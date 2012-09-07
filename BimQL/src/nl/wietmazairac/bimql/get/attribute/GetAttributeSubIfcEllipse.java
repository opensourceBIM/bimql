package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcEllipse {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcEllipse(Object object, String string) {
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
		if (string.equals("SemiAxis1AsString")) {
			resultList.add(((IfcEllipse) object).getSemiAxis1AsString());
			 //1String
		}
		else if (string.equals("SemiAxis2AsString")) {
			resultList.add(((IfcEllipse) object).getSemiAxis2AsString());
			 //1String
		}
		else if (string.equals("SemiAxis1")) {
			resultList.add(((IfcEllipse) object).getSemiAxis1());
			 //1double
		}
		else if (string.equals("SemiAxis2")) {
			resultList.add(((IfcEllipse) object).getSemiAxis2());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcEllipse) object).getPosition());
			 //2IfcAxis2Placement
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcEllipse) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcEllipse) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcEllipse) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcEllipse) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcEllipse) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
