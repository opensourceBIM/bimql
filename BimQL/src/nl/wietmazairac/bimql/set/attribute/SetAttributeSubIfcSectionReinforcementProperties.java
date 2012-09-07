package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcSectionReinforcementProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcSectionReinforcementProperties() {
	}

	public SetAttributeSubIfcSectionReinforcementProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ReinforcementRole")) {
			//1NoEList
			 //1void
			 //1IfcReinforcingBarRoleEnum
		}
		else if (attributeName.equals("SectionDefinition")) {
			//1NoEList
			 //1void
			 //1IfcSectionProperties
		}
		else if (attributeName.equals("LongitudinalStartPosition")) {
			//1NoEList
			((IfcSectionReinforcementProperties) object).setLongitudinalStartPosition(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LongitudinalEndPosition")) {
			//1NoEList
			((IfcSectionReinforcementProperties) object).setLongitudinalEndPosition(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TransversePosition")) {
			//1NoEList
			((IfcSectionReinforcementProperties) object).setTransversePosition(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LongitudinalStartPositionAsString")) {
			//1NoEList
			((IfcSectionReinforcementProperties) object).setLongitudinalStartPositionAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LongitudinalEndPositionAsString")) {
			//1NoEList
			((IfcSectionReinforcementProperties) object).setLongitudinalEndPositionAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TransversePositionAsString")) {
			//1NoEList
			((IfcSectionReinforcementProperties) object).setTransversePositionAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
