package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcOpticalMaterialProperties;

public class GetAttributeSubIfcOpticalMaterialProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcOpticalMaterialProperties(Object object, String string) {
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
		if (string.equals("VisibleTransmittance")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getVisibleTransmittance());
			 //1double
		}
		else if (string.equals("SolarTransmittance")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getSolarTransmittance());
			 //1double
		}
		else if (string.equals("ThermalIrTransmittance")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getThermalIrTransmittance());
			 //1double
		}
		else if (string.equals("ThermalIrEmissivityBack")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getThermalIrEmissivityBack());
			 //1double
		}
		else if (string.equals("ThermalIrEmissivityFront")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getThermalIrEmissivityFront());
			 //1double
		}
		else if (string.equals("VisibleReflectanceBack")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getVisibleReflectanceBack());
			 //1double
		}
		else if (string.equals("VisibleReflectanceFront")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getVisibleReflectanceFront());
			 //1double
		}
		else if (string.equals("SolarReflectanceFront")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getSolarReflectanceFront());
			 //1double
		}
		else if (string.equals("SolarReflectanceBack")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getSolarReflectanceBack());
			 //1double
		}
		else if (string.equals("VisibleTransmittanceAsString")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getVisibleTransmittanceAsString());
			 //1String
		}
		else if (string.equals("SolarTransmittanceAsString")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getSolarTransmittanceAsString());
			 //1String
		}
		else if (string.equals("ThermalIrTransmittanceAsString")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getThermalIrTransmittanceAsString());
			 //1String
		}
		else if (string.equals("ThermalIrEmissivityBackAsString")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getThermalIrEmissivityBackAsString());
			 //1String
		}
		else if (string.equals("ThermalIrEmissivityFrontAsString")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getThermalIrEmissivityFrontAsString());
			 //1String
		}
		else if (string.equals("VisibleReflectanceBackAsString")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getVisibleReflectanceBackAsString());
			 //1String
		}
		else if (string.equals("VisibleReflectanceFrontAsString")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getVisibleReflectanceFrontAsString());
			 //1String
		}
		else if (string.equals("SolarReflectanceFrontAsString")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getSolarReflectanceFrontAsString());
			 //1String
		}
		else if (string.equals("SolarReflectanceBackAsString")) {
			resultList.add(((IfcOpticalMaterialProperties) object).getSolarReflectanceBackAsString());
			 //1String
		}
		return resultList;
	}
}
