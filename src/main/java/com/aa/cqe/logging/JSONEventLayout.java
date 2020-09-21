package com.aa.cqe.logging;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.AbstractStringLayout;

import com.aa.cqe.utility.PropertyReader;
import com.google.gson.GsonBuilder;

@Plugin(name = "JSONEventLayout", category = "Core", elementType = "layout", printObject = true)
public class JSONEventLayout extends AbstractStringLayout {
	
	private boolean locationInfo;
	private PropertyReader propertyReader = null;
	
	 protected JSONEventLayout(final boolean locationInfo, final Charset charset) {
	        super(charset);

	        this.locationInfo = locationInfo;
	    }
    @PluginFactory
    public static JSONEventLayout createLayout(@PluginAttribute(value = "locationInfo", defaultBoolean = true) final boolean locationInfo,
            @PluginAttribute(value = "charset", defaultString = "UTF-8") final Charset charset) {
        return new JSONEventLayout(locationInfo, charset);
    }
  
	@Override
	public String toSerializable(LogEvent event) {

    	FormatMapMessages fmtMessage = new FormatMapMessages();
    	Map<String, Object> formatedString = null;
		try {
			formatedString = fmtMessage.getFormattedMessage(event);
		} catch (org.json.simple.parser.ParseException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return  new GsonBuilder().create().toJson(formatedString)+"\n";
	}
}
