package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSoundValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSoundValue(Object object, String string) {
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
		if (string.equals("Frequency")) {
			resultList.add(((IfcSoundValue) object).getFrequency());
			 //1double
		}
		else if (string.equals("FrequencyAsString")) {
			resultList.add(((IfcSoundValue) object).getFrequencyAsString());
			 //1String
		}
		else if (string.equals("SoundLevelTimeSeries")) {
			resultList.add(((IfcSoundValue) object).getSoundLevelTimeSeries());
			 //1IfcTimeSeries
		}
		else if (string.equals("SoundLevelSingleValue")) {
			resultList.add(((IfcSoundValue) object).getSoundLevelSingleValue());
			 //1IfcDerivedMeasureValue
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcSoundValue) object).getDefinesType().size(); i++) {
				resultList.add(((IfcSoundValue) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcSoundValue) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcSoundValue) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSoundValue) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSoundValue) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSoundValue) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSoundValue) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSoundValue) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSoundValue) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSoundValue) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
