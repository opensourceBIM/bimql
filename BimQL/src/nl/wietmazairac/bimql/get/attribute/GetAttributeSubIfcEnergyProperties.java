package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcEnergyProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcEnergyProperties(Object object, String string) {
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
		if (string.equals("UserDefinedEnergySequence")) {
			resultList.add(((IfcEnergyProperties) object).getUserDefinedEnergySequence());
			 //1String
		}
		else if (string.equals("EnergySequence")) {
			resultList.add(((IfcEnergyProperties) object).getEnergySequence());
			 //1IfcEnergySequenceEnum
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcEnergyProperties) object).getDefinesType().size(); i++) {
				resultList.add(((IfcEnergyProperties) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcEnergyProperties) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcEnergyProperties) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcEnergyProperties) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcEnergyProperties) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcEnergyProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcEnergyProperties) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcEnergyProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcEnergyProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcEnergyProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
