package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcFailureConnectionCondition {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFailureConnectionCondition(Object object, String string) {
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
		if (string.equals("TensionFailureXAsString")) {
			resultList.add(((IfcFailureConnectionCondition) object).getTensionFailureXAsString());
			 //1String
		}
		else if (string.equals("TensionFailureYAsString")) {
			resultList.add(((IfcFailureConnectionCondition) object).getTensionFailureYAsString());
			 //1String
		}
		else if (string.equals("TensionFailureZAsString")) {
			resultList.add(((IfcFailureConnectionCondition) object).getTensionFailureZAsString());
			 //1String
		}
		else if (string.equals("CompressionFailureX")) {
			resultList.add(((IfcFailureConnectionCondition) object).getCompressionFailureX());
			 //1double
		}
		else if (string.equals("CompressionFailureY")) {
			resultList.add(((IfcFailureConnectionCondition) object).getCompressionFailureY());
			 //1double
		}
		else if (string.equals("CompressionFailureZ")) {
			resultList.add(((IfcFailureConnectionCondition) object).getCompressionFailureZ());
			 //1double
		}
		else if (string.equals("TensionFailureX")) {
			resultList.add(((IfcFailureConnectionCondition) object).getTensionFailureX());
			 //1double
		}
		else if (string.equals("TensionFailureY")) {
			resultList.add(((IfcFailureConnectionCondition) object).getTensionFailureY());
			 //1double
		}
		else if (string.equals("TensionFailureZ")) {
			resultList.add(((IfcFailureConnectionCondition) object).getTensionFailureZ());
			 //1double
		}
		else if (string.equals("CompressionFailureXAsString")) {
			resultList.add(((IfcFailureConnectionCondition) object).getCompressionFailureXAsString());
			 //1String
		}
		else if (string.equals("CompressionFailureYAsString")) {
			resultList.add(((IfcFailureConnectionCondition) object).getCompressionFailureYAsString());
			 //1String
		}
		else if (string.equals("CompressionFailureZAsString")) {
			resultList.add(((IfcFailureConnectionCondition) object).getCompressionFailureZAsString());
			 //1String
		}
		return resultList;
	}
}
