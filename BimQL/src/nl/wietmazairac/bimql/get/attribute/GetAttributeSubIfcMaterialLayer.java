package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcMaterialLayer {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMaterialLayer(Object object, String string) {
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
		if (string.equals("LayerThicknessAsString")) {
			resultList.add(((IfcMaterialLayer) object).getLayerThicknessAsString());
			 //1String
		}
		else if (string.equals("ToMaterialLayerSet")) {
			resultList.add(((IfcMaterialLayer) object).getToMaterialLayerSet());
			 //1IfcMaterialLayerSet
		}
		else if (string.equals("LayerThickness")) {
			resultList.add(((IfcMaterialLayer) object).getLayerThickness());
			 //1double
		}
		else if (string.equals("IsVentilated")) {
			resultList.add(((IfcMaterialLayer) object).getIsVentilated());
			 //1Tristate
		}
		else if (string.equals("Material")) {
			resultList.add(((IfcMaterialLayer) object).getMaterial());
			 //1IfcMaterial
		}
		return resultList;
	}
}
