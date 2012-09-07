package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcDraughtingCallout {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDraughtingCallout(Object object, String string) {
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
		if (string.equals("IsRelatedFromCallout")) {
			//3xxx
			for (int i = 0; i < ((IfcDraughtingCallout) object).getIsRelatedFromCallout().size(); i++) {
				resultList.add(((IfcDraughtingCallout) object).getIsRelatedFromCallout().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsRelatedToCallout")) {
			//3xxx
			for (int i = 0; i < ((IfcDraughtingCallout) object).getIsRelatedToCallout().size(); i++) {
				resultList.add(((IfcDraughtingCallout) object).getIsRelatedToCallout().get(i));
			}
			 //1EList
		}
		else if (string.equals("Contents")) {
			//3xxx
			for (int i = 0; i < ((IfcDraughtingCallout) object).getContents().size(); i++) {
				resultList.add(((IfcDraughtingCallout) object).getContents().get(i));
			}
			 //1EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcDraughtingCallout) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcDraughtingCallout) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDraughtingCallout) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcDraughtingCallout) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
