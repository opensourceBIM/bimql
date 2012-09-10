package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCartesianTransformationOperator2DnonUniform;

public class GetAttributeSubIfcCartesianTransformationOperator2DnonUniform {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCartesianTransformationOperator2DnonUniform(Object object, String string) {
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
		if (string.equals("Scale2AsString")) {
			resultList.add(((IfcCartesianTransformationOperator2DnonUniform) object).getScale2AsString());
			 //1String
		}
		else if (string.equals("Scale2")) {
			resultList.add(((IfcCartesianTransformationOperator2DnonUniform) object).getScale2());
			 //1double
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcCartesianTransformationOperator2DnonUniform) object).getDim());
			 //3int
		}
		else if (string.equals("Axis1")) {
			resultList.add(((IfcCartesianTransformationOperator2DnonUniform) object).getAxis1());
			 //3IfcDirection
		}
		else if (string.equals("Axis2")) {
			resultList.add(((IfcCartesianTransformationOperator2DnonUniform) object).getAxis2());
			 //3IfcDirection
		}
		else if (string.equals("Scale")) {
			resultList.add(((IfcCartesianTransformationOperator2DnonUniform) object).getScale());
			 //3double
		}
		else if (string.equals("LocalOrigin")) {
			resultList.add(((IfcCartesianTransformationOperator2DnonUniform) object).getLocalOrigin());
			 //3IfcCartesianPoint
		}
		else if (string.equals("ScaleAsString")) {
			resultList.add(((IfcCartesianTransformationOperator2DnonUniform) object).getScaleAsString());
			 //3String
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcCartesianTransformationOperator2DnonUniform) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcCartesianTransformationOperator2DnonUniform) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCartesianTransformationOperator2DnonUniform) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcCartesianTransformationOperator2DnonUniform) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
