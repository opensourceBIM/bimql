package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcTimeSeries;

public class SetAttributeSubIfcTimeSeries {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTimeSeries() {
	}

	public SetAttributeSubIfcTimeSeries(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("TimeSeriesDataType")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeriesDataTypeEnum
		}
		else if (attributeName.equals("UserDefinedDataOrigin")) {
			//1NoEList
			((IfcTimeSeries) object).setUserDefinedDataOrigin(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Unit")) {
			//1NoEList
			 //1void
			 //1IfcUnit
		}
		else if (attributeName.equals("EndTime")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("DataOrigin")) {
			//1NoEList
			 //1void
			 //1IfcDataOriginEnum
		}
		else if (attributeName.equals("Name")) {
			//1NoEList
			((IfcTimeSeries) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("StartTime")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("Description")) {
			//1NoEList
			((IfcTimeSeries) object).setDescription(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
