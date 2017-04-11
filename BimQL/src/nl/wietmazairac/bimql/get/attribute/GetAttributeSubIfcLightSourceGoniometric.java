package nl.wietmazairac.bimql.get.attribute;

/******************************************************************************
 * Copyright (C) 2009-2017  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcLightSourceGoniometric;

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
