package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcGeneralMaterialProperties;

public class GetAttributeSubIfcGeneralMaterialProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcGeneralMaterialProperties(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("MolecularWeightAsString")) {
			resultList.add(((IfcGeneralMaterialProperties) object).getMolecularWeightAsString());
			 //1String
		}
		else if (string.equals("MassDensityAsString")) {
			resultList.add(((IfcGeneralMaterialProperties) object).getMassDensityAsString());
			 //1String
		}
		else if (string.equals("MolecularWeight")) {
			resultList.add(((IfcGeneralMaterialProperties) object).getMolecularWeight());
			 //1double
		}
		else if (string.equals("PorosityAsString")) {
			resultList.add(((IfcGeneralMaterialProperties) object).getPorosityAsString());
			 //1String
		}
		else if (string.equals("MassDensity")) {
			resultList.add(((IfcGeneralMaterialProperties) object).getMassDensity());
			 //1double
		}
		else if (string.equals("Porosity")) {
			resultList.add(((IfcGeneralMaterialProperties) object).getPorosity());
			 //1double
		}
		return resultList;
	}
}
