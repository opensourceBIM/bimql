package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTrimmedCurve {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTrimmedCurve(Object object, String string) {
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
		if (string.equals("BasisCurve")) {
			resultList.add(((IfcTrimmedCurve) object).getBasisCurve());
			 //1IfcCurve
		}
		else if (string.equals("Trim1")) {
			//3xxx
			for (int i = 0; i < ((IfcTrimmedCurve) object).getTrim1().size(); i++) {
				resultList.add(((IfcTrimmedCurve) object).getTrim1().get(i));
			}
			 //1EList
		}
		else if (string.equals("Trim2")) {
			//3xxx
			for (int i = 0; i < ((IfcTrimmedCurve) object).getTrim2().size(); i++) {
				resultList.add(((IfcTrimmedCurve) object).getTrim2().get(i));
			}
			 //1EList
		}
		else if (string.equals("SenseAgreement")) {
			resultList.add(((IfcTrimmedCurve) object).getSenseAgreement());
			 //1Tristate
		}
		else if (string.equals("MasterRepresentation")) {
			resultList.add(((IfcTrimmedCurve) object).getMasterRepresentation());
			 //1IfcTrimmingPreference
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcTrimmedCurve) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcTrimmedCurve) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcTrimmedCurve) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTrimmedCurve) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcTrimmedCurve) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
