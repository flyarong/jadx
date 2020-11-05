package jadx.core.dex.instructions.args;

public enum PrimitiveType {
	BOOLEAN("Z", "boolean"),
	CHAR("C", "char"),
	BYTE("B", "byte"),
	SHORT("S", "short"),
	INT("I", "int"),
	FLOAT("F", "float"),
	LONG("J", "long"),
	DOUBLE("D", "double"),
	OBJECT("L", "OBJECT"),
	ARRAY("[", "ARRAY"),
	VOID("V", "void");

	private final String shortName;
	private final String longName;

	PrimitiveType(String shortName, String longName) {
		this.shortName = shortName;
		this.longName = longName;
	}

	public String getShortName() {
		return shortName;
	}

	public String getLongName() {
		return longName;
	}

	@Override
	public String toString() {
		return longName;
	}

	public boolean isObjectOrArray() {
		return this == OBJECT || this == ARRAY;
	}
}
