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

import org.bimserver.models.ifc2x3tc1.IfcLightSourcePositional;

public class SetAttributeSubIfcLightSourcePositional {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcLightSourcePositional() {
	}

	public SetAttributeSubIfcLightSourcePositional(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ConstantAttenuationAsString")) {
			//1NoEList
			((IfcLightSourcePositional) object).setConstantAttenuationAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DistanceAttenuationAsString")) {
			//1NoEList
			((IfcLightSourcePositional) object).setDistanceAttenuationAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("QuadricAttenuationAsString")) {
			//1NoEList
			((IfcLightSourcePositional) object).setQuadricAttenuationAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ConstantAttenuation")) {
			//1NoEList
			((IfcLightSourcePositional) object).setConstantAttenuation(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DistanceAttenuation")) {
			//1NoEList
			((IfcLightSourcePositional) object).setDistanceAttenuation(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("QuadricAttenuation")) {
			//1NoEList
			((IfcLightSourcePositional) object).setQuadricAttenuation(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Radius")) {
			//1NoEList
			((IfcLightSourcePositional) object).setRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RadiusAsString")) {
			//1NoEList
			((IfcLightSourcePositional) object).setRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Position")) {
			//1NoEList
			 //1void
			 //1IfcCartesianPoint
		}
		else if (attributeName.equals("LightColour")) {
			//2NoEList
			 //2void
			 //2IfcColourRgb
		}
		else if (attributeName.equals("AmbientIntensity")) {
			//2NoEList
			((IfcLightSourcePositional) object).setAmbientIntensity(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("IntensityAsString")) {
			//2NoEList
			((IfcLightSourcePositional) object).setIntensityAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Intensity")) {
			//2NoEList
			((IfcLightSourcePositional) object).setIntensity(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("AmbientIntensityAsString")) {
			//2NoEList
			((IfcLightSourcePositional) object).setAmbientIntensityAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Name")) {
			//2NoEList
			((IfcLightSourcePositional) object).setName(attributeNewValue);
			 //2void
			 //2String
		}
		else {
		}
	}
}
