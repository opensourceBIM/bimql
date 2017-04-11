package nl.wietmazairac.bimql.set.attribute;

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

import org.bimserver.models.ifc2x3tc1.IfcLightSourceSpot;

public class SetAttributeSubIfcLightSourceSpot {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcLightSourceSpot() {
	}

	public SetAttributeSubIfcLightSourceSpot(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("SpreadAngle")) {
			//1NoEList
			((IfcLightSourceSpot) object).setSpreadAngle(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BeamWidthAngle")) {
			//1NoEList
			((IfcLightSourceSpot) object).setBeamWidthAngle(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ConcentrationExponentAsString")) {
			//1NoEList
			((IfcLightSourceSpot) object).setConcentrationExponentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ConcentrationExponent")) {
			//1NoEList
			((IfcLightSourceSpot) object).setConcentrationExponent(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SpreadAngleAsString")) {
			//1NoEList
			((IfcLightSourceSpot) object).setSpreadAngleAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BeamWidthAngleAsString")) {
			//1NoEList
			((IfcLightSourceSpot) object).setBeamWidthAngleAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Orientation")) {
			//1NoEList
			 //1void
			 //1IfcDirection
		}
		else if (attributeName.equals("ConstantAttenuationAsString")) {
			//2NoEList
			((IfcLightSourceSpot) object).setConstantAttenuationAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("DistanceAttenuationAsString")) {
			//2NoEList
			((IfcLightSourceSpot) object).setDistanceAttenuationAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("QuadricAttenuationAsString")) {
			//2NoEList
			((IfcLightSourceSpot) object).setQuadricAttenuationAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ConstantAttenuation")) {
			//2NoEList
			((IfcLightSourceSpot) object).setConstantAttenuation(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("DistanceAttenuation")) {
			//2NoEList
			((IfcLightSourceSpot) object).setDistanceAttenuation(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("QuadricAttenuation")) {
			//2NoEList
			((IfcLightSourceSpot) object).setQuadricAttenuation(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("Radius")) {
			//2NoEList
			((IfcLightSourceSpot) object).setRadius(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("RadiusAsString")) {
			//2NoEList
			((IfcLightSourceSpot) object).setRadiusAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Position")) {
			//2NoEList
			 //2void
			 //2IfcCartesianPoint
		}
		else if (attributeName.equals("LightColour")) {
			//5NoEList
			 //5void
			 //5IfcColourRgb
		}
		else if (attributeName.equals("AmbientIntensity")) {
			//5NoEList
			((IfcLightSourceSpot) object).setAmbientIntensity(Double.parseDouble(attributeNewValue));
			 //5void
			 //5double
		}
		else if (attributeName.equals("IntensityAsString")) {
			//5NoEList
			((IfcLightSourceSpot) object).setIntensityAsString(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Intensity")) {
			//5NoEList
			((IfcLightSourceSpot) object).setIntensity(Double.parseDouble(attributeNewValue));
			 //5void
			 //5double
		}
		else if (attributeName.equals("AmbientIntensityAsString")) {
			//5NoEList
			((IfcLightSourceSpot) object).setAmbientIntensityAsString(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcLightSourceSpot) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
