package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcLightSourceGoniometric {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLightSourceGoniometric(Object object, String string) {
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
		if (string.equals("ColourTemperatureAsString")) {
			resultList.add(((IfcLightSourceGoniometric) object).getColourTemperatureAsString());
			 //1String
		}
		else if (string.equals("LuminousFluxAsString")) {
			resultList.add(((IfcLightSourceGoniometric) object).getLuminousFluxAsString());
			 //1String
		}
		else if (string.equals("LightEmissionSource")) {
			resultList.add(((IfcLightSourceGoniometric) object).getLightEmissionSource());
			 //1IfcLightEmissionSourceEnum
		}
		else if (string.equals("LightDistributionDataSource")) {
			resultList.add(((IfcLightSourceGoniometric) object).getLightDistributionDataSource());
			 //1IfcLightDistributionDataSourceSelect
		}
		else if (string.equals("ColourAppearance")) {
			resultList.add(((IfcLightSourceGoniometric) object).getColourAppearance());
			 //1IfcColourRgb
		}
		else if (string.equals("ColourTemperature")) {
			resultList.add(((IfcLightSourceGoniometric) object).getColourTemperature());
			 //1double
		}
		else if (string.equals("LuminousFlux")) {
			resultList.add(((IfcLightSourceGoniometric) object).getLuminousFlux());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcLightSourceGoniometric) object).getPosition());
			 //1IfcAxis2Placement3D
		}
		else if (string.equals("AmbientIntensityAsString")) {
			resultList.add(((IfcLightSourceGoniometric) object).getAmbientIntensityAsString());
			 //2String
		}
		else if (string.equals("LightColour")) {
			resultList.add(((IfcLightSourceGoniometric) object).getLightColour());
			 //2IfcColourRgb
		}
		else if (string.equals("AmbientIntensity")) {
			resultList.add(((IfcLightSourceGoniometric) object).getAmbientIntensity());
			 //2double
		}
		else if (string.equals("IntensityAsString")) {
			resultList.add(((IfcLightSourceGoniometric) object).getIntensityAsString());
			 //2String
		}
		else if (string.equals("Intensity")) {
			resultList.add(((IfcLightSourceGoniometric) object).getIntensity());
			 //2double
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcLightSourceGoniometric) object).getName());
			 //2String
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcLightSourceGoniometric) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcLightSourceGoniometric) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcLightSourceGoniometric) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcLightSourceGoniometric) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
