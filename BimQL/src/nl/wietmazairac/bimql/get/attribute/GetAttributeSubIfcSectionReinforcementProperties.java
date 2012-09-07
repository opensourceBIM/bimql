package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSectionReinforcementProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSectionReinforcementProperties(Object object, String string) {
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
		if (string.equals("LongitudinalStartPosition")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getLongitudinalStartPosition());
			 //1double
		}
		else if (string.equals("LongitudinalEndPosition")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getLongitudinalEndPosition());
			 //1double
		}
		else if (string.equals("TransversePosition")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getTransversePosition());
			 //1double
		}
		else if (string.equals("ReinforcementRole")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getReinforcementRole());
			 //1IfcReinforcingBarRoleEnum
		}
		else if (string.equals("SectionDefinition")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getSectionDefinition());
			 //1IfcSectionProperties
		}
		else if (string.equals("LongitudinalStartPositionAsString")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getLongitudinalStartPositionAsString());
			 //1String
		}
		else if (string.equals("LongitudinalEndPositionAsString")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getLongitudinalEndPositionAsString());
			 //1String
		}
		else if (string.equals("TransversePositionAsString")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getTransversePositionAsString());
			 //1String
		}
		else if (string.equals("CrossSectionReinforcementDefinitions")) {
			//3xxx
			for (int i = 0; i < ((IfcSectionReinforcementProperties) object).getCrossSectionReinforcementDefinitions().size(); i++) {
				resultList.add(((IfcSectionReinforcementProperties) object).getCrossSectionReinforcementDefinitions().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
