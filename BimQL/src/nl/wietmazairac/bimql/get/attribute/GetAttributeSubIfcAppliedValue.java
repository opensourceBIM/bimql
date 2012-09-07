package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcAppliedValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAppliedValue(Object object, String string) {
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
		if (string.equals("UnitBasis")) {
			resultList.add(((IfcAppliedValue) object).getUnitBasis());
			 //1IfcMeasureWithUnit
		}
		else if (string.equals("AppliedValue")) {
			resultList.add(((IfcAppliedValue) object).getAppliedValue());
			 //1IfcAppliedValueSelect
		}
		else if (string.equals("ApplicableDate")) {
			resultList.add(((IfcAppliedValue) object).getApplicableDate());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("FixedUntilDate")) {
			resultList.add(((IfcAppliedValue) object).getFixedUntilDate());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("ValuesReferenced")) {
			//3xxx
			for (int i = 0; i < ((IfcAppliedValue) object).getValuesReferenced().size(); i++) {
				resultList.add(((IfcAppliedValue) object).getValuesReferenced().get(i));
			}
			 //1EList
		}
		else if (string.equals("ValueOfComponents")) {
			//3xxx
			for (int i = 0; i < ((IfcAppliedValue) object).getValueOfComponents().size(); i++) {
				resultList.add(((IfcAppliedValue) object).getValueOfComponents().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsComponentIn")) {
			//3xxx
			for (int i = 0; i < ((IfcAppliedValue) object).getIsComponentIn().size(); i++) {
				resultList.add(((IfcAppliedValue) object).getIsComponentIn().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcAppliedValue) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcAppliedValue) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
