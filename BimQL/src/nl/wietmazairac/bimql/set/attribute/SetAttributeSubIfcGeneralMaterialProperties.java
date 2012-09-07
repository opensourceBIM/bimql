package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcGeneralMaterialProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcGeneralMaterialProperties() {
	}

	public SetAttributeSubIfcGeneralMaterialProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("MolecularWeight")) {
			//1NoEList
			((IfcGeneralMaterialProperties) object).setMolecularWeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PorosityAsString")) {
			//1NoEList
			((IfcGeneralMaterialProperties) object).setPorosityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MassDensity")) {
			//1NoEList
			((IfcGeneralMaterialProperties) object).setMassDensity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MolecularWeightAsString")) {
			//1NoEList
			((IfcGeneralMaterialProperties) object).setMolecularWeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MassDensityAsString")) {
			//1NoEList
			((IfcGeneralMaterialProperties) object).setMassDensityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Porosity")) {
			//1NoEList
			((IfcGeneralMaterialProperties) object).setPorosity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
