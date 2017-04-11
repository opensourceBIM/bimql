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

import org.bimserver.models.ifc2x3tc1.IfcLightSourcePositional;

public class GetAttributeSubIfcLightSourcePositional {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLightSourcePositional(Object object, String string) {
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
		if (string.equals("ConstantAttenuation")) {
			resultList.add(((IfcLightSourcePositional) object).getConstantAttenuation());
			 //1double
		}
		else if (string.equals("DistanceAttenuation")) {
			resultList.add(((IfcLightSourcePositional) object).getDistanceAttenuation());
			 //1double
		}
		else if (string.equals("QuadricAttenuation")) {
			resultList.add(((IfcLightSourcePositional) object).getQuadricAttenuation());
			 //1double
		}
		else if (string.equals("ConstantAttenuationAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getConstantAttenuationAsString());
			 //1String
		}
		else if (string.equals("DistanceAttenuationAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getDistanceAttenuationAsString());
			 //1String
		}
		else if (string.equals("QuadricAttenuationAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getQuadricAttenuationAsString());
			 //1String
		}
		else if (string.equals("RadiusAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getRadiusAsString());
			 //1String
		}
		else if (string.equals("Radius")) {
			resultList.add(((IfcLightSourcePositional) object).getRadius());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcLightSourcePositional) object).getPosition());
			 //1IfcCartesianPoint
		}
		else if (string.equals("AmbientIntensityAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getAmbientIntensityAsString());
			 //2String
		}
		else if (string.equals("LightColour")) {
			resultList.add(((IfcLightSourcePositional) object).getLightColour());
			 //2IfcColourRgb
		}
		else if (string.equals("AmbientIntensity")) {
			resultList.add(((IfcLightSourcePositional) object).getAmbientIntensity());
			 //2double
		}
		else if (string.equals("IntensityAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getIntensityAsString());
			 //2String
		}
		else if (string.equals("Intensity")) {
			resultList.add(((IfcLightSourcePositional) object).getIntensity());
			 //2double
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcLightSourcePositional) object).getName());
			 //2String
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcLightSourcePositional) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcLightSourcePositional) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcLightSourcePositional) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcLightSourcePositional) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
