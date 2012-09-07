package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcWaterProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcWaterProperties(Object object, String string) {
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
		if (string.equals("IsPotable")) {
			resultList.add(((IfcWaterProperties) object).getIsPotable());
			 //1Tristate
		}
		else if (string.equals("Hardness")) {
			resultList.add(((IfcWaterProperties) object).getHardness());
			 //1double
		}
		else if (string.equals("PHLevel")) {
			resultList.add(((IfcWaterProperties) object).getPHLevel());
			 //1double
		}
		else if (string.equals("HardnessAsString")) {
			resultList.add(((IfcWaterProperties) object).getHardnessAsString());
			 //1String
		}
		else if (string.equals("ImpuritiesContent")) {
			resultList.add(((IfcWaterProperties) object).getImpuritiesContent());
			 //1double
		}
		else if (string.equals("PHLevelAsString")) {
			resultList.add(((IfcWaterProperties) object).getPHLevelAsString());
			 //1String
		}
		else if (string.equals("AlkalinityConcentration")) {
			resultList.add(((IfcWaterProperties) object).getAlkalinityConcentration());
			 //1double
		}
		else if (string.equals("AcidityConcentration")) {
			resultList.add(((IfcWaterProperties) object).getAcidityConcentration());
			 //1double
		}
		else if (string.equals("ImpuritiesContentAsString")) {
			resultList.add(((IfcWaterProperties) object).getImpuritiesContentAsString());
			 //1String
		}
		else if (string.equals("DissolvedSolidsContent")) {
			resultList.add(((IfcWaterProperties) object).getDissolvedSolidsContent());
			 //1double
		}
		else if (string.equals("AlkalinityConcentrationAsString")) {
			resultList.add(((IfcWaterProperties) object).getAlkalinityConcentrationAsString());
			 //1String
		}
		else if (string.equals("AcidityConcentrationAsString")) {
			resultList.add(((IfcWaterProperties) object).getAcidityConcentrationAsString());
			 //1String
		}
		else if (string.equals("DissolvedSolidsContentAsString")) {
			resultList.add(((IfcWaterProperties) object).getDissolvedSolidsContentAsString());
			 //1String
		}
		return resultList;
	}
}
