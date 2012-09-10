package nl.wietmazairac.bimql.set.attribute;


public class SetAttributeSubIfcSurfaceTexture {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcSurfaceTexture() {
	}

	public SetAttributeSubIfcSurfaceTexture(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("TextureType")) {
			//1NoEList
			 //1void
			 //1IfcSurfaceTextureEnum
		}
		else if (attributeName.equals("TextureTransform")) {
			//1NoEList
			 //1void
			 //1IfcCartesianTransformationOperator2D
		}
		else if (attributeName.equals("RepeatS")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
		else if (attributeName.equals("RepeatT")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
	}
}
