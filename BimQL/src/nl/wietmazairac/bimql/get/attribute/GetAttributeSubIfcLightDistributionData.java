package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcLightDistributionData {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLightDistributionData(Object object, String string) {
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
		if (string.equals("MainPlaneAngleAsString")) {
			resultList.add(((IfcLightDistributionData) object).getMainPlaneAngleAsString());
			 //1String
		}
		else if (string.equals("SecondaryPlaneAngle")) {
			//3xxx
			for (int i = 0; i < ((IfcLightDistributionData) object).getSecondaryPlaneAngle().size(); i++) {
				resultList.add(((IfcLightDistributionData) object).getSecondaryPlaneAngle().get(i));
			}
			 //1EList
		}
		else if (string.equals("LuminousIntensityAsString")) {
			//3xxx
			for (int i = 0; i < ((IfcLightDistributionData) object).getLuminousIntensityAsString().size(); i++) {
				resultList.add(((IfcLightDistributionData) object).getLuminousIntensityAsString().get(i));
			}
			 //1EList
		}
		else if (string.equals("SecondaryPlaneAngleAsString")) {
			//3xxx
			for (int i = 0; i < ((IfcLightDistributionData) object).getSecondaryPlaneAngleAsString().size(); i++) {
				resultList.add(((IfcLightDistributionData) object).getSecondaryPlaneAngleAsString().get(i));
			}
			 //1EList
		}
		else if (string.equals("MainPlaneAngle")) {
			resultList.add(((IfcLightDistributionData) object).getMainPlaneAngle());
			 //1double
		}
		else if (string.equals("LuminousIntensity")) {
			//3xxx
			for (int i = 0; i < ((IfcLightDistributionData) object).getLuminousIntensity().size(); i++) {
				resultList.add(((IfcLightDistributionData) object).getLuminousIntensity().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
