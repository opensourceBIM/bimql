package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcStructuralLoadTemperature {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralLoadTemperature() {
	}

	public SetAttributeSubIfcStructuralLoadTemperature(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("DeltaT_Y")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_Y(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DeltaT_Z")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_Z(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DeltaT_Constant")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_Constant(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DeltaT_YAsString")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_YAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DeltaT_ZAsString")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_ZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DeltaT_ConstantAsString")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_ConstantAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcStructuralLoadTemperature) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
