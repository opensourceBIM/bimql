package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcPointOnSurface {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPointOnSurface() {
	}

	public SetAttributeSubIfcPointOnSurface(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Dim")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("BasisSurface")) {
			//1NoEList
			 //1void
			 //1IfcSurface
		}
		else if (attributeName.equals("PointParameterUAsString")) {
			//1NoEList
			((IfcPointOnSurface) object).setPointParameterUAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PointParameterVAsString")) {
			//1NoEList
			((IfcPointOnSurface) object).setPointParameterVAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PointParameterU")) {
			//1NoEList
			((IfcPointOnSurface) object).setPointParameterU(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PointParameterV")) {
			//1NoEList
			((IfcPointOnSurface) object).setPointParameterV(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
