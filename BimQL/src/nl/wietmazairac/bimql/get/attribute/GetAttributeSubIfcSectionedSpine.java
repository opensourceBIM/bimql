package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSectionedSpine;

public class GetAttributeSubIfcSectionedSpine {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSectionedSpine(Object object, String string) {
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
		if (string.equals("Dim")) {
			resultList.add(((IfcSectionedSpine) object).getDim());
			 //1int
		}
		else if (string.equals("SpineCurve")) {
			resultList.add(((IfcSectionedSpine) object).getSpineCurve());
			 //1IfcCompositeCurve
		}
		else if (string.equals("CrossSections")) {
			//3xxx
			for (int i = 0; i < ((IfcSectionedSpine) object).getCrossSections().size(); i++) {
				resultList.add(((IfcSectionedSpine) object).getCrossSections().get(i));
			}
			 //1EList
		}
		else if (string.equals("CrossSectionPositions")) {
			//3xxx
			for (int i = 0; i < ((IfcSectionedSpine) object).getCrossSectionPositions().size(); i++) {
				resultList.add(((IfcSectionedSpine) object).getCrossSectionPositions().get(i));
			}
			 //1EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcSectionedSpine) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcSectionedSpine) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSectionedSpine) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcSectionedSpine) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
