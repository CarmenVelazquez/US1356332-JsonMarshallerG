package com.aa.cqe.flight.service;

import com.fasterxml.jackson.core.type.TypeReference;

public interface JsonTransformer<T> {
	public T unmarshallEvent(String jsonString, Class className);
	public T unmarshallAnonymousJson(String jsonString, TypeReference<T> typeRef);
}
