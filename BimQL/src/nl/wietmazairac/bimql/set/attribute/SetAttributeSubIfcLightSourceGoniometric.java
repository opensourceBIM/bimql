package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcLightSourceGoniometric {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcLightSourceGoniometric() {
	}

	public SetAttributeSubIfcLightSourceGoniometric(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ColourAppearance")) {
			//1NoEList
			 //1void
			 //1IfcColourRgb
		}
		else if (attributeName.equals("ColourTemperature")) {
			//1NoEList
			((IfcLightSourceGoniometric) object).setColourTemperature(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LuminousFlux")) {
			//1NoEList
			((IfcLightSourceGoniometric) object).setLuminousFlux(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ColourTemperatureAsString")) {
			//1NoEList
			((IfcLightSourceGoniometric) object).setColourTemperatureAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LuminousFluxAsString")) {
			//1NoEList
			((IfcLightSourceGoniometric) object).setLuminousFluxAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LightEmissionSource")) {
			//1NoEList
			 //1void
			 //1IfcLightEmissionSourceEnum
		}
		else if (attributeName.equals("LightDistributionDataSource")) {
			//1NoEList
			 //1void
			 //1IfcLightDistributionDataSourceSelect
		}
		else if (attributeName.equals("Position")) {
			//1NoEList
			 //1void
			 //1IfcAxis2Placement3D
		}
		else if (attributeName.equals("LightColour")) {
			//2NoEList
			 //2void
			 //2IfcColourRgb
		}
		else if (attributeName.equals("AmbientIntensity")) {
			//2NoEList
			((IfcLightSourceGoniometric) object).setAmbientIntensity(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("IntensityAsString")) {
			//2NoEList
			((IfcLightSourceGoniometric) object).setIntensityAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Intensity")) {
			//2NoEList
			((IfcLightSourceGoniometric) object).setIntensity(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("AmbientIntensityAsString")) {
			//2NoEList
			((IfcLightSourceGoniometric) object).setAmbientIntensityAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Name")) {
			//2NoEList
			((IfcLightSourceGoniometric) object).setName(attributeNewValue);
			 //2void
			 //2String
		}
		else {
		}
	}
}
