package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcGeneralProfileProperties;

public class GetAttributeSubIfcGeneralProfileProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcGeneralProfileProperties(Object object, String string) {
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
		if (string.equals("PhysicalWeightAsString")) {
			resultList.add(((IfcGeneralProfileProperties) object).getPhysicalWeightAsString());
			 //1String
		}
		else if (string.equals("MinimumPlateThickness")) {
			resultList.add(((IfcGeneralProfileProperties) object).getMinimumPlateThickness());
			 //1double
		}
		else if (string.equals("MaximumPlateThickness")) {
			resultList.add(((IfcGeneralProfileProperties) object).getMaximumPlateThickness());
			 //1double
		}
		else if (string.equals("CrossSectionAreaAsString")) {
			resultList.add(((IfcGeneralProfileProperties) object).getCrossSectionAreaAsString());
			 //1String
		}
		else if (string.equals("MinimumPlateThicknessAsString")) {
			resultList.add(((IfcGeneralProfileProperties) object).getMinimumPlateThicknessAsString());
			 //1String
		}
		else if (string.equals("MaximumPlateThicknessAsString")) {
			resultList.add(((IfcGeneralProfileProperties) object).getMaximumPlateThicknessAsString());
			 //1String
		}
		else if (string.equals("PhysicalWeight")) {
			resultList.add(((IfcGeneralProfileProperties) object).getPhysicalWeight());
			 //1double
		}
		else if (string.equals("PerimeterAsString")) {
			resultList.add(((IfcGeneralProfileProperties) object).getPerimeterAsString());
			 //1String
		}
		else if (string.equals("CrossSectionArea")) {
			resultList.add(((IfcGeneralProfileProperties) object).getCrossSectionArea());
			 //1double
		}
		else if (string.equals("Perimeter")) {
			resultList.add(((IfcGeneralProfileProperties) object).getPerimeter());
			 //1double
		}
		return resultList;
	}
}
