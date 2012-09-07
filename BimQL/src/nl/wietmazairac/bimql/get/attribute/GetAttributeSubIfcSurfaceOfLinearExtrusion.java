package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSurfaceOfLinearExtrusion {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSurfaceOfLinearExtrusion(Object object, String string) {
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
			resultList.add(((IfcSurfaceOfLinearExtrusion) object).getExtrudedDirection());
			 //1IfcDirection
		}
		else if (string.equals("DepthAsString")) {
			resultList.add(((IfcSurfaceOfLinearExtrusion) object).getDepthAsString());
			 //1String
		}
		else if (string.equals("Depth")) {
			resultList.add(((IfcSurfaceOfLinearExtrusion) object).getDepth());
			 //1double
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcSurfaceOfLinearExtrusion) object).getDim());
			 //2int
		}
		else if (string.equals("SweptCurve")) {
			resultList.add(((IfcSurfaceOfLinearExtrusion) object).getSweptCurve());
			 //2IfcProfileDef
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcSurfaceOfLinearExtrusion) object).getPosition());
			 //2IfcAxis2Placement3D
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcSurfaceOfLinearExtrusion) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcSurfaceOfLinearExtrusion) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSurfaceOfLinearExtrusion) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcSurfaceOfLinearExtrusion) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
