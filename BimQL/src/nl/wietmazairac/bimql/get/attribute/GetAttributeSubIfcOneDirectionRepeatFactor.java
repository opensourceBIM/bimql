package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcOneDirectionRepeatFactor;

public class GetAttributeSubIfcOneDirectionRepeatFactor {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcOneDirectionRepeatFactor(Object object, String string) {
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
		if (string.equals("RepeatFactor")) {
			resultList.add(((IfcOneDirectionRepeatFactor) object).getRepeatFactor());
			 //1IfcVector
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcOneDirectionRepeatFactor) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcOneDirectionRepeatFactor) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcOneDirectionRepeatFactor) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcOneDirectionRepeatFactor) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
