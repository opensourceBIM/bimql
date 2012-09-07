package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcReinforcementBarProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcReinforcementBarProperties(Object object, String string) {
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
		if (string.equals("TotalCrossSectionArea")) {
			resultList.add(((IfcReinforcementBarProperties) object).getTotalCrossSectionArea());
			 //1double
		}
		else if (string.equals("EffectiveDepthAsString")) {
			resultList.add(((IfcReinforcementBarProperties) object).getEffectiveDepthAsString());
			 //1String
		}
		else if (string.equals("SteelGrade")) {
			resultList.add(((IfcReinforcementBarProperties) object).getSteelGrade());
			 //1String
		}
		else if (string.equals("BarSurface")) {
			resultList.add(((IfcReinforcementBarProperties) object).getBarSurface());
			 //1IfcReinforcingBarSurfaceEnum
		}
		else if (string.equals("EffectiveDepth")) {
			resultList.add(((IfcReinforcementBarProperties) object).getEffectiveDepth());
			 //1double
		}
		else if (string.equals("BarCountAsString")) {
			resultList.add(((IfcReinforcementBarProperties) object).getBarCountAsString());
			 //1String
		}
		else if (string.equals("BarCount")) {
			resultList.add(((IfcReinforcementBarProperties) object).getBarCount());
			 //1double
		}
		else if (string.equals("NominalBarDiameter")) {
			resultList.add(((IfcReinforcementBarProperties) object).getNominalBarDiameter());
			 //1double
		}
		else if (string.equals("TotalCrossSectionAreaAsString")) {
			resultList.add(((IfcReinforcementBarProperties) object).getTotalCrossSectionAreaAsString());
			 //1String
		}
		else if (string.equals("NominalBarDiameterAsString")) {
			resultList.add(((IfcReinforcementBarProperties) object).getNominalBarDiameterAsString());
			 //1String
		}
		return resultList;
	}
}
