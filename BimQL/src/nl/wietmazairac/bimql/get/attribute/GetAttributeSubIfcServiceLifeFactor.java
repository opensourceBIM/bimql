package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcServiceLifeFactor {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcServiceLifeFactor(Object object, String string) {
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
		if (string.equals("UpperValue")) {
			resultList.add(((IfcServiceLifeFactor) object).getUpperValue());
			 //1IfcMeasureValue
		}
		else if (string.equals("MostUsedValue")) {
			resultList.add(((IfcServiceLifeFactor) object).getMostUsedValue());
			 //1IfcMeasureValue
		}
		else if (string.equals("LowerValue")) {
			resultList.add(((IfcServiceLifeFactor) object).getLowerValue());
			 //1IfcMeasureValue
		}
		else if (string.equals("PredefinedType")) {
			resultList.add(((IfcServiceLifeFactor) object).getPredefinedType());
			 //1IfcServiceLifeFactorTypeEnum
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLifeFactor) object).getDefinesType().size(); i++) {
				resultList.add(((IfcServiceLifeFactor) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLifeFactor) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcServiceLifeFactor) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLifeFactor) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcServiceLifeFactor) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcServiceLifeFactor) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcServiceLifeFactor) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcServiceLifeFactor) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcServiceLifeFactor) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcServiceLifeFactor) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
