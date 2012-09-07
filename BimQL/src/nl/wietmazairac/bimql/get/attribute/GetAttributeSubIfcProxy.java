package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcProxy {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProxy(Object object, String string) {
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
		if (string.equals("ProxyType")) {
			resultList.add(((IfcProxy) object).getProxyType());
			 //1IfcObjectTypeEnum
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcProxy) object).getTag());
			 //1String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcProxy) object).getObjectPlacement());
			 //2IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcProxy) object).getRepresentation());
			 //2IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProxy) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcProxy) object).getReferencedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcProxy) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProxy) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcProxy) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcProxy) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcProxy) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProxy) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcProxy) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcProxy) object).getDecomposes().size(); i++) {
				resultList.add(((IfcProxy) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcProxy) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcProxy) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcProxy) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcProxy) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcProxy) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProxy) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcProxy) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
