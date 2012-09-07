package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcFluidFlowProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcFluidFlowProperties() {
	}

	public SetAttributeSubIfcFluidFlowProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Fluid")) {
			//1NoEList
			 //1void
			 //1IfcMaterial
		}
		else if (attributeName.equals("TemperatureSingleValueAsString")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setTemperatureSingleValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WetBulbTemperatureSingleValue")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setWetBulbTemperatureSingleValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("WetBulbTemperatureTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("FlowConditionSingleValueAsString")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setFlowConditionSingleValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("VelocitySingleValueAsString")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setVelocitySingleValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WetBulbTemperatureSingleValueAsString")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setWetBulbTemperatureSingleValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FlowConditionTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("VelocityTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("FlowrateTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("PressureTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("UserDefinedPropertySource")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setUserDefinedPropertySource(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TemperatureSingleValue")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setTemperatureSingleValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TemperatureTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("FlowrateSingleValue")) {
			//1NoEList
			 //1void
			 //1IfcDerivedMeasureValue
		}
		else if (attributeName.equals("FlowConditionSingleValue")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setFlowConditionSingleValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("VelocitySingleValue")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setVelocitySingleValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PressureSingleValue")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setPressureSingleValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PropertySource")) {
			//1NoEList
			 //1void
			 //1IfcPropertySourceEnum
		}
		else if (attributeName.equals("PressureSingleValueAsString")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setPressureSingleValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcFluidFlowProperties) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcFluidFlowProperties) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
