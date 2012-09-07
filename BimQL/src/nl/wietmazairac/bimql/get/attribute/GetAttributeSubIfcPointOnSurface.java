package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcPointOnSurface {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPointOnSurface(Object object, String string) {
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
			resultList.add(((IfcPointOnSurface) object).getDim());
			 //1int
		}
		else if (string.equals("BasisSurface")) {
			resultList.add(((IfcPointOnSurface) object).getBasisSurface());
			 //1IfcSurface
		}
		else if (string.equals("PointParameterUAsString")) {
			resultList.add(((IfcPointOnSurface) object).getPointParameterUAsString());
			 //1String
		}
		else if (string.equals("PointParameterVAsString")) {
			resultList.add(((IfcPointOnSurface) object).getPointParameterVAsString());
			 //1String
		}
		else if (string.equals("PointParameterU")) {
			resultList.add(((IfcPointOnSurface) object).getPointParameterU());
			 //1double
		}
		else if (string.equals("PointParameterV")) {
			resultList.add(((IfcPointOnSurface) object).getPointParameterV());
			 //1double
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcPointOnSurface) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcPointOnSurface) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPointOnSurface) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcPointOnSurface) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
