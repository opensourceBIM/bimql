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

import org.bimserver.models.ifc2x3tc1.IfcGeometricRepresentationSubContext;

public class GetAttributeSubIfcGeometricRepresentationSubContext {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcGeometricRepresentationSubContext(Object object, String string) {
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
		if (string.equals("ParentContext")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getParentContext());
			 //1IfcGeometricRepresentationContext
		}
		else if (string.equals("TargetScale")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getTargetScale());
			 //1double
		}
		else if (string.equals("TargetView")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getTargetView());
			 //1IfcGeometricProjectionEnum
		}
		else if (string.equals("TargetScaleAsString")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getTargetScaleAsString());
			 //1String
		}
		else if (string.equals("UserDefinedTargetView")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getUserDefinedTargetView());
			 //1String
		}
		else if (string.equals("PrecisionAsString")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getPrecisionAsString());
			 //2String
		}
		else if (string.equals("HasSubContexts")) {
			//3xxx
			for (int i = 0; i < ((IfcGeometricRepresentationSubContext) object).getHasSubContexts().size(); i++) {
				resultList.add(((IfcGeometricRepresentationSubContext) object).getHasSubContexts().get(i));
			}
			 //2EList
		}
		else if (string.equals("Precision")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getPrecision());
			 //2double
		}
		else if (string.equals("TrueNorth")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getTrueNorth());
			 //2IfcDirection
		}
		else if (string.equals("CoordinateSpaceDimension")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getCoordinateSpaceDimension());
			 //2int
		}
		else if (string.equals("WorldCoordinateSystem")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getWorldCoordinateSystem());
			 //2IfcAxis2Placement
		}
		else if (string.equals("RepresentationsInContext")) {
			//3xxx
			for (int i = 0; i < ((IfcGeometricRepresentationSubContext) object).getRepresentationsInContext().size(); i++) {
				resultList.add(((IfcGeometricRepresentationSubContext) object).getRepresentationsInContext().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContextIdentifier")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getContextIdentifier());
			 //3String
		}
		else if (string.equals("ContextType")) {
			resultList.add(((IfcGeometricRepresentationSubContext) object).getContextType());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
