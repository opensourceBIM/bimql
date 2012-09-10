package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcGeometricRepresentationContext;

public class GetAttributeSubIfcGeometricRepresentationContext {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcGeometricRepresentationContext(Object object, String string) {
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
		if (string.equals("PrecisionAsString")) {
			resultList.add(((IfcGeometricRepresentationContext) object).getPrecisionAsString());
			 //1String
		}
		else if (string.equals("HasSubContexts")) {
			//3xxx
			for (int i = 0; i < ((IfcGeometricRepresentationContext) object).getHasSubContexts().size(); i++) {
				resultList.add(((IfcGeometricRepresentationContext) object).getHasSubContexts().get(i));
			}
			 //1EList
		}
		else if (string.equals("Precision")) {
			resultList.add(((IfcGeometricRepresentationContext) object).getPrecision());
			 //1double
		}
		else if (string.equals("TrueNorth")) {
			resultList.add(((IfcGeometricRepresentationContext) object).getTrueNorth());
			 //1IfcDirection
		}
		else if (string.equals("CoordinateSpaceDimension")) {
			resultList.add(((IfcGeometricRepresentationContext) object).getCoordinateSpaceDimension());
			 //1int
		}
		else if (string.equals("WorldCoordinateSystem")) {
			resultList.add(((IfcGeometricRepresentationContext) object).getWorldCoordinateSystem());
			 //1IfcAxis2Placement
		}
		return resultList;
	}
}
