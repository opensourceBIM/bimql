package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcStructuralLoadPlanarForce {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralLoadPlanarForce(Object object, String string) {
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
		if (string.equals("PlanarForceX")) {
			resultList.add(((IfcStructuralLoadPlanarForce) object).getPlanarForceX());
			 //1double
		}
		else if (string.equals("PlanarForceY")) {
			resultList.add(((IfcStructuralLoadPlanarForce) object).getPlanarForceY());
			 //1double
		}
		else if (string.equals("PlanarForceZ")) {
			resultList.add(((IfcStructuralLoadPlanarForce) object).getPlanarForceZ());
			 //1double
		}
		else if (string.equals("PlanarForceXAsString")) {
			resultList.add(((IfcStructuralLoadPlanarForce) object).getPlanarForceXAsString());
			 //1String
		}
		else if (string.equals("PlanarForceYAsString")) {
			resultList.add(((IfcStructuralLoadPlanarForce) object).getPlanarForceYAsString());
			 //1String
		}
		else if (string.equals("PlanarForceZAsString")) {
			resultList.add(((IfcStructuralLoadPlanarForce) object).getPlanarForceZAsString());
			 //1String
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralLoadPlanarForce) object).getName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
