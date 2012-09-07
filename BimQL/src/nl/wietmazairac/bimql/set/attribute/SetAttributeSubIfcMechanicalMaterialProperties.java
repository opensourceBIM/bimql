package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcMechanicalMaterialProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcMechanicalMaterialProperties() {
	}

	public SetAttributeSubIfcMechanicalMaterialProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ThermalExpansionCoefficientAsString")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setThermalExpansionCoefficientAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DynamicViscosity")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setDynamicViscosity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("YoungModulus")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setYoungModulus(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ShearModulus")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setShearModulus(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PoissonRatio")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setPoissonRatio(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ThermalExpansionCoefficient")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setThermalExpansionCoefficient(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DynamicViscosityAsString")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setDynamicViscosityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("YoungModulusAsString")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setYoungModulusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ShearModulusAsString")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setShearModulusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PoissonRatioAsString")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setPoissonRatioAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
