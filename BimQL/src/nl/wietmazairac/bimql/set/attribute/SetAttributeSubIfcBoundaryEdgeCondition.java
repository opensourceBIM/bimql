package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcBoundaryEdgeCondition {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcBoundaryEdgeCondition() {
	}

	public SetAttributeSubIfcBoundaryEdgeCondition(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("RotationalStiffnessByLengthXAsString")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setRotationalStiffnessByLengthXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearStiffnessByLengthXAsString")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setLinearStiffnessByLengthXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearStiffnessByLengthYAsString")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setLinearStiffnessByLengthYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearStiffnessByLengthZAsString")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setLinearStiffnessByLengthZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RotationalStiffnessByLengthX")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setRotationalStiffnessByLengthX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearStiffnessByLengthX")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setLinearStiffnessByLengthX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearStiffnessByLengthY")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setLinearStiffnessByLengthY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearStiffnessByLengthZ")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setLinearStiffnessByLengthZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RotationalStiffnessByLengthY")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setRotationalStiffnessByLengthY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RotationalStiffnessByLengthZ")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setRotationalStiffnessByLengthZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RotationalStiffnessByLengthYAsString")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setRotationalStiffnessByLengthYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RotationalStiffnessByLengthZAsString")) {
			//1NoEList
			((IfcBoundaryEdgeCondition) object).setRotationalStiffnessByLengthZAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
