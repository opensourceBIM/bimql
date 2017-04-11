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

import org.bimserver.models.ifc2x3tc1.IfcReinforcementBarProperties;

public class GetAttributeSubIfcReinforcementBarProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcReinforcementBarProperties(Object object, String string) {
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
		if (string.equals("TotalCrossSectionArea")) {
			resultList.add(((IfcReinforcementBarProperties) object).getTotalCrossSectionArea());
			 //1double
		}
		else if (string.equals("EffectiveDepthAsString")) {
			resultList.add(((IfcReinforcementBarProperties) object).getEffectiveDepthAsString());
			 //1String
		}
		else if (string.equals("SteelGrade")) {
			resultList.add(((IfcReinforcementBarProperties) object).getSteelGrade());
			 //1String
		}
		else if (string.equals("BarSurface")) {
			resultList.add(((IfcReinforcementBarProperties) object).getBarSurface());
			 //1IfcReinforcingBarSurfaceEnum
		}
		else if (string.equals("EffectiveDepth")) {
			resultList.add(((IfcReinforcementBarProperties) object).getEffectiveDepth());
			 //1double
		}
		else if (string.equals("BarCountAsString")) {
			resultList.add(((IfcReinforcementBarProperties) object).getBarCountAsString());
			 //1String
		}
		else if (string.equals("BarCount")) {
			resultList.add(((IfcReinforcementBarProperties) object).getBarCount());
			 //1double
		}
		else if (string.equals("NominalBarDiameter")) {
			resultList.add(((IfcReinforcementBarProperties) object).getNominalBarDiameter());
			 //1double
		}
		else if (string.equals("TotalCrossSectionAreaAsString")) {
			resultList.add(((IfcReinforcementBarProperties) object).getTotalCrossSectionAreaAsString());
			 //1String
		}
		else if (string.equals("NominalBarDiameterAsString")) {
			resultList.add(((IfcReinforcementBarProperties) object).getNominalBarDiameterAsString());
			 //1String
		}
		return resultList;
	}
}
