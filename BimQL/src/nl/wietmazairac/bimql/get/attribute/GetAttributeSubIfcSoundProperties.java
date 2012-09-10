package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSoundProperties;

public class GetAttributeSubIfcSoundProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSoundProperties(Object object, String string) {
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
		if (string.equals("IsAttenuating")) {
			resultList.add(((IfcSoundProperties) object).getIsAttenuating());
			 //1Tristate
		}
		else if (string.equals("SoundScale")) {
			resultList.add(((IfcSoundProperties) object).getSoundScale());
			 //1IfcSoundScaleEnum
		}
		else if (string.equals("SoundValues")) {
			//3xxx
			for (int i = 0; i < ((IfcSoundProperties) object).getSoundValues().size(); i++) {
				resultList.add(((IfcSoundProperties) object).getSoundValues().get(i));
			}
			 //1EList
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcSoundProperties) object).getDefinesType().size(); i++) {
				resultList.add(((IfcSoundProperties) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcSoundProperties) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcSoundProperties) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSoundProperties) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSoundProperties) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSoundProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSoundProperties) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSoundProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSoundProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSoundProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
