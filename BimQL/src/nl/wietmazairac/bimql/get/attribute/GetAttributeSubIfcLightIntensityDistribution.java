package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcLightIntensityDistribution;

public class GetAttributeSubIfcLightIntensityDistribution {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLightIntensityDistribution(Object object, String string) {
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
		if (string.equals("LightDistributionCurve")) {
			resultList.add(((IfcLightIntensityDistribution) object).getLightDistributionCurve());
			 //1IfcLightDistributionCurveEnum
		}
		else if (string.equals("DistributionData")) {
			//3xxx
			for (int i = 0; i < ((IfcLightIntensityDistribution) object).getDistributionData().size(); i++) {
				resultList.add(((IfcLightIntensityDistribution) object).getDistributionData().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
