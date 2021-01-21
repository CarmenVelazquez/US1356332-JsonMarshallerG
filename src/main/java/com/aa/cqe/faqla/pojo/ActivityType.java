package com.aa.cqe.faqla.pojo;

public enum ActivityType {
	
	/** Sequence **/
	SEQ,
	/** Ghost Trip **/
	GHT,
	/** Paper Legal **/
	PLG,
	/** Credit Removal **/
	CRR,
	/** Stand by **/
	STB,
	/** Flex Day **/
	FLD,
	/** FA QLA Flex Day **/
	FD,
	/** Golden Day **/
	GLD,
	/** FA QLA Golden Day **/
	GD,
	/** Regular DFP **/
	D24,
	/** Planned Absence **/
	ABS,
	/** UNPD SK Planned Absence **/
	US,
	/** MOVED FD - Applicable only for Pilots **/
	MVD,
	/** Reserve Assignment Period **/
	RAP,
	/** Training Sequence */
	TRN,
	/** FA QLA Training Sequence */
	TRA,
	/** Miscellaneous */
	MSC,
	/** Premium Sequence */
	PRM,
	/** Golden and Flex Day */
	GFD,
	/** FA QLA Golden and Flex Day */
	FG,
	/** Previous month activity */
	PRV,
	/** Release activity/Obligation Activity */
	RLS,
	/** Flight */
	FLT,
	/** Vacation */
	VAC,
	/** Sick */
	SCK,
	/** Focal-Day */
	AVL;

	public boolean isFaDFP() {
		return this == FLD || this == GLD || this == D24 || this == GFD;
	}

	public boolean isSequence() {
		return this == SEQ || this == GHT || this == CRR || this == PRM || this == PLG || this == TRN;
	}

	public boolean isSTB() {
		return this == STB;
	}

	public boolean isOffDay() {
		switch (this) {
		case FD:
		case GD:
		case FG:
			return true;
		default:
			return false;
		}
	}

}