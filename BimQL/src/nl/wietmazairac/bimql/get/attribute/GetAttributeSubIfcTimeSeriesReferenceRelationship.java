package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTimeSeriesReferenceRelationship;

public class GetAttributeSubIfcTimeSeriesReferenceRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTimeSeriesReferenceRelationship(Object object, String string) {
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
		if (string.equals("ReferencedTimeSeries")) {
			resultList.add(((IfcTimeSeriesReferenceRelationship) object).getReferencedTimeSeries());
			 //1IfcTimeSeries
		}
		else if (string.equals("TimeSeriesReferences")) {
			//3xxx
			for (int i = 0; i < ((IfcTimeSeriesReferenceRelationship) object).getTimeSeriesReferences().size(); i++) {
				resultList.add(((IfcTimeSeriesReferenceRelationship) object).getTimeSeriesReferences().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
