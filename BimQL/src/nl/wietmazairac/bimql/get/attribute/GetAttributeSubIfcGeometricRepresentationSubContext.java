package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

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
