package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcHygroscopicMaterialProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcHygroscopicMaterialProperties(Object object, String string) {
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
		if (string.equals("UpperVaporResistanceFactorAsString")) {
			resultList.add(((IfcHygroscopicMaterialProperties) object).getUpperVaporResistanceFactorAsString());
			 //1String
		}
		else if (string.equals("LowerVaporResistanceFactorAsString")) {
			resultList.add(((IfcHygroscopicMaterialProperties) object).getLowerVaporResistanceFactorAsString());
			 //1String
		}
		else if (string.equals("IsothermalMoistureCapacityAsString")) {
			resultList.add(((IfcHygroscopicMaterialProperties) object).getIsothermalMoistureCapacityAsString());
			 //1String
		}
		else if (string.equals("UpperVaporResistanceFactor")) {
			resultList.add(((IfcHygroscopicMaterialProperties) object).getUpperVaporResistanceFactor());
			 //1double
		}
		else if (string.equals("LowerVaporResistanceFactor")) {
			resultList.add(((IfcHygroscopicMaterialProperties) object).getLowerVaporResistanceFactor());
			 //1double
		}
		else if (string.equals("IsothermalMoistureCapacity")) {
			resultList.add(((IfcHygroscopicMaterialProperties) object).getIsothermalMoistureCapacity());
			 //1double
		}
		else if (string.equals("MoistureDiffusivityAsString")) {
			resultList.add(((IfcHygroscopicMaterialProperties) object).getMoistureDiffusivityAsString());
			 //1String
		}
		else if (string.equals("VaporPermeability")) {
			resultList.add(((IfcHygroscopicMaterialProperties) object).getVaporPermeability());
			 //1double
		}
		else if (string.equals("VaporPermeabilityAsString")) {
			resultList.add(((IfcHygroscopicMaterialProperties) object).getVaporPermeabilityAsString());
			 //1String
		}
		else if (string.equals("MoistureDiffusivity")) {
			resultList.add(((IfcHygroscopicMaterialProperties) object).getMoistureDiffusivity());
			 //1double
		}
		return resultList;
	}
}
