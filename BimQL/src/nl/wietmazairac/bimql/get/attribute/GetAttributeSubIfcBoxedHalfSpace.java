package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcBoxedHalfSpace;

public class GetAttributeSubIfcBoxedHalfSpace {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBoxedHalfSpace(Object object, String string) {
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
		if (string.equals("Enclosure")) {
			resultList.add(((IfcBoxedHalfSpace) object).getEnclosure());
			 //1IfcBoundingBox
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcBoxedHalfSpace) object).getDim());
			 //2int
		}
		else if (string.equals("BaseSurface")) {
			resultList.add(((IfcBoxedHalfSpace) object).getBaseSurface());
			 //2IfcSurface
		}
		else if (string.equals("AgreementFlag")) {
			resultList.add(((IfcBoxedHalfSpace) object).getAgreementFlag());
			 //2Tristate
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcBoxedHalfSpace) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcBoxedHalfSpace) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBoxedHalfSpace) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcBoxedHalfSpace) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
