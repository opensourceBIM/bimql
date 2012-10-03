package nl.wietmazairac.bimql.set.attribute;

import java.util.List;

import org.bimserver.models.ifc2x3tc1.IfcRoot;

public class SetAttributeMain {
	// fields
	private List<Object> objectList;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeMain() {
	}

	public SetAttributeMain(List<Object> objectList, String attributeName, String attributeNewValue) {
		this.objectList = objectList;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public List<Object> getList() {
		return objectList;
	}

	public void setList(List<Object> objectList) {
		this.objectList = objectList;
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
		System.out.println(objectList.size());
		for (Object object : objectList) {
			if (((IfcRoot) object).eClass().getName().equals("Ifc2DCompositeCurve")) {
				SetAttributeSubIfc2DCompositeCurve setAttributeSubIfc2DCompositeCurve = new SetAttributeSubIfc2DCompositeCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfc2DCompositeCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("Ifc2x3Factory")) {
				SetAttributeSubIfc2x3Factory setAttributeSubIfc2x3Factory = new SetAttributeSubIfc2x3Factory(object, attributeName, attributeNewValue);
				setAttributeSubIfc2x3Factory.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("Ifc2x3tc1Package")) {
				SetAttributeSubIfc2x3Package setAttributeSubIfc2x3tc1Package = new SetAttributeSubIfc2x3Package(object, attributeName, attributeNewValue);
				setAttributeSubIfc2x3tc1Package.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAbsorbedDoseMeasure")) {
				SetAttributeSubIfcAbsorbedDoseMeasure setAttributeSubIfcAbsorbedDoseMeasure = new SetAttributeSubIfcAbsorbedDoseMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcAbsorbedDoseMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAccelerationMeasure")) {
				SetAttributeSubIfcAccelerationMeasure setAttributeSubIfcAccelerationMeasure = new SetAttributeSubIfcAccelerationMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcAccelerationMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcActionRequest")) {
				SetAttributeSubIfcActionRequest setAttributeSubIfcActionRequest = new SetAttributeSubIfcActionRequest(object, attributeName, attributeNewValue);
				setAttributeSubIfcActionRequest.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcActor")) {
				SetAttributeSubIfcActor setAttributeSubIfcActor = new SetAttributeSubIfcActor(object, attributeName, attributeNewValue);
				setAttributeSubIfcActor.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcActorRole")) {
				SetAttributeSubIfcActorRole setAttributeSubIfcActorRole = new SetAttributeSubIfcActorRole(object, attributeName, attributeNewValue);
				setAttributeSubIfcActorRole.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcActuatorType")) {
				SetAttributeSubIfcActuatorType setAttributeSubIfcActuatorType = new SetAttributeSubIfcActuatorType(object, attributeName, attributeNewValue);
				setAttributeSubIfcActuatorType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAddress")) {
				SetAttributeSubIfcAddress setAttributeSubIfcAddress = new SetAttributeSubIfcAddress(object, attributeName, attributeNewValue);
				setAttributeSubIfcAddress.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAirTerminalBoxType")) {
				SetAttributeSubIfcAirTerminalBoxType setAttributeSubIfcAirTerminalBoxType = new SetAttributeSubIfcAirTerminalBoxType(object, attributeName, attributeNewValue);
				setAttributeSubIfcAirTerminalBoxType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAirTerminalType")) {
				SetAttributeSubIfcAirTerminalType setAttributeSubIfcAirTerminalType = new SetAttributeSubIfcAirTerminalType(object, attributeName, attributeNewValue);
				setAttributeSubIfcAirTerminalType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAirToAirHeatRecoveryType")) {
				SetAttributeSubIfcAirToAirHeatRecoveryType setAttributeSubIfcAirToAirHeatRecoveryType = new SetAttributeSubIfcAirToAirHeatRecoveryType(object, attributeName, attributeNewValue);
				setAttributeSubIfcAirToAirHeatRecoveryType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAlarmType")) {
				SetAttributeSubIfcAlarmType setAttributeSubIfcAlarmType = new SetAttributeSubIfcAlarmType(object, attributeName, attributeNewValue);
				setAttributeSubIfcAlarmType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAmountOfSubstanceMeasure")) {
				SetAttributeSubIfcAmountOfSubstanceMeasure setAttributeSubIfcAmountOfSubstanceMeasure = new SetAttributeSubIfcAmountOfSubstanceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcAmountOfSubstanceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAngularDimension")) {
				SetAttributeSubIfcAngularDimension setAttributeSubIfcAngularDimension = new SetAttributeSubIfcAngularDimension(object, attributeName, attributeNewValue);
				setAttributeSubIfcAngularDimension.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAngularVelocityMeasure")) {
				SetAttributeSubIfcAngularVelocityMeasure setAttributeSubIfcAngularVelocityMeasure = new SetAttributeSubIfcAngularVelocityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcAngularVelocityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationCurveOccurrence")) {
				SetAttributeSubIfcAnnotationCurveOccurrence setAttributeSubIfcAnnotationCurveOccurrence = new SetAttributeSubIfcAnnotationCurveOccurrence(object, attributeName, attributeNewValue);
				setAttributeSubIfcAnnotationCurveOccurrence.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationFillArea")) {
				SetAttributeSubIfcAnnotationFillArea setAttributeSubIfcAnnotationFillArea = new SetAttributeSubIfcAnnotationFillArea(object, attributeName, attributeNewValue);
				setAttributeSubIfcAnnotationFillArea.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationFillAreaOccurrence")) {
				SetAttributeSubIfcAnnotationFillAreaOccurrence setAttributeSubIfcAnnotationFillAreaOccurrence = new SetAttributeSubIfcAnnotationFillAreaOccurrence(object, attributeName, attributeNewValue);
				setAttributeSubIfcAnnotationFillAreaOccurrence.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotation")) {
				SetAttributeSubIfcAnnotation setAttributeSubIfcAnnotation = new SetAttributeSubIfcAnnotation(object, attributeName, attributeNewValue);
				setAttributeSubIfcAnnotation.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationOccurrence")) {
				SetAttributeSubIfcAnnotationOccurrence setAttributeSubIfcAnnotationOccurrence = new SetAttributeSubIfcAnnotationOccurrence(object, attributeName, attributeNewValue);
				setAttributeSubIfcAnnotationOccurrence.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationSurface")) {
				SetAttributeSubIfcAnnotationSurface setAttributeSubIfcAnnotationSurface = new SetAttributeSubIfcAnnotationSurface(object, attributeName, attributeNewValue);
				setAttributeSubIfcAnnotationSurface.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationSurfaceOccurrence")) {
				SetAttributeSubIfcAnnotationSurfaceOccurrence setAttributeSubIfcAnnotationSurfaceOccurrence = new SetAttributeSubIfcAnnotationSurfaceOccurrence(object, attributeName, attributeNewValue);
				setAttributeSubIfcAnnotationSurfaceOccurrence.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationSymbolOccurrence")) {
				SetAttributeSubIfcAnnotationSymbolOccurrence setAttributeSubIfcAnnotationSymbolOccurrence = new SetAttributeSubIfcAnnotationSymbolOccurrence(object, attributeName, attributeNewValue);
				setAttributeSubIfcAnnotationSymbolOccurrence.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationTextOccurrence")) {
				SetAttributeSubIfcAnnotationTextOccurrence setAttributeSubIfcAnnotationTextOccurrence = new SetAttributeSubIfcAnnotationTextOccurrence(object, attributeName, attributeNewValue);
				setAttributeSubIfcAnnotationTextOccurrence.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcApplication")) {
				SetAttributeSubIfcApplication setAttributeSubIfcApplication = new SetAttributeSubIfcApplication(object, attributeName, attributeNewValue);
				setAttributeSubIfcApplication.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAppliedValue")) {
				SetAttributeSubIfcAppliedValue setAttributeSubIfcAppliedValue = new SetAttributeSubIfcAppliedValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcAppliedValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAppliedValueRelationship")) {
				SetAttributeSubIfcAppliedValueRelationship setAttributeSubIfcAppliedValueRelationship = new SetAttributeSubIfcAppliedValueRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcAppliedValueRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcApprovalActorRelationship")) {
				SetAttributeSubIfcApprovalActorRelationship setAttributeSubIfcApprovalActorRelationship = new SetAttributeSubIfcApprovalActorRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcApprovalActorRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcApproval")) {
				SetAttributeSubIfcApproval setAttributeSubIfcApproval = new SetAttributeSubIfcApproval(object, attributeName, attributeNewValue);
				setAttributeSubIfcApproval.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcApprovalPropertyRelationship")) {
				SetAttributeSubIfcApprovalPropertyRelationship setAttributeSubIfcApprovalPropertyRelationship = new SetAttributeSubIfcApprovalPropertyRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcApprovalPropertyRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcApprovalRelationship")) {
				SetAttributeSubIfcApprovalRelationship setAttributeSubIfcApprovalRelationship = new SetAttributeSubIfcApprovalRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcApprovalRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcArbitraryClosedProfileDef")) {
				SetAttributeSubIfcArbitraryClosedProfileDef setAttributeSubIfcArbitraryClosedProfileDef = new SetAttributeSubIfcArbitraryClosedProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcArbitraryClosedProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcArbitraryOpenProfileDef")) {
				SetAttributeSubIfcArbitraryOpenProfileDef setAttributeSubIfcArbitraryOpenProfileDef = new SetAttributeSubIfcArbitraryOpenProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcArbitraryOpenProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcArbitraryProfileDefWithVoids")) {
				SetAttributeSubIfcArbitraryProfileDefWithVoids setAttributeSubIfcArbitraryProfileDefWithVoids = new SetAttributeSubIfcArbitraryProfileDefWithVoids(object, attributeName, attributeNewValue);
				setAttributeSubIfcArbitraryProfileDefWithVoids.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAreaMeasure")) {
				SetAttributeSubIfcAreaMeasure setAttributeSubIfcAreaMeasure = new SetAttributeSubIfcAreaMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcAreaMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAsset")) {
				SetAttributeSubIfcAsset setAttributeSubIfcAsset = new SetAttributeSubIfcAsset(object, attributeName, attributeNewValue);
				setAttributeSubIfcAsset.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAsymmetricIShapeProfileDef")) {
				SetAttributeSubIfcAsymmetricIShapeProfileDef setAttributeSubIfcAsymmetricIShapeProfileDef = new SetAttributeSubIfcAsymmetricIShapeProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcAsymmetricIShapeProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAxis1Placement")) {
				SetAttributeSubIfcAxis1Placement setAttributeSubIfcAxis1Placement = new SetAttributeSubIfcAxis1Placement(object, attributeName, attributeNewValue);
				setAttributeSubIfcAxis1Placement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAxis2Placement2D")) {
				SetAttributeSubIfcAxis2Placement2D setAttributeSubIfcAxis2Placement2D = new SetAttributeSubIfcAxis2Placement2D(object, attributeName, attributeNewValue);
				setAttributeSubIfcAxis2Placement2D.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAxis2Placement3D")) {
				SetAttributeSubIfcAxis2Placement3D setAttributeSubIfcAxis2Placement3D = new SetAttributeSubIfcAxis2Placement3D(object, attributeName, attributeNewValue);
				setAttributeSubIfcAxis2Placement3D.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBSplineCurve")) {
				SetAttributeSubIfcBSplineCurve setAttributeSubIfcBSplineCurve = new SetAttributeSubIfcBSplineCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfcBSplineCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBeam")) {
				SetAttributeSubIfcBeam setAttributeSubIfcBeam = new SetAttributeSubIfcBeam(object, attributeName, attributeNewValue);
				setAttributeSubIfcBeam.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBeamType")) {
				SetAttributeSubIfcBeamType setAttributeSubIfcBeamType = new SetAttributeSubIfcBeamType(object, attributeName, attributeNewValue);
				setAttributeSubIfcBeamType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBezierCurve")) {
				SetAttributeSubIfcBezierCurve setAttributeSubIfcBezierCurve = new SetAttributeSubIfcBezierCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfcBezierCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBlobTexture")) {
				SetAttributeSubIfcBlobTexture setAttributeSubIfcBlobTexture = new SetAttributeSubIfcBlobTexture(object, attributeName, attributeNewValue);
				setAttributeSubIfcBlobTexture.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBlock")) {
				SetAttributeSubIfcBlock setAttributeSubIfcBlock = new SetAttributeSubIfcBlock(object, attributeName, attributeNewValue);
				setAttributeSubIfcBlock.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoilerType")) {
				SetAttributeSubIfcBoilerType setAttributeSubIfcBoilerType = new SetAttributeSubIfcBoilerType(object, attributeName, attributeNewValue);
				setAttributeSubIfcBoilerType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBooleanClippingResult")) {
				SetAttributeSubIfcBooleanClippingResult setAttributeSubIfcBooleanClippingResult = new SetAttributeSubIfcBooleanClippingResult(object, attributeName, attributeNewValue);
				setAttributeSubIfcBooleanClippingResult.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoolean")) {
				SetAttributeSubIfcBoolean setAttributeSubIfcBoolean = new SetAttributeSubIfcBoolean(object, attributeName, attributeNewValue);
				setAttributeSubIfcBoolean.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBooleanResult")) {
				SetAttributeSubIfcBooleanResult setAttributeSubIfcBooleanResult = new SetAttributeSubIfcBooleanResult(object, attributeName, attributeNewValue);
				setAttributeSubIfcBooleanResult.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundaryCondition")) {
				SetAttributeSubIfcBoundaryCondition setAttributeSubIfcBoundaryCondition = new SetAttributeSubIfcBoundaryCondition(object, attributeName, attributeNewValue);
				setAttributeSubIfcBoundaryCondition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundaryEdgeCondition")) {
				SetAttributeSubIfcBoundaryEdgeCondition setAttributeSubIfcBoundaryEdgeCondition = new SetAttributeSubIfcBoundaryEdgeCondition(object, attributeName, attributeNewValue);
				setAttributeSubIfcBoundaryEdgeCondition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundaryFaceCondition")) {
				SetAttributeSubIfcBoundaryFaceCondition setAttributeSubIfcBoundaryFaceCondition = new SetAttributeSubIfcBoundaryFaceCondition(object, attributeName, attributeNewValue);
				setAttributeSubIfcBoundaryFaceCondition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundaryNodeCondition")) {
				SetAttributeSubIfcBoundaryNodeCondition setAttributeSubIfcBoundaryNodeCondition = new SetAttributeSubIfcBoundaryNodeCondition(object, attributeName, attributeNewValue);
				setAttributeSubIfcBoundaryNodeCondition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundaryNodeConditionWarping")) {
				SetAttributeSubIfcBoundaryNodeConditionWarping setAttributeSubIfcBoundaryNodeConditionWarping = new SetAttributeSubIfcBoundaryNodeConditionWarping(object, attributeName, attributeNewValue);
				setAttributeSubIfcBoundaryNodeConditionWarping.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundedCurve")) {
				SetAttributeSubIfcBoundedCurve setAttributeSubIfcBoundedCurve = new SetAttributeSubIfcBoundedCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfcBoundedCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundedSurface")) {
				SetAttributeSubIfcBoundedSurface setAttributeSubIfcBoundedSurface = new SetAttributeSubIfcBoundedSurface(object, attributeName, attributeNewValue);
				setAttributeSubIfcBoundedSurface.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundingBox")) {
				SetAttributeSubIfcBoundingBox setAttributeSubIfcBoundingBox = new SetAttributeSubIfcBoundingBox(object, attributeName, attributeNewValue);
				setAttributeSubIfcBoundingBox.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoxedHalfSpace")) {
				SetAttributeSubIfcBoxedHalfSpace setAttributeSubIfcBoxedHalfSpace = new SetAttributeSubIfcBoxedHalfSpace(object, attributeName, attributeNewValue);
				setAttributeSubIfcBoxedHalfSpace.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElementComponent")) {
				SetAttributeSubIfcBuildingElementComponent setAttributeSubIfcBuildingElementComponent = new SetAttributeSubIfcBuildingElementComponent(object, attributeName, attributeNewValue);
				setAttributeSubIfcBuildingElementComponent.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElement")) {
				SetAttributeSubIfcBuildingElement setAttributeSubIfcBuildingElement = new SetAttributeSubIfcBuildingElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcBuildingElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElementPart")) {
				SetAttributeSubIfcBuildingElementPart setAttributeSubIfcBuildingElementPart = new SetAttributeSubIfcBuildingElementPart(object, attributeName, attributeNewValue);
				setAttributeSubIfcBuildingElementPart.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElementProxy")) {
				SetAttributeSubIfcBuildingElementProxy setAttributeSubIfcBuildingElementProxy = new SetAttributeSubIfcBuildingElementProxy(object, attributeName, attributeNewValue);
				setAttributeSubIfcBuildingElementProxy.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElementProxyType")) {
				SetAttributeSubIfcBuildingElementProxyType setAttributeSubIfcBuildingElementProxyType = new SetAttributeSubIfcBuildingElementProxyType(object, attributeName, attributeNewValue);
				setAttributeSubIfcBuildingElementProxyType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElementType")) {
				SetAttributeSubIfcBuildingElementType setAttributeSubIfcBuildingElementType = new SetAttributeSubIfcBuildingElementType(object, attributeName, attributeNewValue);
				setAttributeSubIfcBuildingElementType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuilding")) {
				SetAttributeSubIfcBuilding setAttributeSubIfcBuilding = new SetAttributeSubIfcBuilding(object, attributeName, attributeNewValue);
				setAttributeSubIfcBuilding.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingStorey")) {
				SetAttributeSubIfcBuildingStorey setAttributeSubIfcBuildingStorey = new SetAttributeSubIfcBuildingStorey(object, attributeName, attributeNewValue);
				setAttributeSubIfcBuildingStorey.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCShapeProfileDef")) {
				SetAttributeSubIfcCShapeProfileDef setAttributeSubIfcCShapeProfileDef = new SetAttributeSubIfcCShapeProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcCShapeProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCableCarrierFittingType")) {
				SetAttributeSubIfcCableCarrierFittingType setAttributeSubIfcCableCarrierFittingType = new SetAttributeSubIfcCableCarrierFittingType(object, attributeName, attributeNewValue);
				setAttributeSubIfcCableCarrierFittingType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCableCarrierSegmentType")) {
				SetAttributeSubIfcCableCarrierSegmentType setAttributeSubIfcCableCarrierSegmentType = new SetAttributeSubIfcCableCarrierSegmentType(object, attributeName, attributeNewValue);
				setAttributeSubIfcCableCarrierSegmentType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCableSegmentType")) {
				SetAttributeSubIfcCableSegmentType setAttributeSubIfcCableSegmentType = new SetAttributeSubIfcCableSegmentType(object, attributeName, attributeNewValue);
				setAttributeSubIfcCableSegmentType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCalendarDate")) {
				SetAttributeSubIfcCalendarDate setAttributeSubIfcCalendarDate = new SetAttributeSubIfcCalendarDate(object, attributeName, attributeNewValue);
				setAttributeSubIfcCalendarDate.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianPoint")) {
				SetAttributeSubIfcCartesianPoint setAttributeSubIfcCartesianPoint = new SetAttributeSubIfcCartesianPoint(object, attributeName, attributeNewValue);
				setAttributeSubIfcCartesianPoint.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianTransformationOperator2D")) {
				SetAttributeSubIfcCartesianTransformationOperator2D setAttributeSubIfcCartesianTransformationOperator2D = new SetAttributeSubIfcCartesianTransformationOperator2D(object, attributeName, attributeNewValue);
				setAttributeSubIfcCartesianTransformationOperator2D.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianTransformationOperator2DnonUniform")) {
				SetAttributeSubIfcCartesianTransformationOperator2DnonUniform setAttributeSubIfcCartesianTransformationOperator2DnonUniform = new SetAttributeSubIfcCartesianTransformationOperator2DnonUniform(object, attributeName, attributeNewValue);
				setAttributeSubIfcCartesianTransformationOperator2DnonUniform.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianTransformationOperator3D")) {
				SetAttributeSubIfcCartesianTransformationOperator3D setAttributeSubIfcCartesianTransformationOperator3D = new SetAttributeSubIfcCartesianTransformationOperator3D(object, attributeName, attributeNewValue);
				setAttributeSubIfcCartesianTransformationOperator3D.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianTransformationOperator3DnonUniform")) {
				SetAttributeSubIfcCartesianTransformationOperator3DnonUniform setAttributeSubIfcCartesianTransformationOperator3DnonUniform = new SetAttributeSubIfcCartesianTransformationOperator3DnonUniform(object, attributeName, attributeNewValue);
				setAttributeSubIfcCartesianTransformationOperator3DnonUniform.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianTransformationOperator")) {
				SetAttributeSubIfcCartesianTransformationOperator setAttributeSubIfcCartesianTransformationOperator = new SetAttributeSubIfcCartesianTransformationOperator(object, attributeName, attributeNewValue);
				setAttributeSubIfcCartesianTransformationOperator.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCenterLineProfileDef")) {
				SetAttributeSubIfcCenterLineProfileDef setAttributeSubIfcCenterLineProfileDef = new SetAttributeSubIfcCenterLineProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcCenterLineProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcChamferEdgeFeature")) {
				SetAttributeSubIfcChamferEdgeFeature setAttributeSubIfcChamferEdgeFeature = new SetAttributeSubIfcChamferEdgeFeature(object, attributeName, attributeNewValue);
				setAttributeSubIfcChamferEdgeFeature.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcChillerType")) {
				SetAttributeSubIfcChillerType setAttributeSubIfcChillerType = new SetAttributeSubIfcChillerType(object, attributeName, attributeNewValue);
				setAttributeSubIfcChillerType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCircleHollowProfileDef")) {
				SetAttributeSubIfcCircleHollowProfileDef setAttributeSubIfcCircleHollowProfileDef = new SetAttributeSubIfcCircleHollowProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcCircleHollowProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCircle")) {
				SetAttributeSubIfcCircle setAttributeSubIfcCircle = new SetAttributeSubIfcCircle(object, attributeName, attributeNewValue);
				setAttributeSubIfcCircle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCircleProfileDef")) {
				SetAttributeSubIfcCircleProfileDef setAttributeSubIfcCircleProfileDef = new SetAttributeSubIfcCircleProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcCircleProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassification")) {
				SetAttributeSubIfcClassification setAttributeSubIfcClassification = new SetAttributeSubIfcClassification(object, attributeName, attributeNewValue);
				setAttributeSubIfcClassification.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassificationItem")) {
				SetAttributeSubIfcClassificationItem setAttributeSubIfcClassificationItem = new SetAttributeSubIfcClassificationItem(object, attributeName, attributeNewValue);
				setAttributeSubIfcClassificationItem.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassificationItemRelationship")) {
				SetAttributeSubIfcClassificationItemRelationship setAttributeSubIfcClassificationItemRelationship = new SetAttributeSubIfcClassificationItemRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcClassificationItemRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassificationNotationFacet")) {
				SetAttributeSubIfcClassificationNotationFacet setAttributeSubIfcClassificationNotationFacet = new SetAttributeSubIfcClassificationNotationFacet(object, attributeName, attributeNewValue);
				setAttributeSubIfcClassificationNotationFacet.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassificationNotation")) {
				SetAttributeSubIfcClassificationNotation setAttributeSubIfcClassificationNotation = new SetAttributeSubIfcClassificationNotation(object, attributeName, attributeNewValue);
				setAttributeSubIfcClassificationNotation.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassificationReference")) {
				SetAttributeSubIfcClassificationReference setAttributeSubIfcClassificationReference = new SetAttributeSubIfcClassificationReference(object, attributeName, attributeNewValue);
				setAttributeSubIfcClassificationReference.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClosedShell")) {
				SetAttributeSubIfcClosedShell setAttributeSubIfcClosedShell = new SetAttributeSubIfcClosedShell(object, attributeName, attributeNewValue);
				setAttributeSubIfcClosedShell.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCoilType")) {
				SetAttributeSubIfcCoilType setAttributeSubIfcCoilType = new SetAttributeSubIfcCoilType(object, attributeName, attributeNewValue);
				setAttributeSubIfcCoilType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcColourRgb")) {
				SetAttributeSubIfcColourRgb setAttributeSubIfcColourRgb = new SetAttributeSubIfcColourRgb(object, attributeName, attributeNewValue);
				setAttributeSubIfcColourRgb.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcColourSpecification")) {
				SetAttributeSubIfcColourSpecification setAttributeSubIfcColourSpecification = new SetAttributeSubIfcColourSpecification(object, attributeName, attributeNewValue);
				setAttributeSubIfcColourSpecification.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcColumn")) {
				SetAttributeSubIfcColumn setAttributeSubIfcColumn = new SetAttributeSubIfcColumn(object, attributeName, attributeNewValue);
				setAttributeSubIfcColumn.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcColumnType")) {
				SetAttributeSubIfcColumnType setAttributeSubIfcColumnType = new SetAttributeSubIfcColumnType(object, attributeName, attributeNewValue);
				setAttributeSubIfcColumnType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcComplexProperty")) {
				SetAttributeSubIfcComplexProperty setAttributeSubIfcComplexProperty = new SetAttributeSubIfcComplexProperty(object, attributeName, attributeNewValue);
				setAttributeSubIfcComplexProperty.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCompositeCurve")) {
				SetAttributeSubIfcCompositeCurve setAttributeSubIfcCompositeCurve = new SetAttributeSubIfcCompositeCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfcCompositeCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCompositeCurveSegment")) {
				SetAttributeSubIfcCompositeCurveSegment setAttributeSubIfcCompositeCurveSegment = new SetAttributeSubIfcCompositeCurveSegment(object, attributeName, attributeNewValue);
				setAttributeSubIfcCompositeCurveSegment.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCompositeProfileDef")) {
				SetAttributeSubIfcCompositeProfileDef setAttributeSubIfcCompositeProfileDef = new SetAttributeSubIfcCompositeProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcCompositeProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCompressorType")) {
				SetAttributeSubIfcCompressorType setAttributeSubIfcCompressorType = new SetAttributeSubIfcCompressorType(object, attributeName, attributeNewValue);
				setAttributeSubIfcCompressorType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCondenserType")) {
				SetAttributeSubIfcCondenserType setAttributeSubIfcCondenserType = new SetAttributeSubIfcCondenserType(object, attributeName, attributeNewValue);
				setAttributeSubIfcCondenserType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConditionCriterion")) {
				SetAttributeSubIfcConditionCriterion setAttributeSubIfcConditionCriterion = new SetAttributeSubIfcConditionCriterion(object, attributeName, attributeNewValue);
				setAttributeSubIfcConditionCriterion.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCondition")) {
				SetAttributeSubIfcCondition setAttributeSubIfcCondition = new SetAttributeSubIfcCondition(object, attributeName, attributeNewValue);
				setAttributeSubIfcCondition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConic")) {
				SetAttributeSubIfcConic setAttributeSubIfcConic = new SetAttributeSubIfcConic(object, attributeName, attributeNewValue);
				setAttributeSubIfcConic.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectedFaceSet")) {
				SetAttributeSubIfcConnectedFaceSet setAttributeSubIfcConnectedFaceSet = new SetAttributeSubIfcConnectedFaceSet(object, attributeName, attributeNewValue);
				setAttributeSubIfcConnectedFaceSet.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionCurveGeometry")) {
				SetAttributeSubIfcConnectionCurveGeometry setAttributeSubIfcConnectionCurveGeometry = new SetAttributeSubIfcConnectionCurveGeometry(object, attributeName, attributeNewValue);
				setAttributeSubIfcConnectionCurveGeometry.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionGeometry")) {
				SetAttributeSubIfcConnectionGeometry setAttributeSubIfcConnectionGeometry = new SetAttributeSubIfcConnectionGeometry(object, attributeName, attributeNewValue);
				setAttributeSubIfcConnectionGeometry.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionPointEccentricity")) {
				SetAttributeSubIfcConnectionPointEccentricity setAttributeSubIfcConnectionPointEccentricity = new SetAttributeSubIfcConnectionPointEccentricity(object, attributeName, attributeNewValue);
				setAttributeSubIfcConnectionPointEccentricity.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionPointGeometry")) {
				SetAttributeSubIfcConnectionPointGeometry setAttributeSubIfcConnectionPointGeometry = new SetAttributeSubIfcConnectionPointGeometry(object, attributeName, attributeNewValue);
				setAttributeSubIfcConnectionPointGeometry.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionPortGeometry")) {
				SetAttributeSubIfcConnectionPortGeometry setAttributeSubIfcConnectionPortGeometry = new SetAttributeSubIfcConnectionPortGeometry(object, attributeName, attributeNewValue);
				setAttributeSubIfcConnectionPortGeometry.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionSurfaceGeometry")) {
				SetAttributeSubIfcConnectionSurfaceGeometry setAttributeSubIfcConnectionSurfaceGeometry = new SetAttributeSubIfcConnectionSurfaceGeometry(object, attributeName, attributeNewValue);
				setAttributeSubIfcConnectionSurfaceGeometry.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstraintAggregationRelationship")) {
				SetAttributeSubIfcConstraintAggregationRelationship setAttributeSubIfcConstraintAggregationRelationship = new SetAttributeSubIfcConstraintAggregationRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcConstraintAggregationRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstraintClassificationRelationship")) {
				SetAttributeSubIfcConstraintClassificationRelationship setAttributeSubIfcConstraintClassificationRelationship = new SetAttributeSubIfcConstraintClassificationRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcConstraintClassificationRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstraint")) {
				SetAttributeSubIfcConstraint setAttributeSubIfcConstraint = new SetAttributeSubIfcConstraint(object, attributeName, attributeNewValue);
				setAttributeSubIfcConstraint.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstraintRelationship")) {
				SetAttributeSubIfcConstraintRelationship setAttributeSubIfcConstraintRelationship = new SetAttributeSubIfcConstraintRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcConstraintRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstructionEquipmentResource")) {
				SetAttributeSubIfcConstructionEquipmentResource setAttributeSubIfcConstructionEquipmentResource = new SetAttributeSubIfcConstructionEquipmentResource(object, attributeName, attributeNewValue);
				setAttributeSubIfcConstructionEquipmentResource.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstructionMaterialResource")) {
				SetAttributeSubIfcConstructionMaterialResource setAttributeSubIfcConstructionMaterialResource = new SetAttributeSubIfcConstructionMaterialResource(object, attributeName, attributeNewValue);
				setAttributeSubIfcConstructionMaterialResource.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstructionProductResource")) {
				SetAttributeSubIfcConstructionProductResource setAttributeSubIfcConstructionProductResource = new SetAttributeSubIfcConstructionProductResource(object, attributeName, attributeNewValue);
				setAttributeSubIfcConstructionProductResource.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstructionResource")) {
				SetAttributeSubIfcConstructionResource setAttributeSubIfcConstructionResource = new SetAttributeSubIfcConstructionResource(object, attributeName, attributeNewValue);
				setAttributeSubIfcConstructionResource.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcContextDependentMeasure")) {
				SetAttributeSubIfcContextDependentMeasure setAttributeSubIfcContextDependentMeasure = new SetAttributeSubIfcContextDependentMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcContextDependentMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcContextDependentUnit")) {
				SetAttributeSubIfcContextDependentUnit setAttributeSubIfcContextDependentUnit = new SetAttributeSubIfcContextDependentUnit(object, attributeName, attributeNewValue);
				setAttributeSubIfcContextDependentUnit.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcControl")) {
				SetAttributeSubIfcControl setAttributeSubIfcControl = new SetAttributeSubIfcControl(object, attributeName, attributeNewValue);
				setAttributeSubIfcControl.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcControllerType")) {
				SetAttributeSubIfcControllerType setAttributeSubIfcControllerType = new SetAttributeSubIfcControllerType(object, attributeName, attributeNewValue);
				setAttributeSubIfcControllerType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConversionBasedUnit")) {
				SetAttributeSubIfcConversionBasedUnit setAttributeSubIfcConversionBasedUnit = new SetAttributeSubIfcConversionBasedUnit(object, attributeName, attributeNewValue);
				setAttributeSubIfcConversionBasedUnit.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCooledBeamType")) {
				SetAttributeSubIfcCooledBeamType setAttributeSubIfcCooledBeamType = new SetAttributeSubIfcCooledBeamType(object, attributeName, attributeNewValue);
				setAttributeSubIfcCooledBeamType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCoolingTowerType")) {
				SetAttributeSubIfcCoolingTowerType setAttributeSubIfcCoolingTowerType = new SetAttributeSubIfcCoolingTowerType(object, attributeName, attributeNewValue);
				setAttributeSubIfcCoolingTowerType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCoordinatedUniversalTimeOffset")) {
				SetAttributeSubIfcCoordinatedUniversalTimeOffset setAttributeSubIfcCoordinatedUniversalTimeOffset = new SetAttributeSubIfcCoordinatedUniversalTimeOffset(object, attributeName, attributeNewValue);
				setAttributeSubIfcCoordinatedUniversalTimeOffset.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCostItem")) {
				SetAttributeSubIfcCostItem setAttributeSubIfcCostItem = new SetAttributeSubIfcCostItem(object, attributeName, attributeNewValue);
				setAttributeSubIfcCostItem.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCostSchedule")) {
				SetAttributeSubIfcCostSchedule setAttributeSubIfcCostSchedule = new SetAttributeSubIfcCostSchedule(object, attributeName, attributeNewValue);
				setAttributeSubIfcCostSchedule.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCostValue")) {
				SetAttributeSubIfcCostValue setAttributeSubIfcCostValue = new SetAttributeSubIfcCostValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcCostValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCountMeasure")) {
				SetAttributeSubIfcCountMeasure setAttributeSubIfcCountMeasure = new SetAttributeSubIfcCountMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcCountMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCovering")) {
				SetAttributeSubIfcCovering setAttributeSubIfcCovering = new SetAttributeSubIfcCovering(object, attributeName, attributeNewValue);
				setAttributeSubIfcCovering.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCoveringType")) {
				SetAttributeSubIfcCoveringType setAttributeSubIfcCoveringType = new SetAttributeSubIfcCoveringType(object, attributeName, attributeNewValue);
				setAttributeSubIfcCoveringType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCraneRailAShapeProfileDef")) {
				SetAttributeSubIfcCraneRailAShapeProfileDef setAttributeSubIfcCraneRailAShapeProfileDef = new SetAttributeSubIfcCraneRailAShapeProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcCraneRailAShapeProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCraneRailFShapeProfileDef")) {
				SetAttributeSubIfcCraneRailFShapeProfileDef setAttributeSubIfcCraneRailFShapeProfileDef = new SetAttributeSubIfcCraneRailFShapeProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcCraneRailFShapeProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCrewResource")) {
				SetAttributeSubIfcCrewResource setAttributeSubIfcCrewResource = new SetAttributeSubIfcCrewResource(object, attributeName, attributeNewValue);
				setAttributeSubIfcCrewResource.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCsgPrimitive3D")) {
				SetAttributeSubIfcCsgPrimitive3D setAttributeSubIfcCsgPrimitive3D = new SetAttributeSubIfcCsgPrimitive3D(object, attributeName, attributeNewValue);
				setAttributeSubIfcCsgPrimitive3D.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCsgSolid")) {
				SetAttributeSubIfcCsgSolid setAttributeSubIfcCsgSolid = new SetAttributeSubIfcCsgSolid(object, attributeName, attributeNewValue);
				setAttributeSubIfcCsgSolid.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurrencyRelationship")) {
				SetAttributeSubIfcCurrencyRelationship setAttributeSubIfcCurrencyRelationship = new SetAttributeSubIfcCurrencyRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcCurrencyRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurtainWall")) {
				SetAttributeSubIfcCurtainWall setAttributeSubIfcCurtainWall = new SetAttributeSubIfcCurtainWall(object, attributeName, attributeNewValue);
				setAttributeSubIfcCurtainWall.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurtainWallType")) {
				SetAttributeSubIfcCurtainWallType setAttributeSubIfcCurtainWallType = new SetAttributeSubIfcCurtainWallType(object, attributeName, attributeNewValue);
				setAttributeSubIfcCurtainWallType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurvatureMeasure")) {
				SetAttributeSubIfcCurvatureMeasure setAttributeSubIfcCurvatureMeasure = new SetAttributeSubIfcCurvatureMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcCurvatureMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurveBoundedPlane")) {
				SetAttributeSubIfcCurveBoundedPlane setAttributeSubIfcCurveBoundedPlane = new SetAttributeSubIfcCurveBoundedPlane(object, attributeName, attributeNewValue);
				setAttributeSubIfcCurveBoundedPlane.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurve")) {
				SetAttributeSubIfcCurve setAttributeSubIfcCurve = new SetAttributeSubIfcCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfcCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurveStyleFontAndScaling")) {
				SetAttributeSubIfcCurveStyleFontAndScaling setAttributeSubIfcCurveStyleFontAndScaling = new SetAttributeSubIfcCurveStyleFontAndScaling(object, attributeName, attributeNewValue);
				setAttributeSubIfcCurveStyleFontAndScaling.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurveStyleFont")) {
				SetAttributeSubIfcCurveStyleFont setAttributeSubIfcCurveStyleFont = new SetAttributeSubIfcCurveStyleFont(object, attributeName, attributeNewValue);
				setAttributeSubIfcCurveStyleFont.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurveStyleFontPattern")) {
				SetAttributeSubIfcCurveStyleFontPattern setAttributeSubIfcCurveStyleFontPattern = new SetAttributeSubIfcCurveStyleFontPattern(object, attributeName, attributeNewValue);
				setAttributeSubIfcCurveStyleFontPattern.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurveStyle")) {
				SetAttributeSubIfcCurveStyle setAttributeSubIfcCurveStyle = new SetAttributeSubIfcCurveStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcCurveStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDamperType")) {
				SetAttributeSubIfcDamperType setAttributeSubIfcDamperType = new SetAttributeSubIfcDamperType(object, attributeName, attributeNewValue);
				setAttributeSubIfcDamperType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDateAndTime")) {
				SetAttributeSubIfcDateAndTime setAttributeSubIfcDateAndTime = new SetAttributeSubIfcDateAndTime(object, attributeName, attributeNewValue);
				setAttributeSubIfcDateAndTime.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDefinedSymbol")) {
				SetAttributeSubIfcDefinedSymbol setAttributeSubIfcDefinedSymbol = new SetAttributeSubIfcDefinedSymbol(object, attributeName, attributeNewValue);
				setAttributeSubIfcDefinedSymbol.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDerivedProfileDef")) {
				SetAttributeSubIfcDerivedProfileDef setAttributeSubIfcDerivedProfileDef = new SetAttributeSubIfcDerivedProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcDerivedProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDerivedUnitElement")) {
				SetAttributeSubIfcDerivedUnitElement setAttributeSubIfcDerivedUnitElement = new SetAttributeSubIfcDerivedUnitElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcDerivedUnitElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDerivedUnit")) {
				SetAttributeSubIfcDerivedUnit setAttributeSubIfcDerivedUnit = new SetAttributeSubIfcDerivedUnit(object, attributeName, attributeNewValue);
				setAttributeSubIfcDerivedUnit.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDescriptiveMeasure")) {
				SetAttributeSubIfcDescriptiveMeasure setAttributeSubIfcDescriptiveMeasure = new SetAttributeSubIfcDescriptiveMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcDescriptiveMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDiameterDimension")) {
				SetAttributeSubIfcDiameterDimension setAttributeSubIfcDiameterDimension = new SetAttributeSubIfcDiameterDimension(object, attributeName, attributeNewValue);
				setAttributeSubIfcDiameterDimension.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionCalloutRelationship")) {
				SetAttributeSubIfcDimensionCalloutRelationship setAttributeSubIfcDimensionCalloutRelationship = new SetAttributeSubIfcDimensionCalloutRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcDimensionCalloutRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionCurveDirectedCallout")) {
				SetAttributeSubIfcDimensionCurveDirectedCallout setAttributeSubIfcDimensionCurveDirectedCallout = new SetAttributeSubIfcDimensionCurveDirectedCallout(object, attributeName, attributeNewValue);
				setAttributeSubIfcDimensionCurveDirectedCallout.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionCurve")) {
				SetAttributeSubIfcDimensionCurve setAttributeSubIfcDimensionCurve = new SetAttributeSubIfcDimensionCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfcDimensionCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionCurveTerminator")) {
				SetAttributeSubIfcDimensionCurveTerminator setAttributeSubIfcDimensionCurveTerminator = new SetAttributeSubIfcDimensionCurveTerminator(object, attributeName, attributeNewValue);
				setAttributeSubIfcDimensionCurveTerminator.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionPair")) {
				SetAttributeSubIfcDimensionPair setAttributeSubIfcDimensionPair = new SetAttributeSubIfcDimensionPair(object, attributeName, attributeNewValue);
				setAttributeSubIfcDimensionPair.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionalExponents")) {
				SetAttributeSubIfcDimensionalExponents setAttributeSubIfcDimensionalExponents = new SetAttributeSubIfcDimensionalExponents(object, attributeName, attributeNewValue);
				setAttributeSubIfcDimensionalExponents.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDirection")) {
				SetAttributeSubIfcDirection setAttributeSubIfcDirection = new SetAttributeSubIfcDirection(object, attributeName, attributeNewValue);
				setAttributeSubIfcDirection.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDiscreteAccessory")) {
				SetAttributeSubIfcDiscreteAccessory setAttributeSubIfcDiscreteAccessory = new SetAttributeSubIfcDiscreteAccessory(object, attributeName, attributeNewValue);
				setAttributeSubIfcDiscreteAccessory.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDiscreteAccessoryType")) {
				SetAttributeSubIfcDiscreteAccessoryType setAttributeSubIfcDiscreteAccessoryType = new SetAttributeSubIfcDiscreteAccessoryType(object, attributeName, attributeNewValue);
				setAttributeSubIfcDiscreteAccessoryType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionChamberElement")) {
				SetAttributeSubIfcDistributionChamberElement setAttributeSubIfcDistributionChamberElement = new SetAttributeSubIfcDistributionChamberElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcDistributionChamberElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionChamberElementType")) {
				SetAttributeSubIfcDistributionChamberElementType setAttributeSubIfcDistributionChamberElementType = new SetAttributeSubIfcDistributionChamberElementType(object, attributeName, attributeNewValue);
				setAttributeSubIfcDistributionChamberElementType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionControlElement")) {
				SetAttributeSubIfcDistributionControlElement setAttributeSubIfcDistributionControlElement = new SetAttributeSubIfcDistributionControlElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcDistributionControlElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionControlElementType")) {
				SetAttributeSubIfcDistributionControlElementType setAttributeSubIfcDistributionControlElementType = new SetAttributeSubIfcDistributionControlElementType(object, attributeName, attributeNewValue);
				setAttributeSubIfcDistributionControlElementType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionElement")) {
				SetAttributeSubIfcDistributionElement setAttributeSubIfcDistributionElement = new SetAttributeSubIfcDistributionElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcDistributionElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionElementType")) {
				SetAttributeSubIfcDistributionElementType setAttributeSubIfcDistributionElementType = new SetAttributeSubIfcDistributionElementType(object, attributeName, attributeNewValue);
				setAttributeSubIfcDistributionElementType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionFlowElement")) {
				SetAttributeSubIfcDistributionFlowElement setAttributeSubIfcDistributionFlowElement = new SetAttributeSubIfcDistributionFlowElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcDistributionFlowElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionFlowElementType")) {
				SetAttributeSubIfcDistributionFlowElementType setAttributeSubIfcDistributionFlowElementType = new SetAttributeSubIfcDistributionFlowElementType(object, attributeName, attributeNewValue);
				setAttributeSubIfcDistributionFlowElementType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionPort")) {
				SetAttributeSubIfcDistributionPort setAttributeSubIfcDistributionPort = new SetAttributeSubIfcDistributionPort(object, attributeName, attributeNewValue);
				setAttributeSubIfcDistributionPort.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDocumentElectronicFormat")) {
				SetAttributeSubIfcDocumentElectronicFormat setAttributeSubIfcDocumentElectronicFormat = new SetAttributeSubIfcDocumentElectronicFormat(object, attributeName, attributeNewValue);
				setAttributeSubIfcDocumentElectronicFormat.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDocumentInformation")) {
				SetAttributeSubIfcDocumentInformation setAttributeSubIfcDocumentInformation = new SetAttributeSubIfcDocumentInformation(object, attributeName, attributeNewValue);
				setAttributeSubIfcDocumentInformation.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDocumentInformationRelationship")) {
				SetAttributeSubIfcDocumentInformationRelationship setAttributeSubIfcDocumentInformationRelationship = new SetAttributeSubIfcDocumentInformationRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcDocumentInformationRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDocumentReference")) {
				SetAttributeSubIfcDocumentReference setAttributeSubIfcDocumentReference = new SetAttributeSubIfcDocumentReference(object, attributeName, attributeNewValue);
				setAttributeSubIfcDocumentReference.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDoor")) {
				SetAttributeSubIfcDoor setAttributeSubIfcDoor = new SetAttributeSubIfcDoor(object, attributeName, attributeNewValue);
				setAttributeSubIfcDoor.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDoorLiningProperties")) {
				SetAttributeSubIfcDoorLiningProperties setAttributeSubIfcDoorLiningProperties = new SetAttributeSubIfcDoorLiningProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcDoorLiningProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDoorPanelProperties")) {
				SetAttributeSubIfcDoorPanelProperties setAttributeSubIfcDoorPanelProperties = new SetAttributeSubIfcDoorPanelProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcDoorPanelProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDoorStyle")) {
				SetAttributeSubIfcDoorStyle setAttributeSubIfcDoorStyle = new SetAttributeSubIfcDoorStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcDoorStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDoseEquivalentMeasure")) {
				SetAttributeSubIfcDoseEquivalentMeasure setAttributeSubIfcDoseEquivalentMeasure = new SetAttributeSubIfcDoseEquivalentMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcDoseEquivalentMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDraughtingCallout")) {
				SetAttributeSubIfcDraughtingCallout setAttributeSubIfcDraughtingCallout = new SetAttributeSubIfcDraughtingCallout(object, attributeName, attributeNewValue);
				setAttributeSubIfcDraughtingCallout.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDraughtingCalloutRelationship")) {
				SetAttributeSubIfcDraughtingCalloutRelationship setAttributeSubIfcDraughtingCalloutRelationship = new SetAttributeSubIfcDraughtingCalloutRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcDraughtingCalloutRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDraughtingPreDefinedColour")) {
				SetAttributeSubIfcDraughtingPreDefinedColour setAttributeSubIfcDraughtingPreDefinedColour = new SetAttributeSubIfcDraughtingPreDefinedColour(object, attributeName, attributeNewValue);
				setAttributeSubIfcDraughtingPreDefinedColour.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDraughtingPreDefinedCurveFont")) {
				SetAttributeSubIfcDraughtingPreDefinedCurveFont setAttributeSubIfcDraughtingPreDefinedCurveFont = new SetAttributeSubIfcDraughtingPreDefinedCurveFont(object, attributeName, attributeNewValue);
				setAttributeSubIfcDraughtingPreDefinedCurveFont.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDraughtingPreDefinedTextFont")) {
				SetAttributeSubIfcDraughtingPreDefinedTextFont setAttributeSubIfcDraughtingPreDefinedTextFont = new SetAttributeSubIfcDraughtingPreDefinedTextFont(object, attributeName, attributeNewValue);
				setAttributeSubIfcDraughtingPreDefinedTextFont.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDuctFittingType")) {
				SetAttributeSubIfcDuctFittingType setAttributeSubIfcDuctFittingType = new SetAttributeSubIfcDuctFittingType(object, attributeName, attributeNewValue);
				setAttributeSubIfcDuctFittingType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDuctSegmentType")) {
				SetAttributeSubIfcDuctSegmentType setAttributeSubIfcDuctSegmentType = new SetAttributeSubIfcDuctSegmentType(object, attributeName, attributeNewValue);
				setAttributeSubIfcDuctSegmentType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDuctSilencerType")) {
				SetAttributeSubIfcDuctSilencerType setAttributeSubIfcDuctSilencerType = new SetAttributeSubIfcDuctSilencerType(object, attributeName, attributeNewValue);
				setAttributeSubIfcDuctSilencerType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDynamicViscosityMeasure")) {
				SetAttributeSubIfcDynamicViscosityMeasure setAttributeSubIfcDynamicViscosityMeasure = new SetAttributeSubIfcDynamicViscosityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcDynamicViscosityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEdgeCurve")) {
				SetAttributeSubIfcEdgeCurve setAttributeSubIfcEdgeCurve = new SetAttributeSubIfcEdgeCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfcEdgeCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEdgeFeature")) {
				SetAttributeSubIfcEdgeFeature setAttributeSubIfcEdgeFeature = new SetAttributeSubIfcEdgeFeature(object, attributeName, attributeNewValue);
				setAttributeSubIfcEdgeFeature.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEdge")) {
				SetAttributeSubIfcEdge setAttributeSubIfcEdge = new SetAttributeSubIfcEdge(object, attributeName, attributeNewValue);
				setAttributeSubIfcEdge.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEdgeLoop")) {
				SetAttributeSubIfcEdgeLoop setAttributeSubIfcEdgeLoop = new SetAttributeSubIfcEdgeLoop(object, attributeName, attributeNewValue);
				setAttributeSubIfcEdgeLoop.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricApplianceType")) {
				SetAttributeSubIfcElectricApplianceType setAttributeSubIfcElectricApplianceType = new SetAttributeSubIfcElectricApplianceType(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricApplianceType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricCapacitanceMeasure")) {
				SetAttributeSubIfcElectricCapacitanceMeasure setAttributeSubIfcElectricCapacitanceMeasure = new SetAttributeSubIfcElectricCapacitanceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricCapacitanceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricChargeMeasure")) {
				SetAttributeSubIfcElectricChargeMeasure setAttributeSubIfcElectricChargeMeasure = new SetAttributeSubIfcElectricChargeMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricChargeMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricConductanceMeasure")) {
				SetAttributeSubIfcElectricConductanceMeasure setAttributeSubIfcElectricConductanceMeasure = new SetAttributeSubIfcElectricConductanceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricConductanceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricCurrentMeasure")) {
				SetAttributeSubIfcElectricCurrentMeasure setAttributeSubIfcElectricCurrentMeasure = new SetAttributeSubIfcElectricCurrentMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricCurrentMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricDistributionPoint")) {
				SetAttributeSubIfcElectricDistributionPoint setAttributeSubIfcElectricDistributionPoint = new SetAttributeSubIfcElectricDistributionPoint(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricDistributionPoint.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricFlowStorageDeviceType")) {
				SetAttributeSubIfcElectricFlowStorageDeviceType setAttributeSubIfcElectricFlowStorageDeviceType = new SetAttributeSubIfcElectricFlowStorageDeviceType(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricFlowStorageDeviceType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricGeneratorType")) {
				SetAttributeSubIfcElectricGeneratorType setAttributeSubIfcElectricGeneratorType = new SetAttributeSubIfcElectricGeneratorType(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricGeneratorType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricHeaterType")) {
				SetAttributeSubIfcElectricHeaterType setAttributeSubIfcElectricHeaterType = new SetAttributeSubIfcElectricHeaterType(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricHeaterType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricMotorType")) {
				SetAttributeSubIfcElectricMotorType setAttributeSubIfcElectricMotorType = new SetAttributeSubIfcElectricMotorType(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricMotorType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricResistanceMeasure")) {
				SetAttributeSubIfcElectricResistanceMeasure setAttributeSubIfcElectricResistanceMeasure = new SetAttributeSubIfcElectricResistanceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricResistanceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricTimeControlType")) {
				SetAttributeSubIfcElectricTimeControlType setAttributeSubIfcElectricTimeControlType = new SetAttributeSubIfcElectricTimeControlType(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricTimeControlType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricVoltageMeasure")) {
				SetAttributeSubIfcElectricVoltageMeasure setAttributeSubIfcElectricVoltageMeasure = new SetAttributeSubIfcElectricVoltageMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricVoltageMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricalBaseProperties")) {
				SetAttributeSubIfcElectricalBaseProperties setAttributeSubIfcElectricalBaseProperties = new SetAttributeSubIfcElectricalBaseProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricalBaseProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricalCircuit")) {
				SetAttributeSubIfcElectricalCircuit setAttributeSubIfcElectricalCircuit = new SetAttributeSubIfcElectricalCircuit(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricalCircuit.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricalElement")) {
				SetAttributeSubIfcElectricalElement setAttributeSubIfcElectricalElement = new SetAttributeSubIfcElectricalElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcElectricalElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementAssembly")) {
				SetAttributeSubIfcElementAssembly setAttributeSubIfcElementAssembly = new SetAttributeSubIfcElementAssembly(object, attributeName, attributeNewValue);
				setAttributeSubIfcElementAssembly.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementComponent")) {
				SetAttributeSubIfcElementComponent setAttributeSubIfcElementComponent = new SetAttributeSubIfcElementComponent(object, attributeName, attributeNewValue);
				setAttributeSubIfcElementComponent.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementComponentType")) {
				SetAttributeSubIfcElementComponentType setAttributeSubIfcElementComponentType = new SetAttributeSubIfcElementComponentType(object, attributeName, attributeNewValue);
				setAttributeSubIfcElementComponentType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElement")) {
				SetAttributeSubIfcElement setAttributeSubIfcElement = new SetAttributeSubIfcElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementQuantity")) {
				SetAttributeSubIfcElementQuantity setAttributeSubIfcElementQuantity = new SetAttributeSubIfcElementQuantity(object, attributeName, attributeNewValue);
				setAttributeSubIfcElementQuantity.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementType")) {
				SetAttributeSubIfcElementType setAttributeSubIfcElementType = new SetAttributeSubIfcElementType(object, attributeName, attributeNewValue);
				setAttributeSubIfcElementType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementarySurface")) {
				SetAttributeSubIfcElementarySurface setAttributeSubIfcElementarySurface = new SetAttributeSubIfcElementarySurface(object, attributeName, attributeNewValue);
				setAttributeSubIfcElementarySurface.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEllipse")) {
				SetAttributeSubIfcEllipse setAttributeSubIfcEllipse = new SetAttributeSubIfcEllipse(object, attributeName, attributeNewValue);
				setAttributeSubIfcEllipse.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEllipseProfileDef")) {
				SetAttributeSubIfcEllipseProfileDef setAttributeSubIfcEllipseProfileDef = new SetAttributeSubIfcEllipseProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcEllipseProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEnergyConversionDevice")) {
				SetAttributeSubIfcEnergyConversionDevice setAttributeSubIfcEnergyConversionDevice = new SetAttributeSubIfcEnergyConversionDevice(object, attributeName, attributeNewValue);
				setAttributeSubIfcEnergyConversionDevice.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEnergyConversionDeviceType")) {
				SetAttributeSubIfcEnergyConversionDeviceType setAttributeSubIfcEnergyConversionDeviceType = new SetAttributeSubIfcEnergyConversionDeviceType(object, attributeName, attributeNewValue);
				setAttributeSubIfcEnergyConversionDeviceType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEnergyMeasure")) {
				SetAttributeSubIfcEnergyMeasure setAttributeSubIfcEnergyMeasure = new SetAttributeSubIfcEnergyMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcEnergyMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEnergyProperties")) {
				SetAttributeSubIfcEnergyProperties setAttributeSubIfcEnergyProperties = new SetAttributeSubIfcEnergyProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcEnergyProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEnvironmentalImpactValue")) {
				SetAttributeSubIfcEnvironmentalImpactValue setAttributeSubIfcEnvironmentalImpactValue = new SetAttributeSubIfcEnvironmentalImpactValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcEnvironmentalImpactValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEquipmentElement")) {
				SetAttributeSubIfcEquipmentElement setAttributeSubIfcEquipmentElement = new SetAttributeSubIfcEquipmentElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcEquipmentElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEquipmentStandard")) {
				SetAttributeSubIfcEquipmentStandard setAttributeSubIfcEquipmentStandard = new SetAttributeSubIfcEquipmentStandard(object, attributeName, attributeNewValue);
				setAttributeSubIfcEquipmentStandard.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEvaporativeCoolerType")) {
				SetAttributeSubIfcEvaporativeCoolerType setAttributeSubIfcEvaporativeCoolerType = new SetAttributeSubIfcEvaporativeCoolerType(object, attributeName, attributeNewValue);
				setAttributeSubIfcEvaporativeCoolerType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEvaporatorType")) {
				SetAttributeSubIfcEvaporatorType setAttributeSubIfcEvaporatorType = new SetAttributeSubIfcEvaporatorType(object, attributeName, attributeNewValue);
				setAttributeSubIfcEvaporatorType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExtendedMaterialProperties")) {
				SetAttributeSubIfcExtendedMaterialProperties setAttributeSubIfcExtendedMaterialProperties = new SetAttributeSubIfcExtendedMaterialProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcExtendedMaterialProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExternalReference")) {
				SetAttributeSubIfcExternalReference setAttributeSubIfcExternalReference = new SetAttributeSubIfcExternalReference(object, attributeName, attributeNewValue);
				setAttributeSubIfcExternalReference.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExternallyDefinedHatchStyle")) {
				SetAttributeSubIfcExternallyDefinedHatchStyle setAttributeSubIfcExternallyDefinedHatchStyle = new SetAttributeSubIfcExternallyDefinedHatchStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcExternallyDefinedHatchStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExternallyDefinedSurfaceStyle")) {
				SetAttributeSubIfcExternallyDefinedSurfaceStyle setAttributeSubIfcExternallyDefinedSurfaceStyle = new SetAttributeSubIfcExternallyDefinedSurfaceStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcExternallyDefinedSurfaceStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExternallyDefinedSymbol")) {
				SetAttributeSubIfcExternallyDefinedSymbol setAttributeSubIfcExternallyDefinedSymbol = new SetAttributeSubIfcExternallyDefinedSymbol(object, attributeName, attributeNewValue);
				setAttributeSubIfcExternallyDefinedSymbol.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExternallyDefinedTextFont")) {
				SetAttributeSubIfcExternallyDefinedTextFont setAttributeSubIfcExternallyDefinedTextFont = new SetAttributeSubIfcExternallyDefinedTextFont(object, attributeName, attributeNewValue);
				setAttributeSubIfcExternallyDefinedTextFont.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExtrudedAreaSolid")) {
				SetAttributeSubIfcExtrudedAreaSolid setAttributeSubIfcExtrudedAreaSolid = new SetAttributeSubIfcExtrudedAreaSolid(object, attributeName, attributeNewValue);
				setAttributeSubIfcExtrudedAreaSolid.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFaceBasedSurfaceModel")) {
				SetAttributeSubIfcFaceBasedSurfaceModel setAttributeSubIfcFaceBasedSurfaceModel = new SetAttributeSubIfcFaceBasedSurfaceModel(object, attributeName, attributeNewValue);
				setAttributeSubIfcFaceBasedSurfaceModel.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFaceBound")) {
				SetAttributeSubIfcFaceBound setAttributeSubIfcFaceBound = new SetAttributeSubIfcFaceBound(object, attributeName, attributeNewValue);
				setAttributeSubIfcFaceBound.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFace")) {
				SetAttributeSubIfcFace setAttributeSubIfcFace = new SetAttributeSubIfcFace(object, attributeName, attributeNewValue);
				setAttributeSubIfcFace.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFaceOuterBound")) {
				SetAttributeSubIfcFaceOuterBound setAttributeSubIfcFaceOuterBound = new SetAttributeSubIfcFaceOuterBound(object, attributeName, attributeNewValue);
				setAttributeSubIfcFaceOuterBound.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFaceSurface")) {
				SetAttributeSubIfcFaceSurface setAttributeSubIfcFaceSurface = new SetAttributeSubIfcFaceSurface(object, attributeName, attributeNewValue);
				setAttributeSubIfcFaceSurface.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFacetedBrep")) {
				SetAttributeSubIfcFacetedBrep setAttributeSubIfcFacetedBrep = new SetAttributeSubIfcFacetedBrep(object, attributeName, attributeNewValue);
				setAttributeSubIfcFacetedBrep.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFacetedBrepWithVoids")) {
				SetAttributeSubIfcFacetedBrepWithVoids setAttributeSubIfcFacetedBrepWithVoids = new SetAttributeSubIfcFacetedBrepWithVoids(object, attributeName, attributeNewValue);
				setAttributeSubIfcFacetedBrepWithVoids.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFailureConnectionCondition")) {
				SetAttributeSubIfcFailureConnectionCondition setAttributeSubIfcFailureConnectionCondition = new SetAttributeSubIfcFailureConnectionCondition(object, attributeName, attributeNewValue);
				setAttributeSubIfcFailureConnectionCondition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFanType")) {
				SetAttributeSubIfcFanType setAttributeSubIfcFanType = new SetAttributeSubIfcFanType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFanType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFastener")) {
				SetAttributeSubIfcFastener setAttributeSubIfcFastener = new SetAttributeSubIfcFastener(object, attributeName, attributeNewValue);
				setAttributeSubIfcFastener.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFastenerType")) {
				SetAttributeSubIfcFastenerType setAttributeSubIfcFastenerType = new SetAttributeSubIfcFastenerType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFastenerType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFeatureElementAddition")) {
				SetAttributeSubIfcFeatureElementAddition setAttributeSubIfcFeatureElementAddition = new SetAttributeSubIfcFeatureElementAddition(object, attributeName, attributeNewValue);
				setAttributeSubIfcFeatureElementAddition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFeatureElement")) {
				SetAttributeSubIfcFeatureElement setAttributeSubIfcFeatureElement = new SetAttributeSubIfcFeatureElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcFeatureElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFeatureElementSubtraction")) {
				SetAttributeSubIfcFeatureElementSubtraction setAttributeSubIfcFeatureElementSubtraction = new SetAttributeSubIfcFeatureElementSubtraction(object, attributeName, attributeNewValue);
				setAttributeSubIfcFeatureElementSubtraction.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFillAreaStyleHatching")) {
				SetAttributeSubIfcFillAreaStyleHatching setAttributeSubIfcFillAreaStyleHatching = new SetAttributeSubIfcFillAreaStyleHatching(object, attributeName, attributeNewValue);
				setAttributeSubIfcFillAreaStyleHatching.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFillAreaStyle")) {
				SetAttributeSubIfcFillAreaStyle setAttributeSubIfcFillAreaStyle = new SetAttributeSubIfcFillAreaStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcFillAreaStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFillAreaStyleTileSymbolWithStyle")) {
				SetAttributeSubIfcFillAreaStyleTileSymbolWithStyle setAttributeSubIfcFillAreaStyleTileSymbolWithStyle = new SetAttributeSubIfcFillAreaStyleTileSymbolWithStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcFillAreaStyleTileSymbolWithStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFillAreaStyleTiles")) {
				SetAttributeSubIfcFillAreaStyleTiles setAttributeSubIfcFillAreaStyleTiles = new SetAttributeSubIfcFillAreaStyleTiles(object, attributeName, attributeNewValue);
				setAttributeSubIfcFillAreaStyleTiles.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFilterType")) {
				SetAttributeSubIfcFilterType setAttributeSubIfcFilterType = new SetAttributeSubIfcFilterType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFilterType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFireSuppressionTerminalType")) {
				SetAttributeSubIfcFireSuppressionTerminalType setAttributeSubIfcFireSuppressionTerminalType = new SetAttributeSubIfcFireSuppressionTerminalType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFireSuppressionTerminalType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowController")) {
				SetAttributeSubIfcFlowController setAttributeSubIfcFlowController = new SetAttributeSubIfcFlowController(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowController.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowControllerType")) {
				SetAttributeSubIfcFlowControllerType setAttributeSubIfcFlowControllerType = new SetAttributeSubIfcFlowControllerType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowControllerType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowFitting")) {
				SetAttributeSubIfcFlowFitting setAttributeSubIfcFlowFitting = new SetAttributeSubIfcFlowFitting(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowFitting.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowFittingType")) {
				SetAttributeSubIfcFlowFittingType setAttributeSubIfcFlowFittingType = new SetAttributeSubIfcFlowFittingType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowFittingType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowInstrumentType")) {
				SetAttributeSubIfcFlowInstrumentType setAttributeSubIfcFlowInstrumentType = new SetAttributeSubIfcFlowInstrumentType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowInstrumentType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowMeterType")) {
				SetAttributeSubIfcFlowMeterType setAttributeSubIfcFlowMeterType = new SetAttributeSubIfcFlowMeterType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowMeterType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowMovingDevice")) {
				SetAttributeSubIfcFlowMovingDevice setAttributeSubIfcFlowMovingDevice = new SetAttributeSubIfcFlowMovingDevice(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowMovingDevice.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowMovingDeviceType")) {
				SetAttributeSubIfcFlowMovingDeviceType setAttributeSubIfcFlowMovingDeviceType = new SetAttributeSubIfcFlowMovingDeviceType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowMovingDeviceType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowSegment")) {
				SetAttributeSubIfcFlowSegment setAttributeSubIfcFlowSegment = new SetAttributeSubIfcFlowSegment(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowSegment.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowSegmentType")) {
				SetAttributeSubIfcFlowSegmentType setAttributeSubIfcFlowSegmentType = new SetAttributeSubIfcFlowSegmentType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowSegmentType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowStorageDevice")) {
				SetAttributeSubIfcFlowStorageDevice setAttributeSubIfcFlowStorageDevice = new SetAttributeSubIfcFlowStorageDevice(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowStorageDevice.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowStorageDeviceType")) {
				SetAttributeSubIfcFlowStorageDeviceType setAttributeSubIfcFlowStorageDeviceType = new SetAttributeSubIfcFlowStorageDeviceType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowStorageDeviceType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowTerminal")) {
				SetAttributeSubIfcFlowTerminal setAttributeSubIfcFlowTerminal = new SetAttributeSubIfcFlowTerminal(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowTerminal.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowTerminalType")) {
				SetAttributeSubIfcFlowTerminalType setAttributeSubIfcFlowTerminalType = new SetAttributeSubIfcFlowTerminalType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowTerminalType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowTreatmentDevice")) {
				SetAttributeSubIfcFlowTreatmentDevice setAttributeSubIfcFlowTreatmentDevice = new SetAttributeSubIfcFlowTreatmentDevice(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowTreatmentDevice.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowTreatmentDeviceType")) {
				SetAttributeSubIfcFlowTreatmentDeviceType setAttributeSubIfcFlowTreatmentDeviceType = new SetAttributeSubIfcFlowTreatmentDeviceType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFlowTreatmentDeviceType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFluidFlowProperties")) {
				SetAttributeSubIfcFluidFlowProperties setAttributeSubIfcFluidFlowProperties = new SetAttributeSubIfcFluidFlowProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcFluidFlowProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFooting")) {
				SetAttributeSubIfcFooting setAttributeSubIfcFooting = new SetAttributeSubIfcFooting(object, attributeName, attributeNewValue);
				setAttributeSubIfcFooting.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcForceMeasure")) {
				SetAttributeSubIfcForceMeasure setAttributeSubIfcForceMeasure = new SetAttributeSubIfcForceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcForceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFrequencyMeasure")) {
				SetAttributeSubIfcFrequencyMeasure setAttributeSubIfcFrequencyMeasure = new SetAttributeSubIfcFrequencyMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcFrequencyMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFuelProperties")) {
				SetAttributeSubIfcFuelProperties setAttributeSubIfcFuelProperties = new SetAttributeSubIfcFuelProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcFuelProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFurnishingElement")) {
				SetAttributeSubIfcFurnishingElement setAttributeSubIfcFurnishingElement = new SetAttributeSubIfcFurnishingElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcFurnishingElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFurnishingElementType")) {
				SetAttributeSubIfcFurnishingElementType setAttributeSubIfcFurnishingElementType = new SetAttributeSubIfcFurnishingElementType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFurnishingElementType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFurnitureStandard")) {
				SetAttributeSubIfcFurnitureStandard setAttributeSubIfcFurnitureStandard = new SetAttributeSubIfcFurnitureStandard(object, attributeName, attributeNewValue);
				setAttributeSubIfcFurnitureStandard.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFurnitureType")) {
				SetAttributeSubIfcFurnitureType setAttributeSubIfcFurnitureType = new SetAttributeSubIfcFurnitureType(object, attributeName, attributeNewValue);
				setAttributeSubIfcFurnitureType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGasTerminalType")) {
				SetAttributeSubIfcGasTerminalType setAttributeSubIfcGasTerminalType = new SetAttributeSubIfcGasTerminalType(object, attributeName, attributeNewValue);
				setAttributeSubIfcGasTerminalType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeneralMaterialProperties")) {
				SetAttributeSubIfcGeneralMaterialProperties setAttributeSubIfcGeneralMaterialProperties = new SetAttributeSubIfcGeneralMaterialProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcGeneralMaterialProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeneralProfileProperties")) {
				SetAttributeSubIfcGeneralProfileProperties setAttributeSubIfcGeneralProfileProperties = new SetAttributeSubIfcGeneralProfileProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcGeneralProfileProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeometricCurveSet")) {
				SetAttributeSubIfcGeometricCurveSet setAttributeSubIfcGeometricCurveSet = new SetAttributeSubIfcGeometricCurveSet(object, attributeName, attributeNewValue);
				setAttributeSubIfcGeometricCurveSet.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeometricRepresentationContext")) {
				SetAttributeSubIfcGeometricRepresentationContext setAttributeSubIfcGeometricRepresentationContext = new SetAttributeSubIfcGeometricRepresentationContext(object, attributeName, attributeNewValue);
				setAttributeSubIfcGeometricRepresentationContext.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeometricRepresentationItem")) {
				SetAttributeSubIfcGeometricRepresentationItem setAttributeSubIfcGeometricRepresentationItem = new SetAttributeSubIfcGeometricRepresentationItem(object, attributeName, attributeNewValue);
				setAttributeSubIfcGeometricRepresentationItem.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeometricRepresentationSubContext")) {
				SetAttributeSubIfcGeometricRepresentationSubContext setAttributeSubIfcGeometricRepresentationSubContext = new SetAttributeSubIfcGeometricRepresentationSubContext(object, attributeName, attributeNewValue);
				setAttributeSubIfcGeometricRepresentationSubContext.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeometricSet")) {
				SetAttributeSubIfcGeometricSet setAttributeSubIfcGeometricSet = new SetAttributeSubIfcGeometricSet(object, attributeName, attributeNewValue);
				setAttributeSubIfcGeometricSet.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGloballyUniqueId")) {
				SetAttributeSubIfcGloballyUniqueId setAttributeSubIfcGloballyUniqueId = new SetAttributeSubIfcGloballyUniqueId(object, attributeName, attributeNewValue);
				setAttributeSubIfcGloballyUniqueId.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGridAxis")) {
				SetAttributeSubIfcGridAxis setAttributeSubIfcGridAxis = new SetAttributeSubIfcGridAxis(object, attributeName, attributeNewValue);
				setAttributeSubIfcGridAxis.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGrid")) {
				SetAttributeSubIfcGrid setAttributeSubIfcGrid = new SetAttributeSubIfcGrid(object, attributeName, attributeNewValue);
				setAttributeSubIfcGrid.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGridPlacement")) {
				SetAttributeSubIfcGridPlacement setAttributeSubIfcGridPlacement = new SetAttributeSubIfcGridPlacement(object, attributeName, attributeNewValue);
				setAttributeSubIfcGridPlacement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGroup")) {
				SetAttributeSubIfcGroup setAttributeSubIfcGroup = new SetAttributeSubIfcGroup(object, attributeName, attributeNewValue);
				setAttributeSubIfcGroup.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHalfSpaceSolid")) {
				SetAttributeSubIfcHalfSpaceSolid setAttributeSubIfcHalfSpaceSolid = new SetAttributeSubIfcHalfSpaceSolid(object, attributeName, attributeNewValue);
				setAttributeSubIfcHalfSpaceSolid.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHeatExchangerType")) {
				SetAttributeSubIfcHeatExchangerType setAttributeSubIfcHeatExchangerType = new SetAttributeSubIfcHeatExchangerType(object, attributeName, attributeNewValue);
				setAttributeSubIfcHeatExchangerType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHeatFluxDensityMeasure")) {
				SetAttributeSubIfcHeatFluxDensityMeasure setAttributeSubIfcHeatFluxDensityMeasure = new SetAttributeSubIfcHeatFluxDensityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcHeatFluxDensityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHeatingValueMeasure")) {
				SetAttributeSubIfcHeatingValueMeasure setAttributeSubIfcHeatingValueMeasure = new SetAttributeSubIfcHeatingValueMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcHeatingValueMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHumidifierType")) {
				SetAttributeSubIfcHumidifierType setAttributeSubIfcHumidifierType = new SetAttributeSubIfcHumidifierType(object, attributeName, attributeNewValue);
				setAttributeSubIfcHumidifierType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHygroscopicMaterialProperties")) {
				SetAttributeSubIfcHygroscopicMaterialProperties setAttributeSubIfcHygroscopicMaterialProperties = new SetAttributeSubIfcHygroscopicMaterialProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcHygroscopicMaterialProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIShapeProfileDef")) {
				SetAttributeSubIfcIShapeProfileDef setAttributeSubIfcIShapeProfileDef = new SetAttributeSubIfcIShapeProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcIShapeProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIdentifier")) {
				SetAttributeSubIfcIdentifier setAttributeSubIfcIdentifier = new SetAttributeSubIfcIdentifier(object, attributeName, attributeNewValue);
				setAttributeSubIfcIdentifier.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIlluminanceMeasure")) {
				SetAttributeSubIfcIlluminanceMeasure setAttributeSubIfcIlluminanceMeasure = new SetAttributeSubIfcIlluminanceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcIlluminanceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcImageTexture")) {
				SetAttributeSubIfcImageTexture setAttributeSubIfcImageTexture = new SetAttributeSubIfcImageTexture(object, attributeName, attributeNewValue);
				setAttributeSubIfcImageTexture.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcInductanceMeasure")) {
				SetAttributeSubIfcInductanceMeasure setAttributeSubIfcInductanceMeasure = new SetAttributeSubIfcInductanceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcInductanceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIntegerCountRateMeasure")) {
				SetAttributeSubIfcIntegerCountRateMeasure setAttributeSubIfcIntegerCountRateMeasure = new SetAttributeSubIfcIntegerCountRateMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcIntegerCountRateMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcInteger")) {
				SetAttributeSubIfcInteger setAttributeSubIfcInteger = new SetAttributeSubIfcInteger(object, attributeName, attributeNewValue);
				setAttributeSubIfcInteger.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcInventory")) {
				SetAttributeSubIfcInventory setAttributeSubIfcInventory = new SetAttributeSubIfcInventory(object, attributeName, attributeNewValue);
				setAttributeSubIfcInventory.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIonConcentrationMeasure")) {
				SetAttributeSubIfcIonConcentrationMeasure setAttributeSubIfcIonConcentrationMeasure = new SetAttributeSubIfcIonConcentrationMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcIonConcentrationMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIrregularTimeSeries")) {
				SetAttributeSubIfcIrregularTimeSeries setAttributeSubIfcIrregularTimeSeries = new SetAttributeSubIfcIrregularTimeSeries(object, attributeName, attributeNewValue);
				setAttributeSubIfcIrregularTimeSeries.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIrregularTimeSeriesValue")) {
				SetAttributeSubIfcIrregularTimeSeriesValue setAttributeSubIfcIrregularTimeSeriesValue = new SetAttributeSubIfcIrregularTimeSeriesValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcIrregularTimeSeriesValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIsothermalMoistureCapacityMeasure")) {
				SetAttributeSubIfcIsothermalMoistureCapacityMeasure setAttributeSubIfcIsothermalMoistureCapacityMeasure = new SetAttributeSubIfcIsothermalMoistureCapacityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcIsothermalMoistureCapacityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcJunctionBoxType")) {
				SetAttributeSubIfcJunctionBoxType setAttributeSubIfcJunctionBoxType = new SetAttributeSubIfcJunctionBoxType(object, attributeName, attributeNewValue);
				setAttributeSubIfcJunctionBoxType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcKinematicViscosityMeasure")) {
				SetAttributeSubIfcKinematicViscosityMeasure setAttributeSubIfcKinematicViscosityMeasure = new SetAttributeSubIfcKinematicViscosityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcKinematicViscosityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLShapeProfileDef")) {
				SetAttributeSubIfcLShapeProfileDef setAttributeSubIfcLShapeProfileDef = new SetAttributeSubIfcLShapeProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcLShapeProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLabel")) {
				SetAttributeSubIfcLabel setAttributeSubIfcLabel = new SetAttributeSubIfcLabel(object, attributeName, attributeNewValue);
				setAttributeSubIfcLabel.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLaborResource")) {
				SetAttributeSubIfcLaborResource setAttributeSubIfcLaborResource = new SetAttributeSubIfcLaborResource(object, attributeName, attributeNewValue);
				setAttributeSubIfcLaborResource.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLampType")) {
				SetAttributeSubIfcLampType setAttributeSubIfcLampType = new SetAttributeSubIfcLampType(object, attributeName, attributeNewValue);
				setAttributeSubIfcLampType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLengthMeasure")) {
				SetAttributeSubIfcLengthMeasure setAttributeSubIfcLengthMeasure = new SetAttributeSubIfcLengthMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcLengthMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLibraryInformation")) {
				SetAttributeSubIfcLibraryInformation setAttributeSubIfcLibraryInformation = new SetAttributeSubIfcLibraryInformation(object, attributeName, attributeNewValue);
				setAttributeSubIfcLibraryInformation.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLibraryReference")) {
				SetAttributeSubIfcLibraryReference setAttributeSubIfcLibraryReference = new SetAttributeSubIfcLibraryReference(object, attributeName, attributeNewValue);
				setAttributeSubIfcLibraryReference.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightDistributionData")) {
				SetAttributeSubIfcLightDistributionData setAttributeSubIfcLightDistributionData = new SetAttributeSubIfcLightDistributionData(object, attributeName, attributeNewValue);
				setAttributeSubIfcLightDistributionData.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightFixtureType")) {
				SetAttributeSubIfcLightFixtureType setAttributeSubIfcLightFixtureType = new SetAttributeSubIfcLightFixtureType(object, attributeName, attributeNewValue);
				setAttributeSubIfcLightFixtureType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightIntensityDistribution")) {
				SetAttributeSubIfcLightIntensityDistribution setAttributeSubIfcLightIntensityDistribution = new SetAttributeSubIfcLightIntensityDistribution(object, attributeName, attributeNewValue);
				setAttributeSubIfcLightIntensityDistribution.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSourceAmbient")) {
				SetAttributeSubIfcLightSourceAmbient setAttributeSubIfcLightSourceAmbient = new SetAttributeSubIfcLightSourceAmbient(object, attributeName, attributeNewValue);
				setAttributeSubIfcLightSourceAmbient.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSourceDirectional")) {
				SetAttributeSubIfcLightSourceDirectional setAttributeSubIfcLightSourceDirectional = new SetAttributeSubIfcLightSourceDirectional(object, attributeName, attributeNewValue);
				setAttributeSubIfcLightSourceDirectional.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSourceGoniometric")) {
				SetAttributeSubIfcLightSourceGoniometric setAttributeSubIfcLightSourceGoniometric = new SetAttributeSubIfcLightSourceGoniometric(object, attributeName, attributeNewValue);
				setAttributeSubIfcLightSourceGoniometric.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSource")) {
				SetAttributeSubIfcLightSource setAttributeSubIfcLightSource = new SetAttributeSubIfcLightSource(object, attributeName, attributeNewValue);
				setAttributeSubIfcLightSource.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSourcePositional")) {
				SetAttributeSubIfcLightSourcePositional setAttributeSubIfcLightSourcePositional = new SetAttributeSubIfcLightSourcePositional(object, attributeName, attributeNewValue);
				setAttributeSubIfcLightSourcePositional.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSourceSpot")) {
				SetAttributeSubIfcLightSourceSpot setAttributeSubIfcLightSourceSpot = new SetAttributeSubIfcLightSourceSpot(object, attributeName, attributeNewValue);
				setAttributeSubIfcLightSourceSpot.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLine")) {
				SetAttributeSubIfcLine setAttributeSubIfcLine = new SetAttributeSubIfcLine(object, attributeName, attributeNewValue);
				setAttributeSubIfcLine.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLinearDimension")) {
				SetAttributeSubIfcLinearDimension setAttributeSubIfcLinearDimension = new SetAttributeSubIfcLinearDimension(object, attributeName, attributeNewValue);
				setAttributeSubIfcLinearDimension.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLinearForceMeasure")) {
				SetAttributeSubIfcLinearForceMeasure setAttributeSubIfcLinearForceMeasure = new SetAttributeSubIfcLinearForceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcLinearForceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLinearMomentMeasure")) {
				SetAttributeSubIfcLinearMomentMeasure setAttributeSubIfcLinearMomentMeasure = new SetAttributeSubIfcLinearMomentMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcLinearMomentMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLinearStiffnessMeasure")) {
				SetAttributeSubIfcLinearStiffnessMeasure setAttributeSubIfcLinearStiffnessMeasure = new SetAttributeSubIfcLinearStiffnessMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcLinearStiffnessMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLinearVelocityMeasure")) {
				SetAttributeSubIfcLinearVelocityMeasure setAttributeSubIfcLinearVelocityMeasure = new SetAttributeSubIfcLinearVelocityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcLinearVelocityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLocalPlacement")) {
				SetAttributeSubIfcLocalPlacement setAttributeSubIfcLocalPlacement = new SetAttributeSubIfcLocalPlacement(object, attributeName, attributeNewValue);
				setAttributeSubIfcLocalPlacement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLocalTime")) {
				SetAttributeSubIfcLocalTime setAttributeSubIfcLocalTime = new SetAttributeSubIfcLocalTime(object, attributeName, attributeNewValue);
				setAttributeSubIfcLocalTime.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLogical")) {
				SetAttributeSubIfcLogical setAttributeSubIfcLogical = new SetAttributeSubIfcLogical(object, attributeName, attributeNewValue);
				setAttributeSubIfcLogical.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLoop")) {
				SetAttributeSubIfcLoop setAttributeSubIfcLoop = new SetAttributeSubIfcLoop(object, attributeName, attributeNewValue);
				setAttributeSubIfcLoop.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLuminousFluxMeasure")) {
				SetAttributeSubIfcLuminousFluxMeasure setAttributeSubIfcLuminousFluxMeasure = new SetAttributeSubIfcLuminousFluxMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcLuminousFluxMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLuminousIntensityDistributionMeasure")) {
				SetAttributeSubIfcLuminousIntensityDistributionMeasure setAttributeSubIfcLuminousIntensityDistributionMeasure = new SetAttributeSubIfcLuminousIntensityDistributionMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcLuminousIntensityDistributionMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLuminousIntensityMeasure")) {
				SetAttributeSubIfcLuminousIntensityMeasure setAttributeSubIfcLuminousIntensityMeasure = new SetAttributeSubIfcLuminousIntensityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcLuminousIntensityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMagneticFluxDensityMeasure")) {
				SetAttributeSubIfcMagneticFluxDensityMeasure setAttributeSubIfcMagneticFluxDensityMeasure = new SetAttributeSubIfcMagneticFluxDensityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcMagneticFluxDensityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMagneticFluxMeasure")) {
				SetAttributeSubIfcMagneticFluxMeasure setAttributeSubIfcMagneticFluxMeasure = new SetAttributeSubIfcMagneticFluxMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcMagneticFluxMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcManifoldSolidBrep")) {
				SetAttributeSubIfcManifoldSolidBrep setAttributeSubIfcManifoldSolidBrep = new SetAttributeSubIfcManifoldSolidBrep(object, attributeName, attributeNewValue);
				setAttributeSubIfcManifoldSolidBrep.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMappedItem")) {
				SetAttributeSubIfcMappedItem setAttributeSubIfcMappedItem = new SetAttributeSubIfcMappedItem(object, attributeName, attributeNewValue);
				setAttributeSubIfcMappedItem.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMassDensityMeasure")) {
				SetAttributeSubIfcMassDensityMeasure setAttributeSubIfcMassDensityMeasure = new SetAttributeSubIfcMassDensityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcMassDensityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMassFlowRateMeasure")) {
				SetAttributeSubIfcMassFlowRateMeasure setAttributeSubIfcMassFlowRateMeasure = new SetAttributeSubIfcMassFlowRateMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcMassFlowRateMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMassMeasure")) {
				SetAttributeSubIfcMassMeasure setAttributeSubIfcMassMeasure = new SetAttributeSubIfcMassMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcMassMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMassPerLengthMeasure")) {
				SetAttributeSubIfcMassPerLengthMeasure setAttributeSubIfcMassPerLengthMeasure = new SetAttributeSubIfcMassPerLengthMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcMassPerLengthMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialClassificationRelationship")) {
				SetAttributeSubIfcMaterialClassificationRelationship setAttributeSubIfcMaterialClassificationRelationship = new SetAttributeSubIfcMaterialClassificationRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcMaterialClassificationRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialDefinitionRepresentation")) {
				SetAttributeSubIfcMaterialDefinitionRepresentation setAttributeSubIfcMaterialDefinitionRepresentation = new SetAttributeSubIfcMaterialDefinitionRepresentation(object, attributeName, attributeNewValue);
				setAttributeSubIfcMaterialDefinitionRepresentation.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterial")) {
				SetAttributeSubIfcMaterial setAttributeSubIfcMaterial = new SetAttributeSubIfcMaterial(object, attributeName, attributeNewValue);
				setAttributeSubIfcMaterial.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialLayer")) {
				SetAttributeSubIfcMaterialLayer setAttributeSubIfcMaterialLayer = new SetAttributeSubIfcMaterialLayer(object, attributeName, attributeNewValue);
				setAttributeSubIfcMaterialLayer.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialLayerSet")) {
				SetAttributeSubIfcMaterialLayerSet setAttributeSubIfcMaterialLayerSet = new SetAttributeSubIfcMaterialLayerSet(object, attributeName, attributeNewValue);
				setAttributeSubIfcMaterialLayerSet.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialLayerSetUsage")) {
				SetAttributeSubIfcMaterialLayerSetUsage setAttributeSubIfcMaterialLayerSetUsage = new SetAttributeSubIfcMaterialLayerSetUsage(object, attributeName, attributeNewValue);
				setAttributeSubIfcMaterialLayerSetUsage.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialList")) {
				SetAttributeSubIfcMaterialList setAttributeSubIfcMaterialList = new SetAttributeSubIfcMaterialList(object, attributeName, attributeNewValue);
				setAttributeSubIfcMaterialList.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialProperties")) {
				SetAttributeSubIfcMaterialProperties setAttributeSubIfcMaterialProperties = new SetAttributeSubIfcMaterialProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcMaterialProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMeasureWithUnit")) {
				SetAttributeSubIfcMeasureWithUnit setAttributeSubIfcMeasureWithUnit = new SetAttributeSubIfcMeasureWithUnit(object, attributeName, attributeNewValue);
				setAttributeSubIfcMeasureWithUnit.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMechanicalConcreteMaterialProperties")) {
				SetAttributeSubIfcMechanicalConcreteMaterialProperties setAttributeSubIfcMechanicalConcreteMaterialProperties = new SetAttributeSubIfcMechanicalConcreteMaterialProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcMechanicalConcreteMaterialProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMechanicalFastener")) {
				SetAttributeSubIfcMechanicalFastener setAttributeSubIfcMechanicalFastener = new SetAttributeSubIfcMechanicalFastener(object, attributeName, attributeNewValue);
				setAttributeSubIfcMechanicalFastener.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMechanicalFastenerType")) {
				SetAttributeSubIfcMechanicalFastenerType setAttributeSubIfcMechanicalFastenerType = new SetAttributeSubIfcMechanicalFastenerType(object, attributeName, attributeNewValue);
				setAttributeSubIfcMechanicalFastenerType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMechanicalMaterialProperties")) {
				SetAttributeSubIfcMechanicalMaterialProperties setAttributeSubIfcMechanicalMaterialProperties = new SetAttributeSubIfcMechanicalMaterialProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcMechanicalMaterialProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMechanicalSteelMaterialProperties")) {
				SetAttributeSubIfcMechanicalSteelMaterialProperties setAttributeSubIfcMechanicalSteelMaterialProperties = new SetAttributeSubIfcMechanicalSteelMaterialProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcMechanicalSteelMaterialProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMember")) {
				SetAttributeSubIfcMember setAttributeSubIfcMember = new SetAttributeSubIfcMember(object, attributeName, attributeNewValue);
				setAttributeSubIfcMember.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMemberType")) {
				SetAttributeSubIfcMemberType setAttributeSubIfcMemberType = new SetAttributeSubIfcMemberType(object, attributeName, attributeNewValue);
				setAttributeSubIfcMemberType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMetric")) {
				SetAttributeSubIfcMetric setAttributeSubIfcMetric = new SetAttributeSubIfcMetric(object, attributeName, attributeNewValue);
				setAttributeSubIfcMetric.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcModulusOfElasticityMeasure")) {
				SetAttributeSubIfcModulusOfElasticityMeasure setAttributeSubIfcModulusOfElasticityMeasure = new SetAttributeSubIfcModulusOfElasticityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcModulusOfElasticityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcModulusOfLinearSubgradeReactionMeasure")) {
				SetAttributeSubIfcModulusOfLinearSubgradeReactionMeasure setAttributeSubIfcModulusOfLinearSubgradeReactionMeasure = new SetAttributeSubIfcModulusOfLinearSubgradeReactionMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcModulusOfLinearSubgradeReactionMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcModulusOfRotationalSubgradeReactionMeasure")) {
				SetAttributeSubIfcModulusOfRotationalSubgradeReactionMeasure setAttributeSubIfcModulusOfRotationalSubgradeReactionMeasure = new SetAttributeSubIfcModulusOfRotationalSubgradeReactionMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcModulusOfRotationalSubgradeReactionMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcModulusOfSubgradeReactionMeasure")) {
				SetAttributeSubIfcModulusOfSubgradeReactionMeasure setAttributeSubIfcModulusOfSubgradeReactionMeasure = new SetAttributeSubIfcModulusOfSubgradeReactionMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcModulusOfSubgradeReactionMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMoistureDiffusivityMeasure")) {
				SetAttributeSubIfcMoistureDiffusivityMeasure setAttributeSubIfcMoistureDiffusivityMeasure = new SetAttributeSubIfcMoistureDiffusivityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcMoistureDiffusivityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMolecularWeightMeasure")) {
				SetAttributeSubIfcMolecularWeightMeasure setAttributeSubIfcMolecularWeightMeasure = new SetAttributeSubIfcMolecularWeightMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcMolecularWeightMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMomentOfInertiaMeasure")) {
				SetAttributeSubIfcMomentOfInertiaMeasure setAttributeSubIfcMomentOfInertiaMeasure = new SetAttributeSubIfcMomentOfInertiaMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcMomentOfInertiaMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMonetaryMeasure")) {
				SetAttributeSubIfcMonetaryMeasure setAttributeSubIfcMonetaryMeasure = new SetAttributeSubIfcMonetaryMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcMonetaryMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMonetaryUnit")) {
				SetAttributeSubIfcMonetaryUnit setAttributeSubIfcMonetaryUnit = new SetAttributeSubIfcMonetaryUnit(object, attributeName, attributeNewValue);
				setAttributeSubIfcMonetaryUnit.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMotorConnectionType")) {
				SetAttributeSubIfcMotorConnectionType setAttributeSubIfcMotorConnectionType = new SetAttributeSubIfcMotorConnectionType(object, attributeName, attributeNewValue);
				setAttributeSubIfcMotorConnectionType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMove")) {
				SetAttributeSubIfcMove setAttributeSubIfcMove = new SetAttributeSubIfcMove(object, attributeName, attributeNewValue);
				setAttributeSubIfcMove.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcNamedUnit")) {
				SetAttributeSubIfcNamedUnit setAttributeSubIfcNamedUnit = new SetAttributeSubIfcNamedUnit(object, attributeName, attributeNewValue);
				setAttributeSubIfcNamedUnit.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcNormalisedRatioMeasure")) {
				SetAttributeSubIfcNormalisedRatioMeasure setAttributeSubIfcNormalisedRatioMeasure = new SetAttributeSubIfcNormalisedRatioMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcNormalisedRatioMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcNumericMeasure")) {
				SetAttributeSubIfcNumericMeasure setAttributeSubIfcNumericMeasure = new SetAttributeSubIfcNumericMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcNumericMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcObjectDefinition")) {
				SetAttributeSubIfcObjectDefinition setAttributeSubIfcObjectDefinition = new SetAttributeSubIfcObjectDefinition(object, attributeName, attributeNewValue);
				setAttributeSubIfcObjectDefinition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcObject")) {
				SetAttributeSubIfcObject setAttributeSubIfcObject = new SetAttributeSubIfcObject(object, attributeName, attributeNewValue);
				setAttributeSubIfcObject.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcObjectPlacement")) {
				SetAttributeSubIfcObjectPlacement setAttributeSubIfcObjectPlacement = new SetAttributeSubIfcObjectPlacement(object, attributeName, attributeNewValue);
				setAttributeSubIfcObjectPlacement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcObjective")) {
				SetAttributeSubIfcObjective setAttributeSubIfcObjective = new SetAttributeSubIfcObjective(object, attributeName, attributeNewValue);
				setAttributeSubIfcObjective.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOccupant")) {
				SetAttributeSubIfcOccupant setAttributeSubIfcOccupant = new SetAttributeSubIfcOccupant(object, attributeName, attributeNewValue);
				setAttributeSubIfcOccupant.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOffsetCurve2D")) {
				SetAttributeSubIfcOffsetCurve2D setAttributeSubIfcOffsetCurve2D = new SetAttributeSubIfcOffsetCurve2D(object, attributeName, attributeNewValue);
				setAttributeSubIfcOffsetCurve2D.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOffsetCurve3D")) {
				SetAttributeSubIfcOffsetCurve3D setAttributeSubIfcOffsetCurve3D = new SetAttributeSubIfcOffsetCurve3D(object, attributeName, attributeNewValue);
				setAttributeSubIfcOffsetCurve3D.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOneDirectionRepeatFactor")) {
				SetAttributeSubIfcOneDirectionRepeatFactor setAttributeSubIfcOneDirectionRepeatFactor = new SetAttributeSubIfcOneDirectionRepeatFactor(object, attributeName, attributeNewValue);
				setAttributeSubIfcOneDirectionRepeatFactor.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOpenShell")) {
				SetAttributeSubIfcOpenShell setAttributeSubIfcOpenShell = new SetAttributeSubIfcOpenShell(object, attributeName, attributeNewValue);
				setAttributeSubIfcOpenShell.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOpeningElement")) {
				SetAttributeSubIfcOpeningElement setAttributeSubIfcOpeningElement = new SetAttributeSubIfcOpeningElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcOpeningElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOpticalMaterialProperties")) {
				SetAttributeSubIfcOpticalMaterialProperties setAttributeSubIfcOpticalMaterialProperties = new SetAttributeSubIfcOpticalMaterialProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcOpticalMaterialProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOrderAction")) {
				SetAttributeSubIfcOrderAction setAttributeSubIfcOrderAction = new SetAttributeSubIfcOrderAction(object, attributeName, attributeNewValue);
				setAttributeSubIfcOrderAction.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOrganization")) {
				SetAttributeSubIfcOrganization setAttributeSubIfcOrganization = new SetAttributeSubIfcOrganization(object, attributeName, attributeNewValue);
				setAttributeSubIfcOrganization.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOrganizationRelationship")) {
				SetAttributeSubIfcOrganizationRelationship setAttributeSubIfcOrganizationRelationship = new SetAttributeSubIfcOrganizationRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcOrganizationRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOrientedEdge")) {
				SetAttributeSubIfcOrientedEdge setAttributeSubIfcOrientedEdge = new SetAttributeSubIfcOrientedEdge(object, attributeName, attributeNewValue);
				setAttributeSubIfcOrientedEdge.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOutletType")) {
				SetAttributeSubIfcOutletType setAttributeSubIfcOutletType = new SetAttributeSubIfcOutletType(object, attributeName, attributeNewValue);
				setAttributeSubIfcOutletType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOwnerHistory")) {
				SetAttributeSubIfcOwnerHistory setAttributeSubIfcOwnerHistory = new SetAttributeSubIfcOwnerHistory(object, attributeName, attributeNewValue);
				setAttributeSubIfcOwnerHistory.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPHMeasure")) {
				SetAttributeSubIfcPHMeasure setAttributeSubIfcPHMeasure = new SetAttributeSubIfcPHMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcPHMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcParameterValue")) {
				SetAttributeSubIfcParameterValue setAttributeSubIfcParameterValue = new SetAttributeSubIfcParameterValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcParameterValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcParameterizedProfileDef")) {
				SetAttributeSubIfcParameterizedProfileDef setAttributeSubIfcParameterizedProfileDef = new SetAttributeSubIfcParameterizedProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcParameterizedProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPath")) {
				SetAttributeSubIfcPath setAttributeSubIfcPath = new SetAttributeSubIfcPath(object, attributeName, attributeNewValue);
				setAttributeSubIfcPath.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPerformanceHistory")) {
				SetAttributeSubIfcPerformanceHistory setAttributeSubIfcPerformanceHistory = new SetAttributeSubIfcPerformanceHistory(object, attributeName, attributeNewValue);
				setAttributeSubIfcPerformanceHistory.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPermeableCoveringProperties")) {
				SetAttributeSubIfcPermeableCoveringProperties setAttributeSubIfcPermeableCoveringProperties = new SetAttributeSubIfcPermeableCoveringProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcPermeableCoveringProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPermit")) {
				SetAttributeSubIfcPermit setAttributeSubIfcPermit = new SetAttributeSubIfcPermit(object, attributeName, attributeNewValue);
				setAttributeSubIfcPermit.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPersonAndOrganization")) {
				SetAttributeSubIfcPersonAndOrganization setAttributeSubIfcPersonAndOrganization = new SetAttributeSubIfcPersonAndOrganization(object, attributeName, attributeNewValue);
				setAttributeSubIfcPersonAndOrganization.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPerson")) {
				SetAttributeSubIfcPerson setAttributeSubIfcPerson = new SetAttributeSubIfcPerson(object, attributeName, attributeNewValue);
				setAttributeSubIfcPerson.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPhysicalComplexQuantity")) {
				SetAttributeSubIfcPhysicalComplexQuantity setAttributeSubIfcPhysicalComplexQuantity = new SetAttributeSubIfcPhysicalComplexQuantity(object, attributeName, attributeNewValue);
				setAttributeSubIfcPhysicalComplexQuantity.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPhysicalQuantity")) {
				SetAttributeSubIfcPhysicalQuantity setAttributeSubIfcPhysicalQuantity = new SetAttributeSubIfcPhysicalQuantity(object, attributeName, attributeNewValue);
				setAttributeSubIfcPhysicalQuantity.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPhysicalSimpleQuantity")) {
				SetAttributeSubIfcPhysicalSimpleQuantity setAttributeSubIfcPhysicalSimpleQuantity = new SetAttributeSubIfcPhysicalSimpleQuantity(object, attributeName, attributeNewValue);
				setAttributeSubIfcPhysicalSimpleQuantity.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPile")) {
				SetAttributeSubIfcPile setAttributeSubIfcPile = new SetAttributeSubIfcPile(object, attributeName, attributeNewValue);
				setAttributeSubIfcPile.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPipeFittingType")) {
				SetAttributeSubIfcPipeFittingType setAttributeSubIfcPipeFittingType = new SetAttributeSubIfcPipeFittingType(object, attributeName, attributeNewValue);
				setAttributeSubIfcPipeFittingType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPipeSegmentType")) {
				SetAttributeSubIfcPipeSegmentType setAttributeSubIfcPipeSegmentType = new SetAttributeSubIfcPipeSegmentType(object, attributeName, attributeNewValue);
				setAttributeSubIfcPipeSegmentType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPixelTexture")) {
				SetAttributeSubIfcPixelTexture setAttributeSubIfcPixelTexture = new SetAttributeSubIfcPixelTexture(object, attributeName, attributeNewValue);
				setAttributeSubIfcPixelTexture.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlacement")) {
				SetAttributeSubIfcPlacement setAttributeSubIfcPlacement = new SetAttributeSubIfcPlacement(object, attributeName, attributeNewValue);
				setAttributeSubIfcPlacement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlanarBox")) {
				SetAttributeSubIfcPlanarBox setAttributeSubIfcPlanarBox = new SetAttributeSubIfcPlanarBox(object, attributeName, attributeNewValue);
				setAttributeSubIfcPlanarBox.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlanarExtent")) {
				SetAttributeSubIfcPlanarExtent setAttributeSubIfcPlanarExtent = new SetAttributeSubIfcPlanarExtent(object, attributeName, attributeNewValue);
				setAttributeSubIfcPlanarExtent.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlanarForceMeasure")) {
				SetAttributeSubIfcPlanarForceMeasure setAttributeSubIfcPlanarForceMeasure = new SetAttributeSubIfcPlanarForceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcPlanarForceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlaneAngleMeasure")) {
				SetAttributeSubIfcPlaneAngleMeasure setAttributeSubIfcPlaneAngleMeasure = new SetAttributeSubIfcPlaneAngleMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcPlaneAngleMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlane")) {
				SetAttributeSubIfcPlane setAttributeSubIfcPlane = new SetAttributeSubIfcPlane(object, attributeName, attributeNewValue);
				setAttributeSubIfcPlane.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlate")) {
				SetAttributeSubIfcPlate setAttributeSubIfcPlate = new SetAttributeSubIfcPlate(object, attributeName, attributeNewValue);
				setAttributeSubIfcPlate.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlateType")) {
				SetAttributeSubIfcPlateType setAttributeSubIfcPlateType = new SetAttributeSubIfcPlateType(object, attributeName, attributeNewValue);
				setAttributeSubIfcPlateType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPoint")) {
				SetAttributeSubIfcPoint setAttributeSubIfcPoint = new SetAttributeSubIfcPoint(object, attributeName, attributeNewValue);
				setAttributeSubIfcPoint.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPointOnCurve")) {
				SetAttributeSubIfcPointOnCurve setAttributeSubIfcPointOnCurve = new SetAttributeSubIfcPointOnCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfcPointOnCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPointOnSurface")) {
				SetAttributeSubIfcPointOnSurface setAttributeSubIfcPointOnSurface = new SetAttributeSubIfcPointOnSurface(object, attributeName, attributeNewValue);
				setAttributeSubIfcPointOnSurface.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPolyLoop")) {
				SetAttributeSubIfcPolyLoop setAttributeSubIfcPolyLoop = new SetAttributeSubIfcPolyLoop(object, attributeName, attributeNewValue);
				setAttributeSubIfcPolyLoop.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPolygonalBoundedHalfSpace")) {
				SetAttributeSubIfcPolygonalBoundedHalfSpace setAttributeSubIfcPolygonalBoundedHalfSpace = new SetAttributeSubIfcPolygonalBoundedHalfSpace(object, attributeName, attributeNewValue);
				setAttributeSubIfcPolygonalBoundedHalfSpace.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPolyline")) {
				SetAttributeSubIfcPolyline setAttributeSubIfcPolyline = new SetAttributeSubIfcPolyline(object, attributeName, attributeNewValue);
				setAttributeSubIfcPolyline.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPort")) {
				SetAttributeSubIfcPort setAttributeSubIfcPort = new SetAttributeSubIfcPort(object, attributeName, attributeNewValue);
				setAttributeSubIfcPort.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPositiveLengthMeasure")) {
				SetAttributeSubIfcPositiveLengthMeasure setAttributeSubIfcPositiveLengthMeasure = new SetAttributeSubIfcPositiveLengthMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcPositiveLengthMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPositivePlaneAngleMeasure")) {
				SetAttributeSubIfcPositivePlaneAngleMeasure setAttributeSubIfcPositivePlaneAngleMeasure = new SetAttributeSubIfcPositivePlaneAngleMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcPositivePlaneAngleMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPositiveRatioMeasure")) {
				SetAttributeSubIfcPositiveRatioMeasure setAttributeSubIfcPositiveRatioMeasure = new SetAttributeSubIfcPositiveRatioMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcPositiveRatioMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPostalAddress")) {
				SetAttributeSubIfcPostalAddress setAttributeSubIfcPostalAddress = new SetAttributeSubIfcPostalAddress(object, attributeName, attributeNewValue);
				setAttributeSubIfcPostalAddress.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPowerMeasure")) {
				SetAttributeSubIfcPowerMeasure setAttributeSubIfcPowerMeasure = new SetAttributeSubIfcPowerMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcPowerMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedColour")) {
				SetAttributeSubIfcPreDefinedColour setAttributeSubIfcPreDefinedColour = new SetAttributeSubIfcPreDefinedColour(object, attributeName, attributeNewValue);
				setAttributeSubIfcPreDefinedColour.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedCurveFont")) {
				SetAttributeSubIfcPreDefinedCurveFont setAttributeSubIfcPreDefinedCurveFont = new SetAttributeSubIfcPreDefinedCurveFont(object, attributeName, attributeNewValue);
				setAttributeSubIfcPreDefinedCurveFont.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedDimensionSymbol")) {
				SetAttributeSubIfcPreDefinedDimensionSymbol setAttributeSubIfcPreDefinedDimensionSymbol = new SetAttributeSubIfcPreDefinedDimensionSymbol(object, attributeName, attributeNewValue);
				setAttributeSubIfcPreDefinedDimensionSymbol.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedItem")) {
				SetAttributeSubIfcPreDefinedItem setAttributeSubIfcPreDefinedItem = new SetAttributeSubIfcPreDefinedItem(object, attributeName, attributeNewValue);
				setAttributeSubIfcPreDefinedItem.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedPointMarkerSymbol")) {
				SetAttributeSubIfcPreDefinedPointMarkerSymbol setAttributeSubIfcPreDefinedPointMarkerSymbol = new SetAttributeSubIfcPreDefinedPointMarkerSymbol(object, attributeName, attributeNewValue);
				setAttributeSubIfcPreDefinedPointMarkerSymbol.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedSymbol")) {
				SetAttributeSubIfcPreDefinedSymbol setAttributeSubIfcPreDefinedSymbol = new SetAttributeSubIfcPreDefinedSymbol(object, attributeName, attributeNewValue);
				setAttributeSubIfcPreDefinedSymbol.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedTerminatorSymbol")) {
				SetAttributeSubIfcPreDefinedTerminatorSymbol setAttributeSubIfcPreDefinedTerminatorSymbol = new SetAttributeSubIfcPreDefinedTerminatorSymbol(object, attributeName, attributeNewValue);
				setAttributeSubIfcPreDefinedTerminatorSymbol.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedTextFont")) {
				SetAttributeSubIfcPreDefinedTextFont setAttributeSubIfcPreDefinedTextFont = new SetAttributeSubIfcPreDefinedTextFont(object, attributeName, attributeNewValue);
				setAttributeSubIfcPreDefinedTextFont.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPresentationLayerAssignment")) {
				SetAttributeSubIfcPresentationLayerAssignment setAttributeSubIfcPresentationLayerAssignment = new SetAttributeSubIfcPresentationLayerAssignment(object, attributeName, attributeNewValue);
				setAttributeSubIfcPresentationLayerAssignment.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPresentationLayerWithStyle")) {
				SetAttributeSubIfcPresentationLayerWithStyle setAttributeSubIfcPresentationLayerWithStyle = new SetAttributeSubIfcPresentationLayerWithStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcPresentationLayerWithStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPresentationStyleAssignment")) {
				SetAttributeSubIfcPresentationStyleAssignment setAttributeSubIfcPresentationStyleAssignment = new SetAttributeSubIfcPresentationStyleAssignment(object, attributeName, attributeNewValue);
				setAttributeSubIfcPresentationStyleAssignment.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPresentationStyle")) {
				SetAttributeSubIfcPresentationStyle setAttributeSubIfcPresentationStyle = new SetAttributeSubIfcPresentationStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcPresentationStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPressureMeasure")) {
				SetAttributeSubIfcPressureMeasure setAttributeSubIfcPressureMeasure = new SetAttributeSubIfcPressureMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcPressureMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProcedure")) {
				SetAttributeSubIfcProcedure setAttributeSubIfcProcedure = new SetAttributeSubIfcProcedure(object, attributeName, attributeNewValue);
				setAttributeSubIfcProcedure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProcess")) {
				SetAttributeSubIfcProcess setAttributeSubIfcProcess = new SetAttributeSubIfcProcess(object, attributeName, attributeNewValue);
				setAttributeSubIfcProcess.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProductDefinitionShape")) {
				SetAttributeSubIfcProductDefinitionShape setAttributeSubIfcProductDefinitionShape = new SetAttributeSubIfcProductDefinitionShape(object, attributeName, attributeNewValue);
				setAttributeSubIfcProductDefinitionShape.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProduct")) {
				SetAttributeSubIfcProduct setAttributeSubIfcProduct = new SetAttributeSubIfcProduct(object, attributeName, attributeNewValue);
				setAttributeSubIfcProduct.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProductRepresentation")) {
				SetAttributeSubIfcProductRepresentation setAttributeSubIfcProductRepresentation = new SetAttributeSubIfcProductRepresentation(object, attributeName, attributeNewValue);
				setAttributeSubIfcProductRepresentation.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProductsOfCombustionProperties")) {
				SetAttributeSubIfcProductsOfCombustionProperties setAttributeSubIfcProductsOfCombustionProperties = new SetAttributeSubIfcProductsOfCombustionProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcProductsOfCombustionProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProfileDef")) {
				SetAttributeSubIfcProfileDef setAttributeSubIfcProfileDef = new SetAttributeSubIfcProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProfileProperties")) {
				SetAttributeSubIfcProfileProperties setAttributeSubIfcProfileProperties = new SetAttributeSubIfcProfileProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcProfileProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProject")) {
				SetAttributeSubIfcProject setAttributeSubIfcProject = new SetAttributeSubIfcProject(object, attributeName, attributeNewValue);
				setAttributeSubIfcProject.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProjectOrder")) {
				SetAttributeSubIfcProjectOrder setAttributeSubIfcProjectOrder = new SetAttributeSubIfcProjectOrder(object, attributeName, attributeNewValue);
				setAttributeSubIfcProjectOrder.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProjectOrderRecord")) {
				SetAttributeSubIfcProjectOrderRecord setAttributeSubIfcProjectOrderRecord = new SetAttributeSubIfcProjectOrderRecord(object, attributeName, attributeNewValue);
				setAttributeSubIfcProjectOrderRecord.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProjectionCurve")) {
				SetAttributeSubIfcProjectionCurve setAttributeSubIfcProjectionCurve = new SetAttributeSubIfcProjectionCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfcProjectionCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProjectionElement")) {
				SetAttributeSubIfcProjectionElement setAttributeSubIfcProjectionElement = new SetAttributeSubIfcProjectionElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcProjectionElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyBoundedValue")) {
				SetAttributeSubIfcPropertyBoundedValue setAttributeSubIfcPropertyBoundedValue = new SetAttributeSubIfcPropertyBoundedValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertyBoundedValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyConstraintRelationship")) {
				SetAttributeSubIfcPropertyConstraintRelationship setAttributeSubIfcPropertyConstraintRelationship = new SetAttributeSubIfcPropertyConstraintRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertyConstraintRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyDefinition")) {
				SetAttributeSubIfcPropertyDefinition setAttributeSubIfcPropertyDefinition = new SetAttributeSubIfcPropertyDefinition(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertyDefinition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyDependencyRelationship")) {
				SetAttributeSubIfcPropertyDependencyRelationship setAttributeSubIfcPropertyDependencyRelationship = new SetAttributeSubIfcPropertyDependencyRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertyDependencyRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyEnumeratedValue")) {
				SetAttributeSubIfcPropertyEnumeratedValue setAttributeSubIfcPropertyEnumeratedValue = new SetAttributeSubIfcPropertyEnumeratedValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertyEnumeratedValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyEnumeration")) {
				SetAttributeSubIfcPropertyEnumeration setAttributeSubIfcPropertyEnumeration = new SetAttributeSubIfcPropertyEnumeration(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertyEnumeration.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProperty")) {
				SetAttributeSubIfcProperty setAttributeSubIfcProperty = new SetAttributeSubIfcProperty(object, attributeName, attributeNewValue);
				setAttributeSubIfcProperty.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyListValue")) {
				SetAttributeSubIfcPropertyListValue setAttributeSubIfcPropertyListValue = new SetAttributeSubIfcPropertyListValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertyListValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyReferenceValue")) {
				SetAttributeSubIfcPropertyReferenceValue setAttributeSubIfcPropertyReferenceValue = new SetAttributeSubIfcPropertyReferenceValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertyReferenceValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertySetDefinition")) {
				SetAttributeSubIfcPropertySetDefinition setAttributeSubIfcPropertySetDefinition = new SetAttributeSubIfcPropertySetDefinition(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertySetDefinition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertySet")) {
				SetAttributeSubIfcPropertySet setAttributeSubIfcPropertySet = new SetAttributeSubIfcPropertySet(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertySet.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertySingleValue")) {
				SetAttributeSubIfcPropertySingleValue setAttributeSubIfcPropertySingleValue = new SetAttributeSubIfcPropertySingleValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertySingleValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyTableValue")) {
				SetAttributeSubIfcPropertyTableValue setAttributeSubIfcPropertyTableValue = new SetAttributeSubIfcPropertyTableValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcPropertyTableValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProtectiveDeviceType")) {
				SetAttributeSubIfcProtectiveDeviceType setAttributeSubIfcProtectiveDeviceType = new SetAttributeSubIfcProtectiveDeviceType(object, attributeName, attributeNewValue);
				setAttributeSubIfcProtectiveDeviceType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProxy")) {
				SetAttributeSubIfcProxy setAttributeSubIfcProxy = new SetAttributeSubIfcProxy(object, attributeName, attributeNewValue);
				setAttributeSubIfcProxy.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPumpType")) {
				SetAttributeSubIfcPumpType setAttributeSubIfcPumpType = new SetAttributeSubIfcPumpType(object, attributeName, attributeNewValue);
				setAttributeSubIfcPumpType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityArea")) {
				SetAttributeSubIfcQuantityArea setAttributeSubIfcQuantityArea = new SetAttributeSubIfcQuantityArea(object, attributeName, attributeNewValue);
				setAttributeSubIfcQuantityArea.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityCount")) {
				SetAttributeSubIfcQuantityCount setAttributeSubIfcQuantityCount = new SetAttributeSubIfcQuantityCount(object, attributeName, attributeNewValue);
				setAttributeSubIfcQuantityCount.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityLength")) {
				SetAttributeSubIfcQuantityLength setAttributeSubIfcQuantityLength = new SetAttributeSubIfcQuantityLength(object, attributeName, attributeNewValue);
				setAttributeSubIfcQuantityLength.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityTime")) {
				SetAttributeSubIfcQuantityTime setAttributeSubIfcQuantityTime = new SetAttributeSubIfcQuantityTime(object, attributeName, attributeNewValue);
				setAttributeSubIfcQuantityTime.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityVolume")) {
				SetAttributeSubIfcQuantityVolume setAttributeSubIfcQuantityVolume = new SetAttributeSubIfcQuantityVolume(object, attributeName, attributeNewValue);
				setAttributeSubIfcQuantityVolume.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityWeight")) {
				SetAttributeSubIfcQuantityWeight setAttributeSubIfcQuantityWeight = new SetAttributeSubIfcQuantityWeight(object, attributeName, attributeNewValue);
				setAttributeSubIfcQuantityWeight.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRadioActivityMeasure")) {
				SetAttributeSubIfcRadioActivityMeasure setAttributeSubIfcRadioActivityMeasure = new SetAttributeSubIfcRadioActivityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcRadioActivityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRadiusDimension")) {
				SetAttributeSubIfcRadiusDimension setAttributeSubIfcRadiusDimension = new SetAttributeSubIfcRadiusDimension(object, attributeName, attributeNewValue);
				setAttributeSubIfcRadiusDimension.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRailing")) {
				SetAttributeSubIfcRailing setAttributeSubIfcRailing = new SetAttributeSubIfcRailing(object, attributeName, attributeNewValue);
				setAttributeSubIfcRailing.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRailingType")) {
				SetAttributeSubIfcRailingType setAttributeSubIfcRailingType = new SetAttributeSubIfcRailingType(object, attributeName, attributeNewValue);
				setAttributeSubIfcRailingType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRampFlight")) {
				SetAttributeSubIfcRampFlight setAttributeSubIfcRampFlight = new SetAttributeSubIfcRampFlight(object, attributeName, attributeNewValue);
				setAttributeSubIfcRampFlight.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRampFlightType")) {
				SetAttributeSubIfcRampFlightType setAttributeSubIfcRampFlightType = new SetAttributeSubIfcRampFlightType(object, attributeName, attributeNewValue);
				setAttributeSubIfcRampFlightType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRamp")) {
				SetAttributeSubIfcRamp setAttributeSubIfcRamp = new SetAttributeSubIfcRamp(object, attributeName, attributeNewValue);
				setAttributeSubIfcRamp.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRatioMeasure")) {
				SetAttributeSubIfcRatioMeasure setAttributeSubIfcRatioMeasure = new SetAttributeSubIfcRatioMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcRatioMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRationalBezierCurve")) {
				SetAttributeSubIfcRationalBezierCurve setAttributeSubIfcRationalBezierCurve = new SetAttributeSubIfcRationalBezierCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfcRationalBezierCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReal")) {
				SetAttributeSubIfcReal setAttributeSubIfcReal = new SetAttributeSubIfcReal(object, attributeName, attributeNewValue);
				setAttributeSubIfcReal.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRectangleHollowProfileDef")) {
				SetAttributeSubIfcRectangleHollowProfileDef setAttributeSubIfcRectangleHollowProfileDef = new SetAttributeSubIfcRectangleHollowProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcRectangleHollowProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRectangleProfileDef")) {
				SetAttributeSubIfcRectangleProfileDef setAttributeSubIfcRectangleProfileDef = new SetAttributeSubIfcRectangleProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcRectangleProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRectangularPyramid")) {
				SetAttributeSubIfcRectangularPyramid setAttributeSubIfcRectangularPyramid = new SetAttributeSubIfcRectangularPyramid(object, attributeName, attributeNewValue);
				setAttributeSubIfcRectangularPyramid.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRectangularTrimmedSurface")) {
				SetAttributeSubIfcRectangularTrimmedSurface setAttributeSubIfcRectangularTrimmedSurface = new SetAttributeSubIfcRectangularTrimmedSurface(object, attributeName, attributeNewValue);
				setAttributeSubIfcRectangularTrimmedSurface.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReferencesValueDocument")) {
				SetAttributeSubIfcReferencesValueDocument setAttributeSubIfcReferencesValueDocument = new SetAttributeSubIfcReferencesValueDocument(object, attributeName, attributeNewValue);
				setAttributeSubIfcReferencesValueDocument.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRegularTimeSeries")) {
				SetAttributeSubIfcRegularTimeSeries setAttributeSubIfcRegularTimeSeries = new SetAttributeSubIfcRegularTimeSeries(object, attributeName, attributeNewValue);
				setAttributeSubIfcRegularTimeSeries.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReinforcementBarProperties")) {
				SetAttributeSubIfcReinforcementBarProperties setAttributeSubIfcReinforcementBarProperties = new SetAttributeSubIfcReinforcementBarProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcReinforcementBarProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReinforcementDefinitionProperties")) {
				SetAttributeSubIfcReinforcementDefinitionProperties setAttributeSubIfcReinforcementDefinitionProperties = new SetAttributeSubIfcReinforcementDefinitionProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcReinforcementDefinitionProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReinforcingBar")) {
				SetAttributeSubIfcReinforcingBar setAttributeSubIfcReinforcingBar = new SetAttributeSubIfcReinforcingBar(object, attributeName, attributeNewValue);
				setAttributeSubIfcReinforcingBar.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReinforcingElement")) {
				SetAttributeSubIfcReinforcingElement setAttributeSubIfcReinforcingElement = new SetAttributeSubIfcReinforcingElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcReinforcingElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReinforcingMesh")) {
				SetAttributeSubIfcReinforcingMesh setAttributeSubIfcReinforcingMesh = new SetAttributeSubIfcReinforcingMesh(object, attributeName, attributeNewValue);
				setAttributeSubIfcReinforcingMesh.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAggregates")) {
				SetAttributeSubIfcRelAggregates setAttributeSubIfcRelAggregates = new SetAttributeSubIfcRelAggregates(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAggregates.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssigns")) {
				SetAttributeSubIfcRelAssigns setAttributeSubIfcRelAssigns = new SetAttributeSubIfcRelAssigns(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssigns.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsTasks")) {
				SetAttributeSubIfcRelAssignsTasks setAttributeSubIfcRelAssignsTasks = new SetAttributeSubIfcRelAssignsTasks(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssignsTasks.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToActor")) {
				SetAttributeSubIfcRelAssignsToActor setAttributeSubIfcRelAssignsToActor = new SetAttributeSubIfcRelAssignsToActor(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssignsToActor.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToControl")) {
				SetAttributeSubIfcRelAssignsToControl setAttributeSubIfcRelAssignsToControl = new SetAttributeSubIfcRelAssignsToControl(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssignsToControl.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToGroup")) {
				SetAttributeSubIfcRelAssignsToGroup setAttributeSubIfcRelAssignsToGroup = new SetAttributeSubIfcRelAssignsToGroup(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssignsToGroup.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToProcess")) {
				SetAttributeSubIfcRelAssignsToProcess setAttributeSubIfcRelAssignsToProcess = new SetAttributeSubIfcRelAssignsToProcess(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssignsToProcess.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToProduct")) {
				SetAttributeSubIfcRelAssignsToProduct setAttributeSubIfcRelAssignsToProduct = new SetAttributeSubIfcRelAssignsToProduct(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssignsToProduct.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToProjectOrder")) {
				SetAttributeSubIfcRelAssignsToProjectOrder setAttributeSubIfcRelAssignsToProjectOrder = new SetAttributeSubIfcRelAssignsToProjectOrder(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssignsToProjectOrder.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToResource")) {
				SetAttributeSubIfcRelAssignsToResource setAttributeSubIfcRelAssignsToResource = new SetAttributeSubIfcRelAssignsToResource(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssignsToResource.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesAppliedValue")) {
				SetAttributeSubIfcRelAssociatesAppliedValue setAttributeSubIfcRelAssociatesAppliedValue = new SetAttributeSubIfcRelAssociatesAppliedValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssociatesAppliedValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesApproval")) {
				SetAttributeSubIfcRelAssociatesApproval setAttributeSubIfcRelAssociatesApproval = new SetAttributeSubIfcRelAssociatesApproval(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssociatesApproval.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesClassification")) {
				SetAttributeSubIfcRelAssociatesClassification setAttributeSubIfcRelAssociatesClassification = new SetAttributeSubIfcRelAssociatesClassification(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssociatesClassification.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesConstraint")) {
				SetAttributeSubIfcRelAssociatesConstraint setAttributeSubIfcRelAssociatesConstraint = new SetAttributeSubIfcRelAssociatesConstraint(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssociatesConstraint.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesDocument")) {
				SetAttributeSubIfcRelAssociatesDocument setAttributeSubIfcRelAssociatesDocument = new SetAttributeSubIfcRelAssociatesDocument(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssociatesDocument.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociates")) {
				SetAttributeSubIfcRelAssociates setAttributeSubIfcRelAssociates = new SetAttributeSubIfcRelAssociates(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssociates.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesLibrary")) {
				SetAttributeSubIfcRelAssociatesLibrary setAttributeSubIfcRelAssociatesLibrary = new SetAttributeSubIfcRelAssociatesLibrary(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssociatesLibrary.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesMaterial")) {
				SetAttributeSubIfcRelAssociatesMaterial setAttributeSubIfcRelAssociatesMaterial = new SetAttributeSubIfcRelAssociatesMaterial(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssociatesMaterial.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesProfileProperties")) {
				SetAttributeSubIfcRelAssociatesProfileProperties setAttributeSubIfcRelAssociatesProfileProperties = new SetAttributeSubIfcRelAssociatesProfileProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelAssociatesProfileProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsElements")) {
				SetAttributeSubIfcRelConnectsElements setAttributeSubIfcRelConnectsElements = new SetAttributeSubIfcRelConnectsElements(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelConnectsElements.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnects")) {
				SetAttributeSubIfcRelConnects setAttributeSubIfcRelConnects = new SetAttributeSubIfcRelConnects(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelConnects.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsPathElements")) {
				SetAttributeSubIfcRelConnectsPathElements setAttributeSubIfcRelConnectsPathElements = new SetAttributeSubIfcRelConnectsPathElements(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelConnectsPathElements.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsPortToElement")) {
				SetAttributeSubIfcRelConnectsPortToElement setAttributeSubIfcRelConnectsPortToElement = new SetAttributeSubIfcRelConnectsPortToElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelConnectsPortToElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsPorts")) {
				SetAttributeSubIfcRelConnectsPorts setAttributeSubIfcRelConnectsPorts = new SetAttributeSubIfcRelConnectsPorts(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelConnectsPorts.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsStructuralActivity")) {
				SetAttributeSubIfcRelConnectsStructuralActivity setAttributeSubIfcRelConnectsStructuralActivity = new SetAttributeSubIfcRelConnectsStructuralActivity(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelConnectsStructuralActivity.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsStructuralElement")) {
				SetAttributeSubIfcRelConnectsStructuralElement setAttributeSubIfcRelConnectsStructuralElement = new SetAttributeSubIfcRelConnectsStructuralElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelConnectsStructuralElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsStructuralMember")) {
				SetAttributeSubIfcRelConnectsStructuralMember setAttributeSubIfcRelConnectsStructuralMember = new SetAttributeSubIfcRelConnectsStructuralMember(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelConnectsStructuralMember.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsWithEccentricity")) {
				SetAttributeSubIfcRelConnectsWithEccentricity setAttributeSubIfcRelConnectsWithEccentricity = new SetAttributeSubIfcRelConnectsWithEccentricity(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelConnectsWithEccentricity.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsWithRealizingElements")) {
				SetAttributeSubIfcRelConnectsWithRealizingElements setAttributeSubIfcRelConnectsWithRealizingElements = new SetAttributeSubIfcRelConnectsWithRealizingElements(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelConnectsWithRealizingElements.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelContainedInSpatialStructure")) {
				SetAttributeSubIfcRelContainedInSpatialStructure setAttributeSubIfcRelContainedInSpatialStructure = new SetAttributeSubIfcRelContainedInSpatialStructure(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelContainedInSpatialStructure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelCoversBldgElements")) {
				SetAttributeSubIfcRelCoversBldgElements setAttributeSubIfcRelCoversBldgElements = new SetAttributeSubIfcRelCoversBldgElements(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelCoversBldgElements.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelCoversSpaces")) {
				SetAttributeSubIfcRelCoversSpaces setAttributeSubIfcRelCoversSpaces = new SetAttributeSubIfcRelCoversSpaces(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelCoversSpaces.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelDecomposes")) {
				SetAttributeSubIfcRelDecomposes setAttributeSubIfcRelDecomposes = new SetAttributeSubIfcRelDecomposes(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelDecomposes.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelDefinesByProperties")) {
				SetAttributeSubIfcRelDefinesByProperties setAttributeSubIfcRelDefinesByProperties = new SetAttributeSubIfcRelDefinesByProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelDefinesByProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelDefinesByType")) {
				SetAttributeSubIfcRelDefinesByType setAttributeSubIfcRelDefinesByType = new SetAttributeSubIfcRelDefinesByType(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelDefinesByType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelDefines")) {
				SetAttributeSubIfcRelDefines setAttributeSubIfcRelDefines = new SetAttributeSubIfcRelDefines(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelDefines.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelFillsElement")) {
				SetAttributeSubIfcRelFillsElement setAttributeSubIfcRelFillsElement = new SetAttributeSubIfcRelFillsElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelFillsElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelFlowControlElements")) {
				SetAttributeSubIfcRelFlowControlElements setAttributeSubIfcRelFlowControlElements = new SetAttributeSubIfcRelFlowControlElements(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelFlowControlElements.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelInteractionRequirements")) {
				SetAttributeSubIfcRelInteractionRequirements setAttributeSubIfcRelInteractionRequirements = new SetAttributeSubIfcRelInteractionRequirements(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelInteractionRequirements.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelNests")) {
				SetAttributeSubIfcRelNests setAttributeSubIfcRelNests = new SetAttributeSubIfcRelNests(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelNests.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelOccupiesSpaces")) {
				SetAttributeSubIfcRelOccupiesSpaces setAttributeSubIfcRelOccupiesSpaces = new SetAttributeSubIfcRelOccupiesSpaces(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelOccupiesSpaces.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelOverridesProperties")) {
				SetAttributeSubIfcRelOverridesProperties setAttributeSubIfcRelOverridesProperties = new SetAttributeSubIfcRelOverridesProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelOverridesProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelProjectsElement")) {
				SetAttributeSubIfcRelProjectsElement setAttributeSubIfcRelProjectsElement = new SetAttributeSubIfcRelProjectsElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelProjectsElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelReferencedInSpatialStructure")) {
				SetAttributeSubIfcRelReferencedInSpatialStructure setAttributeSubIfcRelReferencedInSpatialStructure = new SetAttributeSubIfcRelReferencedInSpatialStructure(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelReferencedInSpatialStructure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelSchedulesCostItems")) {
				SetAttributeSubIfcRelSchedulesCostItems setAttributeSubIfcRelSchedulesCostItems = new SetAttributeSubIfcRelSchedulesCostItems(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelSchedulesCostItems.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelSequence")) {
				SetAttributeSubIfcRelSequence setAttributeSubIfcRelSequence = new SetAttributeSubIfcRelSequence(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelSequence.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelServicesBuildings")) {
				SetAttributeSubIfcRelServicesBuildings setAttributeSubIfcRelServicesBuildings = new SetAttributeSubIfcRelServicesBuildings(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelServicesBuildings.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelSpaceBoundary")) {
				SetAttributeSubIfcRelSpaceBoundary setAttributeSubIfcRelSpaceBoundary = new SetAttributeSubIfcRelSpaceBoundary(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelSpaceBoundary.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelVoidsElement")) {
				SetAttributeSubIfcRelVoidsElement setAttributeSubIfcRelVoidsElement = new SetAttributeSubIfcRelVoidsElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelVoidsElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelationship")) {
				SetAttributeSubIfcRelationship setAttributeSubIfcRelationship = new SetAttributeSubIfcRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelaxation")) {
				SetAttributeSubIfcRelaxation setAttributeSubIfcRelaxation = new SetAttributeSubIfcRelaxation(object, attributeName, attributeNewValue);
				setAttributeSubIfcRelaxation.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRepresentationContext")) {
				SetAttributeSubIfcRepresentationContext setAttributeSubIfcRepresentationContext = new SetAttributeSubIfcRepresentationContext(object, attributeName, attributeNewValue);
				setAttributeSubIfcRepresentationContext.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRepresentation")) {
				SetAttributeSubIfcRepresentation setAttributeSubIfcRepresentation = new SetAttributeSubIfcRepresentation(object, attributeName, attributeNewValue);
				setAttributeSubIfcRepresentation.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRepresentationItem")) {
				SetAttributeSubIfcRepresentationItem setAttributeSubIfcRepresentationItem = new SetAttributeSubIfcRepresentationItem(object, attributeName, attributeNewValue);
				setAttributeSubIfcRepresentationItem.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRepresentationMap")) {
				SetAttributeSubIfcRepresentationMap setAttributeSubIfcRepresentationMap = new SetAttributeSubIfcRepresentationMap(object, attributeName, attributeNewValue);
				setAttributeSubIfcRepresentationMap.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcResource")) {
				SetAttributeSubIfcResource setAttributeSubIfcResource = new SetAttributeSubIfcResource(object, attributeName, attributeNewValue);
				setAttributeSubIfcResource.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRevolvedAreaSolid")) {
				SetAttributeSubIfcRevolvedAreaSolid setAttributeSubIfcRevolvedAreaSolid = new SetAttributeSubIfcRevolvedAreaSolid(object, attributeName, attributeNewValue);
				setAttributeSubIfcRevolvedAreaSolid.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRibPlateProfileProperties")) {
				SetAttributeSubIfcRibPlateProfileProperties setAttributeSubIfcRibPlateProfileProperties = new SetAttributeSubIfcRibPlateProfileProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcRibPlateProfileProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRightCircularCone")) {
				SetAttributeSubIfcRightCircularCone setAttributeSubIfcRightCircularCone = new SetAttributeSubIfcRightCircularCone(object, attributeName, attributeNewValue);
				setAttributeSubIfcRightCircularCone.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRightCircularCylinder")) {
				SetAttributeSubIfcRightCircularCylinder setAttributeSubIfcRightCircularCylinder = new SetAttributeSubIfcRightCircularCylinder(object, attributeName, attributeNewValue);
				setAttributeSubIfcRightCircularCylinder.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRoof")) {
				SetAttributeSubIfcRoof setAttributeSubIfcRoof = new SetAttributeSubIfcRoof(object, attributeName, attributeNewValue);
				setAttributeSubIfcRoof.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRoot")) {
				SetAttributeSubIfcRoot setAttributeSubIfcRoot = new SetAttributeSubIfcRoot(object, attributeName, attributeNewValue);
				setAttributeSubIfcRoot.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRotationalFrequencyMeasure")) {
				SetAttributeSubIfcRotationalFrequencyMeasure setAttributeSubIfcRotationalFrequencyMeasure = new SetAttributeSubIfcRotationalFrequencyMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcRotationalFrequencyMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRotationalMassMeasure")) {
				SetAttributeSubIfcRotationalMassMeasure setAttributeSubIfcRotationalMassMeasure = new SetAttributeSubIfcRotationalMassMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcRotationalMassMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRotationalStiffnessMeasure")) {
				SetAttributeSubIfcRotationalStiffnessMeasure setAttributeSubIfcRotationalStiffnessMeasure = new SetAttributeSubIfcRotationalStiffnessMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcRotationalStiffnessMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRoundedEdgeFeature")) {
				SetAttributeSubIfcRoundedEdgeFeature setAttributeSubIfcRoundedEdgeFeature = new SetAttributeSubIfcRoundedEdgeFeature(object, attributeName, attributeNewValue);
				setAttributeSubIfcRoundedEdgeFeature.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRoundedRectangleProfileDef")) {
				SetAttributeSubIfcRoundedRectangleProfileDef setAttributeSubIfcRoundedRectangleProfileDef = new SetAttributeSubIfcRoundedRectangleProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcRoundedRectangleProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSIUnit")) {
				SetAttributeSubIfcSIUnit setAttributeSubIfcSIUnit = new SetAttributeSubIfcSIUnit(object, attributeName, attributeNewValue);
				setAttributeSubIfcSIUnit.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSanitaryTerminalType")) {
				SetAttributeSubIfcSanitaryTerminalType setAttributeSubIfcSanitaryTerminalType = new SetAttributeSubIfcSanitaryTerminalType(object, attributeName, attributeNewValue);
				setAttributeSubIfcSanitaryTerminalType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcScheduleTimeControl")) {
				SetAttributeSubIfcScheduleTimeControl setAttributeSubIfcScheduleTimeControl = new SetAttributeSubIfcScheduleTimeControl(object, attributeName, attributeNewValue);
				setAttributeSubIfcScheduleTimeControl.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSectionModulusMeasure")) {
				SetAttributeSubIfcSectionModulusMeasure setAttributeSubIfcSectionModulusMeasure = new SetAttributeSubIfcSectionModulusMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcSectionModulusMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSectionProperties")) {
				SetAttributeSubIfcSectionProperties setAttributeSubIfcSectionProperties = new SetAttributeSubIfcSectionProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcSectionProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSectionReinforcementProperties")) {
				SetAttributeSubIfcSectionReinforcementProperties setAttributeSubIfcSectionReinforcementProperties = new SetAttributeSubIfcSectionReinforcementProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcSectionReinforcementProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSectionalAreaIntegralMeasure")) {
				SetAttributeSubIfcSectionalAreaIntegralMeasure setAttributeSubIfcSectionalAreaIntegralMeasure = new SetAttributeSubIfcSectionalAreaIntegralMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcSectionalAreaIntegralMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSectionedSpine")) {
				SetAttributeSubIfcSectionedSpine setAttributeSubIfcSectionedSpine = new SetAttributeSubIfcSectionedSpine(object, attributeName, attributeNewValue);
				setAttributeSubIfcSectionedSpine.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSensorType")) {
				SetAttributeSubIfcSensorType setAttributeSubIfcSensorType = new SetAttributeSubIfcSensorType(object, attributeName, attributeNewValue);
				setAttributeSubIfcSensorType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcServiceLifeFactor")) {
				SetAttributeSubIfcServiceLifeFactor setAttributeSubIfcServiceLifeFactor = new SetAttributeSubIfcServiceLifeFactor(object, attributeName, attributeNewValue);
				setAttributeSubIfcServiceLifeFactor.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcServiceLife")) {
				SetAttributeSubIfcServiceLife setAttributeSubIfcServiceLife = new SetAttributeSubIfcServiceLife(object, attributeName, attributeNewValue);
				setAttributeSubIfcServiceLife.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcShapeAspect")) {
				SetAttributeSubIfcShapeAspect setAttributeSubIfcShapeAspect = new SetAttributeSubIfcShapeAspect(object, attributeName, attributeNewValue);
				setAttributeSubIfcShapeAspect.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcShapeModel")) {
				SetAttributeSubIfcShapeModel setAttributeSubIfcShapeModel = new SetAttributeSubIfcShapeModel(object, attributeName, attributeNewValue);
				setAttributeSubIfcShapeModel.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcShapeRepresentation")) {
				SetAttributeSubIfcShapeRepresentation setAttributeSubIfcShapeRepresentation = new SetAttributeSubIfcShapeRepresentation(object, attributeName, attributeNewValue);
				setAttributeSubIfcShapeRepresentation.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcShearModulusMeasure")) {
				SetAttributeSubIfcShearModulusMeasure setAttributeSubIfcShearModulusMeasure = new SetAttributeSubIfcShearModulusMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcShearModulusMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcShellBasedSurfaceModel")) {
				SetAttributeSubIfcShellBasedSurfaceModel setAttributeSubIfcShellBasedSurfaceModel = new SetAttributeSubIfcShellBasedSurfaceModel(object, attributeName, attributeNewValue);
				setAttributeSubIfcShellBasedSurfaceModel.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSimpleProperty")) {
				SetAttributeSubIfcSimpleProperty setAttributeSubIfcSimpleProperty = new SetAttributeSubIfcSimpleProperty(object, attributeName, attributeNewValue);
				setAttributeSubIfcSimpleProperty.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSite")) {
				SetAttributeSubIfcSite setAttributeSubIfcSite = new SetAttributeSubIfcSite(object, attributeName, attributeNewValue);
				setAttributeSubIfcSite.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSlab")) {
				SetAttributeSubIfcSlab setAttributeSubIfcSlab = new SetAttributeSubIfcSlab(object, attributeName, attributeNewValue);
				setAttributeSubIfcSlab.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSlabType")) {
				SetAttributeSubIfcSlabType setAttributeSubIfcSlabType = new SetAttributeSubIfcSlabType(object, attributeName, attributeNewValue);
				setAttributeSubIfcSlabType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSlippageConnectionCondition")) {
				SetAttributeSubIfcSlippageConnectionCondition setAttributeSubIfcSlippageConnectionCondition = new SetAttributeSubIfcSlippageConnectionCondition(object, attributeName, attributeNewValue);
				setAttributeSubIfcSlippageConnectionCondition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSolidAngleMeasure")) {
				SetAttributeSubIfcSolidAngleMeasure setAttributeSubIfcSolidAngleMeasure = new SetAttributeSubIfcSolidAngleMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcSolidAngleMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSolidModel")) {
				SetAttributeSubIfcSolidModel setAttributeSubIfcSolidModel = new SetAttributeSubIfcSolidModel(object, attributeName, attributeNewValue);
				setAttributeSubIfcSolidModel.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSoundPowerMeasure")) {
				SetAttributeSubIfcSoundPowerMeasure setAttributeSubIfcSoundPowerMeasure = new SetAttributeSubIfcSoundPowerMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcSoundPowerMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSoundPressureMeasure")) {
				SetAttributeSubIfcSoundPressureMeasure setAttributeSubIfcSoundPressureMeasure = new SetAttributeSubIfcSoundPressureMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcSoundPressureMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSoundProperties")) {
				SetAttributeSubIfcSoundProperties setAttributeSubIfcSoundProperties = new SetAttributeSubIfcSoundProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcSoundProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSoundValue")) {
				SetAttributeSubIfcSoundValue setAttributeSubIfcSoundValue = new SetAttributeSubIfcSoundValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcSoundValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpaceHeaterType")) {
				SetAttributeSubIfcSpaceHeaterType setAttributeSubIfcSpaceHeaterType = new SetAttributeSubIfcSpaceHeaterType(object, attributeName, attributeNewValue);
				setAttributeSubIfcSpaceHeaterType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpace")) {
				SetAttributeSubIfcSpace setAttributeSubIfcSpace = new SetAttributeSubIfcSpace(object, attributeName, attributeNewValue);
				setAttributeSubIfcSpace.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpaceProgram")) {
				SetAttributeSubIfcSpaceProgram setAttributeSubIfcSpaceProgram = new SetAttributeSubIfcSpaceProgram(object, attributeName, attributeNewValue);
				setAttributeSubIfcSpaceProgram.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpaceThermalLoadProperties")) {
				SetAttributeSubIfcSpaceThermalLoadProperties setAttributeSubIfcSpaceThermalLoadProperties = new SetAttributeSubIfcSpaceThermalLoadProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcSpaceThermalLoadProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpaceType")) {
				SetAttributeSubIfcSpaceType setAttributeSubIfcSpaceType = new SetAttributeSubIfcSpaceType(object, attributeName, attributeNewValue);
				setAttributeSubIfcSpaceType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpatialStructureElement")) {
				SetAttributeSubIfcSpatialStructureElement setAttributeSubIfcSpatialStructureElement = new SetAttributeSubIfcSpatialStructureElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcSpatialStructureElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpatialStructureElementType")) {
				SetAttributeSubIfcSpatialStructureElementType setAttributeSubIfcSpatialStructureElementType = new SetAttributeSubIfcSpatialStructureElementType(object, attributeName, attributeNewValue);
				setAttributeSubIfcSpatialStructureElementType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpecificHeatCapacityMeasure")) {
				SetAttributeSubIfcSpecificHeatCapacityMeasure setAttributeSubIfcSpecificHeatCapacityMeasure = new SetAttributeSubIfcSpecificHeatCapacityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcSpecificHeatCapacityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpecularExponent")) {
				SetAttributeSubIfcSpecularExponent setAttributeSubIfcSpecularExponent = new SetAttributeSubIfcSpecularExponent(object, attributeName, attributeNewValue);
				setAttributeSubIfcSpecularExponent.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpecularRoughness")) {
				SetAttributeSubIfcSpecularRoughness setAttributeSubIfcSpecularRoughness = new SetAttributeSubIfcSpecularRoughness(object, attributeName, attributeNewValue);
				setAttributeSubIfcSpecularRoughness.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSphere")) {
				SetAttributeSubIfcSphere setAttributeSubIfcSphere = new SetAttributeSubIfcSphere(object, attributeName, attributeNewValue);
				setAttributeSubIfcSphere.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStackTerminalType")) {
				SetAttributeSubIfcStackTerminalType setAttributeSubIfcStackTerminalType = new SetAttributeSubIfcStackTerminalType(object, attributeName, attributeNewValue);
				setAttributeSubIfcStackTerminalType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStairFlight")) {
				SetAttributeSubIfcStairFlight setAttributeSubIfcStairFlight = new SetAttributeSubIfcStairFlight(object, attributeName, attributeNewValue);
				setAttributeSubIfcStairFlight.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStairFlightType")) {
				SetAttributeSubIfcStairFlightType setAttributeSubIfcStairFlightType = new SetAttributeSubIfcStairFlightType(object, attributeName, attributeNewValue);
				setAttributeSubIfcStairFlightType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStair")) {
				SetAttributeSubIfcStair setAttributeSubIfcStair = new SetAttributeSubIfcStair(object, attributeName, attributeNewValue);
				setAttributeSubIfcStair.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralAction")) {
				SetAttributeSubIfcStructuralAction setAttributeSubIfcStructuralAction = new SetAttributeSubIfcStructuralAction(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralAction.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralActivity")) {
				SetAttributeSubIfcStructuralActivity setAttributeSubIfcStructuralActivity = new SetAttributeSubIfcStructuralActivity(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralActivity.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralAnalysisModel")) {
				SetAttributeSubIfcStructuralAnalysisModel setAttributeSubIfcStructuralAnalysisModel = new SetAttributeSubIfcStructuralAnalysisModel(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralAnalysisModel.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralConnectionCondition")) {
				SetAttributeSubIfcStructuralConnectionCondition setAttributeSubIfcStructuralConnectionCondition = new SetAttributeSubIfcStructuralConnectionCondition(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralConnectionCondition.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralConnection")) {
				SetAttributeSubIfcStructuralConnection setAttributeSubIfcStructuralConnection = new SetAttributeSubIfcStructuralConnection(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralConnection.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralCurveConnection")) {
				SetAttributeSubIfcStructuralCurveConnection setAttributeSubIfcStructuralCurveConnection = new SetAttributeSubIfcStructuralCurveConnection(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralCurveConnection.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralCurveMember")) {
				SetAttributeSubIfcStructuralCurveMember setAttributeSubIfcStructuralCurveMember = new SetAttributeSubIfcStructuralCurveMember(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralCurveMember.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralCurveMemberVarying")) {
				SetAttributeSubIfcStructuralCurveMemberVarying setAttributeSubIfcStructuralCurveMemberVarying = new SetAttributeSubIfcStructuralCurveMemberVarying(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralCurveMemberVarying.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralItem")) {
				SetAttributeSubIfcStructuralItem setAttributeSubIfcStructuralItem = new SetAttributeSubIfcStructuralItem(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralItem.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLinearAction")) {
				SetAttributeSubIfcStructuralLinearAction setAttributeSubIfcStructuralLinearAction = new SetAttributeSubIfcStructuralLinearAction(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLinearAction.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLinearActionVarying")) {
				SetAttributeSubIfcStructuralLinearActionVarying setAttributeSubIfcStructuralLinearActionVarying = new SetAttributeSubIfcStructuralLinearActionVarying(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLinearActionVarying.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadGroup")) {
				SetAttributeSubIfcStructuralLoadGroup setAttributeSubIfcStructuralLoadGroup = new SetAttributeSubIfcStructuralLoadGroup(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLoadGroup.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoad")) {
				SetAttributeSubIfcStructuralLoad setAttributeSubIfcStructuralLoad = new SetAttributeSubIfcStructuralLoad(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLoad.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadLinearForce")) {
				SetAttributeSubIfcStructuralLoadLinearForce setAttributeSubIfcStructuralLoadLinearForce = new SetAttributeSubIfcStructuralLoadLinearForce(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLoadLinearForce.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadPlanarForce")) {
				SetAttributeSubIfcStructuralLoadPlanarForce setAttributeSubIfcStructuralLoadPlanarForce = new SetAttributeSubIfcStructuralLoadPlanarForce(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLoadPlanarForce.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadSingleDisplacementDistortion")) {
				SetAttributeSubIfcStructuralLoadSingleDisplacementDistortion setAttributeSubIfcStructuralLoadSingleDisplacementDistortion = new SetAttributeSubIfcStructuralLoadSingleDisplacementDistortion(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLoadSingleDisplacementDistortion.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadSingleDisplacement")) {
				SetAttributeSubIfcStructuralLoadSingleDisplacement setAttributeSubIfcStructuralLoadSingleDisplacement = new SetAttributeSubIfcStructuralLoadSingleDisplacement(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLoadSingleDisplacement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadSingleForce")) {
				SetAttributeSubIfcStructuralLoadSingleForce setAttributeSubIfcStructuralLoadSingleForce = new SetAttributeSubIfcStructuralLoadSingleForce(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLoadSingleForce.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadSingleForceWarping")) {
				SetAttributeSubIfcStructuralLoadSingleForceWarping setAttributeSubIfcStructuralLoadSingleForceWarping = new SetAttributeSubIfcStructuralLoadSingleForceWarping(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLoadSingleForceWarping.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadStatic")) {
				SetAttributeSubIfcStructuralLoadStatic setAttributeSubIfcStructuralLoadStatic = new SetAttributeSubIfcStructuralLoadStatic(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLoadStatic.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadTemperature")) {
				SetAttributeSubIfcStructuralLoadTemperature setAttributeSubIfcStructuralLoadTemperature = new SetAttributeSubIfcStructuralLoadTemperature(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralLoadTemperature.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralMember")) {
				SetAttributeSubIfcStructuralMember setAttributeSubIfcStructuralMember = new SetAttributeSubIfcStructuralMember(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralMember.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralPlanarAction")) {
				SetAttributeSubIfcStructuralPlanarAction setAttributeSubIfcStructuralPlanarAction = new SetAttributeSubIfcStructuralPlanarAction(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralPlanarAction.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralPlanarActionVarying")) {
				SetAttributeSubIfcStructuralPlanarActionVarying setAttributeSubIfcStructuralPlanarActionVarying = new SetAttributeSubIfcStructuralPlanarActionVarying(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralPlanarActionVarying.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralPointAction")) {
				SetAttributeSubIfcStructuralPointAction setAttributeSubIfcStructuralPointAction = new SetAttributeSubIfcStructuralPointAction(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralPointAction.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralPointConnection")) {
				SetAttributeSubIfcStructuralPointConnection setAttributeSubIfcStructuralPointConnection = new SetAttributeSubIfcStructuralPointConnection(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralPointConnection.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralPointReaction")) {
				SetAttributeSubIfcStructuralPointReaction setAttributeSubIfcStructuralPointReaction = new SetAttributeSubIfcStructuralPointReaction(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralPointReaction.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralProfileProperties")) {
				SetAttributeSubIfcStructuralProfileProperties setAttributeSubIfcStructuralProfileProperties = new SetAttributeSubIfcStructuralProfileProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralProfileProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralReaction")) {
				SetAttributeSubIfcStructuralReaction setAttributeSubIfcStructuralReaction = new SetAttributeSubIfcStructuralReaction(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralReaction.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralResultGroup")) {
				SetAttributeSubIfcStructuralResultGroup setAttributeSubIfcStructuralResultGroup = new SetAttributeSubIfcStructuralResultGroup(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralResultGroup.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralSteelProfileProperties")) {
				SetAttributeSubIfcStructuralSteelProfileProperties setAttributeSubIfcStructuralSteelProfileProperties = new SetAttributeSubIfcStructuralSteelProfileProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralSteelProfileProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralSurfaceConnection")) {
				SetAttributeSubIfcStructuralSurfaceConnection setAttributeSubIfcStructuralSurfaceConnection = new SetAttributeSubIfcStructuralSurfaceConnection(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralSurfaceConnection.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralSurfaceMember")) {
				SetAttributeSubIfcStructuralSurfaceMember setAttributeSubIfcStructuralSurfaceMember = new SetAttributeSubIfcStructuralSurfaceMember(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralSurfaceMember.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralSurfaceMemberVarying")) {
				SetAttributeSubIfcStructuralSurfaceMemberVarying setAttributeSubIfcStructuralSurfaceMemberVarying = new SetAttributeSubIfcStructuralSurfaceMemberVarying(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuralSurfaceMemberVarying.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuredDimensionCallout")) {
				SetAttributeSubIfcStructuredDimensionCallout setAttributeSubIfcStructuredDimensionCallout = new SetAttributeSubIfcStructuredDimensionCallout(object, attributeName, attributeNewValue);
				setAttributeSubIfcStructuredDimensionCallout.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStyleModel")) {
				SetAttributeSubIfcStyleModel setAttributeSubIfcStyleModel = new SetAttributeSubIfcStyleModel(object, attributeName, attributeNewValue);
				setAttributeSubIfcStyleModel.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStyledItem")) {
				SetAttributeSubIfcStyledItem setAttributeSubIfcStyledItem = new SetAttributeSubIfcStyledItem(object, attributeName, attributeNewValue);
				setAttributeSubIfcStyledItem.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStyledRepresentation")) {
				SetAttributeSubIfcStyledRepresentation setAttributeSubIfcStyledRepresentation = new SetAttributeSubIfcStyledRepresentation(object, attributeName, attributeNewValue);
				setAttributeSubIfcStyledRepresentation.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSubContractResource")) {
				SetAttributeSubIfcSubContractResource setAttributeSubIfcSubContractResource = new SetAttributeSubIfcSubContractResource(object, attributeName, attributeNewValue);
				setAttributeSubIfcSubContractResource.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSubedge")) {
				SetAttributeSubIfcSubedge setAttributeSubIfcSubedge = new SetAttributeSubIfcSubedge(object, attributeName, attributeNewValue);
				setAttributeSubIfcSubedge.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceCurveSweptAreaSolid")) {
				SetAttributeSubIfcSurfaceCurveSweptAreaSolid setAttributeSubIfcSurfaceCurveSweptAreaSolid = new SetAttributeSubIfcSurfaceCurveSweptAreaSolid(object, attributeName, attributeNewValue);
				setAttributeSubIfcSurfaceCurveSweptAreaSolid.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurface")) {
				SetAttributeSubIfcSurface setAttributeSubIfcSurface = new SetAttributeSubIfcSurface(object, attributeName, attributeNewValue);
				setAttributeSubIfcSurface.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceOfLinearExtrusion")) {
				SetAttributeSubIfcSurfaceOfLinearExtrusion setAttributeSubIfcSurfaceOfLinearExtrusion = new SetAttributeSubIfcSurfaceOfLinearExtrusion(object, attributeName, attributeNewValue);
				setAttributeSubIfcSurfaceOfLinearExtrusion.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceOfRevolution")) {
				SetAttributeSubIfcSurfaceOfRevolution setAttributeSubIfcSurfaceOfRevolution = new SetAttributeSubIfcSurfaceOfRevolution(object, attributeName, attributeNewValue);
				setAttributeSubIfcSurfaceOfRevolution.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyle")) {
				SetAttributeSubIfcSurfaceStyle setAttributeSubIfcSurfaceStyle = new SetAttributeSubIfcSurfaceStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcSurfaceStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyleLighting")) {
				SetAttributeSubIfcSurfaceStyleLighting setAttributeSubIfcSurfaceStyleLighting = new SetAttributeSubIfcSurfaceStyleLighting(object, attributeName, attributeNewValue);
				setAttributeSubIfcSurfaceStyleLighting.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyleRefraction")) {
				SetAttributeSubIfcSurfaceStyleRefraction setAttributeSubIfcSurfaceStyleRefraction = new SetAttributeSubIfcSurfaceStyleRefraction(object, attributeName, attributeNewValue);
				setAttributeSubIfcSurfaceStyleRefraction.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyleRendering")) {
				SetAttributeSubIfcSurfaceStyleRendering setAttributeSubIfcSurfaceStyleRendering = new SetAttributeSubIfcSurfaceStyleRendering(object, attributeName, attributeNewValue);
				setAttributeSubIfcSurfaceStyleRendering.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyleShading")) {
				SetAttributeSubIfcSurfaceStyleShading setAttributeSubIfcSurfaceStyleShading = new SetAttributeSubIfcSurfaceStyleShading(object, attributeName, attributeNewValue);
				setAttributeSubIfcSurfaceStyleShading.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyleWithTextures")) {
				SetAttributeSubIfcSurfaceStyleWithTextures setAttributeSubIfcSurfaceStyleWithTextures = new SetAttributeSubIfcSurfaceStyleWithTextures(object, attributeName, attributeNewValue);
				setAttributeSubIfcSurfaceStyleWithTextures.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceTexture")) {
				SetAttributeSubIfcSurfaceTexture setAttributeSubIfcSurfaceTexture = new SetAttributeSubIfcSurfaceTexture(object, attributeName, attributeNewValue);
				setAttributeSubIfcSurfaceTexture.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSweptAreaSolid")) {
				SetAttributeSubIfcSweptAreaSolid setAttributeSubIfcSweptAreaSolid = new SetAttributeSubIfcSweptAreaSolid(object, attributeName, attributeNewValue);
				setAttributeSubIfcSweptAreaSolid.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSweptDiskSolid")) {
				SetAttributeSubIfcSweptDiskSolid setAttributeSubIfcSweptDiskSolid = new SetAttributeSubIfcSweptDiskSolid(object, attributeName, attributeNewValue);
				setAttributeSubIfcSweptDiskSolid.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSweptSurface")) {
				SetAttributeSubIfcSweptSurface setAttributeSubIfcSweptSurface = new SetAttributeSubIfcSweptSurface(object, attributeName, attributeNewValue);
				setAttributeSubIfcSweptSurface.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSwitchingDeviceType")) {
				SetAttributeSubIfcSwitchingDeviceType setAttributeSubIfcSwitchingDeviceType = new SetAttributeSubIfcSwitchingDeviceType(object, attributeName, attributeNewValue);
				setAttributeSubIfcSwitchingDeviceType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSymbolStyle")) {
				SetAttributeSubIfcSymbolStyle setAttributeSubIfcSymbolStyle = new SetAttributeSubIfcSymbolStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcSymbolStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSystemFurnitureElementType")) {
				SetAttributeSubIfcSystemFurnitureElementType setAttributeSubIfcSystemFurnitureElementType = new SetAttributeSubIfcSystemFurnitureElementType(object, attributeName, attributeNewValue);
				setAttributeSubIfcSystemFurnitureElementType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSystem")) {
				SetAttributeSubIfcSystem setAttributeSubIfcSystem = new SetAttributeSubIfcSystem(object, attributeName, attributeNewValue);
				setAttributeSubIfcSystem.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTShapeProfileDef")) {
				SetAttributeSubIfcTShapeProfileDef setAttributeSubIfcTShapeProfileDef = new SetAttributeSubIfcTShapeProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcTShapeProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTable")) {
				SetAttributeSubIfcTable setAttributeSubIfcTable = new SetAttributeSubIfcTable(object, attributeName, attributeNewValue);
				setAttributeSubIfcTable.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTableRow")) {
				SetAttributeSubIfcTableRow setAttributeSubIfcTableRow = new SetAttributeSubIfcTableRow(object, attributeName, attributeNewValue);
				setAttributeSubIfcTableRow.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTankType")) {
				SetAttributeSubIfcTankType setAttributeSubIfcTankType = new SetAttributeSubIfcTankType(object, attributeName, attributeNewValue);
				setAttributeSubIfcTankType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTask")) {
				SetAttributeSubIfcTask setAttributeSubIfcTask = new SetAttributeSubIfcTask(object, attributeName, attributeNewValue);
				setAttributeSubIfcTask.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTelecomAddress")) {
				SetAttributeSubIfcTelecomAddress setAttributeSubIfcTelecomAddress = new SetAttributeSubIfcTelecomAddress(object, attributeName, attributeNewValue);
				setAttributeSubIfcTelecomAddress.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTemperatureGradientMeasure")) {
				SetAttributeSubIfcTemperatureGradientMeasure setAttributeSubIfcTemperatureGradientMeasure = new SetAttributeSubIfcTemperatureGradientMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcTemperatureGradientMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTendonAnchor")) {
				SetAttributeSubIfcTendonAnchor setAttributeSubIfcTendonAnchor = new SetAttributeSubIfcTendonAnchor(object, attributeName, attributeNewValue);
				setAttributeSubIfcTendonAnchor.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTendon")) {
				SetAttributeSubIfcTendon setAttributeSubIfcTendon = new SetAttributeSubIfcTendon(object, attributeName, attributeNewValue);
				setAttributeSubIfcTendon.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTerminatorSymbol")) {
				SetAttributeSubIfcTerminatorSymbol setAttributeSubIfcTerminatorSymbol = new SetAttributeSubIfcTerminatorSymbol(object, attributeName, attributeNewValue);
				setAttributeSubIfcTerminatorSymbol.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcText")) {
				SetAttributeSubIfcText setAttributeSubIfcText = new SetAttributeSubIfcText(object, attributeName, attributeNewValue);
				setAttributeSubIfcText.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextLiteral")) {
				SetAttributeSubIfcTextLiteral setAttributeSubIfcTextLiteral = new SetAttributeSubIfcTextLiteral(object, attributeName, attributeNewValue);
				setAttributeSubIfcTextLiteral.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextLiteralWithExtent")) {
				SetAttributeSubIfcTextLiteralWithExtent setAttributeSubIfcTextLiteralWithExtent = new SetAttributeSubIfcTextLiteralWithExtent(object, attributeName, attributeNewValue);
				setAttributeSubIfcTextLiteralWithExtent.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextStyleFontModel")) {
				SetAttributeSubIfcTextStyleFontModel setAttributeSubIfcTextStyleFontModel = new SetAttributeSubIfcTextStyleFontModel(object, attributeName, attributeNewValue);
				setAttributeSubIfcTextStyleFontModel.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextStyleForDefinedFont")) {
				SetAttributeSubIfcTextStyleForDefinedFont setAttributeSubIfcTextStyleForDefinedFont = new SetAttributeSubIfcTextStyleForDefinedFont(object, attributeName, attributeNewValue);
				setAttributeSubIfcTextStyleForDefinedFont.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextStyle")) {
				SetAttributeSubIfcTextStyle setAttributeSubIfcTextStyle = new SetAttributeSubIfcTextStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcTextStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextStyleTextModel")) {
				SetAttributeSubIfcTextStyleTextModel setAttributeSubIfcTextStyleTextModel = new SetAttributeSubIfcTextStyleTextModel(object, attributeName, attributeNewValue);
				setAttributeSubIfcTextStyleTextModel.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextStyleWithBoxCharacteristics")) {
				SetAttributeSubIfcTextStyleWithBoxCharacteristics setAttributeSubIfcTextStyleWithBoxCharacteristics = new SetAttributeSubIfcTextStyleWithBoxCharacteristics(object, attributeName, attributeNewValue);
				setAttributeSubIfcTextStyleWithBoxCharacteristics.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextureCoordinateGenerator")) {
				SetAttributeSubIfcTextureCoordinateGenerator setAttributeSubIfcTextureCoordinateGenerator = new SetAttributeSubIfcTextureCoordinateGenerator(object, attributeName, attributeNewValue);
				setAttributeSubIfcTextureCoordinateGenerator.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextureCoordinate")) {
				SetAttributeSubIfcTextureCoordinate setAttributeSubIfcTextureCoordinate = new SetAttributeSubIfcTextureCoordinate(object, attributeName, attributeNewValue);
				setAttributeSubIfcTextureCoordinate.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextureMap")) {
				SetAttributeSubIfcTextureMap setAttributeSubIfcTextureMap = new SetAttributeSubIfcTextureMap(object, attributeName, attributeNewValue);
				setAttributeSubIfcTextureMap.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextureVertex")) {
				SetAttributeSubIfcTextureVertex setAttributeSubIfcTextureVertex = new SetAttributeSubIfcTextureVertex(object, attributeName, attributeNewValue);
				setAttributeSubIfcTextureVertex.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalAdmittanceMeasure")) {
				SetAttributeSubIfcThermalAdmittanceMeasure setAttributeSubIfcThermalAdmittanceMeasure = new SetAttributeSubIfcThermalAdmittanceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcThermalAdmittanceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalConductivityMeasure")) {
				SetAttributeSubIfcThermalConductivityMeasure setAttributeSubIfcThermalConductivityMeasure = new SetAttributeSubIfcThermalConductivityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcThermalConductivityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalExpansionCoefficientMeasure")) {
				SetAttributeSubIfcThermalExpansionCoefficientMeasure setAttributeSubIfcThermalExpansionCoefficientMeasure = new SetAttributeSubIfcThermalExpansionCoefficientMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcThermalExpansionCoefficientMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalMaterialProperties")) {
				SetAttributeSubIfcThermalMaterialProperties setAttributeSubIfcThermalMaterialProperties = new SetAttributeSubIfcThermalMaterialProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcThermalMaterialProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalResistanceMeasure")) {
				SetAttributeSubIfcThermalResistanceMeasure setAttributeSubIfcThermalResistanceMeasure = new SetAttributeSubIfcThermalResistanceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcThermalResistanceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalTransmittanceMeasure")) {
				SetAttributeSubIfcThermalTransmittanceMeasure setAttributeSubIfcThermalTransmittanceMeasure = new SetAttributeSubIfcThermalTransmittanceMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcThermalTransmittanceMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermodynamicTemperatureMeasure")) {
				SetAttributeSubIfcThermodynamicTemperatureMeasure setAttributeSubIfcThermodynamicTemperatureMeasure = new SetAttributeSubIfcThermodynamicTemperatureMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcThermodynamicTemperatureMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeMeasure")) {
				SetAttributeSubIfcTimeMeasure setAttributeSubIfcTimeMeasure = new SetAttributeSubIfcTimeMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcTimeMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeSeries")) {
				SetAttributeSubIfcTimeSeries setAttributeSubIfcTimeSeries = new SetAttributeSubIfcTimeSeries(object, attributeName, attributeNewValue);
				setAttributeSubIfcTimeSeries.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeSeriesReferenceRelationship")) {
				SetAttributeSubIfcTimeSeriesReferenceRelationship setAttributeSubIfcTimeSeriesReferenceRelationship = new SetAttributeSubIfcTimeSeriesReferenceRelationship(object, attributeName, attributeNewValue);
				setAttributeSubIfcTimeSeriesReferenceRelationship.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeSeriesSchedule")) {
				SetAttributeSubIfcTimeSeriesSchedule setAttributeSubIfcTimeSeriesSchedule = new SetAttributeSubIfcTimeSeriesSchedule(object, attributeName, attributeNewValue);
				setAttributeSubIfcTimeSeriesSchedule.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeSeriesValue")) {
				SetAttributeSubIfcTimeSeriesValue setAttributeSubIfcTimeSeriesValue = new SetAttributeSubIfcTimeSeriesValue(object, attributeName, attributeNewValue);
				setAttributeSubIfcTimeSeriesValue.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeStamp")) {
				SetAttributeSubIfcTimeStamp setAttributeSubIfcTimeStamp = new SetAttributeSubIfcTimeStamp(object, attributeName, attributeNewValue);
				setAttributeSubIfcTimeStamp.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTopologicalRepresentationItem")) {
				SetAttributeSubIfcTopologicalRepresentationItem setAttributeSubIfcTopologicalRepresentationItem = new SetAttributeSubIfcTopologicalRepresentationItem(object, attributeName, attributeNewValue);
				setAttributeSubIfcTopologicalRepresentationItem.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTopologyRepresentation")) {
				SetAttributeSubIfcTopologyRepresentation setAttributeSubIfcTopologyRepresentation = new SetAttributeSubIfcTopologyRepresentation(object, attributeName, attributeNewValue);
				setAttributeSubIfcTopologyRepresentation.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTorqueMeasure")) {
				SetAttributeSubIfcTorqueMeasure setAttributeSubIfcTorqueMeasure = new SetAttributeSubIfcTorqueMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcTorqueMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTransformerType")) {
				SetAttributeSubIfcTransformerType setAttributeSubIfcTransformerType = new SetAttributeSubIfcTransformerType(object, attributeName, attributeNewValue);
				setAttributeSubIfcTransformerType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTransportElement")) {
				SetAttributeSubIfcTransportElement setAttributeSubIfcTransportElement = new SetAttributeSubIfcTransportElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcTransportElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTransportElementType")) {
				SetAttributeSubIfcTransportElementType setAttributeSubIfcTransportElementType = new SetAttributeSubIfcTransportElementType(object, attributeName, attributeNewValue);
				setAttributeSubIfcTransportElementType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTrapeziumProfileDef")) {
				SetAttributeSubIfcTrapeziumProfileDef setAttributeSubIfcTrapeziumProfileDef = new SetAttributeSubIfcTrapeziumProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcTrapeziumProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTrimmedCurve")) {
				SetAttributeSubIfcTrimmedCurve setAttributeSubIfcTrimmedCurve = new SetAttributeSubIfcTrimmedCurve(object, attributeName, attributeNewValue);
				setAttributeSubIfcTrimmedCurve.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTubeBundleType")) {
				SetAttributeSubIfcTubeBundleType setAttributeSubIfcTubeBundleType = new SetAttributeSubIfcTubeBundleType(object, attributeName, attributeNewValue);
				setAttributeSubIfcTubeBundleType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTwoDirectionRepeatFactor")) {
				SetAttributeSubIfcTwoDirectionRepeatFactor setAttributeSubIfcTwoDirectionRepeatFactor = new SetAttributeSubIfcTwoDirectionRepeatFactor(object, attributeName, attributeNewValue);
				setAttributeSubIfcTwoDirectionRepeatFactor.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTypeObject")) {
				SetAttributeSubIfcTypeObject setAttributeSubIfcTypeObject = new SetAttributeSubIfcTypeObject(object, attributeName, attributeNewValue);
				setAttributeSubIfcTypeObject.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTypeProduct")) {
				SetAttributeSubIfcTypeProduct setAttributeSubIfcTypeProduct = new SetAttributeSubIfcTypeProduct(object, attributeName, attributeNewValue);
				setAttributeSubIfcTypeProduct.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcUShapeProfileDef")) {
				SetAttributeSubIfcUShapeProfileDef setAttributeSubIfcUShapeProfileDef = new SetAttributeSubIfcUShapeProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcUShapeProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcUnitAssignment")) {
				SetAttributeSubIfcUnitAssignment setAttributeSubIfcUnitAssignment = new SetAttributeSubIfcUnitAssignment(object, attributeName, attributeNewValue);
				setAttributeSubIfcUnitAssignment.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcUnitaryEquipmentType")) {
				SetAttributeSubIfcUnitaryEquipmentType setAttributeSubIfcUnitaryEquipmentType = new SetAttributeSubIfcUnitaryEquipmentType(object, attributeName, attributeNewValue);
				setAttributeSubIfcUnitaryEquipmentType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcValveType")) {
				SetAttributeSubIfcValveType setAttributeSubIfcValveType = new SetAttributeSubIfcValveType(object, attributeName, attributeNewValue);
				setAttributeSubIfcValveType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVaporPermeabilityMeasure")) {
				SetAttributeSubIfcVaporPermeabilityMeasure setAttributeSubIfcVaporPermeabilityMeasure = new SetAttributeSubIfcVaporPermeabilityMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcVaporPermeabilityMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVector")) {
				SetAttributeSubIfcVector setAttributeSubIfcVector = new SetAttributeSubIfcVector(object, attributeName, attributeNewValue);
				setAttributeSubIfcVector.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVertexBasedTextureMap")) {
				SetAttributeSubIfcVertexBasedTextureMap setAttributeSubIfcVertexBasedTextureMap = new SetAttributeSubIfcVertexBasedTextureMap(object, attributeName, attributeNewValue);
				setAttributeSubIfcVertexBasedTextureMap.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVertex")) {
				SetAttributeSubIfcVertex setAttributeSubIfcVertex = new SetAttributeSubIfcVertex(object, attributeName, attributeNewValue);
				setAttributeSubIfcVertex.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVertexLoop")) {
				SetAttributeSubIfcVertexLoop setAttributeSubIfcVertexLoop = new SetAttributeSubIfcVertexLoop(object, attributeName, attributeNewValue);
				setAttributeSubIfcVertexLoop.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVertexPoint")) {
				SetAttributeSubIfcVertexPoint setAttributeSubIfcVertexPoint = new SetAttributeSubIfcVertexPoint(object, attributeName, attributeNewValue);
				setAttributeSubIfcVertexPoint.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVibrationIsolatorType")) {
				SetAttributeSubIfcVibrationIsolatorType setAttributeSubIfcVibrationIsolatorType = new SetAttributeSubIfcVibrationIsolatorType(object, attributeName, attributeNewValue);
				setAttributeSubIfcVibrationIsolatorType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVirtualElement")) {
				SetAttributeSubIfcVirtualElement setAttributeSubIfcVirtualElement = new SetAttributeSubIfcVirtualElement(object, attributeName, attributeNewValue);
				setAttributeSubIfcVirtualElement.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVirtualGridIntersection")) {
				SetAttributeSubIfcVirtualGridIntersection setAttributeSubIfcVirtualGridIntersection = new SetAttributeSubIfcVirtualGridIntersection(object, attributeName, attributeNewValue);
				setAttributeSubIfcVirtualGridIntersection.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVolumeMeasure")) {
				SetAttributeSubIfcVolumeMeasure setAttributeSubIfcVolumeMeasure = new SetAttributeSubIfcVolumeMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcVolumeMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVolumetricFlowRateMeasure")) {
				SetAttributeSubIfcVolumetricFlowRateMeasure setAttributeSubIfcVolumetricFlowRateMeasure = new SetAttributeSubIfcVolumetricFlowRateMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcVolumetricFlowRateMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWall")) {
				SetAttributeSubIfcWall setAttributeSubIfcWall = new SetAttributeSubIfcWall(object, attributeName, attributeNewValue);
				setAttributeSubIfcWall.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWallStandardCase")) {
				SetAttributeSubIfcWallStandardCase setAttributeSubIfcWallStandardCase = new SetAttributeSubIfcWallStandardCase(object, attributeName, attributeNewValue);
				setAttributeSubIfcWallStandardCase.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWallType")) {
				SetAttributeSubIfcWallType setAttributeSubIfcWallType = new SetAttributeSubIfcWallType(object, attributeName, attributeNewValue);
				setAttributeSubIfcWallType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWarpingConstantMeasure")) {
				SetAttributeSubIfcWarpingConstantMeasure setAttributeSubIfcWarpingConstantMeasure = new SetAttributeSubIfcWarpingConstantMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcWarpingConstantMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWarpingMomentMeasure")) {
				SetAttributeSubIfcWarpingMomentMeasure setAttributeSubIfcWarpingMomentMeasure = new SetAttributeSubIfcWarpingMomentMeasure(object, attributeName, attributeNewValue);
				setAttributeSubIfcWarpingMomentMeasure.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWasteTerminalType")) {
				SetAttributeSubIfcWasteTerminalType setAttributeSubIfcWasteTerminalType = new SetAttributeSubIfcWasteTerminalType(object, attributeName, attributeNewValue);
				setAttributeSubIfcWasteTerminalType.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWaterProperties")) {
				SetAttributeSubIfcWaterProperties setAttributeSubIfcWaterProperties = new SetAttributeSubIfcWaterProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcWaterProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWindow")) {
				SetAttributeSubIfcWindow setAttributeSubIfcWindow = new SetAttributeSubIfcWindow(object, attributeName, attributeNewValue);
				setAttributeSubIfcWindow.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWindowLiningProperties")) {
				SetAttributeSubIfcWindowLiningProperties setAttributeSubIfcWindowLiningProperties = new SetAttributeSubIfcWindowLiningProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcWindowLiningProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWindowPanelProperties")) {
				SetAttributeSubIfcWindowPanelProperties setAttributeSubIfcWindowPanelProperties = new SetAttributeSubIfcWindowPanelProperties(object, attributeName, attributeNewValue);
				setAttributeSubIfcWindowPanelProperties.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWindowStyle")) {
				SetAttributeSubIfcWindowStyle setAttributeSubIfcWindowStyle = new SetAttributeSubIfcWindowStyle(object, attributeName, attributeNewValue);
				setAttributeSubIfcWindowStyle.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWorkControl")) {
				SetAttributeSubIfcWorkControl setAttributeSubIfcWorkControl = new SetAttributeSubIfcWorkControl(object, attributeName, attributeNewValue);
				setAttributeSubIfcWorkControl.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWorkPlan")) {
				SetAttributeSubIfcWorkPlan setAttributeSubIfcWorkPlan = new SetAttributeSubIfcWorkPlan(object, attributeName, attributeNewValue);
				setAttributeSubIfcWorkPlan.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWorkSchedule")) {
				SetAttributeSubIfcWorkSchedule setAttributeSubIfcWorkSchedule = new SetAttributeSubIfcWorkSchedule(object, attributeName, attributeNewValue);
				setAttributeSubIfcWorkSchedule.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcZShapeProfileDef")) {
				SetAttributeSubIfcZShapeProfileDef setAttributeSubIfcZShapeProfileDef = new SetAttributeSubIfcZShapeProfileDef(object, attributeName, attributeNewValue);
				setAttributeSubIfcZShapeProfileDef.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcZone")) {
				SetAttributeSubIfcZone setAttributeSubIfcZone = new SetAttributeSubIfcZone(object, attributeName, attributeNewValue);
				setAttributeSubIfcZone.setAttribute();
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEnginePluginDescriptor")) {
				SetAttributeSubIfcEnginePluginDescriptor setAttributeSubIfcEnginePluginDescriptor = new SetAttributeSubIfcEnginePluginDescriptor(object, attributeName, attributeNewValue);
				setAttributeSubIfcEnginePluginDescriptor.setAttribute();
			}
			else {
			}
		}
	}
}
