package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcConnectionPointEccentricity {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConnectionPointEccentricity(Object object, String string) {
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
		if (string.equals("EccentricityInXAsString")) {
			resultList.add(((IfcConnectionPointEccentricity) object).getEccentricityInXAsString());
			 //1String
		}
		else if (string.equals("EccentricityInX")) {
			resultList.add(((IfcConnectionPointEccentricity) object).getEccentricityInX());
			 //1double
		}
		else if (string.equals("EccentricityInY")) {
			resultList.add(((IfcConnectionPointEccentricity) object).getEccentricityInY());
			 //1double
		}
		else if (string.equals("EccentricityInZ")) {
			resultList.add(((IfcConnectionPointEccentricity) object).getEccentricityInZ());
			 //1double
		}
		else if (string.equals("EccentricityInYAsString")) {
			resultList.add(((IfcConnectionPointEccentricity) object).getEccentricityInYAsString());
			 //1String
		}
		else if (string.equals("EccentricityInZAsString")) {
			resultList.add(((IfcConnectionPointEccentricity) object).getEccentricityInZAsString());
			 //1String
		}
		else if (string.equals("PointOnRelatingElement")) {
			resultList.add(((IfcConnectionPointEccentricity) object).getPointOnRelatingElement());
			 //2IfcPointOrVertexPoint
		}
		else if (string.equals("PointOnRelatedElement")) {
			resultList.add(((IfcConnectionPointEccentricity) object).getPointOnRelatedElement());
			 //2IfcPointOrVertexPoint
		}
		else {
		}
		return resultList;
	}
}
