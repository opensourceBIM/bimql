package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcTextLiteralWithExtent {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTextLiteralWithExtent() {
	}

	public SetAttributeSubIfcTextLiteralWithExtent(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("BoxAlignment")) {
			//1NoEList
			((IfcTextLiteralWithExtent) object).setBoxAlignment(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Extent")) {
			//1NoEList
			 //1void
			 //1IfcPlanarExtent
		}
		else if (attributeName.equals("Placement")) {
			//2NoEList
			 //2void
			 //2IfcAxis2Placement
		}
		else if (attributeName.equals("Literal")) {
			//2NoEList
			((IfcTextLiteralWithExtent) object).setLiteral(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Path")) {
			//2NoEList
			 //2void
			 //2IfcTextPath
		}
		else {
		}
	}
}
