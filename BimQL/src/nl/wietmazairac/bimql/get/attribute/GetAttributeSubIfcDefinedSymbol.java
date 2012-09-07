package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcDefinedSymbol {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDefinedSymbol(Object object, String string) {
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
		if (string.equals("Definition")) {
			resultList.add(((IfcDefinedSymbol) object).getDefinition());
			 //1IfcDefinedSymbolSelect
		}
		else if (string.equals("Target")) {
			resultList.add(((IfcDefinedSymbol) object).getTarget());
			 //1IfcCartesianTransformationOperator2D
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcDefinedSymbol) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcDefinedSymbol) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDefinedSymbol) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcDefinedSymbol) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
