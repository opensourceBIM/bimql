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

import org.bimserver.models.ifc2x3tc1.IfcLightSourceSpot;

public class GetAttributeSubIfcLightSourceSpot {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLightSourceSpot(Object object, String string) {
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
		if (string.equals("ConcentrationExponent")) {
			resultList.add(((IfcLightSourceSpot) object).getConcentrationExponent());
			 //1double
		}
		else if (string.equals("SpreadAngle")) {
			resultList.add(((IfcLightSourceSpot) object).getSpreadAngle());
			 //1double
		}
		else if (string.equals("BeamWidthAngle")) {
			resultList.add(((IfcLightSourceSpot) object).getBeamWidthAngle());
			 //1double
		}
		else if (string.equals("SpreadAngleAsString")) {
			resultList.add(((IfcLightSourceSpot) object).getSpreadAngleAsString());
			 //1String
		}
		else if (string.equals("BeamWidthAngleAsString")) {
			resultList.add(((IfcLightSourceSpot) object).getBeamWidthAngleAsString());
			 //1String
		}
		else if (string.equals("ConcentrationExponentAsString")) {
			resultList.add(((IfcLightSourceSpot) object).getConcentrationExponentAsString());
			 //1String
		}
		else if (string.equals("Orientation")) {
			resultList.add(((IfcLightSourceSpot) object).getOrientation());
			 //1IfcDirection
		}
		else if (string.equals("ConstantAttenuation")) {
			resultList.add(((IfcLightSourceSpot) object).getConstantAttenuation());
			 //2double
		}
		else if (string.equals("DistanceAttenuation")) {
			resultList.add(((IfcLightSourceSpot) object).getDistanceAttenuation());
			 //2double
		}
		else if (string.equals("QuadricAttenuation")) {
			resultList.add(((IfcLightSourceSpot) object).getQuadricAttenuation());
			 //2double
		}
		else if (string.equals("ConstantAttenuationAsString")) {
			resultList.add(((IfcLightSourceSpot) object).getConstantAttenuationAsString());
			 //2String
		}
		else if (string.equals("DistanceAttenuationAsString")) {
			resultList.add(((IfcLightSourceSpot) object).getDistanceAttenuationAsString());
			 //2String
		}
		else if (string.equals("QuadricAttenuationAsString")) {
			resultList.add(((IfcLightSourceSpot) object).getQuadricAttenuationAsString());
			 //2String
		}
		else if (string.equals("RadiusAsString")) {
			resultList.add(((IfcLightSourceSpot) object).getRadiusAsString());
			 //2String
		}
		else if (string.equals("Radius")) {
			resultList.add(((IfcLightSourceSpot) object).getRadius());
			 //2double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcLightSourceSpot) object).getPosition());
			 //2IfcCartesianPoint
		}
		else if (string.equals("AmbientIntensityAsString")) {
			resultList.add(((IfcLightSourceSpot) object).getAmbientIntensityAsString());
			 //3String
		}
		else if (string.equals("LightColour")) {
			resultList.add(((IfcLightSourceSpot) object).getLightColour());
			 //3IfcColourRgb
		}
		else if (string.equals("AmbientIntensity")) {
			resultList.add(((IfcLightSourceSpot) object).getAmbientIntensity());
			 //3double
		}
		else if (string.equals("IntensityAsString")) {
			resultList.add(((IfcLightSourceSpot) object).getIntensityAsString());
			 //3String
		}
		else if (string.equals("Intensity")) {
			resultList.add(((IfcLightSourceSpot) object).getIntensity());
			 //3double
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcLightSourceSpot) object).getName());
			 //3String
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcLightSourceSpot) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcLightSourceSpot) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcLightSourceSpot) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcLightSourceSpot) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
