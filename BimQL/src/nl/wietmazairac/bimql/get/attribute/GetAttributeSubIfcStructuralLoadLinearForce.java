package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcStructuralLoadLinearForce {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralLoadLinearForce(Object object, String string) {
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
		if (string.equals("LinearForceX")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearForceX());
			 //1double
		}
		else if (string.equals("LinearForceY")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearForceY());
			 //1double
		}
		else if (string.equals("LinearForceZ")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearForceZ());
			 //1double
		}
		else if (string.equals("LinearMomentX")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearMomentX());
			 //1double
		}
		else if (string.equals("LinearMomentY")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearMomentY());
			 //1double
		}
		else if (string.equals("LinearMomentZ")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearMomentZ());
			 //1double
		}
		else if (string.equals("LinearForceXAsString")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearForceXAsString());
			 //1String
		}
		else if (string.equals("LinearForceYAsString")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearForceYAsString());
			 //1String
		}
		else if (string.equals("LinearForceZAsString")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearForceZAsString());
			 //1String
		}
		else if (string.equals("LinearMomentXAsString")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearMomentXAsString());
			 //1String
		}
		else if (string.equals("LinearMomentYAsString")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearMomentYAsString());
			 //1String
		}
		else if (string.equals("LinearMomentZAsString")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getLinearMomentZAsString());
			 //1String
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralLoadLinearForce) object).getName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
