package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcGridAxis;

public class GetAttributeSubIfcGridAxis {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcGridAxis(Object object, String string) {
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
		if (string.equals("HasIntersections")) {
			//3xxx
			for (int i = 0; i < ((IfcGridAxis) object).getHasIntersections().size(); i++) {
				resultList.add(((IfcGridAxis) object).getHasIntersections().get(i));
			}
			 //1EList
		}
		else if (string.equals("AxisTag")) {
			resultList.add(((IfcGridAxis) object).getAxisTag());
			 //1String
		}
		else if (string.equals("AxisCurve")) {
			resultList.add(((IfcGridAxis) object).getAxisCurve());
			 //1IfcCurve
		}
		else if (string.equals("PartOfW")) {
			//3xxx
			for (int i = 0; i < ((IfcGridAxis) object).getPartOfW().size(); i++) {
				resultList.add(((IfcGridAxis) object).getPartOfW().get(i));
			}
			 //1EList
		}
		else if (string.equals("PartOfV")) {
			//3xxx
			for (int i = 0; i < ((IfcGridAxis) object).getPartOfV().size(); i++) {
				resultList.add(((IfcGridAxis) object).getPartOfV().get(i));
			}
			 //1EList
		}
		else if (string.equals("PartOfU")) {
			//3xxx
			for (int i = 0; i < ((IfcGridAxis) object).getPartOfU().size(); i++) {
				resultList.add(((IfcGridAxis) object).getPartOfU().get(i));
			}
			 //1EList
		}
		else if (string.equals("SameSense")) {
			resultList.add(((IfcGridAxis) object).getSameSense());
			 //1Tristate
		}
		return resultList;
	}
}
