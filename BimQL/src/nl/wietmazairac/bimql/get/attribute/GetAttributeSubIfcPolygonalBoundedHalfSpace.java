package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPolygonalBoundedHalfSpace;

public class GetAttributeSubIfcPolygonalBoundedHalfSpace {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPolygonalBoundedHalfSpace(Object object, String string) {
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
		if (string.equals("PolygonalBoundary")) {
			resultList.add(((IfcPolygonalBoundedHalfSpace) object).getPolygonalBoundary());
			 //1IfcBoundedCurve
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcPolygonalBoundedHalfSpace) object).getPosition());
			 //1IfcAxis2Placement3D
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcPolygonalBoundedHalfSpace) object).getDim());
			 //2int
		}
		else if (string.equals("BaseSurface")) {
			resultList.add(((IfcPolygonalBoundedHalfSpace) object).getBaseSurface());
			 //2IfcSurface
		}
		else if (string.equals("AgreementFlag")) {
			resultList.add(((IfcPolygonalBoundedHalfSpace) object).getAgreementFlag());
			 //2Tristate
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcPolygonalBoundedHalfSpace) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcPolygonalBoundedHalfSpace) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPolygonalBoundedHalfSpace) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcPolygonalBoundedHalfSpace) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
