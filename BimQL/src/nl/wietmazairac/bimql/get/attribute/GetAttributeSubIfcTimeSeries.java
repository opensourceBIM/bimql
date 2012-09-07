package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTimeSeries {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTimeSeries(Object object, String string) {
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
		if (string.equals("TimeSeriesDataType")) {
			resultList.add(((IfcTimeSeries) object).getTimeSeriesDataType());
			 //1IfcTimeSeriesDataTypeEnum
		}
		else if (string.equals("UserDefinedDataOrigin")) {
			resultList.add(((IfcTimeSeries) object).getUserDefinedDataOrigin());
			 //1String
		}
		else if (string.equals("DataOrigin")) {
			resultList.add(((IfcTimeSeries) object).getDataOrigin());
			 //1IfcDataOriginEnum
		}
		else if (string.equals("DocumentedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTimeSeries) object).getDocumentedBy().size(); i++) {
				resultList.add(((IfcTimeSeries) object).getDocumentedBy().get(i));
			}
			 //1EList
		}
		else if (string.equals("EndTime")) {
			resultList.add(((IfcTimeSeries) object).getEndTime());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("Unit")) {
			resultList.add(((IfcTimeSeries) object).getUnit());
			 //1IfcUnit
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTimeSeries) object).getName());
			 //1String
		}
		else if (string.equals("StartTime")) {
			resultList.add(((IfcTimeSeries) object).getStartTime());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcTimeSeries) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
