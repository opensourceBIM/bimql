package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcOpenShell {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcOpenShell(Object object, String string) {
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
		if (string.equals("CfsFaces")) {
			//3xxx
			for (int i = 0; i < ((IfcOpenShell) object).getCfsFaces().size(); i++) {
				resultList.add(((IfcOpenShell) object).getCfsFaces().get(i));
			}
			 //2EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcOpenShell) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcOpenShell) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcOpenShell) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcOpenShell) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
