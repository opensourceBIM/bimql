package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRibPlateProfileProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRibPlateProfileProperties(Object object, String string) {
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
		if (string.equals("RibHeight")) {
			resultList.add(((IfcRibPlateProfileProperties) object).getRibHeight());
			 //1double
		}
		else if (string.equals("RibWidth")) {
			resultList.add(((IfcRibPlateProfileProperties) object).getRibWidth());
			 //1double
		}
		else if (string.equals("RibSpacingAsString")) {
			resultList.add(((IfcRibPlateProfileProperties) object).getRibSpacingAsString());
			 //1String
		}
		else if (string.equals("RibHeightAsString")) {
			resultList.add(((IfcRibPlateProfileProperties) object).getRibHeightAsString());
			 //1String
		}
		else if (string.equals("RibWidthAsString")) {
			resultList.add(((IfcRibPlateProfileProperties) object).getRibWidthAsString());
			 //1String
		}
		else if (string.equals("RibSpacing")) {
			resultList.add(((IfcRibPlateProfileProperties) object).getRibSpacing());
			 //1double
		}
		else if (string.equals("ThicknessAsString")) {
			resultList.add(((IfcRibPlateProfileProperties) object).getThicknessAsString());
			 //1String
		}
		else if (string.equals("Direction")) {
			resultList.add(((IfcRibPlateProfileProperties) object).getDirection());
			 //1IfcRibPlateDirectionEnum
		}
		else if (string.equals("Thickness")) {
			resultList.add(((IfcRibPlateProfileProperties) object).getThickness());
			 //1double
		}
		return resultList;
	}
}
