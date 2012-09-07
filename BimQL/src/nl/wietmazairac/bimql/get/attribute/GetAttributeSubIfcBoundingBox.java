package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcBoundingBox {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBoundingBox(Object object, String string) {
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
		if (string.equals("Dim")) {
			resultList.add(((IfcBoundingBox) object).getDim());
			 //1int
		}
		else if (string.equals("XDimAsString")) {
			resultList.add(((IfcBoundingBox) object).getXDimAsString());
			 //1String
		}
		else if (string.equals("YDimAsString")) {
			resultList.add(((IfcBoundingBox) object).getYDimAsString());
			 //1String
		}
		else if (string.equals("XDim")) {
			resultList.add(((IfcBoundingBox) object).getXDim());
			 //1double
		}
		else if (string.equals("YDim")) {
			resultList.add(((IfcBoundingBox) object).getYDim());
			 //1double
		}
		else if (string.equals("ZDim")) {
			resultList.add(((IfcBoundingBox) object).getZDim());
			 //1double
		}
		else if (string.equals("ZDimAsString")) {
			resultList.add(((IfcBoundingBox) object).getZDimAsString());
			 //1String
		}
		else if (string.equals("Corner")) {
			resultList.add(((IfcBoundingBox) object).getCorner());
			 //1IfcCartesianPoint
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcBoundingBox) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcBoundingBox) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBoundingBox) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcBoundingBox) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
