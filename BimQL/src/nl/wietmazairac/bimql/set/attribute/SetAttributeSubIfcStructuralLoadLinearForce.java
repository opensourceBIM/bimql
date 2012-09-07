package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcStructuralLoadLinearForce {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralLoadLinearForce() {
	}

	public SetAttributeSubIfcStructuralLoadLinearForce(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("LinearForceXAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearForceYAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearForceZAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearMomentXAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearMomentYAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearMomentZAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearForceX")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearForceY")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearForceZ")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearMomentX")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearMomentY")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearMomentZ")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcStructuralLoadLinearForce) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
