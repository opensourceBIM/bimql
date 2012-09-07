package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcMechanicalMaterialProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMechanicalMaterialProperties(Object object, String string) {
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
		if (string.equals("DynamicViscosityAsString")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getDynamicViscosityAsString());
			 //1String
		}
		else if (string.equals("YoungModulusAsString")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getYoungModulusAsString());
			 //1String
		}
		else if (string.equals("ShearModulusAsString")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getShearModulusAsString());
			 //1String
		}
		else if (string.equals("PoissonRatioAsString")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getPoissonRatioAsString());
			 //1String
		}
		else if (string.equals("DynamicViscosity")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getDynamicViscosity());
			 //1double
		}
		else if (string.equals("YoungModulus")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getYoungModulus());
			 //1double
		}
		else if (string.equals("ShearModulus")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getShearModulus());
			 //1double
		}
		else if (string.equals("PoissonRatio")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getPoissonRatio());
			 //1double
		}
		else if (string.equals("ThermalExpansionCoefficientAsString")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getThermalExpansionCoefficientAsString());
			 //1String
		}
		else if (string.equals("ThermalExpansionCoefficient")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getThermalExpansionCoefficient());
			 //1double
		}
		return resultList;
	}
}
