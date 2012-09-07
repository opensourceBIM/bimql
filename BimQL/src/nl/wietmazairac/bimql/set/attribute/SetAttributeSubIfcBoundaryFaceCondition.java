package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcBoundaryFaceCondition {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcBoundaryFaceCondition() {
	}

	public SetAttributeSubIfcBoundaryFaceCondition(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("LinearStiffnessByAreaX")) {
			//1NoEList
			((IfcBoundaryFaceCondition) object).setLinearStiffnessByAreaX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearStiffnessByAreaY")) {
			//1NoEList
			((IfcBoundaryFaceCondition) object).setLinearStiffnessByAreaY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearStiffnessByAreaZ")) {
			//1NoEList
			((IfcBoundaryFaceCondition) object).setLinearStiffnessByAreaZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearStiffnessByAreaXAsString")) {
			//1NoEList
			((IfcBoundaryFaceCondition) object).setLinearStiffnessByAreaXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearStiffnessByAreaYAsString")) {
			//1NoEList
			((IfcBoundaryFaceCondition) object).setLinearStiffnessByAreaYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearStiffnessByAreaZAsString")) {
			//1NoEList
			((IfcBoundaryFaceCondition) object).setLinearStiffnessByAreaZAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
