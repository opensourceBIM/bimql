package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcStructuralLoadSingleForce {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralLoadSingleForce() {
	}

	public SetAttributeSubIfcStructuralLoadSingleForce(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ForceX")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setForceX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ForceY")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setForceY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ForceZ")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setForceZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MomentX")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setMomentX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MomentY")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setMomentY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MomentZ")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setMomentZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ForceXAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setForceXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ForceYAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setForceYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ForceZAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setForceZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MomentXAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setMomentXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MomentYAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setMomentYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MomentZAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleForce) object).setMomentZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcStructuralLoadSingleForce) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
