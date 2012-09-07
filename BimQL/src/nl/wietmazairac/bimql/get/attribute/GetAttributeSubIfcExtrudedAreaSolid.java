package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcExtrudedAreaSolid {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcExtrudedAreaSolid(Object object, String string) {
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
		if (string.equals("ExtrudedDirection")) {
			resultList.add(((IfcExtrudedAreaSolid) object).getExtrudedDirection());
			 //1IfcDirection
		}
		else if (string.equals("DepthAsString")) {
			resultList.add(((IfcExtrudedAreaSolid) object).getDepthAsString());
			 //1String
		}
		else if (string.equals("Depth")) {
			resultList.add(((IfcExtrudedAreaSolid) object).getDepth());
			 //1double
		}
		else if (string.equals("SweptArea")) {
			resultList.add(((IfcExtrudedAreaSolid) object).getSweptArea());
			 //2IfcProfileDef
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcExtrudedAreaSolid) object).getPosition());
			 //2IfcAxis2Placement3D
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcExtrudedAreaSolid) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcExtrudedAreaSolid) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcExtrudedAreaSolid) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcExtrudedAreaSolid) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcExtrudedAreaSolid) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
