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

import org.bimserver.models.ifc2x3tc1.IfcReinforcementBarProperties;

public class SetAttributeSubIfcReinforcementBarProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcReinforcementBarProperties() {
	}

	public SetAttributeSubIfcReinforcementBarProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("BarSurface")) {
			//1NoEList
			 //1void
			 //1IfcReinforcingBarSurfaceEnum
		}
		else if (attributeName.equals("SteelGrade")) {
			//1NoEList
			((IfcReinforcementBarProperties) object).setSteelGrade(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BarCount")) {
			//1NoEList
			((IfcReinforcementBarProperties) object).setBarCount(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TotalCrossSectionArea")) {
			//1NoEList
			((IfcReinforcementBarProperties) object).setTotalCrossSectionArea(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("EffectiveDepthAsString")) {
			//1NoEList
			((IfcReinforcementBarProperties) object).setEffectiveDepthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("NominalBarDiameter")) {
			//1NoEList
			((IfcReinforcementBarProperties) object).setNominalBarDiameter(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("EffectiveDepth")) {
			//1NoEList
			((IfcReinforcementBarProperties) object).setEffectiveDepth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BarCountAsString")) {
			//1NoEList
			((IfcReinforcementBarProperties) object).setBarCountAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TotalCrossSectionAreaAsString")) {
			//1NoEList
			((IfcReinforcementBarProperties) object).setTotalCrossSectionAreaAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("NominalBarDiameterAsString")) {
			//1NoEList
			((IfcReinforcementBarProperties) object).setNominalBarDiameterAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
