package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcElementAssembly {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcElementAssembly(Object object, String string) {
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
		if (string.equals("PredefinedType")) {
			resultList.add(((IfcElementAssembly) object).getPredefinedType());
			 //1IfcElementAssemblyTypeEnum
		}
		else if (string.equals("AssemblyPlace")) {
			resultList.add(((IfcElementAssembly) object).getAssemblyPlace());
			 //1IfcAssemblyPlaceEnum
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getHasStructuralMember().get(i));
			}
			 //2EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getReferencedInStructures().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getIsConnectionRealization().get(i));
			}
			 //2EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getProvidesBoundaries().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getContainedInStructure().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getHasPorts().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getHasPorts().get(i));
			}
			 //2EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getFillsVoids().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getConnectedTo().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getHasCoverings().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getHasProjections().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getHasProjections().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getHasOpenings().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getConnectedFrom().get(i));
			}
			 //2EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcElementAssembly) object).getTag());
			 //2String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcElementAssembly) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcElementAssembly) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcElementAssembly) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getDecomposes().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcElementAssembly) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcElementAssembly) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcElementAssembly) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcElementAssembly) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcElementAssembly) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcElementAssembly) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcElementAssembly) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
