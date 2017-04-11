package nl.wietmazairac.bimql.get.attribute;

/******************************************************************************
 * Copyright (C) 2009-2017  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import java.util.ArrayList;
import java.util.List;

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.models.ifc2x3tc1.IfcRoot;

public class GetAttributeMain {
	// fields
	private IfcModelInterface ifcModel;
	private List<IfcRoot> ifcRootList;
	private List<Object> objectList;
	private String string;

	// constructors
	public GetAttributeMain(IfcModelInterface ifcModel, String string) {
		this.ifcModel = ifcModel;
		this.ifcRootList = ifcModel.getAllWithSubTypes(IfcRoot.class);
		for (IfcRoot ifcRoot : ifcRootList) {
			objectList.add(ifcRoot);
		}
		this.string = string;
	}

	//public GetAttributeMain(List<IfcRoot> ifcRootList, String string) {
	//	this.ifcRootList = ifcRootList;
	//	this.string = string;
	//}

	public GetAttributeMain(List<Object> objectList, String string) {
		this.objectList = objectList;
		this.string = string;
	}

	// methods
	public IfcModelInterface getIfcModel() {
		return ifcModel;
	}

	public void setIfcModel(IfcModelInterface ifcModel) {
		this.ifcModel = ifcModel;
	}

	public List<?> getList() {
		return ifcRootList;
	}

	public void setList(List<IfcRoot> ifcRootList) {
		this.ifcRootList = ifcRootList;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public List<List<Object>> getResult() {
		List<Object> objectArrayList = new ArrayList<Object>();
		List<List<Object>> arrayListArrayList = new ArrayList<List<Object>>();

		for (Object object : objectList) {
			if (((IfcRoot) object).eClass().getName().equals("Ifc2DCompositeCurve")) {
				GetAttributeSubIfc2DCompositeCurve GetAttributeSubIfc2DCompositeCurve = new GetAttributeSubIfc2DCompositeCurve(object, string);
				objectArrayList = GetAttributeSubIfc2DCompositeCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("Ifc2x3Factory")) {
				GetAttributeSubIfc2x3Factory GetAttributeSubIfc2x3Factory = new GetAttributeSubIfc2x3Factory(object, string);
				objectArrayList = GetAttributeSubIfc2x3Factory.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("Ifc2x3tc1Package")) {
				GetAttributeSubIfc2x3Package GetAttributeSubIfc2x3tc1Package = new GetAttributeSubIfc2x3Package(object, string);
				objectArrayList = GetAttributeSubIfc2x3tc1Package.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAbsorbedDoseMeasure")) {
				GetAttributeSubIfcAbsorbedDoseMeasure GetAttributeSubIfcAbsorbedDoseMeasure = new GetAttributeSubIfcAbsorbedDoseMeasure(object, string);
				objectArrayList = GetAttributeSubIfcAbsorbedDoseMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAccelerationMeasure")) {
				GetAttributeSubIfcAccelerationMeasure GetAttributeSubIfcAccelerationMeasure = new GetAttributeSubIfcAccelerationMeasure(object, string);
				objectArrayList = GetAttributeSubIfcAccelerationMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcActionRequest")) {
				GetAttributeSubIfcActionRequest GetAttributeSubIfcActionRequest = new GetAttributeSubIfcActionRequest(object, string);
				objectArrayList = GetAttributeSubIfcActionRequest.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcActor")) {
				GetAttributeSubIfcActor GetAttributeSubIfcActor = new GetAttributeSubIfcActor(object, string);
				objectArrayList = GetAttributeSubIfcActor.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcActorRole")) {
				GetAttributeSubIfcActorRole GetAttributeSubIfcActorRole = new GetAttributeSubIfcActorRole(object, string);
				objectArrayList = GetAttributeSubIfcActorRole.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcActuatorType")) {
				GetAttributeSubIfcActuatorType GetAttributeSubIfcActuatorType = new GetAttributeSubIfcActuatorType(object, string);
				objectArrayList = GetAttributeSubIfcActuatorType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAddress")) {
				GetAttributeSubIfcAddress GetAttributeSubIfcAddress = new GetAttributeSubIfcAddress(object, string);
				objectArrayList = GetAttributeSubIfcAddress.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAirTerminalBoxType")) {
				GetAttributeSubIfcAirTerminalBoxType GetAttributeSubIfcAirTerminalBoxType = new GetAttributeSubIfcAirTerminalBoxType(object, string);
				objectArrayList = GetAttributeSubIfcAirTerminalBoxType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAirTerminalType")) {
				GetAttributeSubIfcAirTerminalType GetAttributeSubIfcAirTerminalType = new GetAttributeSubIfcAirTerminalType(object, string);
				objectArrayList = GetAttributeSubIfcAirTerminalType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAirToAirHeatRecoveryType")) {
				GetAttributeSubIfcAirToAirHeatRecoveryType GetAttributeSubIfcAirToAirHeatRecoveryType = new GetAttributeSubIfcAirToAirHeatRecoveryType(object, string);
				objectArrayList = GetAttributeSubIfcAirToAirHeatRecoveryType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAlarmType")) {
				GetAttributeSubIfcAlarmType GetAttributeSubIfcAlarmType = new GetAttributeSubIfcAlarmType(object, string);
				objectArrayList = GetAttributeSubIfcAlarmType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAmountOfSubstanceMeasure")) {
				GetAttributeSubIfcAmountOfSubstanceMeasure GetAttributeSubIfcAmountOfSubstanceMeasure = new GetAttributeSubIfcAmountOfSubstanceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcAmountOfSubstanceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAngularDimension")) {
				GetAttributeSubIfcAngularDimension GetAttributeSubIfcAngularDimension = new GetAttributeSubIfcAngularDimension(object, string);
				objectArrayList = GetAttributeSubIfcAngularDimension.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAngularVelocityMeasure")) {
				GetAttributeSubIfcAngularVelocityMeasure GetAttributeSubIfcAngularVelocityMeasure = new GetAttributeSubIfcAngularVelocityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcAngularVelocityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationCurveOccurrence")) {
				GetAttributeSubIfcAnnotationCurveOccurrence GetAttributeSubIfcAnnotationCurveOccurrence = new GetAttributeSubIfcAnnotationCurveOccurrence(object, string);
				objectArrayList = GetAttributeSubIfcAnnotationCurveOccurrence.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationFillArea")) {
				GetAttributeSubIfcAnnotationFillArea GetAttributeSubIfcAnnotationFillArea = new GetAttributeSubIfcAnnotationFillArea(object, string);
				objectArrayList = GetAttributeSubIfcAnnotationFillArea.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationFillAreaOccurrence")) {
				GetAttributeSubIfcAnnotationFillAreaOccurrence GetAttributeSubIfcAnnotationFillAreaOccurrence = new GetAttributeSubIfcAnnotationFillAreaOccurrence(object, string);
				objectArrayList = GetAttributeSubIfcAnnotationFillAreaOccurrence.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotation")) {
				GetAttributeSubIfcAnnotation GetAttributeSubIfcAnnotation = new GetAttributeSubIfcAnnotation(object, string);
				objectArrayList = GetAttributeSubIfcAnnotation.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationOccurrence")) {
				GetAttributeSubIfcAnnotationOccurrence GetAttributeSubIfcAnnotationOccurrence = new GetAttributeSubIfcAnnotationOccurrence(object, string);
				objectArrayList = GetAttributeSubIfcAnnotationOccurrence.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationSurface")) {
				GetAttributeSubIfcAnnotationSurface GetAttributeSubIfcAnnotationSurface = new GetAttributeSubIfcAnnotationSurface(object, string);
				objectArrayList = GetAttributeSubIfcAnnotationSurface.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationSurfaceOccurrence")) {
				GetAttributeSubIfcAnnotationSurfaceOccurrence GetAttributeSubIfcAnnotationSurfaceOccurrence = new GetAttributeSubIfcAnnotationSurfaceOccurrence(object, string);
				objectArrayList = GetAttributeSubIfcAnnotationSurfaceOccurrence.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationSymbolOccurrence")) {
				GetAttributeSubIfcAnnotationSymbolOccurrence GetAttributeSubIfcAnnotationSymbolOccurrence = new GetAttributeSubIfcAnnotationSymbolOccurrence(object, string);
				objectArrayList = GetAttributeSubIfcAnnotationSymbolOccurrence.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAnnotationTextOccurrence")) {
				GetAttributeSubIfcAnnotationTextOccurrence GetAttributeSubIfcAnnotationTextOccurrence = new GetAttributeSubIfcAnnotationTextOccurrence(object, string);
				objectArrayList = GetAttributeSubIfcAnnotationTextOccurrence.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcApplication")) {
				GetAttributeSubIfcApplication GetAttributeSubIfcApplication = new GetAttributeSubIfcApplication(object, string);
				objectArrayList = GetAttributeSubIfcApplication.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAppliedValue")) {
				GetAttributeSubIfcAppliedValue GetAttributeSubIfcAppliedValue = new GetAttributeSubIfcAppliedValue(object, string);
				objectArrayList = GetAttributeSubIfcAppliedValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAppliedValueRelationship")) {
				GetAttributeSubIfcAppliedValueRelationship GetAttributeSubIfcAppliedValueRelationship = new GetAttributeSubIfcAppliedValueRelationship(object, string);
				objectArrayList = GetAttributeSubIfcAppliedValueRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcApprovalActorRelationship")) {
				GetAttributeSubIfcApprovalActorRelationship GetAttributeSubIfcApprovalActorRelationship = new GetAttributeSubIfcApprovalActorRelationship(object, string);
				objectArrayList = GetAttributeSubIfcApprovalActorRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcApproval")) {
				GetAttributeSubIfcApproval GetAttributeSubIfcApproval = new GetAttributeSubIfcApproval(object, string);
				objectArrayList = GetAttributeSubIfcApproval.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcApprovalPropertyRelationship")) {
				GetAttributeSubIfcApprovalPropertyRelationship GetAttributeSubIfcApprovalPropertyRelationship = new GetAttributeSubIfcApprovalPropertyRelationship(object, string);
				objectArrayList = GetAttributeSubIfcApprovalPropertyRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcApprovalRelationship")) {
				GetAttributeSubIfcApprovalRelationship GetAttributeSubIfcApprovalRelationship = new GetAttributeSubIfcApprovalRelationship(object, string);
				objectArrayList = GetAttributeSubIfcApprovalRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcArbitraryClosedProfileDef")) {
				GetAttributeSubIfcArbitraryClosedProfileDef GetAttributeSubIfcArbitraryClosedProfileDef = new GetAttributeSubIfcArbitraryClosedProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcArbitraryClosedProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcArbitraryOpenProfileDef")) {
				GetAttributeSubIfcArbitraryOpenProfileDef GetAttributeSubIfcArbitraryOpenProfileDef = new GetAttributeSubIfcArbitraryOpenProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcArbitraryOpenProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcArbitraryProfileDefWithVoids")) {
				GetAttributeSubIfcArbitraryProfileDefWithVoids GetAttributeSubIfcArbitraryProfileDefWithVoids = new GetAttributeSubIfcArbitraryProfileDefWithVoids(object, string);
				objectArrayList = GetAttributeSubIfcArbitraryProfileDefWithVoids.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAreaMeasure")) {
				GetAttributeSubIfcAreaMeasure GetAttributeSubIfcAreaMeasure = new GetAttributeSubIfcAreaMeasure(object, string);
				objectArrayList = GetAttributeSubIfcAreaMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAsset")) {
				GetAttributeSubIfcAsset GetAttributeSubIfcAsset = new GetAttributeSubIfcAsset(object, string);
				objectArrayList = GetAttributeSubIfcAsset.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAsymmetricIShapeProfileDef")) {
				GetAttributeSubIfcAsymmetricIShapeProfileDef GetAttributeSubIfcAsymmetricIShapeProfileDef = new GetAttributeSubIfcAsymmetricIShapeProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcAsymmetricIShapeProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAxis1Placement")) {
				GetAttributeSubIfcAxis1Placement GetAttributeSubIfcAxis1Placement = new GetAttributeSubIfcAxis1Placement(object, string);
				objectArrayList = GetAttributeSubIfcAxis1Placement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAxis2Placement2D")) {
				GetAttributeSubIfcAxis2Placement2D GetAttributeSubIfcAxis2Placement2D = new GetAttributeSubIfcAxis2Placement2D(object, string);
				objectArrayList = GetAttributeSubIfcAxis2Placement2D.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcAxis2Placement3D")) {
				GetAttributeSubIfcAxis2Placement3D GetAttributeSubIfcAxis2Placement3D = new GetAttributeSubIfcAxis2Placement3D(object, string);
				objectArrayList = GetAttributeSubIfcAxis2Placement3D.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBSplineCurve")) {
				GetAttributeSubIfcBSplineCurve GetAttributeSubIfcBSplineCurve = new GetAttributeSubIfcBSplineCurve(object, string);
				objectArrayList = GetAttributeSubIfcBSplineCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBeam")) {
				GetAttributeSubIfcBeam GetAttributeSubIfcBeam = new GetAttributeSubIfcBeam(object, string);
				objectArrayList = GetAttributeSubIfcBeam.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBeamType")) {
				GetAttributeSubIfcBeamType GetAttributeSubIfcBeamType = new GetAttributeSubIfcBeamType(object, string);
				objectArrayList = GetAttributeSubIfcBeamType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBezierCurve")) {
				GetAttributeSubIfcBezierCurve GetAttributeSubIfcBezierCurve = new GetAttributeSubIfcBezierCurve(object, string);
				objectArrayList = GetAttributeSubIfcBezierCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBlobTexture")) {
				GetAttributeSubIfcBlobTexture GetAttributeSubIfcBlobTexture = new GetAttributeSubIfcBlobTexture(object, string);
				objectArrayList = GetAttributeSubIfcBlobTexture.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBlock")) {
				GetAttributeSubIfcBlock GetAttributeSubIfcBlock = new GetAttributeSubIfcBlock(object, string);
				objectArrayList = GetAttributeSubIfcBlock.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoilerType")) {
				GetAttributeSubIfcBoilerType GetAttributeSubIfcBoilerType = new GetAttributeSubIfcBoilerType(object, string);
				objectArrayList = GetAttributeSubIfcBoilerType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBooleanClippingResult")) {
				GetAttributeSubIfcBooleanClippingResult GetAttributeSubIfcBooleanClippingResult = new GetAttributeSubIfcBooleanClippingResult(object, string);
				objectArrayList = GetAttributeSubIfcBooleanClippingResult.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoolean")) {
				GetAttributeSubIfcBoolean GetAttributeSubIfcBoolean = new GetAttributeSubIfcBoolean(object, string);
				objectArrayList = GetAttributeSubIfcBoolean.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBooleanResult")) {
				GetAttributeSubIfcBooleanResult GetAttributeSubIfcBooleanResult = new GetAttributeSubIfcBooleanResult(object, string);
				objectArrayList = GetAttributeSubIfcBooleanResult.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundaryCondition")) {
				GetAttributeSubIfcBoundaryCondition GetAttributeSubIfcBoundaryCondition = new GetAttributeSubIfcBoundaryCondition(object, string);
				objectArrayList = GetAttributeSubIfcBoundaryCondition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundaryEdgeCondition")) {
				GetAttributeSubIfcBoundaryEdgeCondition GetAttributeSubIfcBoundaryEdgeCondition = new GetAttributeSubIfcBoundaryEdgeCondition(object, string);
				objectArrayList = GetAttributeSubIfcBoundaryEdgeCondition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundaryFaceCondition")) {
				GetAttributeSubIfcBoundaryFaceCondition GetAttributeSubIfcBoundaryFaceCondition = new GetAttributeSubIfcBoundaryFaceCondition(object, string);
				objectArrayList = GetAttributeSubIfcBoundaryFaceCondition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundaryNodeCondition")) {
				GetAttributeSubIfcBoundaryNodeCondition GetAttributeSubIfcBoundaryNodeCondition = new GetAttributeSubIfcBoundaryNodeCondition(object, string);
				objectArrayList = GetAttributeSubIfcBoundaryNodeCondition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundaryNodeConditionWarping")) {
				GetAttributeSubIfcBoundaryNodeConditionWarping GetAttributeSubIfcBoundaryNodeConditionWarping = new GetAttributeSubIfcBoundaryNodeConditionWarping(object, string);
				objectArrayList = GetAttributeSubIfcBoundaryNodeConditionWarping.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundedCurve")) {
				GetAttributeSubIfcBoundedCurve GetAttributeSubIfcBoundedCurve = new GetAttributeSubIfcBoundedCurve(object, string);
				objectArrayList = GetAttributeSubIfcBoundedCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundedSurface")) {
				GetAttributeSubIfcBoundedSurface GetAttributeSubIfcBoundedSurface = new GetAttributeSubIfcBoundedSurface(object, string);
				objectArrayList = GetAttributeSubIfcBoundedSurface.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoundingBox")) {
				GetAttributeSubIfcBoundingBox GetAttributeSubIfcBoundingBox = new GetAttributeSubIfcBoundingBox(object, string);
				objectArrayList = GetAttributeSubIfcBoundingBox.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBoxedHalfSpace")) {
				GetAttributeSubIfcBoxedHalfSpace GetAttributeSubIfcBoxedHalfSpace = new GetAttributeSubIfcBoxedHalfSpace(object, string);
				objectArrayList = GetAttributeSubIfcBoxedHalfSpace.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElementComponent")) {
				GetAttributeSubIfcBuildingElementComponent GetAttributeSubIfcBuildingElementComponent = new GetAttributeSubIfcBuildingElementComponent(object, string);
				objectArrayList = GetAttributeSubIfcBuildingElementComponent.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElement")) {
				GetAttributeSubIfcBuildingElement GetAttributeSubIfcBuildingElement = new GetAttributeSubIfcBuildingElement(object, string);
				objectArrayList = GetAttributeSubIfcBuildingElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElementPart")) {
				GetAttributeSubIfcBuildingElementPart GetAttributeSubIfcBuildingElementPart = new GetAttributeSubIfcBuildingElementPart(object, string);
				objectArrayList = GetAttributeSubIfcBuildingElementPart.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElementProxy")) {
				GetAttributeSubIfcBuildingElementProxy GetAttributeSubIfcBuildingElementProxy = new GetAttributeSubIfcBuildingElementProxy(object, string);
				objectArrayList = GetAttributeSubIfcBuildingElementProxy.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElementProxyType")) {
				GetAttributeSubIfcBuildingElementProxyType GetAttributeSubIfcBuildingElementProxyType = new GetAttributeSubIfcBuildingElementProxyType(object, string);
				objectArrayList = GetAttributeSubIfcBuildingElementProxyType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingElementType")) {
				GetAttributeSubIfcBuildingElementType GetAttributeSubIfcBuildingElementType = new GetAttributeSubIfcBuildingElementType(object, string);
				objectArrayList = GetAttributeSubIfcBuildingElementType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuilding")) {
				GetAttributeSubIfcBuilding GetAttributeSubIfcBuilding = new GetAttributeSubIfcBuilding(object, string);
				objectArrayList = GetAttributeSubIfcBuilding.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcBuildingStorey")) {
				GetAttributeSubIfcBuildingStorey GetAttributeSubIfcBuildingStorey = new GetAttributeSubIfcBuildingStorey(object, string);
				objectArrayList = GetAttributeSubIfcBuildingStorey.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCShapeProfileDef")) {
				GetAttributeSubIfcCShapeProfileDef GetAttributeSubIfcCShapeProfileDef = new GetAttributeSubIfcCShapeProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcCShapeProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCableCarrierFittingType")) {
				GetAttributeSubIfcCableCarrierFittingType GetAttributeSubIfcCableCarrierFittingType = new GetAttributeSubIfcCableCarrierFittingType(object, string);
				objectArrayList = GetAttributeSubIfcCableCarrierFittingType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCableCarrierSegmentType")) {
				GetAttributeSubIfcCableCarrierSegmentType GetAttributeSubIfcCableCarrierSegmentType = new GetAttributeSubIfcCableCarrierSegmentType(object, string);
				objectArrayList = GetAttributeSubIfcCableCarrierSegmentType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCableSegmentType")) {
				GetAttributeSubIfcCableSegmentType GetAttributeSubIfcCableSegmentType = new GetAttributeSubIfcCableSegmentType(object, string);
				objectArrayList = GetAttributeSubIfcCableSegmentType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCalendarDate")) {
				GetAttributeSubIfcCalendarDate GetAttributeSubIfcCalendarDate = new GetAttributeSubIfcCalendarDate(object, string);
				objectArrayList = GetAttributeSubIfcCalendarDate.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianPoint")) {
				GetAttributeSubIfcCartesianPoint GetAttributeSubIfcCartesianPoint = new GetAttributeSubIfcCartesianPoint(object, string);
				objectArrayList = GetAttributeSubIfcCartesianPoint.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianTransformationOperator2D")) {
				GetAttributeSubIfcCartesianTransformationOperator2D GetAttributeSubIfcCartesianTransformationOperator2D = new GetAttributeSubIfcCartesianTransformationOperator2D(object, string);
				objectArrayList = GetAttributeSubIfcCartesianTransformationOperator2D.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianTransformationOperator2DnonUniform")) {
				GetAttributeSubIfcCartesianTransformationOperator2DnonUniform GetAttributeSubIfcCartesianTransformationOperator2DnonUniform = new GetAttributeSubIfcCartesianTransformationOperator2DnonUniform(object, string);
				objectArrayList = GetAttributeSubIfcCartesianTransformationOperator2DnonUniform.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianTransformationOperator3D")) {
				GetAttributeSubIfcCartesianTransformationOperator3D GetAttributeSubIfcCartesianTransformationOperator3D = new GetAttributeSubIfcCartesianTransformationOperator3D(object, string);
				objectArrayList = GetAttributeSubIfcCartesianTransformationOperator3D.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianTransformationOperator3DnonUniform")) {
				GetAttributeSubIfcCartesianTransformationOperator3DnonUniform GetAttributeSubIfcCartesianTransformationOperator3DnonUniform = new GetAttributeSubIfcCartesianTransformationOperator3DnonUniform(object, string);
				objectArrayList = GetAttributeSubIfcCartesianTransformationOperator3DnonUniform.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCartesianTransformationOperator")) {
				GetAttributeSubIfcCartesianTransformationOperator GetAttributeSubIfcCartesianTransformationOperator = new GetAttributeSubIfcCartesianTransformationOperator(object, string);
				objectArrayList = GetAttributeSubIfcCartesianTransformationOperator.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCenterLineProfileDef")) {
				GetAttributeSubIfcCenterLineProfileDef GetAttributeSubIfcCenterLineProfileDef = new GetAttributeSubIfcCenterLineProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcCenterLineProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcChamferEdgeFeature")) {
				GetAttributeSubIfcChamferEdgeFeature GetAttributeSubIfcChamferEdgeFeature = new GetAttributeSubIfcChamferEdgeFeature(object, string);
				objectArrayList = GetAttributeSubIfcChamferEdgeFeature.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcChillerType")) {
				GetAttributeSubIfcChillerType GetAttributeSubIfcChillerType = new GetAttributeSubIfcChillerType(object, string);
				objectArrayList = GetAttributeSubIfcChillerType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCircleHollowProfileDef")) {
				GetAttributeSubIfcCircleHollowProfileDef GetAttributeSubIfcCircleHollowProfileDef = new GetAttributeSubIfcCircleHollowProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcCircleHollowProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCircle")) {
				GetAttributeSubIfcCircle GetAttributeSubIfcCircle = new GetAttributeSubIfcCircle(object, string);
				objectArrayList = GetAttributeSubIfcCircle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCircleProfileDef")) {
				GetAttributeSubIfcCircleProfileDef GetAttributeSubIfcCircleProfileDef = new GetAttributeSubIfcCircleProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcCircleProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassification")) {
				GetAttributeSubIfcClassification GetAttributeSubIfcClassification = new GetAttributeSubIfcClassification(object, string);
				objectArrayList = GetAttributeSubIfcClassification.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassificationItem")) {
				GetAttributeSubIfcClassificationItem GetAttributeSubIfcClassificationItem = new GetAttributeSubIfcClassificationItem(object, string);
				objectArrayList = GetAttributeSubIfcClassificationItem.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassificationItemRelationship")) {
				GetAttributeSubIfcClassificationItemRelationship GetAttributeSubIfcClassificationItemRelationship = new GetAttributeSubIfcClassificationItemRelationship(object, string);
				objectArrayList = GetAttributeSubIfcClassificationItemRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassificationNotationFacet")) {
				GetAttributeSubIfcClassificationNotationFacet GetAttributeSubIfcClassificationNotationFacet = new GetAttributeSubIfcClassificationNotationFacet(object, string);
				objectArrayList = GetAttributeSubIfcClassificationNotationFacet.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassificationNotation")) {
				GetAttributeSubIfcClassificationNotation GetAttributeSubIfcClassificationNotation = new GetAttributeSubIfcClassificationNotation(object, string);
				objectArrayList = GetAttributeSubIfcClassificationNotation.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClassificationReference")) {
				GetAttributeSubIfcClassificationReference GetAttributeSubIfcClassificationReference = new GetAttributeSubIfcClassificationReference(object, string);
				objectArrayList = GetAttributeSubIfcClassificationReference.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcClosedShell")) {
				GetAttributeSubIfcClosedShell GetAttributeSubIfcClosedShell = new GetAttributeSubIfcClosedShell(object, string);
				objectArrayList = GetAttributeSubIfcClosedShell.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCoilType")) {
				GetAttributeSubIfcCoilType GetAttributeSubIfcCoilType = new GetAttributeSubIfcCoilType(object, string);
				objectArrayList = GetAttributeSubIfcCoilType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcColourRgb")) {
				GetAttributeSubIfcColourRgb GetAttributeSubIfcColourRgb = new GetAttributeSubIfcColourRgb(object, string);
				objectArrayList = GetAttributeSubIfcColourRgb.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcColourSpecification")) {
				GetAttributeSubIfcColourSpecification GetAttributeSubIfcColourSpecification = new GetAttributeSubIfcColourSpecification(object, string);
				objectArrayList = GetAttributeSubIfcColourSpecification.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcColumn")) {
				GetAttributeSubIfcColumn GetAttributeSubIfcColumn = new GetAttributeSubIfcColumn(object, string);
				objectArrayList = GetAttributeSubIfcColumn.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcColumnType")) {
				GetAttributeSubIfcColumnType GetAttributeSubIfcColumnType = new GetAttributeSubIfcColumnType(object, string);
				objectArrayList = GetAttributeSubIfcColumnType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcComplexProperty")) {
				GetAttributeSubIfcComplexProperty GetAttributeSubIfcComplexProperty = new GetAttributeSubIfcComplexProperty(object, string);
				objectArrayList = GetAttributeSubIfcComplexProperty.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCompositeCurve")) {
				GetAttributeSubIfcCompositeCurve GetAttributeSubIfcCompositeCurve = new GetAttributeSubIfcCompositeCurve(object, string);
				objectArrayList = GetAttributeSubIfcCompositeCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCompositeCurveSegment")) {
				GetAttributeSubIfcCompositeCurveSegment GetAttributeSubIfcCompositeCurveSegment = new GetAttributeSubIfcCompositeCurveSegment(object, string);
				objectArrayList = GetAttributeSubIfcCompositeCurveSegment.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCompositeProfileDef")) {
				GetAttributeSubIfcCompositeProfileDef GetAttributeSubIfcCompositeProfileDef = new GetAttributeSubIfcCompositeProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcCompositeProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCompressorType")) {
				GetAttributeSubIfcCompressorType GetAttributeSubIfcCompressorType = new GetAttributeSubIfcCompressorType(object, string);
				objectArrayList = GetAttributeSubIfcCompressorType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCondenserType")) {
				GetAttributeSubIfcCondenserType GetAttributeSubIfcCondenserType = new GetAttributeSubIfcCondenserType(object, string);
				objectArrayList = GetAttributeSubIfcCondenserType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConditionCriterion")) {
				GetAttributeSubIfcConditionCriterion GetAttributeSubIfcConditionCriterion = new GetAttributeSubIfcConditionCriterion(object, string);
				objectArrayList = GetAttributeSubIfcConditionCriterion.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCondition")) {
				GetAttributeSubIfcCondition GetAttributeSubIfcCondition = new GetAttributeSubIfcCondition(object, string);
				objectArrayList = GetAttributeSubIfcCondition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConic")) {
				GetAttributeSubIfcConic GetAttributeSubIfcConic = new GetAttributeSubIfcConic(object, string);
				objectArrayList = GetAttributeSubIfcConic.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectedFaceSet")) {
				GetAttributeSubIfcConnectedFaceSet GetAttributeSubIfcConnectedFaceSet = new GetAttributeSubIfcConnectedFaceSet(object, string);
				objectArrayList = GetAttributeSubIfcConnectedFaceSet.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionCurveGeometry")) {
				GetAttributeSubIfcConnectionCurveGeometry GetAttributeSubIfcConnectionCurveGeometry = new GetAttributeSubIfcConnectionCurveGeometry(object, string);
				objectArrayList = GetAttributeSubIfcConnectionCurveGeometry.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionGeometry")) {
				GetAttributeSubIfcConnectionGeometry GetAttributeSubIfcConnectionGeometry = new GetAttributeSubIfcConnectionGeometry(object, string);
				objectArrayList = GetAttributeSubIfcConnectionGeometry.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionPointEccentricity")) {
				GetAttributeSubIfcConnectionPointEccentricity GetAttributeSubIfcConnectionPointEccentricity = new GetAttributeSubIfcConnectionPointEccentricity(object, string);
				objectArrayList = GetAttributeSubIfcConnectionPointEccentricity.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionPointGeometry")) {
				GetAttributeSubIfcConnectionPointGeometry GetAttributeSubIfcConnectionPointGeometry = new GetAttributeSubIfcConnectionPointGeometry(object, string);
				objectArrayList = GetAttributeSubIfcConnectionPointGeometry.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionPortGeometry")) {
				GetAttributeSubIfcConnectionPortGeometry GetAttributeSubIfcConnectionPortGeometry = new GetAttributeSubIfcConnectionPortGeometry(object, string);
				objectArrayList = GetAttributeSubIfcConnectionPortGeometry.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConnectionSurfaceGeometry")) {
				GetAttributeSubIfcConnectionSurfaceGeometry GetAttributeSubIfcConnectionSurfaceGeometry = new GetAttributeSubIfcConnectionSurfaceGeometry(object, string);
				objectArrayList = GetAttributeSubIfcConnectionSurfaceGeometry.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstraintAggregationRelationship")) {
				GetAttributeSubIfcConstraintAggregationRelationship GetAttributeSubIfcConstraintAggregationRelationship = new GetAttributeSubIfcConstraintAggregationRelationship(object, string);
				objectArrayList = GetAttributeSubIfcConstraintAggregationRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstraintClassificationRelationship")) {
				GetAttributeSubIfcConstraintClassificationRelationship GetAttributeSubIfcConstraintClassificationRelationship = new GetAttributeSubIfcConstraintClassificationRelationship(object, string);
				objectArrayList = GetAttributeSubIfcConstraintClassificationRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstraint")) {
				GetAttributeSubIfcConstraint GetAttributeSubIfcConstraint = new GetAttributeSubIfcConstraint(object, string);
				objectArrayList = GetAttributeSubIfcConstraint.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstraintRelationship")) {
				GetAttributeSubIfcConstraintRelationship GetAttributeSubIfcConstraintRelationship = new GetAttributeSubIfcConstraintRelationship(object, string);
				objectArrayList = GetAttributeSubIfcConstraintRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstructionEquipmentResource")) {
				GetAttributeSubIfcConstructionEquipmentResource GetAttributeSubIfcConstructionEquipmentResource = new GetAttributeSubIfcConstructionEquipmentResource(object, string);
				objectArrayList = GetAttributeSubIfcConstructionEquipmentResource.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstructionMaterialResource")) {
				GetAttributeSubIfcConstructionMaterialResource GetAttributeSubIfcConstructionMaterialResource = new GetAttributeSubIfcConstructionMaterialResource(object, string);
				objectArrayList = GetAttributeSubIfcConstructionMaterialResource.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstructionProductResource")) {
				GetAttributeSubIfcConstructionProductResource GetAttributeSubIfcConstructionProductResource = new GetAttributeSubIfcConstructionProductResource(object, string);
				objectArrayList = GetAttributeSubIfcConstructionProductResource.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConstructionResource")) {
				GetAttributeSubIfcConstructionResource GetAttributeSubIfcConstructionResource = new GetAttributeSubIfcConstructionResource(object, string);
				objectArrayList = GetAttributeSubIfcConstructionResource.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcContextDependentMeasure")) {
				GetAttributeSubIfcContextDependentMeasure GetAttributeSubIfcContextDependentMeasure = new GetAttributeSubIfcContextDependentMeasure(object, string);
				objectArrayList = GetAttributeSubIfcContextDependentMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcContextDependentUnit")) {
				GetAttributeSubIfcContextDependentUnit GetAttributeSubIfcContextDependentUnit = new GetAttributeSubIfcContextDependentUnit(object, string);
				objectArrayList = GetAttributeSubIfcContextDependentUnit.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcControl")) {
				GetAttributeSubIfcControl GetAttributeSubIfcControl = new GetAttributeSubIfcControl(object, string);
				objectArrayList = GetAttributeSubIfcControl.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcControllerType")) {
				GetAttributeSubIfcControllerType GetAttributeSubIfcControllerType = new GetAttributeSubIfcControllerType(object, string);
				objectArrayList = GetAttributeSubIfcControllerType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcConversionBasedUnit")) {
				GetAttributeSubIfcConversionBasedUnit GetAttributeSubIfcConversionBasedUnit = new GetAttributeSubIfcConversionBasedUnit(object, string);
				objectArrayList = GetAttributeSubIfcConversionBasedUnit.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCooledBeamType")) {
				GetAttributeSubIfcCooledBeamType GetAttributeSubIfcCooledBeamType = new GetAttributeSubIfcCooledBeamType(object, string);
				objectArrayList = GetAttributeSubIfcCooledBeamType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCoolingTowerType")) {
				GetAttributeSubIfcCoolingTowerType GetAttributeSubIfcCoolingTowerType = new GetAttributeSubIfcCoolingTowerType(object, string);
				objectArrayList = GetAttributeSubIfcCoolingTowerType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCoordinatedUniversalTimeOffset")) {
				GetAttributeSubIfcCoordinatedUniversalTimeOffset GetAttributeSubIfcCoordinatedUniversalTimeOffset = new GetAttributeSubIfcCoordinatedUniversalTimeOffset(object, string);
				objectArrayList = GetAttributeSubIfcCoordinatedUniversalTimeOffset.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCostItem")) {
				GetAttributeSubIfcCostItem GetAttributeSubIfcCostItem = new GetAttributeSubIfcCostItem(object, string);
				objectArrayList = GetAttributeSubIfcCostItem.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCostSchedule")) {
				GetAttributeSubIfcCostSchedule GetAttributeSubIfcCostSchedule = new GetAttributeSubIfcCostSchedule(object, string);
				objectArrayList = GetAttributeSubIfcCostSchedule.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCostValue")) {
				GetAttributeSubIfcCostValue GetAttributeSubIfcCostValue = new GetAttributeSubIfcCostValue(object, string);
				objectArrayList = GetAttributeSubIfcCostValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCountMeasure")) {
				GetAttributeSubIfcCountMeasure GetAttributeSubIfcCountMeasure = new GetAttributeSubIfcCountMeasure(object, string);
				objectArrayList = GetAttributeSubIfcCountMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCovering")) {
				GetAttributeSubIfcCovering GetAttributeSubIfcCovering = new GetAttributeSubIfcCovering(object, string);
				objectArrayList = GetAttributeSubIfcCovering.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCoveringType")) {
				GetAttributeSubIfcCoveringType GetAttributeSubIfcCoveringType = new GetAttributeSubIfcCoveringType(object, string);
				objectArrayList = GetAttributeSubIfcCoveringType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCraneRailAShapeProfileDef")) {
				GetAttributeSubIfcCraneRailAShapeProfileDef GetAttributeSubIfcCraneRailAShapeProfileDef = new GetAttributeSubIfcCraneRailAShapeProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcCraneRailAShapeProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCraneRailFShapeProfileDef")) {
				GetAttributeSubIfcCraneRailFShapeProfileDef GetAttributeSubIfcCraneRailFShapeProfileDef = new GetAttributeSubIfcCraneRailFShapeProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcCraneRailFShapeProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCrewResource")) {
				GetAttributeSubIfcCrewResource GetAttributeSubIfcCrewResource = new GetAttributeSubIfcCrewResource(object, string);
				objectArrayList = GetAttributeSubIfcCrewResource.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCsgPrimitive3D")) {
				GetAttributeSubIfcCsgPrimitive3D GetAttributeSubIfcCsgPrimitive3D = new GetAttributeSubIfcCsgPrimitive3D(object, string);
				objectArrayList = GetAttributeSubIfcCsgPrimitive3D.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCsgSolid")) {
				GetAttributeSubIfcCsgSolid GetAttributeSubIfcCsgSolid = new GetAttributeSubIfcCsgSolid(object, string);
				objectArrayList = GetAttributeSubIfcCsgSolid.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurrencyRelationship")) {
				GetAttributeSubIfcCurrencyRelationship GetAttributeSubIfcCurrencyRelationship = new GetAttributeSubIfcCurrencyRelationship(object, string);
				objectArrayList = GetAttributeSubIfcCurrencyRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurtainWall")) {
				GetAttributeSubIfcCurtainWall GetAttributeSubIfcCurtainWall = new GetAttributeSubIfcCurtainWall(object, string);
				objectArrayList = GetAttributeSubIfcCurtainWall.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurtainWallType")) {
				GetAttributeSubIfcCurtainWallType GetAttributeSubIfcCurtainWallType = new GetAttributeSubIfcCurtainWallType(object, string);
				objectArrayList = GetAttributeSubIfcCurtainWallType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurvatureMeasure")) {
				GetAttributeSubIfcCurvatureMeasure GetAttributeSubIfcCurvatureMeasure = new GetAttributeSubIfcCurvatureMeasure(object, string);
				objectArrayList = GetAttributeSubIfcCurvatureMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurveBoundedPlane")) {
				GetAttributeSubIfcCurveBoundedPlane GetAttributeSubIfcCurveBoundedPlane = new GetAttributeSubIfcCurveBoundedPlane(object, string);
				objectArrayList = GetAttributeSubIfcCurveBoundedPlane.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurve")) {
				GetAttributeSubIfcCurve GetAttributeSubIfcCurve = new GetAttributeSubIfcCurve(object, string);
				objectArrayList = GetAttributeSubIfcCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurveStyleFontAndScaling")) {
				GetAttributeSubIfcCurveStyleFontAndScaling GetAttributeSubIfcCurveStyleFontAndScaling = new GetAttributeSubIfcCurveStyleFontAndScaling(object, string);
				objectArrayList = GetAttributeSubIfcCurveStyleFontAndScaling.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurveStyleFont")) {
				GetAttributeSubIfcCurveStyleFont GetAttributeSubIfcCurveStyleFont = new GetAttributeSubIfcCurveStyleFont(object, string);
				objectArrayList = GetAttributeSubIfcCurveStyleFont.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurveStyleFontPattern")) {
				GetAttributeSubIfcCurveStyleFontPattern GetAttributeSubIfcCurveStyleFontPattern = new GetAttributeSubIfcCurveStyleFontPattern(object, string);
				objectArrayList = GetAttributeSubIfcCurveStyleFontPattern.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcCurveStyle")) {
				GetAttributeSubIfcCurveStyle GetAttributeSubIfcCurveStyle = new GetAttributeSubIfcCurveStyle(object, string);
				objectArrayList = GetAttributeSubIfcCurveStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDamperType")) {
				GetAttributeSubIfcDamperType GetAttributeSubIfcDamperType = new GetAttributeSubIfcDamperType(object, string);
				objectArrayList = GetAttributeSubIfcDamperType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDateAndTime")) {
				GetAttributeSubIfcDateAndTime GetAttributeSubIfcDateAndTime = new GetAttributeSubIfcDateAndTime(object, string);
				objectArrayList = GetAttributeSubIfcDateAndTime.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDefinedSymbol")) {
				GetAttributeSubIfcDefinedSymbol GetAttributeSubIfcDefinedSymbol = new GetAttributeSubIfcDefinedSymbol(object, string);
				objectArrayList = GetAttributeSubIfcDefinedSymbol.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDerivedProfileDef")) {
				GetAttributeSubIfcDerivedProfileDef GetAttributeSubIfcDerivedProfileDef = new GetAttributeSubIfcDerivedProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcDerivedProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDerivedUnitElement")) {
				GetAttributeSubIfcDerivedUnitElement GetAttributeSubIfcDerivedUnitElement = new GetAttributeSubIfcDerivedUnitElement(object, string);
				objectArrayList = GetAttributeSubIfcDerivedUnitElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDerivedUnit")) {
				GetAttributeSubIfcDerivedUnit GetAttributeSubIfcDerivedUnit = new GetAttributeSubIfcDerivedUnit(object, string);
				objectArrayList = GetAttributeSubIfcDerivedUnit.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDescriptiveMeasure")) {
				GetAttributeSubIfcDescriptiveMeasure GetAttributeSubIfcDescriptiveMeasure = new GetAttributeSubIfcDescriptiveMeasure(object, string);
				objectArrayList = GetAttributeSubIfcDescriptiveMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDiameterDimension")) {
				GetAttributeSubIfcDiameterDimension GetAttributeSubIfcDiameterDimension = new GetAttributeSubIfcDiameterDimension(object, string);
				objectArrayList = GetAttributeSubIfcDiameterDimension.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionCalloutRelationship")) {
				GetAttributeSubIfcDimensionCalloutRelationship GetAttributeSubIfcDimensionCalloutRelationship = new GetAttributeSubIfcDimensionCalloutRelationship(object, string);
				objectArrayList = GetAttributeSubIfcDimensionCalloutRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionCurveDirectedCallout")) {
				GetAttributeSubIfcDimensionCurveDirectedCallout GetAttributeSubIfcDimensionCurveDirectedCallout = new GetAttributeSubIfcDimensionCurveDirectedCallout(object, string);
				objectArrayList = GetAttributeSubIfcDimensionCurveDirectedCallout.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionCurve")) {
				GetAttributeSubIfcDimensionCurve GetAttributeSubIfcDimensionCurve = new GetAttributeSubIfcDimensionCurve(object, string);
				objectArrayList = GetAttributeSubIfcDimensionCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionCurveTerminator")) {
				GetAttributeSubIfcDimensionCurveTerminator GetAttributeSubIfcDimensionCurveTerminator = new GetAttributeSubIfcDimensionCurveTerminator(object, string);
				objectArrayList = GetAttributeSubIfcDimensionCurveTerminator.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionPair")) {
				GetAttributeSubIfcDimensionPair GetAttributeSubIfcDimensionPair = new GetAttributeSubIfcDimensionPair(object, string);
				objectArrayList = GetAttributeSubIfcDimensionPair.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDimensionalExponents")) {
				GetAttributeSubIfcDimensionalExponents GetAttributeSubIfcDimensionalExponents = new GetAttributeSubIfcDimensionalExponents(object, string);
				objectArrayList = GetAttributeSubIfcDimensionalExponents.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDirection")) {
				GetAttributeSubIfcDirection GetAttributeSubIfcDirection = new GetAttributeSubIfcDirection(object, string);
				objectArrayList = GetAttributeSubIfcDirection.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDiscreteAccessory")) {
				GetAttributeSubIfcDiscreteAccessory GetAttributeSubIfcDiscreteAccessory = new GetAttributeSubIfcDiscreteAccessory(object, string);
				objectArrayList = GetAttributeSubIfcDiscreteAccessory.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDiscreteAccessoryType")) {
				GetAttributeSubIfcDiscreteAccessoryType GetAttributeSubIfcDiscreteAccessoryType = new GetAttributeSubIfcDiscreteAccessoryType(object, string);
				objectArrayList = GetAttributeSubIfcDiscreteAccessoryType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionChamberElement")) {
				GetAttributeSubIfcDistributionChamberElement GetAttributeSubIfcDistributionChamberElement = new GetAttributeSubIfcDistributionChamberElement(object, string);
				objectArrayList = GetAttributeSubIfcDistributionChamberElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionChamberElementType")) {
				GetAttributeSubIfcDistributionChamberElementType GetAttributeSubIfcDistributionChamberElementType = new GetAttributeSubIfcDistributionChamberElementType(object, string);
				objectArrayList = GetAttributeSubIfcDistributionChamberElementType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionControlElement")) {
				GetAttributeSubIfcDistributionControlElement GetAttributeSubIfcDistributionControlElement = new GetAttributeSubIfcDistributionControlElement(object, string);
				objectArrayList = GetAttributeSubIfcDistributionControlElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionControlElementType")) {
				GetAttributeSubIfcDistributionControlElementType GetAttributeSubIfcDistributionControlElementType = new GetAttributeSubIfcDistributionControlElementType(object, string);
				objectArrayList = GetAttributeSubIfcDistributionControlElementType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionElement")) {
				GetAttributeSubIfcDistributionElement GetAttributeSubIfcDistributionElement = new GetAttributeSubIfcDistributionElement(object, string);
				objectArrayList = GetAttributeSubIfcDistributionElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionElementType")) {
				GetAttributeSubIfcDistributionElementType GetAttributeSubIfcDistributionElementType = new GetAttributeSubIfcDistributionElementType(object, string);
				objectArrayList = GetAttributeSubIfcDistributionElementType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionFlowElement")) {
				GetAttributeSubIfcDistributionFlowElement GetAttributeSubIfcDistributionFlowElement = new GetAttributeSubIfcDistributionFlowElement(object, string);
				objectArrayList = GetAttributeSubIfcDistributionFlowElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionFlowElementType")) {
				GetAttributeSubIfcDistributionFlowElementType GetAttributeSubIfcDistributionFlowElementType = new GetAttributeSubIfcDistributionFlowElementType(object, string);
				objectArrayList = GetAttributeSubIfcDistributionFlowElementType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDistributionPort")) {
				GetAttributeSubIfcDistributionPort GetAttributeSubIfcDistributionPort = new GetAttributeSubIfcDistributionPort(object, string);
				objectArrayList = GetAttributeSubIfcDistributionPort.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDocumentElectronicFormat")) {
				GetAttributeSubIfcDocumentElectronicFormat GetAttributeSubIfcDocumentElectronicFormat = new GetAttributeSubIfcDocumentElectronicFormat(object, string);
				objectArrayList = GetAttributeSubIfcDocumentElectronicFormat.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDocumentInformation")) {
				GetAttributeSubIfcDocumentInformation GetAttributeSubIfcDocumentInformation = new GetAttributeSubIfcDocumentInformation(object, string);
				objectArrayList = GetAttributeSubIfcDocumentInformation.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDocumentInformationRelationship")) {
				GetAttributeSubIfcDocumentInformationRelationship GetAttributeSubIfcDocumentInformationRelationship = new GetAttributeSubIfcDocumentInformationRelationship(object, string);
				objectArrayList = GetAttributeSubIfcDocumentInformationRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDocumentReference")) {
				GetAttributeSubIfcDocumentReference GetAttributeSubIfcDocumentReference = new GetAttributeSubIfcDocumentReference(object, string);
				objectArrayList = GetAttributeSubIfcDocumentReference.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDoor")) {
				GetAttributeSubIfcDoor GetAttributeSubIfcDoor = new GetAttributeSubIfcDoor(object, string);
				objectArrayList = GetAttributeSubIfcDoor.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDoorLiningProperties")) {
				GetAttributeSubIfcDoorLiningProperties GetAttributeSubIfcDoorLiningProperties = new GetAttributeSubIfcDoorLiningProperties(object, string);
				objectArrayList = GetAttributeSubIfcDoorLiningProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDoorPanelProperties")) {
				GetAttributeSubIfcDoorPanelProperties GetAttributeSubIfcDoorPanelProperties = new GetAttributeSubIfcDoorPanelProperties(object, string);
				objectArrayList = GetAttributeSubIfcDoorPanelProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDoorStyle")) {
				GetAttributeSubIfcDoorStyle GetAttributeSubIfcDoorStyle = new GetAttributeSubIfcDoorStyle(object, string);
				objectArrayList = GetAttributeSubIfcDoorStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDoseEquivalentMeasure")) {
				GetAttributeSubIfcDoseEquivalentMeasure GetAttributeSubIfcDoseEquivalentMeasure = new GetAttributeSubIfcDoseEquivalentMeasure(object, string);
				objectArrayList = GetAttributeSubIfcDoseEquivalentMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDraughtingCallout")) {
				GetAttributeSubIfcDraughtingCallout GetAttributeSubIfcDraughtingCallout = new GetAttributeSubIfcDraughtingCallout(object, string);
				objectArrayList = GetAttributeSubIfcDraughtingCallout.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDraughtingCalloutRelationship")) {
				GetAttributeSubIfcDraughtingCalloutRelationship GetAttributeSubIfcDraughtingCalloutRelationship = new GetAttributeSubIfcDraughtingCalloutRelationship(object, string);
				objectArrayList = GetAttributeSubIfcDraughtingCalloutRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDraughtingPreDefinedColour")) {
				GetAttributeSubIfcDraughtingPreDefinedColour GetAttributeSubIfcDraughtingPreDefinedColour = new GetAttributeSubIfcDraughtingPreDefinedColour(object, string);
				objectArrayList = GetAttributeSubIfcDraughtingPreDefinedColour.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDraughtingPreDefinedCurveFont")) {
				GetAttributeSubIfcDraughtingPreDefinedCurveFont GetAttributeSubIfcDraughtingPreDefinedCurveFont = new GetAttributeSubIfcDraughtingPreDefinedCurveFont(object, string);
				objectArrayList = GetAttributeSubIfcDraughtingPreDefinedCurveFont.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDraughtingPreDefinedTextFont")) {
				GetAttributeSubIfcDraughtingPreDefinedTextFont GetAttributeSubIfcDraughtingPreDefinedTextFont = new GetAttributeSubIfcDraughtingPreDefinedTextFont(object, string);
				objectArrayList = GetAttributeSubIfcDraughtingPreDefinedTextFont.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDuctFittingType")) {
				GetAttributeSubIfcDuctFittingType GetAttributeSubIfcDuctFittingType = new GetAttributeSubIfcDuctFittingType(object, string);
				objectArrayList = GetAttributeSubIfcDuctFittingType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDuctSegmentType")) {
				GetAttributeSubIfcDuctSegmentType GetAttributeSubIfcDuctSegmentType = new GetAttributeSubIfcDuctSegmentType(object, string);
				objectArrayList = GetAttributeSubIfcDuctSegmentType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDuctSilencerType")) {
				GetAttributeSubIfcDuctSilencerType GetAttributeSubIfcDuctSilencerType = new GetAttributeSubIfcDuctSilencerType(object, string);
				objectArrayList = GetAttributeSubIfcDuctSilencerType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcDynamicViscosityMeasure")) {
				GetAttributeSubIfcDynamicViscosityMeasure GetAttributeSubIfcDynamicViscosityMeasure = new GetAttributeSubIfcDynamicViscosityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcDynamicViscosityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEdgeCurve")) {
				GetAttributeSubIfcEdgeCurve GetAttributeSubIfcEdgeCurve = new GetAttributeSubIfcEdgeCurve(object, string);
				objectArrayList = GetAttributeSubIfcEdgeCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEdgeFeature")) {
				GetAttributeSubIfcEdgeFeature GetAttributeSubIfcEdgeFeature = new GetAttributeSubIfcEdgeFeature(object, string);
				objectArrayList = GetAttributeSubIfcEdgeFeature.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEdge")) {
				GetAttributeSubIfcEdge GetAttributeSubIfcEdge = new GetAttributeSubIfcEdge(object, string);
				objectArrayList = GetAttributeSubIfcEdge.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEdgeLoop")) {
				GetAttributeSubIfcEdgeLoop GetAttributeSubIfcEdgeLoop = new GetAttributeSubIfcEdgeLoop(object, string);
				objectArrayList = GetAttributeSubIfcEdgeLoop.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricApplianceType")) {
				GetAttributeSubIfcElectricApplianceType GetAttributeSubIfcElectricApplianceType = new GetAttributeSubIfcElectricApplianceType(object, string);
				objectArrayList = GetAttributeSubIfcElectricApplianceType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricCapacitanceMeasure")) {
				GetAttributeSubIfcElectricCapacitanceMeasure GetAttributeSubIfcElectricCapacitanceMeasure = new GetAttributeSubIfcElectricCapacitanceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcElectricCapacitanceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricChargeMeasure")) {
				GetAttributeSubIfcElectricChargeMeasure GetAttributeSubIfcElectricChargeMeasure = new GetAttributeSubIfcElectricChargeMeasure(object, string);
				objectArrayList = GetAttributeSubIfcElectricChargeMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricConductanceMeasure")) {
				GetAttributeSubIfcElectricConductanceMeasure GetAttributeSubIfcElectricConductanceMeasure = new GetAttributeSubIfcElectricConductanceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcElectricConductanceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricCurrentMeasure")) {
				GetAttributeSubIfcElectricCurrentMeasure GetAttributeSubIfcElectricCurrentMeasure = new GetAttributeSubIfcElectricCurrentMeasure(object, string);
				objectArrayList = GetAttributeSubIfcElectricCurrentMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricDistributionPoint")) {
				GetAttributeSubIfcElectricDistributionPoint GetAttributeSubIfcElectricDistributionPoint = new GetAttributeSubIfcElectricDistributionPoint(object, string);
				objectArrayList = GetAttributeSubIfcElectricDistributionPoint.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricFlowStorageDeviceType")) {
				GetAttributeSubIfcElectricFlowStorageDeviceType GetAttributeSubIfcElectricFlowStorageDeviceType = new GetAttributeSubIfcElectricFlowStorageDeviceType(object, string);
				objectArrayList = GetAttributeSubIfcElectricFlowStorageDeviceType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricGeneratorType")) {
				GetAttributeSubIfcElectricGeneratorType GetAttributeSubIfcElectricGeneratorType = new GetAttributeSubIfcElectricGeneratorType(object, string);
				objectArrayList = GetAttributeSubIfcElectricGeneratorType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricHeaterType")) {
				GetAttributeSubIfcElectricHeaterType GetAttributeSubIfcElectricHeaterType = new GetAttributeSubIfcElectricHeaterType(object, string);
				objectArrayList = GetAttributeSubIfcElectricHeaterType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricMotorType")) {
				GetAttributeSubIfcElectricMotorType GetAttributeSubIfcElectricMotorType = new GetAttributeSubIfcElectricMotorType(object, string);
				objectArrayList = GetAttributeSubIfcElectricMotorType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricResistanceMeasure")) {
				GetAttributeSubIfcElectricResistanceMeasure GetAttributeSubIfcElectricResistanceMeasure = new GetAttributeSubIfcElectricResistanceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcElectricResistanceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricTimeControlType")) {
				GetAttributeSubIfcElectricTimeControlType GetAttributeSubIfcElectricTimeControlType = new GetAttributeSubIfcElectricTimeControlType(object, string);
				objectArrayList = GetAttributeSubIfcElectricTimeControlType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricVoltageMeasure")) {
				GetAttributeSubIfcElectricVoltageMeasure GetAttributeSubIfcElectricVoltageMeasure = new GetAttributeSubIfcElectricVoltageMeasure(object, string);
				objectArrayList = GetAttributeSubIfcElectricVoltageMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricalBaseProperties")) {
				GetAttributeSubIfcElectricalBaseProperties GetAttributeSubIfcElectricalBaseProperties = new GetAttributeSubIfcElectricalBaseProperties(object, string);
				objectArrayList = GetAttributeSubIfcElectricalBaseProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricalCircuit")) {
				GetAttributeSubIfcElectricalCircuit GetAttributeSubIfcElectricalCircuit = new GetAttributeSubIfcElectricalCircuit(object, string);
				objectArrayList = GetAttributeSubIfcElectricalCircuit.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElectricalElement")) {
				GetAttributeSubIfcElectricalElement GetAttributeSubIfcElectricalElement = new GetAttributeSubIfcElectricalElement(object, string);
				objectArrayList = GetAttributeSubIfcElectricalElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementAssembly")) {
				GetAttributeSubIfcElementAssembly GetAttributeSubIfcElementAssembly = new GetAttributeSubIfcElementAssembly(object, string);
				objectArrayList = GetAttributeSubIfcElementAssembly.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementComponent")) {
				GetAttributeSubIfcElementComponent GetAttributeSubIfcElementComponent = new GetAttributeSubIfcElementComponent(object, string);
				objectArrayList = GetAttributeSubIfcElementComponent.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementComponentType")) {
				GetAttributeSubIfcElementComponentType GetAttributeSubIfcElementComponentType = new GetAttributeSubIfcElementComponentType(object, string);
				objectArrayList = GetAttributeSubIfcElementComponentType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElement")) {
				GetAttributeSubIfcElement GetAttributeSubIfcElement = new GetAttributeSubIfcElement(object, string);
				objectArrayList = GetAttributeSubIfcElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementQuantity")) {
				GetAttributeSubIfcElementQuantity GetAttributeSubIfcElementQuantity = new GetAttributeSubIfcElementQuantity(object, string);
				objectArrayList = GetAttributeSubIfcElementQuantity.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementType")) {
				GetAttributeSubIfcElementType GetAttributeSubIfcElementType = new GetAttributeSubIfcElementType(object, string);
				objectArrayList = GetAttributeSubIfcElementType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcElementarySurface")) {
				GetAttributeSubIfcElementarySurface GetAttributeSubIfcElementarySurface = new GetAttributeSubIfcElementarySurface(object, string);
				objectArrayList = GetAttributeSubIfcElementarySurface.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEllipse")) {
				GetAttributeSubIfcEllipse GetAttributeSubIfcEllipse = new GetAttributeSubIfcEllipse(object, string);
				objectArrayList = GetAttributeSubIfcEllipse.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEllipseProfileDef")) {
				GetAttributeSubIfcEllipseProfileDef GetAttributeSubIfcEllipseProfileDef = new GetAttributeSubIfcEllipseProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcEllipseProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEnergyConversionDevice")) {
				GetAttributeSubIfcEnergyConversionDevice GetAttributeSubIfcEnergyConversionDevice = new GetAttributeSubIfcEnergyConversionDevice(object, string);
				objectArrayList = GetAttributeSubIfcEnergyConversionDevice.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEnergyConversionDeviceType")) {
				GetAttributeSubIfcEnergyConversionDeviceType GetAttributeSubIfcEnergyConversionDeviceType = new GetAttributeSubIfcEnergyConversionDeviceType(object, string);
				objectArrayList = GetAttributeSubIfcEnergyConversionDeviceType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEnergyMeasure")) {
				GetAttributeSubIfcEnergyMeasure GetAttributeSubIfcEnergyMeasure = new GetAttributeSubIfcEnergyMeasure(object, string);
				objectArrayList = GetAttributeSubIfcEnergyMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEnergyProperties")) {
				GetAttributeSubIfcEnergyProperties GetAttributeSubIfcEnergyProperties = new GetAttributeSubIfcEnergyProperties(object, string);
				objectArrayList = GetAttributeSubIfcEnergyProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEnvironmentalImpactValue")) {
				GetAttributeSubIfcEnvironmentalImpactValue GetAttributeSubIfcEnvironmentalImpactValue = new GetAttributeSubIfcEnvironmentalImpactValue(object, string);
				objectArrayList = GetAttributeSubIfcEnvironmentalImpactValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEquipmentElement")) {
				GetAttributeSubIfcEquipmentElement GetAttributeSubIfcEquipmentElement = new GetAttributeSubIfcEquipmentElement(object, string);
				objectArrayList = GetAttributeSubIfcEquipmentElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEquipmentStandard")) {
				GetAttributeSubIfcEquipmentStandard GetAttributeSubIfcEquipmentStandard = new GetAttributeSubIfcEquipmentStandard(object, string);
				objectArrayList = GetAttributeSubIfcEquipmentStandard.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEvaporativeCoolerType")) {
				GetAttributeSubIfcEvaporativeCoolerType GetAttributeSubIfcEvaporativeCoolerType = new GetAttributeSubIfcEvaporativeCoolerType(object, string);
				objectArrayList = GetAttributeSubIfcEvaporativeCoolerType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcEvaporatorType")) {
				GetAttributeSubIfcEvaporatorType GetAttributeSubIfcEvaporatorType = new GetAttributeSubIfcEvaporatorType(object, string);
				objectArrayList = GetAttributeSubIfcEvaporatorType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExtendedMaterialProperties")) {
				GetAttributeSubIfcExtendedMaterialProperties GetAttributeSubIfcExtendedMaterialProperties = new GetAttributeSubIfcExtendedMaterialProperties(object, string);
				objectArrayList = GetAttributeSubIfcExtendedMaterialProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExternalReference")) {
				GetAttributeSubIfcExternalReference GetAttributeSubIfcExternalReference = new GetAttributeSubIfcExternalReference(object, string);
				objectArrayList = GetAttributeSubIfcExternalReference.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExternallyDefinedHatchStyle")) {
				GetAttributeSubIfcExternallyDefinedHatchStyle GetAttributeSubIfcExternallyDefinedHatchStyle = new GetAttributeSubIfcExternallyDefinedHatchStyle(object, string);
				objectArrayList = GetAttributeSubIfcExternallyDefinedHatchStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExternallyDefinedSurfaceStyle")) {
				GetAttributeSubIfcExternallyDefinedSurfaceStyle GetAttributeSubIfcExternallyDefinedSurfaceStyle = new GetAttributeSubIfcExternallyDefinedSurfaceStyle(object, string);
				objectArrayList = GetAttributeSubIfcExternallyDefinedSurfaceStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExternallyDefinedSymbol")) {
				GetAttributeSubIfcExternallyDefinedSymbol GetAttributeSubIfcExternallyDefinedSymbol = new GetAttributeSubIfcExternallyDefinedSymbol(object, string);
				objectArrayList = GetAttributeSubIfcExternallyDefinedSymbol.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExternallyDefinedTextFont")) {
				GetAttributeSubIfcExternallyDefinedTextFont GetAttributeSubIfcExternallyDefinedTextFont = new GetAttributeSubIfcExternallyDefinedTextFont(object, string);
				objectArrayList = GetAttributeSubIfcExternallyDefinedTextFont.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcExtrudedAreaSolid")) {
				GetAttributeSubIfcExtrudedAreaSolid GetAttributeSubIfcExtrudedAreaSolid = new GetAttributeSubIfcExtrudedAreaSolid(object, string);
				objectArrayList = GetAttributeSubIfcExtrudedAreaSolid.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFaceBasedSurfaceModel")) {
				GetAttributeSubIfcFaceBasedSurfaceModel GetAttributeSubIfcFaceBasedSurfaceModel = new GetAttributeSubIfcFaceBasedSurfaceModel(object, string);
				objectArrayList = GetAttributeSubIfcFaceBasedSurfaceModel.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFaceBound")) {
				GetAttributeSubIfcFaceBound GetAttributeSubIfcFaceBound = new GetAttributeSubIfcFaceBound(object, string);
				objectArrayList = GetAttributeSubIfcFaceBound.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFace")) {
				GetAttributeSubIfcFace GetAttributeSubIfcFace = new GetAttributeSubIfcFace(object, string);
				objectArrayList = GetAttributeSubIfcFace.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFaceOuterBound")) {
				GetAttributeSubIfcFaceOuterBound GetAttributeSubIfcFaceOuterBound = new GetAttributeSubIfcFaceOuterBound(object, string);
				objectArrayList = GetAttributeSubIfcFaceOuterBound.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFaceSurface")) {
				GetAttributeSubIfcFaceSurface GetAttributeSubIfcFaceSurface = new GetAttributeSubIfcFaceSurface(object, string);
				objectArrayList = GetAttributeSubIfcFaceSurface.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFacetedBrep")) {
				GetAttributeSubIfcFacetedBrep GetAttributeSubIfcFacetedBrep = new GetAttributeSubIfcFacetedBrep(object, string);
				objectArrayList = GetAttributeSubIfcFacetedBrep.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFacetedBrepWithVoids")) {
				GetAttributeSubIfcFacetedBrepWithVoids GetAttributeSubIfcFacetedBrepWithVoids = new GetAttributeSubIfcFacetedBrepWithVoids(object, string);
				objectArrayList = GetAttributeSubIfcFacetedBrepWithVoids.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFailureConnectionCondition")) {
				GetAttributeSubIfcFailureConnectionCondition GetAttributeSubIfcFailureConnectionCondition = new GetAttributeSubIfcFailureConnectionCondition(object, string);
				objectArrayList = GetAttributeSubIfcFailureConnectionCondition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFanType")) {
				GetAttributeSubIfcFanType GetAttributeSubIfcFanType = new GetAttributeSubIfcFanType(object, string);
				objectArrayList = GetAttributeSubIfcFanType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFastener")) {
				GetAttributeSubIfcFastener GetAttributeSubIfcFastener = new GetAttributeSubIfcFastener(object, string);
				objectArrayList = GetAttributeSubIfcFastener.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFastenerType")) {
				GetAttributeSubIfcFastenerType GetAttributeSubIfcFastenerType = new GetAttributeSubIfcFastenerType(object, string);
				objectArrayList = GetAttributeSubIfcFastenerType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFeatureElementAddition")) {
				GetAttributeSubIfcFeatureElementAddition GetAttributeSubIfcFeatureElementAddition = new GetAttributeSubIfcFeatureElementAddition(object, string);
				objectArrayList = GetAttributeSubIfcFeatureElementAddition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFeatureElement")) {
				GetAttributeSubIfcFeatureElement GetAttributeSubIfcFeatureElement = new GetAttributeSubIfcFeatureElement(object, string);
				objectArrayList = GetAttributeSubIfcFeatureElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFeatureElementSubtraction")) {
				GetAttributeSubIfcFeatureElementSubtraction GetAttributeSubIfcFeatureElementSubtraction = new GetAttributeSubIfcFeatureElementSubtraction(object, string);
				objectArrayList = GetAttributeSubIfcFeatureElementSubtraction.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFillAreaStyleHatching")) {
				GetAttributeSubIfcFillAreaStyleHatching GetAttributeSubIfcFillAreaStyleHatching = new GetAttributeSubIfcFillAreaStyleHatching(object, string);
				objectArrayList = GetAttributeSubIfcFillAreaStyleHatching.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFillAreaStyle")) {
				GetAttributeSubIfcFillAreaStyle GetAttributeSubIfcFillAreaStyle = new GetAttributeSubIfcFillAreaStyle(object, string);
				objectArrayList = GetAttributeSubIfcFillAreaStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFillAreaStyleTileSymbolWithStyle")) {
				GetAttributeSubIfcFillAreaStyleTileSymbolWithStyle GetAttributeSubIfcFillAreaStyleTileSymbolWithStyle = new GetAttributeSubIfcFillAreaStyleTileSymbolWithStyle(object, string);
				objectArrayList = GetAttributeSubIfcFillAreaStyleTileSymbolWithStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFillAreaStyleTiles")) {
				GetAttributeSubIfcFillAreaStyleTiles GetAttributeSubIfcFillAreaStyleTiles = new GetAttributeSubIfcFillAreaStyleTiles(object, string);
				objectArrayList = GetAttributeSubIfcFillAreaStyleTiles.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFilterType")) {
				GetAttributeSubIfcFilterType GetAttributeSubIfcFilterType = new GetAttributeSubIfcFilterType(object, string);
				objectArrayList = GetAttributeSubIfcFilterType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFireSuppressionTerminalType")) {
				GetAttributeSubIfcFireSuppressionTerminalType GetAttributeSubIfcFireSuppressionTerminalType = new GetAttributeSubIfcFireSuppressionTerminalType(object, string);
				objectArrayList = GetAttributeSubIfcFireSuppressionTerminalType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowController")) {
				GetAttributeSubIfcFlowController GetAttributeSubIfcFlowController = new GetAttributeSubIfcFlowController(object, string);
				objectArrayList = GetAttributeSubIfcFlowController.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowControllerType")) {
				GetAttributeSubIfcFlowControllerType GetAttributeSubIfcFlowControllerType = new GetAttributeSubIfcFlowControllerType(object, string);
				objectArrayList = GetAttributeSubIfcFlowControllerType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowFitting")) {
				GetAttributeSubIfcFlowFitting GetAttributeSubIfcFlowFitting = new GetAttributeSubIfcFlowFitting(object, string);
				objectArrayList = GetAttributeSubIfcFlowFitting.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowFittingType")) {
				GetAttributeSubIfcFlowFittingType GetAttributeSubIfcFlowFittingType = new GetAttributeSubIfcFlowFittingType(object, string);
				objectArrayList = GetAttributeSubIfcFlowFittingType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowInstrumentType")) {
				GetAttributeSubIfcFlowInstrumentType GetAttributeSubIfcFlowInstrumentType = new GetAttributeSubIfcFlowInstrumentType(object, string);
				objectArrayList = GetAttributeSubIfcFlowInstrumentType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowMeterType")) {
				GetAttributeSubIfcFlowMeterType GetAttributeSubIfcFlowMeterType = new GetAttributeSubIfcFlowMeterType(object, string);
				objectArrayList = GetAttributeSubIfcFlowMeterType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowMovingDevice")) {
				GetAttributeSubIfcFlowMovingDevice GetAttributeSubIfcFlowMovingDevice = new GetAttributeSubIfcFlowMovingDevice(object, string);
				objectArrayList = GetAttributeSubIfcFlowMovingDevice.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowMovingDeviceType")) {
				GetAttributeSubIfcFlowMovingDeviceType GetAttributeSubIfcFlowMovingDeviceType = new GetAttributeSubIfcFlowMovingDeviceType(object, string);
				objectArrayList = GetAttributeSubIfcFlowMovingDeviceType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowSegment")) {
				GetAttributeSubIfcFlowSegment GetAttributeSubIfcFlowSegment = new GetAttributeSubIfcFlowSegment(object, string);
				objectArrayList = GetAttributeSubIfcFlowSegment.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowSegmentType")) {
				GetAttributeSubIfcFlowSegmentType GetAttributeSubIfcFlowSegmentType = new GetAttributeSubIfcFlowSegmentType(object, string);
				objectArrayList = GetAttributeSubIfcFlowSegmentType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowStorageDevice")) {
				GetAttributeSubIfcFlowStorageDevice GetAttributeSubIfcFlowStorageDevice = new GetAttributeSubIfcFlowStorageDevice(object, string);
				objectArrayList = GetAttributeSubIfcFlowStorageDevice.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowStorageDeviceType")) {
				GetAttributeSubIfcFlowStorageDeviceType GetAttributeSubIfcFlowStorageDeviceType = new GetAttributeSubIfcFlowStorageDeviceType(object, string);
				objectArrayList = GetAttributeSubIfcFlowStorageDeviceType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowTerminal")) {
				GetAttributeSubIfcFlowTerminal GetAttributeSubIfcFlowTerminal = new GetAttributeSubIfcFlowTerminal(object, string);
				objectArrayList = GetAttributeSubIfcFlowTerminal.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowTerminalType")) {
				GetAttributeSubIfcFlowTerminalType GetAttributeSubIfcFlowTerminalType = new GetAttributeSubIfcFlowTerminalType(object, string);
				objectArrayList = GetAttributeSubIfcFlowTerminalType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowTreatmentDevice")) {
				GetAttributeSubIfcFlowTreatmentDevice GetAttributeSubIfcFlowTreatmentDevice = new GetAttributeSubIfcFlowTreatmentDevice(object, string);
				objectArrayList = GetAttributeSubIfcFlowTreatmentDevice.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFlowTreatmentDeviceType")) {
				GetAttributeSubIfcFlowTreatmentDeviceType GetAttributeSubIfcFlowTreatmentDeviceType = new GetAttributeSubIfcFlowTreatmentDeviceType(object, string);
				objectArrayList = GetAttributeSubIfcFlowTreatmentDeviceType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFluidFlowProperties")) {
				GetAttributeSubIfcFluidFlowProperties GetAttributeSubIfcFluidFlowProperties = new GetAttributeSubIfcFluidFlowProperties(object, string);
				objectArrayList = GetAttributeSubIfcFluidFlowProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFooting")) {
				GetAttributeSubIfcFooting GetAttributeSubIfcFooting = new GetAttributeSubIfcFooting(object, string);
				objectArrayList = GetAttributeSubIfcFooting.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcForceMeasure")) {
				GetAttributeSubIfcForceMeasure GetAttributeSubIfcForceMeasure = new GetAttributeSubIfcForceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcForceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFrequencyMeasure")) {
				GetAttributeSubIfcFrequencyMeasure GetAttributeSubIfcFrequencyMeasure = new GetAttributeSubIfcFrequencyMeasure(object, string);
				objectArrayList = GetAttributeSubIfcFrequencyMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFuelProperties")) {
				GetAttributeSubIfcFuelProperties GetAttributeSubIfcFuelProperties = new GetAttributeSubIfcFuelProperties(object, string);
				objectArrayList = GetAttributeSubIfcFuelProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFurnishingElement")) {
				GetAttributeSubIfcFurnishingElement GetAttributeSubIfcFurnishingElement = new GetAttributeSubIfcFurnishingElement(object, string);
				objectArrayList = GetAttributeSubIfcFurnishingElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFurnishingElementType")) {
				GetAttributeSubIfcFurnishingElementType GetAttributeSubIfcFurnishingElementType = new GetAttributeSubIfcFurnishingElementType(object, string);
				objectArrayList = GetAttributeSubIfcFurnishingElementType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFurnitureStandard")) {
				GetAttributeSubIfcFurnitureStandard GetAttributeSubIfcFurnitureStandard = new GetAttributeSubIfcFurnitureStandard(object, string);
				objectArrayList = GetAttributeSubIfcFurnitureStandard.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcFurnitureType")) {
				GetAttributeSubIfcFurnitureType GetAttributeSubIfcFurnitureType = new GetAttributeSubIfcFurnitureType(object, string);
				objectArrayList = GetAttributeSubIfcFurnitureType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGasTerminalType")) {
				GetAttributeSubIfcGasTerminalType GetAttributeSubIfcGasTerminalType = new GetAttributeSubIfcGasTerminalType(object, string);
				objectArrayList = GetAttributeSubIfcGasTerminalType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeneralMaterialProperties")) {
				GetAttributeSubIfcGeneralMaterialProperties GetAttributeSubIfcGeneralMaterialProperties = new GetAttributeSubIfcGeneralMaterialProperties(object, string);
				objectArrayList = GetAttributeSubIfcGeneralMaterialProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeneralProfileProperties")) {
				GetAttributeSubIfcGeneralProfileProperties GetAttributeSubIfcGeneralProfileProperties = new GetAttributeSubIfcGeneralProfileProperties(object, string);
				objectArrayList = GetAttributeSubIfcGeneralProfileProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeometricCurveSet")) {
				GetAttributeSubIfcGeometricCurveSet GetAttributeSubIfcGeometricCurveSet = new GetAttributeSubIfcGeometricCurveSet(object, string);
				objectArrayList = GetAttributeSubIfcGeometricCurveSet.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeometricRepresentationContext")) {
				GetAttributeSubIfcGeometricRepresentationContext GetAttributeSubIfcGeometricRepresentationContext = new GetAttributeSubIfcGeometricRepresentationContext(object, string);
				objectArrayList = GetAttributeSubIfcGeometricRepresentationContext.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeometricRepresentationItem")) {
				GetAttributeSubIfcGeometricRepresentationItem GetAttributeSubIfcGeometricRepresentationItem = new GetAttributeSubIfcGeometricRepresentationItem(object, string);
				objectArrayList = GetAttributeSubIfcGeometricRepresentationItem.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeometricRepresentationSubContext")) {
				GetAttributeSubIfcGeometricRepresentationSubContext GetAttributeSubIfcGeometricRepresentationSubContext = new GetAttributeSubIfcGeometricRepresentationSubContext(object, string);
				objectArrayList = GetAttributeSubIfcGeometricRepresentationSubContext.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGeometricSet")) {
				GetAttributeSubIfcGeometricSet GetAttributeSubIfcGeometricSet = new GetAttributeSubIfcGeometricSet(object, string);
				objectArrayList = GetAttributeSubIfcGeometricSet.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGloballyUniqueId")) {
				GetAttributeSubIfcGloballyUniqueId GetAttributeSubIfcGloballyUniqueId = new GetAttributeSubIfcGloballyUniqueId(object, string);
				objectArrayList = GetAttributeSubIfcGloballyUniqueId.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGridAxis")) {
				GetAttributeSubIfcGridAxis GetAttributeSubIfcGridAxis = new GetAttributeSubIfcGridAxis(object, string);
				objectArrayList = GetAttributeSubIfcGridAxis.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGrid")) {
				GetAttributeSubIfcGrid GetAttributeSubIfcGrid = new GetAttributeSubIfcGrid(object, string);
				objectArrayList = GetAttributeSubIfcGrid.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGridPlacement")) {
				GetAttributeSubIfcGridPlacement GetAttributeSubIfcGridPlacement = new GetAttributeSubIfcGridPlacement(object, string);
				objectArrayList = GetAttributeSubIfcGridPlacement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcGroup")) {
				GetAttributeSubIfcGroup GetAttributeSubIfcGroup = new GetAttributeSubIfcGroup(object, string);
				objectArrayList = GetAttributeSubIfcGroup.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHalfSpaceSolid")) {
				GetAttributeSubIfcHalfSpaceSolid GetAttributeSubIfcHalfSpaceSolid = new GetAttributeSubIfcHalfSpaceSolid(object, string);
				objectArrayList = GetAttributeSubIfcHalfSpaceSolid.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHeatExchangerType")) {
				GetAttributeSubIfcHeatExchangerType GetAttributeSubIfcHeatExchangerType = new GetAttributeSubIfcHeatExchangerType(object, string);
				objectArrayList = GetAttributeSubIfcHeatExchangerType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHeatFluxDensityMeasure")) {
				GetAttributeSubIfcHeatFluxDensityMeasure GetAttributeSubIfcHeatFluxDensityMeasure = new GetAttributeSubIfcHeatFluxDensityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcHeatFluxDensityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHeatingValueMeasure")) {
				GetAttributeSubIfcHeatingValueMeasure GetAttributeSubIfcHeatingValueMeasure = new GetAttributeSubIfcHeatingValueMeasure(object, string);
				objectArrayList = GetAttributeSubIfcHeatingValueMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHumidifierType")) {
				GetAttributeSubIfcHumidifierType GetAttributeSubIfcHumidifierType = new GetAttributeSubIfcHumidifierType(object, string);
				objectArrayList = GetAttributeSubIfcHumidifierType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcHygroscopicMaterialProperties")) {
				GetAttributeSubIfcHygroscopicMaterialProperties GetAttributeSubIfcHygroscopicMaterialProperties = new GetAttributeSubIfcHygroscopicMaterialProperties(object, string);
				objectArrayList = GetAttributeSubIfcHygroscopicMaterialProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIShapeProfileDef")) {
				GetAttributeSubIfcIShapeProfileDef GetAttributeSubIfcIShapeProfileDef = new GetAttributeSubIfcIShapeProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcIShapeProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIdentifier")) {
				GetAttributeSubIfcIdentifier GetAttributeSubIfcIdentifier = new GetAttributeSubIfcIdentifier(object, string);
				objectArrayList = GetAttributeSubIfcIdentifier.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIlluminanceMeasure")) {
				GetAttributeSubIfcIlluminanceMeasure GetAttributeSubIfcIlluminanceMeasure = new GetAttributeSubIfcIlluminanceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcIlluminanceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcImageTexture")) {
				GetAttributeSubIfcImageTexture GetAttributeSubIfcImageTexture = new GetAttributeSubIfcImageTexture(object, string);
				objectArrayList = GetAttributeSubIfcImageTexture.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcInductanceMeasure")) {
				GetAttributeSubIfcInductanceMeasure GetAttributeSubIfcInductanceMeasure = new GetAttributeSubIfcInductanceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcInductanceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIntegerCountRateMeasure")) {
				GetAttributeSubIfcIntegerCountRateMeasure GetAttributeSubIfcIntegerCountRateMeasure = new GetAttributeSubIfcIntegerCountRateMeasure(object, string);
				objectArrayList = GetAttributeSubIfcIntegerCountRateMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcInteger")) {
				GetAttributeSubIfcInteger GetAttributeSubIfcInteger = new GetAttributeSubIfcInteger(object, string);
				objectArrayList = GetAttributeSubIfcInteger.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcInventory")) {
				GetAttributeSubIfcInventory GetAttributeSubIfcInventory = new GetAttributeSubIfcInventory(object, string);
				objectArrayList = GetAttributeSubIfcInventory.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIonConcentrationMeasure")) {
				GetAttributeSubIfcIonConcentrationMeasure GetAttributeSubIfcIonConcentrationMeasure = new GetAttributeSubIfcIonConcentrationMeasure(object, string);
				objectArrayList = GetAttributeSubIfcIonConcentrationMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIrregularTimeSeries")) {
				GetAttributeSubIfcIrregularTimeSeries GetAttributeSubIfcIrregularTimeSeries = new GetAttributeSubIfcIrregularTimeSeries(object, string);
				objectArrayList = GetAttributeSubIfcIrregularTimeSeries.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIrregularTimeSeriesValue")) {
				GetAttributeSubIfcIrregularTimeSeriesValue GetAttributeSubIfcIrregularTimeSeriesValue = new GetAttributeSubIfcIrregularTimeSeriesValue(object, string);
				objectArrayList = GetAttributeSubIfcIrregularTimeSeriesValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcIsothermalMoistureCapacityMeasure")) {
				GetAttributeSubIfcIsothermalMoistureCapacityMeasure GetAttributeSubIfcIsothermalMoistureCapacityMeasure = new GetAttributeSubIfcIsothermalMoistureCapacityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcIsothermalMoistureCapacityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcJunctionBoxType")) {
				GetAttributeSubIfcJunctionBoxType GetAttributeSubIfcJunctionBoxType = new GetAttributeSubIfcJunctionBoxType(object, string);
				objectArrayList = GetAttributeSubIfcJunctionBoxType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcKinematicViscosityMeasure")) {
				GetAttributeSubIfcKinematicViscosityMeasure GetAttributeSubIfcKinematicViscosityMeasure = new GetAttributeSubIfcKinematicViscosityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcKinematicViscosityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLShapeProfileDef")) {
				GetAttributeSubIfcLShapeProfileDef GetAttributeSubIfcLShapeProfileDef = new GetAttributeSubIfcLShapeProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcLShapeProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLabel")) {
				GetAttributeSubIfcLabel GetAttributeSubIfcLabel = new GetAttributeSubIfcLabel(object, string);
				objectArrayList = GetAttributeSubIfcLabel.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLaborResource")) {
				GetAttributeSubIfcLaborResource GetAttributeSubIfcLaborResource = new GetAttributeSubIfcLaborResource(object, string);
				objectArrayList = GetAttributeSubIfcLaborResource.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLampType")) {
				GetAttributeSubIfcLampType GetAttributeSubIfcLampType = new GetAttributeSubIfcLampType(object, string);
				objectArrayList = GetAttributeSubIfcLampType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLengthMeasure")) {
				GetAttributeSubIfcLengthMeasure GetAttributeSubIfcLengthMeasure = new GetAttributeSubIfcLengthMeasure(object, string);
				objectArrayList = GetAttributeSubIfcLengthMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLibraryInformation")) {
				GetAttributeSubIfcLibraryInformation GetAttributeSubIfcLibraryInformation = new GetAttributeSubIfcLibraryInformation(object, string);
				objectArrayList = GetAttributeSubIfcLibraryInformation.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLibraryReference")) {
				GetAttributeSubIfcLibraryReference GetAttributeSubIfcLibraryReference = new GetAttributeSubIfcLibraryReference(object, string);
				objectArrayList = GetAttributeSubIfcLibraryReference.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightDistributionData")) {
				GetAttributeSubIfcLightDistributionData GetAttributeSubIfcLightDistributionData = new GetAttributeSubIfcLightDistributionData(object, string);
				objectArrayList = GetAttributeSubIfcLightDistributionData.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightFixtureType")) {
				GetAttributeSubIfcLightFixtureType GetAttributeSubIfcLightFixtureType = new GetAttributeSubIfcLightFixtureType(object, string);
				objectArrayList = GetAttributeSubIfcLightFixtureType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightIntensityDistribution")) {
				GetAttributeSubIfcLightIntensityDistribution GetAttributeSubIfcLightIntensityDistribution = new GetAttributeSubIfcLightIntensityDistribution(object, string);
				objectArrayList = GetAttributeSubIfcLightIntensityDistribution.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSourceAmbient")) {
				GetAttributeSubIfcLightSourceAmbient GetAttributeSubIfcLightSourceAmbient = new GetAttributeSubIfcLightSourceAmbient(object, string);
				objectArrayList = GetAttributeSubIfcLightSourceAmbient.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSourceDirectional")) {
				GetAttributeSubIfcLightSourceDirectional GetAttributeSubIfcLightSourceDirectional = new GetAttributeSubIfcLightSourceDirectional(object, string);
				objectArrayList = GetAttributeSubIfcLightSourceDirectional.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSourceGoniometric")) {
				GetAttributeSubIfcLightSourceGoniometric GetAttributeSubIfcLightSourceGoniometric = new GetAttributeSubIfcLightSourceGoniometric(object, string);
				objectArrayList = GetAttributeSubIfcLightSourceGoniometric.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSource")) {
				GetAttributeSubIfcLightSource GetAttributeSubIfcLightSource = new GetAttributeSubIfcLightSource(object, string);
				objectArrayList = GetAttributeSubIfcLightSource.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSourcePositional")) {
				GetAttributeSubIfcLightSourcePositional GetAttributeSubIfcLightSourcePositional = new GetAttributeSubIfcLightSourcePositional(object, string);
				objectArrayList = GetAttributeSubIfcLightSourcePositional.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLightSourceSpot")) {
				GetAttributeSubIfcLightSourceSpot GetAttributeSubIfcLightSourceSpot = new GetAttributeSubIfcLightSourceSpot(object, string);
				objectArrayList = GetAttributeSubIfcLightSourceSpot.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLine")) {
				GetAttributeSubIfcLine GetAttributeSubIfcLine = new GetAttributeSubIfcLine(object, string);
				objectArrayList = GetAttributeSubIfcLine.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLinearDimension")) {
				GetAttributeSubIfcLinearDimension GetAttributeSubIfcLinearDimension = new GetAttributeSubIfcLinearDimension(object, string);
				objectArrayList = GetAttributeSubIfcLinearDimension.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLinearForceMeasure")) {
				GetAttributeSubIfcLinearForceMeasure GetAttributeSubIfcLinearForceMeasure = new GetAttributeSubIfcLinearForceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcLinearForceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLinearMomentMeasure")) {
				GetAttributeSubIfcLinearMomentMeasure GetAttributeSubIfcLinearMomentMeasure = new GetAttributeSubIfcLinearMomentMeasure(object, string);
				objectArrayList = GetAttributeSubIfcLinearMomentMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLinearStiffnessMeasure")) {
				GetAttributeSubIfcLinearStiffnessMeasure GetAttributeSubIfcLinearStiffnessMeasure = new GetAttributeSubIfcLinearStiffnessMeasure(object, string);
				objectArrayList = GetAttributeSubIfcLinearStiffnessMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLinearVelocityMeasure")) {
				GetAttributeSubIfcLinearVelocityMeasure GetAttributeSubIfcLinearVelocityMeasure = new GetAttributeSubIfcLinearVelocityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcLinearVelocityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLocalPlacement")) {
				GetAttributeSubIfcLocalPlacement GetAttributeSubIfcLocalPlacement = new GetAttributeSubIfcLocalPlacement(object, string);
				objectArrayList = GetAttributeSubIfcLocalPlacement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLocalTime")) {
				GetAttributeSubIfcLocalTime GetAttributeSubIfcLocalTime = new GetAttributeSubIfcLocalTime(object, string);
				objectArrayList = GetAttributeSubIfcLocalTime.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLogical")) {
				GetAttributeSubIfcLogical GetAttributeSubIfcLogical = new GetAttributeSubIfcLogical(object, string);
				objectArrayList = GetAttributeSubIfcLogical.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLoop")) {
				GetAttributeSubIfcLoop GetAttributeSubIfcLoop = new GetAttributeSubIfcLoop(object, string);
				objectArrayList = GetAttributeSubIfcLoop.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLuminousFluxMeasure")) {
				GetAttributeSubIfcLuminousFluxMeasure GetAttributeSubIfcLuminousFluxMeasure = new GetAttributeSubIfcLuminousFluxMeasure(object, string);
				objectArrayList = GetAttributeSubIfcLuminousFluxMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLuminousIntensityDistributionMeasure")) {
				GetAttributeSubIfcLuminousIntensityDistributionMeasure GetAttributeSubIfcLuminousIntensityDistributionMeasure = new GetAttributeSubIfcLuminousIntensityDistributionMeasure(object, string);
				objectArrayList = GetAttributeSubIfcLuminousIntensityDistributionMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcLuminousIntensityMeasure")) {
				GetAttributeSubIfcLuminousIntensityMeasure GetAttributeSubIfcLuminousIntensityMeasure = new GetAttributeSubIfcLuminousIntensityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcLuminousIntensityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMagneticFluxDensityMeasure")) {
				GetAttributeSubIfcMagneticFluxDensityMeasure GetAttributeSubIfcMagneticFluxDensityMeasure = new GetAttributeSubIfcMagneticFluxDensityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcMagneticFluxDensityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMagneticFluxMeasure")) {
				GetAttributeSubIfcMagneticFluxMeasure GetAttributeSubIfcMagneticFluxMeasure = new GetAttributeSubIfcMagneticFluxMeasure(object, string);
				objectArrayList = GetAttributeSubIfcMagneticFluxMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcManifoldSolidBrep")) {
				GetAttributeSubIfcManifoldSolidBrep GetAttributeSubIfcManifoldSolidBrep = new GetAttributeSubIfcManifoldSolidBrep(object, string);
				objectArrayList = GetAttributeSubIfcManifoldSolidBrep.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMappedItem")) {
				GetAttributeSubIfcMappedItem GetAttributeSubIfcMappedItem = new GetAttributeSubIfcMappedItem(object, string);
				objectArrayList = GetAttributeSubIfcMappedItem.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMassDensityMeasure")) {
				GetAttributeSubIfcMassDensityMeasure GetAttributeSubIfcMassDensityMeasure = new GetAttributeSubIfcMassDensityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcMassDensityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMassFlowRateMeasure")) {
				GetAttributeSubIfcMassFlowRateMeasure GetAttributeSubIfcMassFlowRateMeasure = new GetAttributeSubIfcMassFlowRateMeasure(object, string);
				objectArrayList = GetAttributeSubIfcMassFlowRateMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMassMeasure")) {
				GetAttributeSubIfcMassMeasure GetAttributeSubIfcMassMeasure = new GetAttributeSubIfcMassMeasure(object, string);
				objectArrayList = GetAttributeSubIfcMassMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMassPerLengthMeasure")) {
				GetAttributeSubIfcMassPerLengthMeasure GetAttributeSubIfcMassPerLengthMeasure = new GetAttributeSubIfcMassPerLengthMeasure(object, string);
				objectArrayList = GetAttributeSubIfcMassPerLengthMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialClassificationRelationship")) {
				GetAttributeSubIfcMaterialClassificationRelationship GetAttributeSubIfcMaterialClassificationRelationship = new GetAttributeSubIfcMaterialClassificationRelationship(object, string);
				objectArrayList = GetAttributeSubIfcMaterialClassificationRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialDefinitionRepresentation")) {
				GetAttributeSubIfcMaterialDefinitionRepresentation GetAttributeSubIfcMaterialDefinitionRepresentation = new GetAttributeSubIfcMaterialDefinitionRepresentation(object, string);
				objectArrayList = GetAttributeSubIfcMaterialDefinitionRepresentation.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterial")) {
				GetAttributeSubIfcMaterial GetAttributeSubIfcMaterial = new GetAttributeSubIfcMaterial(object, string);
				objectArrayList = GetAttributeSubIfcMaterial.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialLayer")) {
				GetAttributeSubIfcMaterialLayer GetAttributeSubIfcMaterialLayer = new GetAttributeSubIfcMaterialLayer(object, string);
				objectArrayList = GetAttributeSubIfcMaterialLayer.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialLayerSet")) {
				GetAttributeSubIfcMaterialLayerSet GetAttributeSubIfcMaterialLayerSet = new GetAttributeSubIfcMaterialLayerSet(object, string);
				objectArrayList = GetAttributeSubIfcMaterialLayerSet.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialLayerSetUsage")) {
				GetAttributeSubIfcMaterialLayerSetUsage GetAttributeSubIfcMaterialLayerSetUsage = new GetAttributeSubIfcMaterialLayerSetUsage(object, string);
				objectArrayList = GetAttributeSubIfcMaterialLayerSetUsage.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialList")) {
				GetAttributeSubIfcMaterialList GetAttributeSubIfcMaterialList = new GetAttributeSubIfcMaterialList(object, string);
				objectArrayList = GetAttributeSubIfcMaterialList.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMaterialProperties")) {
				GetAttributeSubIfcMaterialProperties GetAttributeSubIfcMaterialProperties = new GetAttributeSubIfcMaterialProperties(object, string);
				objectArrayList = GetAttributeSubIfcMaterialProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMeasureWithUnit")) {
				GetAttributeSubIfcMeasureWithUnit GetAttributeSubIfcMeasureWithUnit = new GetAttributeSubIfcMeasureWithUnit(object, string);
				objectArrayList = GetAttributeSubIfcMeasureWithUnit.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMechanicalConcreteMaterialProperties")) {
				GetAttributeSubIfcMechanicalConcreteMaterialProperties GetAttributeSubIfcMechanicalConcreteMaterialProperties = new GetAttributeSubIfcMechanicalConcreteMaterialProperties(object, string);
				objectArrayList = GetAttributeSubIfcMechanicalConcreteMaterialProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMechanicalFastener")) {
				GetAttributeSubIfcMechanicalFastener GetAttributeSubIfcMechanicalFastener = new GetAttributeSubIfcMechanicalFastener(object, string);
				objectArrayList = GetAttributeSubIfcMechanicalFastener.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMechanicalFastenerType")) {
				GetAttributeSubIfcMechanicalFastenerType GetAttributeSubIfcMechanicalFastenerType = new GetAttributeSubIfcMechanicalFastenerType(object, string);
				objectArrayList = GetAttributeSubIfcMechanicalFastenerType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMechanicalMaterialProperties")) {
				GetAttributeSubIfcMechanicalMaterialProperties GetAttributeSubIfcMechanicalMaterialProperties = new GetAttributeSubIfcMechanicalMaterialProperties(object, string);
				objectArrayList = GetAttributeSubIfcMechanicalMaterialProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMechanicalSteelMaterialProperties")) {
				GetAttributeSubIfcMechanicalSteelMaterialProperties GetAttributeSubIfcMechanicalSteelMaterialProperties = new GetAttributeSubIfcMechanicalSteelMaterialProperties(object, string);
				objectArrayList = GetAttributeSubIfcMechanicalSteelMaterialProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMember")) {
				GetAttributeSubIfcMember GetAttributeSubIfcMember = new GetAttributeSubIfcMember(object, string);
				objectArrayList = GetAttributeSubIfcMember.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMemberType")) {
				GetAttributeSubIfcMemberType GetAttributeSubIfcMemberType = new GetAttributeSubIfcMemberType(object, string);
				objectArrayList = GetAttributeSubIfcMemberType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMetric")) {
				GetAttributeSubIfcMetric GetAttributeSubIfcMetric = new GetAttributeSubIfcMetric(object, string);
				objectArrayList = GetAttributeSubIfcMetric.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcModulusOfElasticityMeasure")) {
				GetAttributeSubIfcModulusOfElasticityMeasure GetAttributeSubIfcModulusOfElasticityMeasure = new GetAttributeSubIfcModulusOfElasticityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcModulusOfElasticityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcModulusOfLinearSubgradeReactionMeasure")) {
				GetAttributeSubIfcModulusOfLinearSubgradeReactionMeasure GetAttributeSubIfcModulusOfLinearSubgradeReactionMeasure = new GetAttributeSubIfcModulusOfLinearSubgradeReactionMeasure(object, string);
				objectArrayList = GetAttributeSubIfcModulusOfLinearSubgradeReactionMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcModulusOfRotationalSubgradeReactionMeasure")) {
				GetAttributeSubIfcModulusOfRotationalSubgradeReactionMeasure GetAttributeSubIfcModulusOfRotationalSubgradeReactionMeasure = new GetAttributeSubIfcModulusOfRotationalSubgradeReactionMeasure(object, string);
				objectArrayList = GetAttributeSubIfcModulusOfRotationalSubgradeReactionMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcModulusOfSubgradeReactionMeasure")) {
				GetAttributeSubIfcModulusOfSubgradeReactionMeasure GetAttributeSubIfcModulusOfSubgradeReactionMeasure = new GetAttributeSubIfcModulusOfSubgradeReactionMeasure(object, string);
				objectArrayList = GetAttributeSubIfcModulusOfSubgradeReactionMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMoistureDiffusivityMeasure")) {
				GetAttributeSubIfcMoistureDiffusivityMeasure GetAttributeSubIfcMoistureDiffusivityMeasure = new GetAttributeSubIfcMoistureDiffusivityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcMoistureDiffusivityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMolecularWeightMeasure")) {
				GetAttributeSubIfcMolecularWeightMeasure GetAttributeSubIfcMolecularWeightMeasure = new GetAttributeSubIfcMolecularWeightMeasure(object, string);
				objectArrayList = GetAttributeSubIfcMolecularWeightMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMomentOfInertiaMeasure")) {
				GetAttributeSubIfcMomentOfInertiaMeasure GetAttributeSubIfcMomentOfInertiaMeasure = new GetAttributeSubIfcMomentOfInertiaMeasure(object, string);
				objectArrayList = GetAttributeSubIfcMomentOfInertiaMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMonetaryMeasure")) {
				GetAttributeSubIfcMonetaryMeasure GetAttributeSubIfcMonetaryMeasure = new GetAttributeSubIfcMonetaryMeasure(object, string);
				objectArrayList = GetAttributeSubIfcMonetaryMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMonetaryUnit")) {
				GetAttributeSubIfcMonetaryUnit GetAttributeSubIfcMonetaryUnit = new GetAttributeSubIfcMonetaryUnit(object, string);
				objectArrayList = GetAttributeSubIfcMonetaryUnit.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMotorConnectionType")) {
				GetAttributeSubIfcMotorConnectionType GetAttributeSubIfcMotorConnectionType = new GetAttributeSubIfcMotorConnectionType(object, string);
				objectArrayList = GetAttributeSubIfcMotorConnectionType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcMove")) {
				GetAttributeSubIfcMove GetAttributeSubIfcMove = new GetAttributeSubIfcMove(object, string);
				objectArrayList = GetAttributeSubIfcMove.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcNamedUnit")) {
				GetAttributeSubIfcNamedUnit GetAttributeSubIfcNamedUnit = new GetAttributeSubIfcNamedUnit(object, string);
				objectArrayList = GetAttributeSubIfcNamedUnit.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcNormalisedRatioMeasure")) {
				GetAttributeSubIfcNormalisedRatioMeasure GetAttributeSubIfcNormalisedRatioMeasure = new GetAttributeSubIfcNormalisedRatioMeasure(object, string);
				objectArrayList = GetAttributeSubIfcNormalisedRatioMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcNumericMeasure")) {
				GetAttributeSubIfcNumericMeasure GetAttributeSubIfcNumericMeasure = new GetAttributeSubIfcNumericMeasure(object, string);
				objectArrayList = GetAttributeSubIfcNumericMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcObjectDefinition")) {
				GetAttributeSubIfcObjectDefinition GetAttributeSubIfcObjectDefinition = new GetAttributeSubIfcObjectDefinition(object, string);
				objectArrayList = GetAttributeSubIfcObjectDefinition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcObject")) {
				GetAttributeSubIfcObject GetAttributeSubIfcObject = new GetAttributeSubIfcObject(object, string);
				objectArrayList = GetAttributeSubIfcObject.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcObjectPlacement")) {
				GetAttributeSubIfcObjectPlacement GetAttributeSubIfcObjectPlacement = new GetAttributeSubIfcObjectPlacement(object, string);
				objectArrayList = GetAttributeSubIfcObjectPlacement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcObjective")) {
				GetAttributeSubIfcObjective GetAttributeSubIfcObjective = new GetAttributeSubIfcObjective(object, string);
				objectArrayList = GetAttributeSubIfcObjective.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOccupant")) {
				GetAttributeSubIfcOccupant GetAttributeSubIfcOccupant = new GetAttributeSubIfcOccupant(object, string);
				objectArrayList = GetAttributeSubIfcOccupant.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOffsetCurve2D")) {
				GetAttributeSubIfcOffsetCurve2D GetAttributeSubIfcOffsetCurve2D = new GetAttributeSubIfcOffsetCurve2D(object, string);
				objectArrayList = GetAttributeSubIfcOffsetCurve2D.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOffsetCurve3D")) {
				GetAttributeSubIfcOffsetCurve3D GetAttributeSubIfcOffsetCurve3D = new GetAttributeSubIfcOffsetCurve3D(object, string);
				objectArrayList = GetAttributeSubIfcOffsetCurve3D.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOneDirectionRepeatFactor")) {
				GetAttributeSubIfcOneDirectionRepeatFactor GetAttributeSubIfcOneDirectionRepeatFactor = new GetAttributeSubIfcOneDirectionRepeatFactor(object, string);
				objectArrayList = GetAttributeSubIfcOneDirectionRepeatFactor.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOpenShell")) {
				GetAttributeSubIfcOpenShell GetAttributeSubIfcOpenShell = new GetAttributeSubIfcOpenShell(object, string);
				objectArrayList = GetAttributeSubIfcOpenShell.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOpeningElement")) {
				GetAttributeSubIfcOpeningElement GetAttributeSubIfcOpeningElement = new GetAttributeSubIfcOpeningElement(object, string);
				objectArrayList = GetAttributeSubIfcOpeningElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOpticalMaterialProperties")) {
				GetAttributeSubIfcOpticalMaterialProperties GetAttributeSubIfcOpticalMaterialProperties = new GetAttributeSubIfcOpticalMaterialProperties(object, string);
				objectArrayList = GetAttributeSubIfcOpticalMaterialProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOrderAction")) {
				GetAttributeSubIfcOrderAction GetAttributeSubIfcOrderAction = new GetAttributeSubIfcOrderAction(object, string);
				objectArrayList = GetAttributeSubIfcOrderAction.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOrganization")) {
				GetAttributeSubIfcOrganization GetAttributeSubIfcOrganization = new GetAttributeSubIfcOrganization(object, string);
				objectArrayList = GetAttributeSubIfcOrganization.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOrganizationRelationship")) {
				GetAttributeSubIfcOrganizationRelationship GetAttributeSubIfcOrganizationRelationship = new GetAttributeSubIfcOrganizationRelationship(object, string);
				objectArrayList = GetAttributeSubIfcOrganizationRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOrientedEdge")) {
				GetAttributeSubIfcOrientedEdge GetAttributeSubIfcOrientedEdge = new GetAttributeSubIfcOrientedEdge(object, string);
				objectArrayList = GetAttributeSubIfcOrientedEdge.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOutletType")) {
				GetAttributeSubIfcOutletType GetAttributeSubIfcOutletType = new GetAttributeSubIfcOutletType(object, string);
				objectArrayList = GetAttributeSubIfcOutletType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcOwnerHistory")) {
				GetAttributeSubIfcOwnerHistory GetAttributeSubIfcOwnerHistory = new GetAttributeSubIfcOwnerHistory(object, string);
				objectArrayList = GetAttributeSubIfcOwnerHistory.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPHMeasure")) {
				GetAttributeSubIfcPHMeasure GetAttributeSubIfcPHMeasure = new GetAttributeSubIfcPHMeasure(object, string);
				objectArrayList = GetAttributeSubIfcPHMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcParameterValue")) {
				GetAttributeSubIfcParameterValue GetAttributeSubIfcParameterValue = new GetAttributeSubIfcParameterValue(object, string);
				objectArrayList = GetAttributeSubIfcParameterValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcParameterizedProfileDef")) {
				GetAttributeSubIfcParameterizedProfileDef GetAttributeSubIfcParameterizedProfileDef = new GetAttributeSubIfcParameterizedProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcParameterizedProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPath")) {
				GetAttributeSubIfcPath GetAttributeSubIfcPath = new GetAttributeSubIfcPath(object, string);
				objectArrayList = GetAttributeSubIfcPath.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPerformanceHistory")) {
				GetAttributeSubIfcPerformanceHistory GetAttributeSubIfcPerformanceHistory = new GetAttributeSubIfcPerformanceHistory(object, string);
				objectArrayList = GetAttributeSubIfcPerformanceHistory.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPermeableCoveringProperties")) {
				GetAttributeSubIfcPermeableCoveringProperties GetAttributeSubIfcPermeableCoveringProperties = new GetAttributeSubIfcPermeableCoveringProperties(object, string);
				objectArrayList = GetAttributeSubIfcPermeableCoveringProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPermit")) {
				GetAttributeSubIfcPermit GetAttributeSubIfcPermit = new GetAttributeSubIfcPermit(object, string);
				objectArrayList = GetAttributeSubIfcPermit.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPersonAndOrganization")) {
				GetAttributeSubIfcPersonAndOrganization GetAttributeSubIfcPersonAndOrganization = new GetAttributeSubIfcPersonAndOrganization(object, string);
				objectArrayList = GetAttributeSubIfcPersonAndOrganization.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPerson")) {
				GetAttributeSubIfcPerson GetAttributeSubIfcPerson = new GetAttributeSubIfcPerson(object, string);
				objectArrayList = GetAttributeSubIfcPerson.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPhysicalComplexQuantity")) {
				GetAttributeSubIfcPhysicalComplexQuantity GetAttributeSubIfcPhysicalComplexQuantity = new GetAttributeSubIfcPhysicalComplexQuantity(object, string);
				objectArrayList = GetAttributeSubIfcPhysicalComplexQuantity.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPhysicalQuantity")) {
				GetAttributeSubIfcPhysicalQuantity GetAttributeSubIfcPhysicalQuantity = new GetAttributeSubIfcPhysicalQuantity(object, string);
				objectArrayList = GetAttributeSubIfcPhysicalQuantity.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPhysicalSimpleQuantity")) {
				GetAttributeSubIfcPhysicalSimpleQuantity GetAttributeSubIfcPhysicalSimpleQuantity = new GetAttributeSubIfcPhysicalSimpleQuantity(object, string);
				objectArrayList = GetAttributeSubIfcPhysicalSimpleQuantity.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPile")) {
				GetAttributeSubIfcPile GetAttributeSubIfcPile = new GetAttributeSubIfcPile(object, string);
				objectArrayList = GetAttributeSubIfcPile.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPipeFittingType")) {
				GetAttributeSubIfcPipeFittingType GetAttributeSubIfcPipeFittingType = new GetAttributeSubIfcPipeFittingType(object, string);
				objectArrayList = GetAttributeSubIfcPipeFittingType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPipeSegmentType")) {
				GetAttributeSubIfcPipeSegmentType GetAttributeSubIfcPipeSegmentType = new GetAttributeSubIfcPipeSegmentType(object, string);
				objectArrayList = GetAttributeSubIfcPipeSegmentType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPixelTexture")) {
				GetAttributeSubIfcPixelTexture GetAttributeSubIfcPixelTexture = new GetAttributeSubIfcPixelTexture(object, string);
				objectArrayList = GetAttributeSubIfcPixelTexture.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlacement")) {
				GetAttributeSubIfcPlacement GetAttributeSubIfcPlacement = new GetAttributeSubIfcPlacement(object, string);
				objectArrayList = GetAttributeSubIfcPlacement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlanarBox")) {
				GetAttributeSubIfcPlanarBox GetAttributeSubIfcPlanarBox = new GetAttributeSubIfcPlanarBox(object, string);
				objectArrayList = GetAttributeSubIfcPlanarBox.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlanarExtent")) {
				GetAttributeSubIfcPlanarExtent GetAttributeSubIfcPlanarExtent = new GetAttributeSubIfcPlanarExtent(object, string);
				objectArrayList = GetAttributeSubIfcPlanarExtent.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlanarForceMeasure")) {
				GetAttributeSubIfcPlanarForceMeasure GetAttributeSubIfcPlanarForceMeasure = new GetAttributeSubIfcPlanarForceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcPlanarForceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlaneAngleMeasure")) {
				GetAttributeSubIfcPlaneAngleMeasure GetAttributeSubIfcPlaneAngleMeasure = new GetAttributeSubIfcPlaneAngleMeasure(object, string);
				objectArrayList = GetAttributeSubIfcPlaneAngleMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlane")) {
				GetAttributeSubIfcPlane GetAttributeSubIfcPlane = new GetAttributeSubIfcPlane(object, string);
				objectArrayList = GetAttributeSubIfcPlane.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlate")) {
				GetAttributeSubIfcPlate GetAttributeSubIfcPlate = new GetAttributeSubIfcPlate(object, string);
				objectArrayList = GetAttributeSubIfcPlate.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPlateType")) {
				GetAttributeSubIfcPlateType GetAttributeSubIfcPlateType = new GetAttributeSubIfcPlateType(object, string);
				objectArrayList = GetAttributeSubIfcPlateType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPoint")) {
				GetAttributeSubIfcPoint GetAttributeSubIfcPoint = new GetAttributeSubIfcPoint(object, string);
				objectArrayList = GetAttributeSubIfcPoint.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPointOnCurve")) {
				GetAttributeSubIfcPointOnCurve GetAttributeSubIfcPointOnCurve = new GetAttributeSubIfcPointOnCurve(object, string);
				objectArrayList = GetAttributeSubIfcPointOnCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPointOnSurface")) {
				GetAttributeSubIfcPointOnSurface GetAttributeSubIfcPointOnSurface = new GetAttributeSubIfcPointOnSurface(object, string);
				objectArrayList = GetAttributeSubIfcPointOnSurface.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPolyLoop")) {
				GetAttributeSubIfcPolyLoop GetAttributeSubIfcPolyLoop = new GetAttributeSubIfcPolyLoop(object, string);
				objectArrayList = GetAttributeSubIfcPolyLoop.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPolygonalBoundedHalfSpace")) {
				GetAttributeSubIfcPolygonalBoundedHalfSpace GetAttributeSubIfcPolygonalBoundedHalfSpace = new GetAttributeSubIfcPolygonalBoundedHalfSpace(object, string);
				objectArrayList = GetAttributeSubIfcPolygonalBoundedHalfSpace.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPolyline")) {
				GetAttributeSubIfcPolyline GetAttributeSubIfcPolyline = new GetAttributeSubIfcPolyline(object, string);
				objectArrayList = GetAttributeSubIfcPolyline.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPort")) {
				GetAttributeSubIfcPort GetAttributeSubIfcPort = new GetAttributeSubIfcPort(object, string);
				objectArrayList = GetAttributeSubIfcPort.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPositiveLengthMeasure")) {
				GetAttributeSubIfcPositiveLengthMeasure GetAttributeSubIfcPositiveLengthMeasure = new GetAttributeSubIfcPositiveLengthMeasure(object, string);
				objectArrayList = GetAttributeSubIfcPositiveLengthMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPositivePlaneAngleMeasure")) {
				GetAttributeSubIfcPositivePlaneAngleMeasure GetAttributeSubIfcPositivePlaneAngleMeasure = new GetAttributeSubIfcPositivePlaneAngleMeasure(object, string);
				objectArrayList = GetAttributeSubIfcPositivePlaneAngleMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPositiveRatioMeasure")) {
				GetAttributeSubIfcPositiveRatioMeasure GetAttributeSubIfcPositiveRatioMeasure = new GetAttributeSubIfcPositiveRatioMeasure(object, string);
				objectArrayList = GetAttributeSubIfcPositiveRatioMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPostalAddress")) {
				GetAttributeSubIfcPostalAddress GetAttributeSubIfcPostalAddress = new GetAttributeSubIfcPostalAddress(object, string);
				objectArrayList = GetAttributeSubIfcPostalAddress.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPowerMeasure")) {
				GetAttributeSubIfcPowerMeasure GetAttributeSubIfcPowerMeasure = new GetAttributeSubIfcPowerMeasure(object, string);
				objectArrayList = GetAttributeSubIfcPowerMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedColour")) {
				GetAttributeSubIfcPreDefinedColour GetAttributeSubIfcPreDefinedColour = new GetAttributeSubIfcPreDefinedColour(object, string);
				objectArrayList = GetAttributeSubIfcPreDefinedColour.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedCurveFont")) {
				GetAttributeSubIfcPreDefinedCurveFont GetAttributeSubIfcPreDefinedCurveFont = new GetAttributeSubIfcPreDefinedCurveFont(object, string);
				objectArrayList = GetAttributeSubIfcPreDefinedCurveFont.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedDimensionSymbol")) {
				GetAttributeSubIfcPreDefinedDimensionSymbol GetAttributeSubIfcPreDefinedDimensionSymbol = new GetAttributeSubIfcPreDefinedDimensionSymbol(object, string);
				objectArrayList = GetAttributeSubIfcPreDefinedDimensionSymbol.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedItem")) {
				GetAttributeSubIfcPreDefinedItem GetAttributeSubIfcPreDefinedItem = new GetAttributeSubIfcPreDefinedItem(object, string);
				objectArrayList = GetAttributeSubIfcPreDefinedItem.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedPointMarkerSymbol")) {
				GetAttributeSubIfcPreDefinedPointMarkerSymbol GetAttributeSubIfcPreDefinedPointMarkerSymbol = new GetAttributeSubIfcPreDefinedPointMarkerSymbol(object, string);
				objectArrayList = GetAttributeSubIfcPreDefinedPointMarkerSymbol.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedSymbol")) {
				GetAttributeSubIfcPreDefinedSymbol GetAttributeSubIfcPreDefinedSymbol = new GetAttributeSubIfcPreDefinedSymbol(object, string);
				objectArrayList = GetAttributeSubIfcPreDefinedSymbol.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedTerminatorSymbol")) {
				GetAttributeSubIfcPreDefinedTerminatorSymbol GetAttributeSubIfcPreDefinedTerminatorSymbol = new GetAttributeSubIfcPreDefinedTerminatorSymbol(object, string);
				objectArrayList = GetAttributeSubIfcPreDefinedTerminatorSymbol.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPreDefinedTextFont")) {
				GetAttributeSubIfcPreDefinedTextFont GetAttributeSubIfcPreDefinedTextFont = new GetAttributeSubIfcPreDefinedTextFont(object, string);
				objectArrayList = GetAttributeSubIfcPreDefinedTextFont.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPresentationLayerAssignment")) {
				GetAttributeSubIfcPresentationLayerAssignment GetAttributeSubIfcPresentationLayerAssignment = new GetAttributeSubIfcPresentationLayerAssignment(object, string);
				objectArrayList = GetAttributeSubIfcPresentationLayerAssignment.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPresentationLayerWithStyle")) {
				GetAttributeSubIfcPresentationLayerWithStyle GetAttributeSubIfcPresentationLayerWithStyle = new GetAttributeSubIfcPresentationLayerWithStyle(object, string);
				objectArrayList = GetAttributeSubIfcPresentationLayerWithStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPresentationStyleAssignment")) {
				GetAttributeSubIfcPresentationStyleAssignment GetAttributeSubIfcPresentationStyleAssignment = new GetAttributeSubIfcPresentationStyleAssignment(object, string);
				objectArrayList = GetAttributeSubIfcPresentationStyleAssignment.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPresentationStyle")) {
				GetAttributeSubIfcPresentationStyle GetAttributeSubIfcPresentationStyle = new GetAttributeSubIfcPresentationStyle(object, string);
				objectArrayList = GetAttributeSubIfcPresentationStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPressureMeasure")) {
				GetAttributeSubIfcPressureMeasure GetAttributeSubIfcPressureMeasure = new GetAttributeSubIfcPressureMeasure(object, string);
				objectArrayList = GetAttributeSubIfcPressureMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProcedure")) {
				GetAttributeSubIfcProcedure GetAttributeSubIfcProcedure = new GetAttributeSubIfcProcedure(object, string);
				objectArrayList = GetAttributeSubIfcProcedure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProcess")) {
				GetAttributeSubIfcProcess GetAttributeSubIfcProcess = new GetAttributeSubIfcProcess(object, string);
				objectArrayList = GetAttributeSubIfcProcess.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProductDefinitionShape")) {
				GetAttributeSubIfcProductDefinitionShape GetAttributeSubIfcProductDefinitionShape = new GetAttributeSubIfcProductDefinitionShape(object, string);
				objectArrayList = GetAttributeSubIfcProductDefinitionShape.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProduct")) {
				GetAttributeSubIfcProduct GetAttributeSubIfcProduct = new GetAttributeSubIfcProduct(object, string);
				objectArrayList = GetAttributeSubIfcProduct.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProductRepresentation")) {
				GetAttributeSubIfcProductRepresentation GetAttributeSubIfcProductRepresentation = new GetAttributeSubIfcProductRepresentation(object, string);
				objectArrayList = GetAttributeSubIfcProductRepresentation.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProductsOfCombustionProperties")) {
				GetAttributeSubIfcProductsOfCombustionProperties GetAttributeSubIfcProductsOfCombustionProperties = new GetAttributeSubIfcProductsOfCombustionProperties(object, string);
				objectArrayList = GetAttributeSubIfcProductsOfCombustionProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProfileDef")) {
				GetAttributeSubIfcProfileDef GetAttributeSubIfcProfileDef = new GetAttributeSubIfcProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProfileProperties")) {
				GetAttributeSubIfcProfileProperties GetAttributeSubIfcProfileProperties = new GetAttributeSubIfcProfileProperties(object, string);
				objectArrayList = GetAttributeSubIfcProfileProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProject")) {
				GetAttributeSubIfcProject GetAttributeSubIfcProject = new GetAttributeSubIfcProject(object, string);
				objectArrayList = GetAttributeSubIfcProject.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProjectOrder")) {
				GetAttributeSubIfcProjectOrder GetAttributeSubIfcProjectOrder = new GetAttributeSubIfcProjectOrder(object, string);
				objectArrayList = GetAttributeSubIfcProjectOrder.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProjectOrderRecord")) {
				GetAttributeSubIfcProjectOrderRecord GetAttributeSubIfcProjectOrderRecord = new GetAttributeSubIfcProjectOrderRecord(object, string);
				objectArrayList = GetAttributeSubIfcProjectOrderRecord.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProjectionCurve")) {
				GetAttributeSubIfcProjectionCurve GetAttributeSubIfcProjectionCurve = new GetAttributeSubIfcProjectionCurve(object, string);
				objectArrayList = GetAttributeSubIfcProjectionCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProjectionElement")) {
				GetAttributeSubIfcProjectionElement GetAttributeSubIfcProjectionElement = new GetAttributeSubIfcProjectionElement(object, string);
				objectArrayList = GetAttributeSubIfcProjectionElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyBoundedValue")) {
				GetAttributeSubIfcPropertyBoundedValue GetAttributeSubIfcPropertyBoundedValue = new GetAttributeSubIfcPropertyBoundedValue(object, string);
				objectArrayList = GetAttributeSubIfcPropertyBoundedValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyConstraintRelationship")) {
				GetAttributeSubIfcPropertyConstraintRelationship GetAttributeSubIfcPropertyConstraintRelationship = new GetAttributeSubIfcPropertyConstraintRelationship(object, string);
				objectArrayList = GetAttributeSubIfcPropertyConstraintRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyDefinition")) {
				GetAttributeSubIfcPropertyDefinition GetAttributeSubIfcPropertyDefinition = new GetAttributeSubIfcPropertyDefinition(object, string);
				objectArrayList = GetAttributeSubIfcPropertyDefinition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyDependencyRelationship")) {
				GetAttributeSubIfcPropertyDependencyRelationship GetAttributeSubIfcPropertyDependencyRelationship = new GetAttributeSubIfcPropertyDependencyRelationship(object, string);
				objectArrayList = GetAttributeSubIfcPropertyDependencyRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyEnumeratedValue")) {
				GetAttributeSubIfcPropertyEnumeratedValue GetAttributeSubIfcPropertyEnumeratedValue = new GetAttributeSubIfcPropertyEnumeratedValue(object, string);
				objectArrayList = GetAttributeSubIfcPropertyEnumeratedValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyEnumeration")) {
				GetAttributeSubIfcPropertyEnumeration GetAttributeSubIfcPropertyEnumeration = new GetAttributeSubIfcPropertyEnumeration(object, string);
				objectArrayList = GetAttributeSubIfcPropertyEnumeration.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProperty")) {
				GetAttributeSubIfcProperty GetAttributeSubIfcProperty = new GetAttributeSubIfcProperty(object, string);
				objectArrayList = GetAttributeSubIfcProperty.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyListValue")) {
				GetAttributeSubIfcPropertyListValue GetAttributeSubIfcPropertyListValue = new GetAttributeSubIfcPropertyListValue(object, string);
				objectArrayList = GetAttributeSubIfcPropertyListValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyReferenceValue")) {
				GetAttributeSubIfcPropertyReferenceValue GetAttributeSubIfcPropertyReferenceValue = new GetAttributeSubIfcPropertyReferenceValue(object, string);
				objectArrayList = GetAttributeSubIfcPropertyReferenceValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertySetDefinition")) {
				GetAttributeSubIfcPropertySetDefinition GetAttributeSubIfcPropertySetDefinition = new GetAttributeSubIfcPropertySetDefinition(object, string);
				objectArrayList = GetAttributeSubIfcPropertySetDefinition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertySet")) {
				GetAttributeSubIfcPropertySet GetAttributeSubIfcPropertySet = new GetAttributeSubIfcPropertySet(object, string);
				objectArrayList = GetAttributeSubIfcPropertySet.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertySingleValue")) {
				GetAttributeSubIfcPropertySingleValue GetAttributeSubIfcPropertySingleValue = new GetAttributeSubIfcPropertySingleValue(object, string);
				objectArrayList = GetAttributeSubIfcPropertySingleValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPropertyTableValue")) {
				GetAttributeSubIfcPropertyTableValue GetAttributeSubIfcPropertyTableValue = new GetAttributeSubIfcPropertyTableValue(object, string);
				objectArrayList = GetAttributeSubIfcPropertyTableValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProtectiveDeviceType")) {
				GetAttributeSubIfcProtectiveDeviceType GetAttributeSubIfcProtectiveDeviceType = new GetAttributeSubIfcProtectiveDeviceType(object, string);
				objectArrayList = GetAttributeSubIfcProtectiveDeviceType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcProxy")) {
				GetAttributeSubIfcProxy GetAttributeSubIfcProxy = new GetAttributeSubIfcProxy(object, string);
				objectArrayList = GetAttributeSubIfcProxy.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcPumpType")) {
				GetAttributeSubIfcPumpType GetAttributeSubIfcPumpType = new GetAttributeSubIfcPumpType(object, string);
				objectArrayList = GetAttributeSubIfcPumpType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityArea")) {
				GetAttributeSubIfcQuantityArea GetAttributeSubIfcQuantityArea = new GetAttributeSubIfcQuantityArea(object, string);
				objectArrayList = GetAttributeSubIfcQuantityArea.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityCount")) {
				GetAttributeSubIfcQuantityCount GetAttributeSubIfcQuantityCount = new GetAttributeSubIfcQuantityCount(object, string);
				objectArrayList = GetAttributeSubIfcQuantityCount.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityLength")) {
				GetAttributeSubIfcQuantityLength GetAttributeSubIfcQuantityLength = new GetAttributeSubIfcQuantityLength(object, string);
				objectArrayList = GetAttributeSubIfcQuantityLength.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityTime")) {
				GetAttributeSubIfcQuantityTime GetAttributeSubIfcQuantityTime = new GetAttributeSubIfcQuantityTime(object, string);
				objectArrayList = GetAttributeSubIfcQuantityTime.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityVolume")) {
				GetAttributeSubIfcQuantityVolume GetAttributeSubIfcQuantityVolume = new GetAttributeSubIfcQuantityVolume(object, string);
				objectArrayList = GetAttributeSubIfcQuantityVolume.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcQuantityWeight")) {
				GetAttributeSubIfcQuantityWeight GetAttributeSubIfcQuantityWeight = new GetAttributeSubIfcQuantityWeight(object, string);
				objectArrayList = GetAttributeSubIfcQuantityWeight.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRadioActivityMeasure")) {
				GetAttributeSubIfcRadioActivityMeasure GetAttributeSubIfcRadioActivityMeasure = new GetAttributeSubIfcRadioActivityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcRadioActivityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRadiusDimension")) {
				GetAttributeSubIfcRadiusDimension GetAttributeSubIfcRadiusDimension = new GetAttributeSubIfcRadiusDimension(object, string);
				objectArrayList = GetAttributeSubIfcRadiusDimension.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRailing")) {
				GetAttributeSubIfcRailing GetAttributeSubIfcRailing = new GetAttributeSubIfcRailing(object, string);
				objectArrayList = GetAttributeSubIfcRailing.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRailingType")) {
				GetAttributeSubIfcRailingType GetAttributeSubIfcRailingType = new GetAttributeSubIfcRailingType(object, string);
				objectArrayList = GetAttributeSubIfcRailingType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRampFlight")) {
				GetAttributeSubIfcRampFlight GetAttributeSubIfcRampFlight = new GetAttributeSubIfcRampFlight(object, string);
				objectArrayList = GetAttributeSubIfcRampFlight.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRampFlightType")) {
				GetAttributeSubIfcRampFlightType GetAttributeSubIfcRampFlightType = new GetAttributeSubIfcRampFlightType(object, string);
				objectArrayList = GetAttributeSubIfcRampFlightType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRamp")) {
				GetAttributeSubIfcRamp GetAttributeSubIfcRamp = new GetAttributeSubIfcRamp(object, string);
				objectArrayList = GetAttributeSubIfcRamp.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRatioMeasure")) {
				GetAttributeSubIfcRatioMeasure GetAttributeSubIfcRatioMeasure = new GetAttributeSubIfcRatioMeasure(object, string);
				objectArrayList = GetAttributeSubIfcRatioMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRationalBezierCurve")) {
				GetAttributeSubIfcRationalBezierCurve GetAttributeSubIfcRationalBezierCurve = new GetAttributeSubIfcRationalBezierCurve(object, string);
				objectArrayList = GetAttributeSubIfcRationalBezierCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReal")) {
				GetAttributeSubIfcReal GetAttributeSubIfcReal = new GetAttributeSubIfcReal(object, string);
				objectArrayList = GetAttributeSubIfcReal.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRectangleHollowProfileDef")) {
				GetAttributeSubIfcRectangleHollowProfileDef GetAttributeSubIfcRectangleHollowProfileDef = new GetAttributeSubIfcRectangleHollowProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcRectangleHollowProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRectangleProfileDef")) {
				GetAttributeSubIfcRectangleProfileDef GetAttributeSubIfcRectangleProfileDef = new GetAttributeSubIfcRectangleProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcRectangleProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRectangularPyramid")) {
				GetAttributeSubIfcRectangularPyramid GetAttributeSubIfcRectangularPyramid = new GetAttributeSubIfcRectangularPyramid(object, string);
				objectArrayList = GetAttributeSubIfcRectangularPyramid.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRectangularTrimmedSurface")) {
				GetAttributeSubIfcRectangularTrimmedSurface GetAttributeSubIfcRectangularTrimmedSurface = new GetAttributeSubIfcRectangularTrimmedSurface(object, string);
				objectArrayList = GetAttributeSubIfcRectangularTrimmedSurface.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReferencesValueDocument")) {
				GetAttributeSubIfcReferencesValueDocument GetAttributeSubIfcReferencesValueDocument = new GetAttributeSubIfcReferencesValueDocument(object, string);
				objectArrayList = GetAttributeSubIfcReferencesValueDocument.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRegularTimeSeries")) {
				GetAttributeSubIfcRegularTimeSeries GetAttributeSubIfcRegularTimeSeries = new GetAttributeSubIfcRegularTimeSeries(object, string);
				objectArrayList = GetAttributeSubIfcRegularTimeSeries.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReinforcementBarProperties")) {
				GetAttributeSubIfcReinforcementBarProperties GetAttributeSubIfcReinforcementBarProperties = new GetAttributeSubIfcReinforcementBarProperties(object, string);
				objectArrayList = GetAttributeSubIfcReinforcementBarProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReinforcementDefinitionProperties")) {
				GetAttributeSubIfcReinforcementDefinitionProperties GetAttributeSubIfcReinforcementDefinitionProperties = new GetAttributeSubIfcReinforcementDefinitionProperties(object, string);
				objectArrayList = GetAttributeSubIfcReinforcementDefinitionProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReinforcingBar")) {
				GetAttributeSubIfcReinforcingBar GetAttributeSubIfcReinforcingBar = new GetAttributeSubIfcReinforcingBar(object, string);
				objectArrayList = GetAttributeSubIfcReinforcingBar.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReinforcingElement")) {
				GetAttributeSubIfcReinforcingElement GetAttributeSubIfcReinforcingElement = new GetAttributeSubIfcReinforcingElement(object, string);
				objectArrayList = GetAttributeSubIfcReinforcingElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcReinforcingMesh")) {
				GetAttributeSubIfcReinforcingMesh GetAttributeSubIfcReinforcingMesh = new GetAttributeSubIfcReinforcingMesh(object, string);
				objectArrayList = GetAttributeSubIfcReinforcingMesh.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAggregates")) {
				GetAttributeSubIfcRelAggregates GetAttributeSubIfcRelAggregates = new GetAttributeSubIfcRelAggregates(object, string);
				objectArrayList = GetAttributeSubIfcRelAggregates.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssigns")) {
				GetAttributeSubIfcRelAssigns GetAttributeSubIfcRelAssigns = new GetAttributeSubIfcRelAssigns(object, string);
				objectArrayList = GetAttributeSubIfcRelAssigns.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsTasks")) {
				GetAttributeSubIfcRelAssignsTasks GetAttributeSubIfcRelAssignsTasks = new GetAttributeSubIfcRelAssignsTasks(object, string);
				objectArrayList = GetAttributeSubIfcRelAssignsTasks.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToActor")) {
				GetAttributeSubIfcRelAssignsToActor GetAttributeSubIfcRelAssignsToActor = new GetAttributeSubIfcRelAssignsToActor(object, string);
				objectArrayList = GetAttributeSubIfcRelAssignsToActor.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToControl")) {
				GetAttributeSubIfcRelAssignsToControl GetAttributeSubIfcRelAssignsToControl = new GetAttributeSubIfcRelAssignsToControl(object, string);
				objectArrayList = GetAttributeSubIfcRelAssignsToControl.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToGroup")) {
				GetAttributeSubIfcRelAssignsToGroup GetAttributeSubIfcRelAssignsToGroup = new GetAttributeSubIfcRelAssignsToGroup(object, string);
				objectArrayList = GetAttributeSubIfcRelAssignsToGroup.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToProcess")) {
				GetAttributeSubIfcRelAssignsToProcess GetAttributeSubIfcRelAssignsToProcess = new GetAttributeSubIfcRelAssignsToProcess(object, string);
				objectArrayList = GetAttributeSubIfcRelAssignsToProcess.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToProduct")) {
				GetAttributeSubIfcRelAssignsToProduct GetAttributeSubIfcRelAssignsToProduct = new GetAttributeSubIfcRelAssignsToProduct(object, string);
				objectArrayList = GetAttributeSubIfcRelAssignsToProduct.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToProjectOrder")) {
				GetAttributeSubIfcRelAssignsToProjectOrder GetAttributeSubIfcRelAssignsToProjectOrder = new GetAttributeSubIfcRelAssignsToProjectOrder(object, string);
				objectArrayList = GetAttributeSubIfcRelAssignsToProjectOrder.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssignsToResource")) {
				GetAttributeSubIfcRelAssignsToResource GetAttributeSubIfcRelAssignsToResource = new GetAttributeSubIfcRelAssignsToResource(object, string);
				objectArrayList = GetAttributeSubIfcRelAssignsToResource.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesAppliedValue")) {
				GetAttributeSubIfcRelAssociatesAppliedValue GetAttributeSubIfcRelAssociatesAppliedValue = new GetAttributeSubIfcRelAssociatesAppliedValue(object, string);
				objectArrayList = GetAttributeSubIfcRelAssociatesAppliedValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesApproval")) {
				GetAttributeSubIfcRelAssociatesApproval GetAttributeSubIfcRelAssociatesApproval = new GetAttributeSubIfcRelAssociatesApproval(object, string);
				objectArrayList = GetAttributeSubIfcRelAssociatesApproval.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesClassification")) {
				GetAttributeSubIfcRelAssociatesClassification GetAttributeSubIfcRelAssociatesClassification = new GetAttributeSubIfcRelAssociatesClassification(object, string);
				objectArrayList = GetAttributeSubIfcRelAssociatesClassification.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesConstraint")) {
				GetAttributeSubIfcRelAssociatesConstraint GetAttributeSubIfcRelAssociatesConstraint = new GetAttributeSubIfcRelAssociatesConstraint(object, string);
				objectArrayList = GetAttributeSubIfcRelAssociatesConstraint.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesDocument")) {
				GetAttributeSubIfcRelAssociatesDocument GetAttributeSubIfcRelAssociatesDocument = new GetAttributeSubIfcRelAssociatesDocument(object, string);
				objectArrayList = GetAttributeSubIfcRelAssociatesDocument.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociates")) {
				GetAttributeSubIfcRelAssociates GetAttributeSubIfcRelAssociates = new GetAttributeSubIfcRelAssociates(object, string);
				objectArrayList = GetAttributeSubIfcRelAssociates.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesLibrary")) {
				GetAttributeSubIfcRelAssociatesLibrary GetAttributeSubIfcRelAssociatesLibrary = new GetAttributeSubIfcRelAssociatesLibrary(object, string);
				objectArrayList = GetAttributeSubIfcRelAssociatesLibrary.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesMaterial")) {
				GetAttributeSubIfcRelAssociatesMaterial GetAttributeSubIfcRelAssociatesMaterial = new GetAttributeSubIfcRelAssociatesMaterial(object, string);
				objectArrayList = GetAttributeSubIfcRelAssociatesMaterial.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelAssociatesProfileProperties")) {
				GetAttributeSubIfcRelAssociatesProfileProperties GetAttributeSubIfcRelAssociatesProfileProperties = new GetAttributeSubIfcRelAssociatesProfileProperties(object, string);
				objectArrayList = GetAttributeSubIfcRelAssociatesProfileProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsElements")) {
				GetAttributeSubIfcRelConnectsElements GetAttributeSubIfcRelConnectsElements = new GetAttributeSubIfcRelConnectsElements(object, string);
				objectArrayList = GetAttributeSubIfcRelConnectsElements.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnects")) {
				GetAttributeSubIfcRelConnects GetAttributeSubIfcRelConnects = new GetAttributeSubIfcRelConnects(object, string);
				objectArrayList = GetAttributeSubIfcRelConnects.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsPathElements")) {
				GetAttributeSubIfcRelConnectsPathElements GetAttributeSubIfcRelConnectsPathElements = new GetAttributeSubIfcRelConnectsPathElements(object, string);
				objectArrayList = GetAttributeSubIfcRelConnectsPathElements.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsPortToElement")) {
				GetAttributeSubIfcRelConnectsPortToElement GetAttributeSubIfcRelConnectsPortToElement = new GetAttributeSubIfcRelConnectsPortToElement(object, string);
				objectArrayList = GetAttributeSubIfcRelConnectsPortToElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsPorts")) {
				GetAttributeSubIfcRelConnectsPorts GetAttributeSubIfcRelConnectsPorts = new GetAttributeSubIfcRelConnectsPorts(object, string);
				objectArrayList = GetAttributeSubIfcRelConnectsPorts.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsStructuralActivity")) {
				GetAttributeSubIfcRelConnectsStructuralActivity GetAttributeSubIfcRelConnectsStructuralActivity = new GetAttributeSubIfcRelConnectsStructuralActivity(object, string);
				objectArrayList = GetAttributeSubIfcRelConnectsStructuralActivity.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsStructuralElement")) {
				GetAttributeSubIfcRelConnectsStructuralElement GetAttributeSubIfcRelConnectsStructuralElement = new GetAttributeSubIfcRelConnectsStructuralElement(object, string);
				objectArrayList = GetAttributeSubIfcRelConnectsStructuralElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsStructuralMember")) {
				GetAttributeSubIfcRelConnectsStructuralMember GetAttributeSubIfcRelConnectsStructuralMember = new GetAttributeSubIfcRelConnectsStructuralMember(object, string);
				objectArrayList = GetAttributeSubIfcRelConnectsStructuralMember.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsWithEccentricity")) {
				GetAttributeSubIfcRelConnectsWithEccentricity GetAttributeSubIfcRelConnectsWithEccentricity = new GetAttributeSubIfcRelConnectsWithEccentricity(object, string);
				objectArrayList = GetAttributeSubIfcRelConnectsWithEccentricity.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelConnectsWithRealizingElements")) {
				GetAttributeSubIfcRelConnectsWithRealizingElements GetAttributeSubIfcRelConnectsWithRealizingElements = new GetAttributeSubIfcRelConnectsWithRealizingElements(object, string);
				objectArrayList = GetAttributeSubIfcRelConnectsWithRealizingElements.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelContainedInSpatialStructure")) {
				GetAttributeSubIfcRelContainedInSpatialStructure GetAttributeSubIfcRelContainedInSpatialStructure = new GetAttributeSubIfcRelContainedInSpatialStructure(object, string);
				objectArrayList = GetAttributeSubIfcRelContainedInSpatialStructure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelCoversBldgElements")) {
				GetAttributeSubIfcRelCoversBldgElements GetAttributeSubIfcRelCoversBldgElements = new GetAttributeSubIfcRelCoversBldgElements(object, string);
				objectArrayList = GetAttributeSubIfcRelCoversBldgElements.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelCoversSpaces")) {
				GetAttributeSubIfcRelCoversSpaces GetAttributeSubIfcRelCoversSpaces = new GetAttributeSubIfcRelCoversSpaces(object, string);
				objectArrayList = GetAttributeSubIfcRelCoversSpaces.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelDecomposes")) {
				GetAttributeSubIfcRelDecomposes GetAttributeSubIfcRelDecomposes = new GetAttributeSubIfcRelDecomposes(object, string);
				objectArrayList = GetAttributeSubIfcRelDecomposes.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelDefinesByProperties")) {
				GetAttributeSubIfcRelDefinesByProperties GetAttributeSubIfcRelDefinesByProperties = new GetAttributeSubIfcRelDefinesByProperties(object, string);
				objectArrayList = GetAttributeSubIfcRelDefinesByProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelDefinesByType")) {
				GetAttributeSubIfcRelDefinesByType GetAttributeSubIfcRelDefinesByType = new GetAttributeSubIfcRelDefinesByType(object, string);
				objectArrayList = GetAttributeSubIfcRelDefinesByType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelDefines")) {
				GetAttributeSubIfcRelDefines GetAttributeSubIfcRelDefines = new GetAttributeSubIfcRelDefines(object, string);
				objectArrayList = GetAttributeSubIfcRelDefines.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelFillsElement")) {
				GetAttributeSubIfcRelFillsElement GetAttributeSubIfcRelFillsElement = new GetAttributeSubIfcRelFillsElement(object, string);
				objectArrayList = GetAttributeSubIfcRelFillsElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelFlowControlElements")) {
				GetAttributeSubIfcRelFlowControlElements GetAttributeSubIfcRelFlowControlElements = new GetAttributeSubIfcRelFlowControlElements(object, string);
				objectArrayList = GetAttributeSubIfcRelFlowControlElements.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelInteractionRequirements")) {
				GetAttributeSubIfcRelInteractionRequirements GetAttributeSubIfcRelInteractionRequirements = new GetAttributeSubIfcRelInteractionRequirements(object, string);
				objectArrayList = GetAttributeSubIfcRelInteractionRequirements.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelNests")) {
				GetAttributeSubIfcRelNests GetAttributeSubIfcRelNests = new GetAttributeSubIfcRelNests(object, string);
				objectArrayList = GetAttributeSubIfcRelNests.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelOccupiesSpaces")) {
				GetAttributeSubIfcRelOccupiesSpaces GetAttributeSubIfcRelOccupiesSpaces = new GetAttributeSubIfcRelOccupiesSpaces(object, string);
				objectArrayList = GetAttributeSubIfcRelOccupiesSpaces.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelOverridesProperties")) {
				GetAttributeSubIfcRelOverridesProperties GetAttributeSubIfcRelOverridesProperties = new GetAttributeSubIfcRelOverridesProperties(object, string);
				objectArrayList = GetAttributeSubIfcRelOverridesProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelProjectsElement")) {
				GetAttributeSubIfcRelProjectsElement GetAttributeSubIfcRelProjectsElement = new GetAttributeSubIfcRelProjectsElement(object, string);
				objectArrayList = GetAttributeSubIfcRelProjectsElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelReferencedInSpatialStructure")) {
				GetAttributeSubIfcRelReferencedInSpatialStructure GetAttributeSubIfcRelReferencedInSpatialStructure = new GetAttributeSubIfcRelReferencedInSpatialStructure(object, string);
				objectArrayList = GetAttributeSubIfcRelReferencedInSpatialStructure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelSchedulesCostItems")) {
				GetAttributeSubIfcRelSchedulesCostItems GetAttributeSubIfcRelSchedulesCostItems = new GetAttributeSubIfcRelSchedulesCostItems(object, string);
				objectArrayList = GetAttributeSubIfcRelSchedulesCostItems.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelSequence")) {
				GetAttributeSubIfcRelSequence GetAttributeSubIfcRelSequence = new GetAttributeSubIfcRelSequence(object, string);
				objectArrayList = GetAttributeSubIfcRelSequence.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelServicesBuildings")) {
				GetAttributeSubIfcRelServicesBuildings GetAttributeSubIfcRelServicesBuildings = new GetAttributeSubIfcRelServicesBuildings(object, string);
				objectArrayList = GetAttributeSubIfcRelServicesBuildings.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelSpaceBoundary")) {
				GetAttributeSubIfcRelSpaceBoundary GetAttributeSubIfcRelSpaceBoundary = new GetAttributeSubIfcRelSpaceBoundary(object, string);
				objectArrayList = GetAttributeSubIfcRelSpaceBoundary.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelVoidsElement")) {
				GetAttributeSubIfcRelVoidsElement GetAttributeSubIfcRelVoidsElement = new GetAttributeSubIfcRelVoidsElement(object, string);
				objectArrayList = GetAttributeSubIfcRelVoidsElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelationship")) {
				GetAttributeSubIfcRelationship GetAttributeSubIfcRelationship = new GetAttributeSubIfcRelationship(object, string);
				objectArrayList = GetAttributeSubIfcRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRelaxation")) {
				GetAttributeSubIfcRelaxation GetAttributeSubIfcRelaxation = new GetAttributeSubIfcRelaxation(object, string);
				objectArrayList = GetAttributeSubIfcRelaxation.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRepresentationContext")) {
				GetAttributeSubIfcRepresentationContext GetAttributeSubIfcRepresentationContext = new GetAttributeSubIfcRepresentationContext(object, string);
				objectArrayList = GetAttributeSubIfcRepresentationContext.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRepresentation")) {
				GetAttributeSubIfcRepresentation GetAttributeSubIfcRepresentation = new GetAttributeSubIfcRepresentation(object, string);
				objectArrayList = GetAttributeSubIfcRepresentation.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRepresentationItem")) {
				GetAttributeSubIfcRepresentationItem GetAttributeSubIfcRepresentationItem = new GetAttributeSubIfcRepresentationItem(object, string);
				objectArrayList = GetAttributeSubIfcRepresentationItem.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRepresentationMap")) {
				GetAttributeSubIfcRepresentationMap GetAttributeSubIfcRepresentationMap = new GetAttributeSubIfcRepresentationMap(object, string);
				objectArrayList = GetAttributeSubIfcRepresentationMap.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcResource")) {
				GetAttributeSubIfcResource GetAttributeSubIfcResource = new GetAttributeSubIfcResource(object, string);
				objectArrayList = GetAttributeSubIfcResource.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRevolvedAreaSolid")) {
				GetAttributeSubIfcRevolvedAreaSolid GetAttributeSubIfcRevolvedAreaSolid = new GetAttributeSubIfcRevolvedAreaSolid(object, string);
				objectArrayList = GetAttributeSubIfcRevolvedAreaSolid.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRibPlateProfileProperties")) {
				GetAttributeSubIfcRibPlateProfileProperties GetAttributeSubIfcRibPlateProfileProperties = new GetAttributeSubIfcRibPlateProfileProperties(object, string);
				objectArrayList = GetAttributeSubIfcRibPlateProfileProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRightCircularCone")) {
				GetAttributeSubIfcRightCircularCone GetAttributeSubIfcRightCircularCone = new GetAttributeSubIfcRightCircularCone(object, string);
				objectArrayList = GetAttributeSubIfcRightCircularCone.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRightCircularCylinder")) {
				GetAttributeSubIfcRightCircularCylinder GetAttributeSubIfcRightCircularCylinder = new GetAttributeSubIfcRightCircularCylinder(object, string);
				objectArrayList = GetAttributeSubIfcRightCircularCylinder.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRoof")) {
				GetAttributeSubIfcRoof GetAttributeSubIfcRoof = new GetAttributeSubIfcRoof(object, string);
				objectArrayList = GetAttributeSubIfcRoof.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRoot")) {
				GetAttributeSubIfcRoot GetAttributeSubIfcRoot = new GetAttributeSubIfcRoot(object, string);
				objectArrayList = GetAttributeSubIfcRoot.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRotationalFrequencyMeasure")) {
				GetAttributeSubIfcRotationalFrequencyMeasure GetAttributeSubIfcRotationalFrequencyMeasure = new GetAttributeSubIfcRotationalFrequencyMeasure(object, string);
				objectArrayList = GetAttributeSubIfcRotationalFrequencyMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRotationalMassMeasure")) {
				GetAttributeSubIfcRotationalMassMeasure GetAttributeSubIfcRotationalMassMeasure = new GetAttributeSubIfcRotationalMassMeasure(object, string);
				objectArrayList = GetAttributeSubIfcRotationalMassMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRotationalStiffnessMeasure")) {
				GetAttributeSubIfcRotationalStiffnessMeasure GetAttributeSubIfcRotationalStiffnessMeasure = new GetAttributeSubIfcRotationalStiffnessMeasure(object, string);
				objectArrayList = GetAttributeSubIfcRotationalStiffnessMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRoundedEdgeFeature")) {
				GetAttributeSubIfcRoundedEdgeFeature GetAttributeSubIfcRoundedEdgeFeature = new GetAttributeSubIfcRoundedEdgeFeature(object, string);
				objectArrayList = GetAttributeSubIfcRoundedEdgeFeature.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcRoundedRectangleProfileDef")) {
				GetAttributeSubIfcRoundedRectangleProfileDef GetAttributeSubIfcRoundedRectangleProfileDef = new GetAttributeSubIfcRoundedRectangleProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcRoundedRectangleProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSIUnit")) {
				GetAttributeSubIfcSIUnit GetAttributeSubIfcSIUnit = new GetAttributeSubIfcSIUnit(object, string);
				objectArrayList = GetAttributeSubIfcSIUnit.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSanitaryTerminalType")) {
				GetAttributeSubIfcSanitaryTerminalType GetAttributeSubIfcSanitaryTerminalType = new GetAttributeSubIfcSanitaryTerminalType(object, string);
				objectArrayList = GetAttributeSubIfcSanitaryTerminalType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcScheduleTimeControl")) {
				GetAttributeSubIfcScheduleTimeControl GetAttributeSubIfcScheduleTimeControl = new GetAttributeSubIfcScheduleTimeControl(object, string);
				objectArrayList = GetAttributeSubIfcScheduleTimeControl.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSectionModulusMeasure")) {
				GetAttributeSubIfcSectionModulusMeasure GetAttributeSubIfcSectionModulusMeasure = new GetAttributeSubIfcSectionModulusMeasure(object, string);
				objectArrayList = GetAttributeSubIfcSectionModulusMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSectionProperties")) {
				GetAttributeSubIfcSectionProperties GetAttributeSubIfcSectionProperties = new GetAttributeSubIfcSectionProperties(object, string);
				objectArrayList = GetAttributeSubIfcSectionProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSectionReinforcementProperties")) {
				GetAttributeSubIfcSectionReinforcementProperties GetAttributeSubIfcSectionReinforcementProperties = new GetAttributeSubIfcSectionReinforcementProperties(object, string);
				objectArrayList = GetAttributeSubIfcSectionReinforcementProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSectionalAreaIntegralMeasure")) {
				GetAttributeSubIfcSectionalAreaIntegralMeasure GetAttributeSubIfcSectionalAreaIntegralMeasure = new GetAttributeSubIfcSectionalAreaIntegralMeasure(object, string);
				objectArrayList = GetAttributeSubIfcSectionalAreaIntegralMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSectionedSpine")) {
				GetAttributeSubIfcSectionedSpine GetAttributeSubIfcSectionedSpine = new GetAttributeSubIfcSectionedSpine(object, string);
				objectArrayList = GetAttributeSubIfcSectionedSpine.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSensorType")) {
				GetAttributeSubIfcSensorType GetAttributeSubIfcSensorType = new GetAttributeSubIfcSensorType(object, string);
				objectArrayList = GetAttributeSubIfcSensorType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcServiceLifeFactor")) {
				GetAttributeSubIfcServiceLifeFactor GetAttributeSubIfcServiceLifeFactor = new GetAttributeSubIfcServiceLifeFactor(object, string);
				objectArrayList = GetAttributeSubIfcServiceLifeFactor.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcServiceLife")) {
				GetAttributeSubIfcServiceLife GetAttributeSubIfcServiceLife = new GetAttributeSubIfcServiceLife(object, string);
				objectArrayList = GetAttributeSubIfcServiceLife.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcShapeAspect")) {
				GetAttributeSubIfcShapeAspect GetAttributeSubIfcShapeAspect = new GetAttributeSubIfcShapeAspect(object, string);
				objectArrayList = GetAttributeSubIfcShapeAspect.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcShapeModel")) {
				GetAttributeSubIfcShapeModel GetAttributeSubIfcShapeModel = new GetAttributeSubIfcShapeModel(object, string);
				objectArrayList = GetAttributeSubIfcShapeModel.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcShapeRepresentation")) {
				GetAttributeSubIfcShapeRepresentation GetAttributeSubIfcShapeRepresentation = new GetAttributeSubIfcShapeRepresentation(object, string);
				objectArrayList = GetAttributeSubIfcShapeRepresentation.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcShearModulusMeasure")) {
				GetAttributeSubIfcShearModulusMeasure GetAttributeSubIfcShearModulusMeasure = new GetAttributeSubIfcShearModulusMeasure(object, string);
				objectArrayList = GetAttributeSubIfcShearModulusMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcShellBasedSurfaceModel")) {
				GetAttributeSubIfcShellBasedSurfaceModel GetAttributeSubIfcShellBasedSurfaceModel = new GetAttributeSubIfcShellBasedSurfaceModel(object, string);
				objectArrayList = GetAttributeSubIfcShellBasedSurfaceModel.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSimpleProperty")) {
				GetAttributeSubIfcSimpleProperty GetAttributeSubIfcSimpleProperty = new GetAttributeSubIfcSimpleProperty(object, string);
				objectArrayList = GetAttributeSubIfcSimpleProperty.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSite")) {
				GetAttributeSubIfcSite GetAttributeSubIfcSite = new GetAttributeSubIfcSite(object, string);
				objectArrayList = GetAttributeSubIfcSite.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSlab")) {
				GetAttributeSubIfcSlab GetAttributeSubIfcSlab = new GetAttributeSubIfcSlab(object, string);
				objectArrayList = GetAttributeSubIfcSlab.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSlabType")) {
				GetAttributeSubIfcSlabType GetAttributeSubIfcSlabType = new GetAttributeSubIfcSlabType(object, string);
				objectArrayList = GetAttributeSubIfcSlabType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSlippageConnectionCondition")) {
				GetAttributeSubIfcSlippageConnectionCondition GetAttributeSubIfcSlippageConnectionCondition = new GetAttributeSubIfcSlippageConnectionCondition(object, string);
				objectArrayList = GetAttributeSubIfcSlippageConnectionCondition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSolidAngleMeasure")) {
				GetAttributeSubIfcSolidAngleMeasure GetAttributeSubIfcSolidAngleMeasure = new GetAttributeSubIfcSolidAngleMeasure(object, string);
				objectArrayList = GetAttributeSubIfcSolidAngleMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSolidModel")) {
				GetAttributeSubIfcSolidModel GetAttributeSubIfcSolidModel = new GetAttributeSubIfcSolidModel(object, string);
				objectArrayList = GetAttributeSubIfcSolidModel.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSoundPowerMeasure")) {
				GetAttributeSubIfcSoundPowerMeasure GetAttributeSubIfcSoundPowerMeasure = new GetAttributeSubIfcSoundPowerMeasure(object, string);
				objectArrayList = GetAttributeSubIfcSoundPowerMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSoundPressureMeasure")) {
				GetAttributeSubIfcSoundPressureMeasure GetAttributeSubIfcSoundPressureMeasure = new GetAttributeSubIfcSoundPressureMeasure(object, string);
				objectArrayList = GetAttributeSubIfcSoundPressureMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSoundProperties")) {
				GetAttributeSubIfcSoundProperties GetAttributeSubIfcSoundProperties = new GetAttributeSubIfcSoundProperties(object, string);
				objectArrayList = GetAttributeSubIfcSoundProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSoundValue")) {
				GetAttributeSubIfcSoundValue GetAttributeSubIfcSoundValue = new GetAttributeSubIfcSoundValue(object, string);
				objectArrayList = GetAttributeSubIfcSoundValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpaceHeaterType")) {
				GetAttributeSubIfcSpaceHeaterType GetAttributeSubIfcSpaceHeaterType = new GetAttributeSubIfcSpaceHeaterType(object, string);
				objectArrayList = GetAttributeSubIfcSpaceHeaterType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpace")) {
				GetAttributeSubIfcSpace GetAttributeSubIfcSpace = new GetAttributeSubIfcSpace(object, string);
				objectArrayList = GetAttributeSubIfcSpace.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpaceProgram")) {
				GetAttributeSubIfcSpaceProgram GetAttributeSubIfcSpaceProgram = new GetAttributeSubIfcSpaceProgram(object, string);
				objectArrayList = GetAttributeSubIfcSpaceProgram.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpaceThermalLoadProperties")) {
				GetAttributeSubIfcSpaceThermalLoadProperties GetAttributeSubIfcSpaceThermalLoadProperties = new GetAttributeSubIfcSpaceThermalLoadProperties(object, string);
				objectArrayList = GetAttributeSubIfcSpaceThermalLoadProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpaceType")) {
				GetAttributeSubIfcSpaceType GetAttributeSubIfcSpaceType = new GetAttributeSubIfcSpaceType(object, string);
				objectArrayList = GetAttributeSubIfcSpaceType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpatialStructureElement")) {
				GetAttributeSubIfcSpatialStructureElement GetAttributeSubIfcSpatialStructureElement = new GetAttributeSubIfcSpatialStructureElement(object, string);
				objectArrayList = GetAttributeSubIfcSpatialStructureElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpatialStructureElementType")) {
				GetAttributeSubIfcSpatialStructureElementType GetAttributeSubIfcSpatialStructureElementType = new GetAttributeSubIfcSpatialStructureElementType(object, string);
				objectArrayList = GetAttributeSubIfcSpatialStructureElementType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpecificHeatCapacityMeasure")) {
				GetAttributeSubIfcSpecificHeatCapacityMeasure GetAttributeSubIfcSpecificHeatCapacityMeasure = new GetAttributeSubIfcSpecificHeatCapacityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcSpecificHeatCapacityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpecularExponent")) {
				GetAttributeSubIfcSpecularExponent GetAttributeSubIfcSpecularExponent = new GetAttributeSubIfcSpecularExponent(object, string);
				objectArrayList = GetAttributeSubIfcSpecularExponent.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSpecularRoughness")) {
				GetAttributeSubIfcSpecularRoughness GetAttributeSubIfcSpecularRoughness = new GetAttributeSubIfcSpecularRoughness(object, string);
				objectArrayList = GetAttributeSubIfcSpecularRoughness.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSphere")) {
				GetAttributeSubIfcSphere GetAttributeSubIfcSphere = new GetAttributeSubIfcSphere(object, string);
				objectArrayList = GetAttributeSubIfcSphere.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStackTerminalType")) {
				GetAttributeSubIfcStackTerminalType GetAttributeSubIfcStackTerminalType = new GetAttributeSubIfcStackTerminalType(object, string);
				objectArrayList = GetAttributeSubIfcStackTerminalType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStairFlight")) {
				GetAttributeSubIfcStairFlight GetAttributeSubIfcStairFlight = new GetAttributeSubIfcStairFlight(object, string);
				objectArrayList = GetAttributeSubIfcStairFlight.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStairFlightType")) {
				GetAttributeSubIfcStairFlightType GetAttributeSubIfcStairFlightType = new GetAttributeSubIfcStairFlightType(object, string);
				objectArrayList = GetAttributeSubIfcStairFlightType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStair")) {
				GetAttributeSubIfcStair GetAttributeSubIfcStair = new GetAttributeSubIfcStair(object, string);
				objectArrayList = GetAttributeSubIfcStair.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralAction")) {
				GetAttributeSubIfcStructuralAction GetAttributeSubIfcStructuralAction = new GetAttributeSubIfcStructuralAction(object, string);
				objectArrayList = GetAttributeSubIfcStructuralAction.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralActivity")) {
				GetAttributeSubIfcStructuralActivity GetAttributeSubIfcStructuralActivity = new GetAttributeSubIfcStructuralActivity(object, string);
				objectArrayList = GetAttributeSubIfcStructuralActivity.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralAnalysisModel")) {
				GetAttributeSubIfcStructuralAnalysisModel GetAttributeSubIfcStructuralAnalysisModel = new GetAttributeSubIfcStructuralAnalysisModel(object, string);
				objectArrayList = GetAttributeSubIfcStructuralAnalysisModel.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralConnectionCondition")) {
				GetAttributeSubIfcStructuralConnectionCondition GetAttributeSubIfcStructuralConnectionCondition = new GetAttributeSubIfcStructuralConnectionCondition(object, string);
				objectArrayList = GetAttributeSubIfcStructuralConnectionCondition.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralConnection")) {
				GetAttributeSubIfcStructuralConnection GetAttributeSubIfcStructuralConnection = new GetAttributeSubIfcStructuralConnection(object, string);
				objectArrayList = GetAttributeSubIfcStructuralConnection.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralCurveConnection")) {
				GetAttributeSubIfcStructuralCurveConnection GetAttributeSubIfcStructuralCurveConnection = new GetAttributeSubIfcStructuralCurveConnection(object, string);
				objectArrayList = GetAttributeSubIfcStructuralCurveConnection.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralCurveMember")) {
				GetAttributeSubIfcStructuralCurveMember GetAttributeSubIfcStructuralCurveMember = new GetAttributeSubIfcStructuralCurveMember(object, string);
				objectArrayList = GetAttributeSubIfcStructuralCurveMember.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralCurveMemberVarying")) {
				GetAttributeSubIfcStructuralCurveMemberVarying GetAttributeSubIfcStructuralCurveMemberVarying = new GetAttributeSubIfcStructuralCurveMemberVarying(object, string);
				objectArrayList = GetAttributeSubIfcStructuralCurveMemberVarying.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralItem")) {
				GetAttributeSubIfcStructuralItem GetAttributeSubIfcStructuralItem = new GetAttributeSubIfcStructuralItem(object, string);
				objectArrayList = GetAttributeSubIfcStructuralItem.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLinearAction")) {
				GetAttributeSubIfcStructuralLinearAction GetAttributeSubIfcStructuralLinearAction = new GetAttributeSubIfcStructuralLinearAction(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLinearAction.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLinearActionVarying")) {
				GetAttributeSubIfcStructuralLinearActionVarying GetAttributeSubIfcStructuralLinearActionVarying = new GetAttributeSubIfcStructuralLinearActionVarying(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLinearActionVarying.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadGroup")) {
				GetAttributeSubIfcStructuralLoadGroup GetAttributeSubIfcStructuralLoadGroup = new GetAttributeSubIfcStructuralLoadGroup(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLoadGroup.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoad")) {
				GetAttributeSubIfcStructuralLoad GetAttributeSubIfcStructuralLoad = new GetAttributeSubIfcStructuralLoad(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLoad.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadLinearForce")) {
				GetAttributeSubIfcStructuralLoadLinearForce GetAttributeSubIfcStructuralLoadLinearForce = new GetAttributeSubIfcStructuralLoadLinearForce(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLoadLinearForce.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadPlanarForce")) {
				GetAttributeSubIfcStructuralLoadPlanarForce GetAttributeSubIfcStructuralLoadPlanarForce = new GetAttributeSubIfcStructuralLoadPlanarForce(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLoadPlanarForce.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadSingleDisplacementDistortion")) {
				GetAttributeSubIfcStructuralLoadSingleDisplacementDistortion GetAttributeSubIfcStructuralLoadSingleDisplacementDistortion = new GetAttributeSubIfcStructuralLoadSingleDisplacementDistortion(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLoadSingleDisplacementDistortion.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadSingleDisplacement")) {
				GetAttributeSubIfcStructuralLoadSingleDisplacement GetAttributeSubIfcStructuralLoadSingleDisplacement = new GetAttributeSubIfcStructuralLoadSingleDisplacement(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLoadSingleDisplacement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadSingleForce")) {
				GetAttributeSubIfcStructuralLoadSingleForce GetAttributeSubIfcStructuralLoadSingleForce = new GetAttributeSubIfcStructuralLoadSingleForce(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLoadSingleForce.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadSingleForceWarping")) {
				GetAttributeSubIfcStructuralLoadSingleForceWarping GetAttributeSubIfcStructuralLoadSingleForceWarping = new GetAttributeSubIfcStructuralLoadSingleForceWarping(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLoadSingleForceWarping.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadStatic")) {
				GetAttributeSubIfcStructuralLoadStatic GetAttributeSubIfcStructuralLoadStatic = new GetAttributeSubIfcStructuralLoadStatic(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLoadStatic.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralLoadTemperature")) {
				GetAttributeSubIfcStructuralLoadTemperature GetAttributeSubIfcStructuralLoadTemperature = new GetAttributeSubIfcStructuralLoadTemperature(object, string);
				objectArrayList = GetAttributeSubIfcStructuralLoadTemperature.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralMember")) {
				GetAttributeSubIfcStructuralMember GetAttributeSubIfcStructuralMember = new GetAttributeSubIfcStructuralMember(object, string);
				objectArrayList = GetAttributeSubIfcStructuralMember.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralPlanarAction")) {
				GetAttributeSubIfcStructuralPlanarAction GetAttributeSubIfcStructuralPlanarAction = new GetAttributeSubIfcStructuralPlanarAction(object, string);
				objectArrayList = GetAttributeSubIfcStructuralPlanarAction.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralPlanarActionVarying")) {
				GetAttributeSubIfcStructuralPlanarActionVarying GetAttributeSubIfcStructuralPlanarActionVarying = new GetAttributeSubIfcStructuralPlanarActionVarying(object, string);
				objectArrayList = GetAttributeSubIfcStructuralPlanarActionVarying.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralPointAction")) {
				GetAttributeSubIfcStructuralPointAction GetAttributeSubIfcStructuralPointAction = new GetAttributeSubIfcStructuralPointAction(object, string);
				objectArrayList = GetAttributeSubIfcStructuralPointAction.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralPointConnection")) {
				GetAttributeSubIfcStructuralPointConnection GetAttributeSubIfcStructuralPointConnection = new GetAttributeSubIfcStructuralPointConnection(object, string);
				objectArrayList = GetAttributeSubIfcStructuralPointConnection.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralPointReaction")) {
				GetAttributeSubIfcStructuralPointReaction GetAttributeSubIfcStructuralPointReaction = new GetAttributeSubIfcStructuralPointReaction(object, string);
				objectArrayList = GetAttributeSubIfcStructuralPointReaction.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralProfileProperties")) {
				GetAttributeSubIfcStructuralProfileProperties GetAttributeSubIfcStructuralProfileProperties = new GetAttributeSubIfcStructuralProfileProperties(object, string);
				objectArrayList = GetAttributeSubIfcStructuralProfileProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralReaction")) {
				GetAttributeSubIfcStructuralReaction GetAttributeSubIfcStructuralReaction = new GetAttributeSubIfcStructuralReaction(object, string);
				objectArrayList = GetAttributeSubIfcStructuralReaction.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralResultGroup")) {
				GetAttributeSubIfcStructuralResultGroup GetAttributeSubIfcStructuralResultGroup = new GetAttributeSubIfcStructuralResultGroup(object, string);
				objectArrayList = GetAttributeSubIfcStructuralResultGroup.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralSteelProfileProperties")) {
				GetAttributeSubIfcStructuralSteelProfileProperties GetAttributeSubIfcStructuralSteelProfileProperties = new GetAttributeSubIfcStructuralSteelProfileProperties(object, string);
				objectArrayList = GetAttributeSubIfcStructuralSteelProfileProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralSurfaceConnection")) {
				GetAttributeSubIfcStructuralSurfaceConnection GetAttributeSubIfcStructuralSurfaceConnection = new GetAttributeSubIfcStructuralSurfaceConnection(object, string);
				objectArrayList = GetAttributeSubIfcStructuralSurfaceConnection.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralSurfaceMember")) {
				GetAttributeSubIfcStructuralSurfaceMember GetAttributeSubIfcStructuralSurfaceMember = new GetAttributeSubIfcStructuralSurfaceMember(object, string);
				objectArrayList = GetAttributeSubIfcStructuralSurfaceMember.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuralSurfaceMemberVarying")) {
				GetAttributeSubIfcStructuralSurfaceMemberVarying GetAttributeSubIfcStructuralSurfaceMemberVarying = new GetAttributeSubIfcStructuralSurfaceMemberVarying(object, string);
				objectArrayList = GetAttributeSubIfcStructuralSurfaceMemberVarying.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStructuredDimensionCallout")) {
				GetAttributeSubIfcStructuredDimensionCallout GetAttributeSubIfcStructuredDimensionCallout = new GetAttributeSubIfcStructuredDimensionCallout(object, string);
				objectArrayList = GetAttributeSubIfcStructuredDimensionCallout.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStyleModel")) {
				GetAttributeSubIfcStyleModel GetAttributeSubIfcStyleModel = new GetAttributeSubIfcStyleModel(object, string);
				objectArrayList = GetAttributeSubIfcStyleModel.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStyledItem")) {
				GetAttributeSubIfcStyledItem GetAttributeSubIfcStyledItem = new GetAttributeSubIfcStyledItem(object, string);
				objectArrayList = GetAttributeSubIfcStyledItem.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcStyledRepresentation")) {
				GetAttributeSubIfcStyledRepresentation GetAttributeSubIfcStyledRepresentation = new GetAttributeSubIfcStyledRepresentation(object, string);
				objectArrayList = GetAttributeSubIfcStyledRepresentation.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSubContractResource")) {
				GetAttributeSubIfcSubContractResource GetAttributeSubIfcSubContractResource = new GetAttributeSubIfcSubContractResource(object, string);
				objectArrayList = GetAttributeSubIfcSubContractResource.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSubedge")) {
				GetAttributeSubIfcSubedge GetAttributeSubIfcSubedge = new GetAttributeSubIfcSubedge(object, string);
				objectArrayList = GetAttributeSubIfcSubedge.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceCurveSweptAreaSolid")) {
				GetAttributeSubIfcSurfaceCurveSweptAreaSolid GetAttributeSubIfcSurfaceCurveSweptAreaSolid = new GetAttributeSubIfcSurfaceCurveSweptAreaSolid(object, string);
				objectArrayList = GetAttributeSubIfcSurfaceCurveSweptAreaSolid.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurface")) {
				GetAttributeSubIfcSurface GetAttributeSubIfcSurface = new GetAttributeSubIfcSurface(object, string);
				objectArrayList = GetAttributeSubIfcSurface.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceOfLinearExtrusion")) {
				GetAttributeSubIfcSurfaceOfLinearExtrusion GetAttributeSubIfcSurfaceOfLinearExtrusion = new GetAttributeSubIfcSurfaceOfLinearExtrusion(object, string);
				objectArrayList = GetAttributeSubIfcSurfaceOfLinearExtrusion.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceOfRevolution")) {
				GetAttributeSubIfcSurfaceOfRevolution GetAttributeSubIfcSurfaceOfRevolution = new GetAttributeSubIfcSurfaceOfRevolution(object, string);
				objectArrayList = GetAttributeSubIfcSurfaceOfRevolution.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyle")) {
				GetAttributeSubIfcSurfaceStyle GetAttributeSubIfcSurfaceStyle = new GetAttributeSubIfcSurfaceStyle(object, string);
				objectArrayList = GetAttributeSubIfcSurfaceStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyleLighting")) {
				GetAttributeSubIfcSurfaceStyleLighting GetAttributeSubIfcSurfaceStyleLighting = new GetAttributeSubIfcSurfaceStyleLighting(object, string);
				objectArrayList = GetAttributeSubIfcSurfaceStyleLighting.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyleRefraction")) {
				GetAttributeSubIfcSurfaceStyleRefraction GetAttributeSubIfcSurfaceStyleRefraction = new GetAttributeSubIfcSurfaceStyleRefraction(object, string);
				objectArrayList = GetAttributeSubIfcSurfaceStyleRefraction.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyleRendering")) {
				GetAttributeSubIfcSurfaceStyleRendering GetAttributeSubIfcSurfaceStyleRendering = new GetAttributeSubIfcSurfaceStyleRendering(object, string);
				objectArrayList = GetAttributeSubIfcSurfaceStyleRendering.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyleShading")) {
				GetAttributeSubIfcSurfaceStyleShading GetAttributeSubIfcSurfaceStyleShading = new GetAttributeSubIfcSurfaceStyleShading(object, string);
				objectArrayList = GetAttributeSubIfcSurfaceStyleShading.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceStyleWithTextures")) {
				GetAttributeSubIfcSurfaceStyleWithTextures GetAttributeSubIfcSurfaceStyleWithTextures = new GetAttributeSubIfcSurfaceStyleWithTextures(object, string);
				objectArrayList = GetAttributeSubIfcSurfaceStyleWithTextures.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSurfaceTexture")) {
				GetAttributeSubIfcSurfaceTexture GetAttributeSubIfcSurfaceTexture = new GetAttributeSubIfcSurfaceTexture(object, string);
				objectArrayList = GetAttributeSubIfcSurfaceTexture.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSweptAreaSolid")) {
				GetAttributeSubIfcSweptAreaSolid GetAttributeSubIfcSweptAreaSolid = new GetAttributeSubIfcSweptAreaSolid(object, string);
				objectArrayList = GetAttributeSubIfcSweptAreaSolid.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSweptDiskSolid")) {
				GetAttributeSubIfcSweptDiskSolid GetAttributeSubIfcSweptDiskSolid = new GetAttributeSubIfcSweptDiskSolid(object, string);
				objectArrayList = GetAttributeSubIfcSweptDiskSolid.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSweptSurface")) {
				GetAttributeSubIfcSweptSurface GetAttributeSubIfcSweptSurface = new GetAttributeSubIfcSweptSurface(object, string);
				objectArrayList = GetAttributeSubIfcSweptSurface.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSwitchingDeviceType")) {
				GetAttributeSubIfcSwitchingDeviceType GetAttributeSubIfcSwitchingDeviceType = new GetAttributeSubIfcSwitchingDeviceType(object, string);
				objectArrayList = GetAttributeSubIfcSwitchingDeviceType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSymbolStyle")) {
				GetAttributeSubIfcSymbolStyle GetAttributeSubIfcSymbolStyle = new GetAttributeSubIfcSymbolStyle(object, string);
				objectArrayList = GetAttributeSubIfcSymbolStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSystemFurnitureElementType")) {
				GetAttributeSubIfcSystemFurnitureElementType GetAttributeSubIfcSystemFurnitureElementType = new GetAttributeSubIfcSystemFurnitureElementType(object, string);
				objectArrayList = GetAttributeSubIfcSystemFurnitureElementType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcSystem")) {
				GetAttributeSubIfcSystem GetAttributeSubIfcSystem = new GetAttributeSubIfcSystem(object, string);
				objectArrayList = GetAttributeSubIfcSystem.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTShapeProfileDef")) {
				GetAttributeSubIfcTShapeProfileDef GetAttributeSubIfcTShapeProfileDef = new GetAttributeSubIfcTShapeProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcTShapeProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTable")) {
				GetAttributeSubIfcTable GetAttributeSubIfcTable = new GetAttributeSubIfcTable(object, string);
				objectArrayList = GetAttributeSubIfcTable.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTableRow")) {
				GetAttributeSubIfcTableRow GetAttributeSubIfcTableRow = new GetAttributeSubIfcTableRow(object, string);
				objectArrayList = GetAttributeSubIfcTableRow.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTankType")) {
				GetAttributeSubIfcTankType GetAttributeSubIfcTankType = new GetAttributeSubIfcTankType(object, string);
				objectArrayList = GetAttributeSubIfcTankType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTask")) {
				GetAttributeSubIfcTask GetAttributeSubIfcTask = new GetAttributeSubIfcTask(object, string);
				objectArrayList = GetAttributeSubIfcTask.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTelecomAddress")) {
				GetAttributeSubIfcTelecomAddress GetAttributeSubIfcTelecomAddress = new GetAttributeSubIfcTelecomAddress(object, string);
				objectArrayList = GetAttributeSubIfcTelecomAddress.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTemperatureGradientMeasure")) {
				GetAttributeSubIfcTemperatureGradientMeasure GetAttributeSubIfcTemperatureGradientMeasure = new GetAttributeSubIfcTemperatureGradientMeasure(object, string);
				objectArrayList = GetAttributeSubIfcTemperatureGradientMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTendonAnchor")) {
				GetAttributeSubIfcTendonAnchor GetAttributeSubIfcTendonAnchor = new GetAttributeSubIfcTendonAnchor(object, string);
				objectArrayList = GetAttributeSubIfcTendonAnchor.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTendon")) {
				GetAttributeSubIfcTendon GetAttributeSubIfcTendon = new GetAttributeSubIfcTendon(object, string);
				objectArrayList = GetAttributeSubIfcTendon.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTerminatorSymbol")) {
				GetAttributeSubIfcTerminatorSymbol GetAttributeSubIfcTerminatorSymbol = new GetAttributeSubIfcTerminatorSymbol(object, string);
				objectArrayList = GetAttributeSubIfcTerminatorSymbol.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcText")) {
				GetAttributeSubIfcText GetAttributeSubIfcText = new GetAttributeSubIfcText(object, string);
				objectArrayList = GetAttributeSubIfcText.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextLiteral")) {
				GetAttributeSubIfcTextLiteral GetAttributeSubIfcTextLiteral = new GetAttributeSubIfcTextLiteral(object, string);
				objectArrayList = GetAttributeSubIfcTextLiteral.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextLiteralWithExtent")) {
				GetAttributeSubIfcTextLiteralWithExtent GetAttributeSubIfcTextLiteralWithExtent = new GetAttributeSubIfcTextLiteralWithExtent(object, string);
				objectArrayList = GetAttributeSubIfcTextLiteralWithExtent.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextStyleFontModel")) {
				GetAttributeSubIfcTextStyleFontModel GetAttributeSubIfcTextStyleFontModel = new GetAttributeSubIfcTextStyleFontModel(object, string);
				objectArrayList = GetAttributeSubIfcTextStyleFontModel.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextStyleForDefinedFont")) {
				GetAttributeSubIfcTextStyleForDefinedFont GetAttributeSubIfcTextStyleForDefinedFont = new GetAttributeSubIfcTextStyleForDefinedFont(object, string);
				objectArrayList = GetAttributeSubIfcTextStyleForDefinedFont.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextStyle")) {
				GetAttributeSubIfcTextStyle GetAttributeSubIfcTextStyle = new GetAttributeSubIfcTextStyle(object, string);
				objectArrayList = GetAttributeSubIfcTextStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextStyleTextModel")) {
				GetAttributeSubIfcTextStyleTextModel GetAttributeSubIfcTextStyleTextModel = new GetAttributeSubIfcTextStyleTextModel(object, string);
				objectArrayList = GetAttributeSubIfcTextStyleTextModel.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextStyleWithBoxCharacteristics")) {
				GetAttributeSubIfcTextStyleWithBoxCharacteristics GetAttributeSubIfcTextStyleWithBoxCharacteristics = new GetAttributeSubIfcTextStyleWithBoxCharacteristics(object, string);
				objectArrayList = GetAttributeSubIfcTextStyleWithBoxCharacteristics.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextureCoordinateGenerator")) {
				GetAttributeSubIfcTextureCoordinateGenerator GetAttributeSubIfcTextureCoordinateGenerator = new GetAttributeSubIfcTextureCoordinateGenerator(object, string);
				objectArrayList = GetAttributeSubIfcTextureCoordinateGenerator.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextureCoordinate")) {
				GetAttributeSubIfcTextureCoordinate GetAttributeSubIfcTextureCoordinate = new GetAttributeSubIfcTextureCoordinate(object, string);
				objectArrayList = GetAttributeSubIfcTextureCoordinate.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextureMap")) {
				GetAttributeSubIfcTextureMap GetAttributeSubIfcTextureMap = new GetAttributeSubIfcTextureMap(object, string);
				objectArrayList = GetAttributeSubIfcTextureMap.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTextureVertex")) {
				GetAttributeSubIfcTextureVertex GetAttributeSubIfcTextureVertex = new GetAttributeSubIfcTextureVertex(object, string);
				objectArrayList = GetAttributeSubIfcTextureVertex.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalAdmittanceMeasure")) {
				GetAttributeSubIfcThermalAdmittanceMeasure GetAttributeSubIfcThermalAdmittanceMeasure = new GetAttributeSubIfcThermalAdmittanceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcThermalAdmittanceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalConductivityMeasure")) {
				GetAttributeSubIfcThermalConductivityMeasure GetAttributeSubIfcThermalConductivityMeasure = new GetAttributeSubIfcThermalConductivityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcThermalConductivityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalExpansionCoefficientMeasure")) {
				GetAttributeSubIfcThermalExpansionCoefficientMeasure GetAttributeSubIfcThermalExpansionCoefficientMeasure = new GetAttributeSubIfcThermalExpansionCoefficientMeasure(object, string);
				objectArrayList = GetAttributeSubIfcThermalExpansionCoefficientMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalMaterialProperties")) {
				GetAttributeSubIfcThermalMaterialProperties GetAttributeSubIfcThermalMaterialProperties = new GetAttributeSubIfcThermalMaterialProperties(object, string);
				objectArrayList = GetAttributeSubIfcThermalMaterialProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalResistanceMeasure")) {
				GetAttributeSubIfcThermalResistanceMeasure GetAttributeSubIfcThermalResistanceMeasure = new GetAttributeSubIfcThermalResistanceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcThermalResistanceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermalTransmittanceMeasure")) {
				GetAttributeSubIfcThermalTransmittanceMeasure GetAttributeSubIfcThermalTransmittanceMeasure = new GetAttributeSubIfcThermalTransmittanceMeasure(object, string);
				objectArrayList = GetAttributeSubIfcThermalTransmittanceMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcThermodynamicTemperatureMeasure")) {
				GetAttributeSubIfcThermodynamicTemperatureMeasure GetAttributeSubIfcThermodynamicTemperatureMeasure = new GetAttributeSubIfcThermodynamicTemperatureMeasure(object, string);
				objectArrayList = GetAttributeSubIfcThermodynamicTemperatureMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeMeasure")) {
				GetAttributeSubIfcTimeMeasure GetAttributeSubIfcTimeMeasure = new GetAttributeSubIfcTimeMeasure(object, string);
				objectArrayList = GetAttributeSubIfcTimeMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeSeries")) {
				GetAttributeSubIfcTimeSeries GetAttributeSubIfcTimeSeries = new GetAttributeSubIfcTimeSeries(object, string);
				objectArrayList = GetAttributeSubIfcTimeSeries.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeSeriesReferenceRelationship")) {
				GetAttributeSubIfcTimeSeriesReferenceRelationship GetAttributeSubIfcTimeSeriesReferenceRelationship = new GetAttributeSubIfcTimeSeriesReferenceRelationship(object, string);
				objectArrayList = GetAttributeSubIfcTimeSeriesReferenceRelationship.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeSeriesSchedule")) {
				GetAttributeSubIfcTimeSeriesSchedule GetAttributeSubIfcTimeSeriesSchedule = new GetAttributeSubIfcTimeSeriesSchedule(object, string);
				objectArrayList = GetAttributeSubIfcTimeSeriesSchedule.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeSeriesValue")) {
				GetAttributeSubIfcTimeSeriesValue GetAttributeSubIfcTimeSeriesValue = new GetAttributeSubIfcTimeSeriesValue(object, string);
				objectArrayList = GetAttributeSubIfcTimeSeriesValue.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTimeStamp")) {
				GetAttributeSubIfcTimeStamp GetAttributeSubIfcTimeStamp = new GetAttributeSubIfcTimeStamp(object, string);
				objectArrayList = GetAttributeSubIfcTimeStamp.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTopologicalRepresentationItem")) {
				GetAttributeSubIfcTopologicalRepresentationItem GetAttributeSubIfcTopologicalRepresentationItem = new GetAttributeSubIfcTopologicalRepresentationItem(object, string);
				objectArrayList = GetAttributeSubIfcTopologicalRepresentationItem.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTopologyRepresentation")) {
				GetAttributeSubIfcTopologyRepresentation GetAttributeSubIfcTopologyRepresentation = new GetAttributeSubIfcTopologyRepresentation(object, string);
				objectArrayList = GetAttributeSubIfcTopologyRepresentation.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTorqueMeasure")) {
				GetAttributeSubIfcTorqueMeasure GetAttributeSubIfcTorqueMeasure = new GetAttributeSubIfcTorqueMeasure(object, string);
				objectArrayList = GetAttributeSubIfcTorqueMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTransformerType")) {
				GetAttributeSubIfcTransformerType GetAttributeSubIfcTransformerType = new GetAttributeSubIfcTransformerType(object, string);
				objectArrayList = GetAttributeSubIfcTransformerType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTransportElement")) {
				GetAttributeSubIfcTransportElement GetAttributeSubIfcTransportElement = new GetAttributeSubIfcTransportElement(object, string);
				objectArrayList = GetAttributeSubIfcTransportElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTransportElementType")) {
				GetAttributeSubIfcTransportElementType GetAttributeSubIfcTransportElementType = new GetAttributeSubIfcTransportElementType(object, string);
				objectArrayList = GetAttributeSubIfcTransportElementType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTrapeziumProfileDef")) {
				GetAttributeSubIfcTrapeziumProfileDef GetAttributeSubIfcTrapeziumProfileDef = new GetAttributeSubIfcTrapeziumProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcTrapeziumProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTrimmedCurve")) {
				GetAttributeSubIfcTrimmedCurve GetAttributeSubIfcTrimmedCurve = new GetAttributeSubIfcTrimmedCurve(object, string);
				objectArrayList = GetAttributeSubIfcTrimmedCurve.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTubeBundleType")) {
				GetAttributeSubIfcTubeBundleType GetAttributeSubIfcTubeBundleType = new GetAttributeSubIfcTubeBundleType(object, string);
				objectArrayList = GetAttributeSubIfcTubeBundleType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTwoDirectionRepeatFactor")) {
				GetAttributeSubIfcTwoDirectionRepeatFactor GetAttributeSubIfcTwoDirectionRepeatFactor = new GetAttributeSubIfcTwoDirectionRepeatFactor(object, string);
				objectArrayList = GetAttributeSubIfcTwoDirectionRepeatFactor.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTypeObject")) {
				GetAttributeSubIfcTypeObject GetAttributeSubIfcTypeObject = new GetAttributeSubIfcTypeObject(object, string);
				objectArrayList = GetAttributeSubIfcTypeObject.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcTypeProduct")) {
				GetAttributeSubIfcTypeProduct GetAttributeSubIfcTypeProduct = new GetAttributeSubIfcTypeProduct(object, string);
				objectArrayList = GetAttributeSubIfcTypeProduct.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcUShapeProfileDef")) {
				GetAttributeSubIfcUShapeProfileDef GetAttributeSubIfcUShapeProfileDef = new GetAttributeSubIfcUShapeProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcUShapeProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcUnitAssignment")) {
				GetAttributeSubIfcUnitAssignment GetAttributeSubIfcUnitAssignment = new GetAttributeSubIfcUnitAssignment(object, string);
				objectArrayList = GetAttributeSubIfcUnitAssignment.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcUnitaryEquipmentType")) {
				GetAttributeSubIfcUnitaryEquipmentType GetAttributeSubIfcUnitaryEquipmentType = new GetAttributeSubIfcUnitaryEquipmentType(object, string);
				objectArrayList = GetAttributeSubIfcUnitaryEquipmentType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcValveType")) {
				GetAttributeSubIfcValveType GetAttributeSubIfcValveType = new GetAttributeSubIfcValveType(object, string);
				objectArrayList = GetAttributeSubIfcValveType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVaporPermeabilityMeasure")) {
				GetAttributeSubIfcVaporPermeabilityMeasure GetAttributeSubIfcVaporPermeabilityMeasure = new GetAttributeSubIfcVaporPermeabilityMeasure(object, string);
				objectArrayList = GetAttributeSubIfcVaporPermeabilityMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVector")) {
				GetAttributeSubIfcVector GetAttributeSubIfcVector = new GetAttributeSubIfcVector(object, string);
				objectArrayList = GetAttributeSubIfcVector.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVertexBasedTextureMap")) {
				GetAttributeSubIfcVertexBasedTextureMap GetAttributeSubIfcVertexBasedTextureMap = new GetAttributeSubIfcVertexBasedTextureMap(object, string);
				objectArrayList = GetAttributeSubIfcVertexBasedTextureMap.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVertex")) {
				GetAttributeSubIfcVertex GetAttributeSubIfcVertex = new GetAttributeSubIfcVertex(object, string);
				objectArrayList = GetAttributeSubIfcVertex.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVertexLoop")) {
				GetAttributeSubIfcVertexLoop GetAttributeSubIfcVertexLoop = new GetAttributeSubIfcVertexLoop(object, string);
				objectArrayList = GetAttributeSubIfcVertexLoop.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVertexPoint")) {
				GetAttributeSubIfcVertexPoint GetAttributeSubIfcVertexPoint = new GetAttributeSubIfcVertexPoint(object, string);
				objectArrayList = GetAttributeSubIfcVertexPoint.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVibrationIsolatorType")) {
				GetAttributeSubIfcVibrationIsolatorType GetAttributeSubIfcVibrationIsolatorType = new GetAttributeSubIfcVibrationIsolatorType(object, string);
				objectArrayList = GetAttributeSubIfcVibrationIsolatorType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVirtualElement")) {
				GetAttributeSubIfcVirtualElement GetAttributeSubIfcVirtualElement = new GetAttributeSubIfcVirtualElement(object, string);
				objectArrayList = GetAttributeSubIfcVirtualElement.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVirtualGridIntersection")) {
				GetAttributeSubIfcVirtualGridIntersection GetAttributeSubIfcVirtualGridIntersection = new GetAttributeSubIfcVirtualGridIntersection(object, string);
				objectArrayList = GetAttributeSubIfcVirtualGridIntersection.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVolumeMeasure")) {
				GetAttributeSubIfcVolumeMeasure GetAttributeSubIfcVolumeMeasure = new GetAttributeSubIfcVolumeMeasure(object, string);
				objectArrayList = GetAttributeSubIfcVolumeMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcVolumetricFlowRateMeasure")) {
				GetAttributeSubIfcVolumetricFlowRateMeasure GetAttributeSubIfcVolumetricFlowRateMeasure = new GetAttributeSubIfcVolumetricFlowRateMeasure(object, string);
				objectArrayList = GetAttributeSubIfcVolumetricFlowRateMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWall")) {
				GetAttributeSubIfcWall GetAttributeSubIfcWall = new GetAttributeSubIfcWall(object, string);
				objectArrayList = GetAttributeSubIfcWall.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWallStandardCase")) {
				GetAttributeSubIfcWallStandardCase GetAttributeSubIfcWallStandardCase = new GetAttributeSubIfcWallStandardCase(object, string);
				objectArrayList = GetAttributeSubIfcWallStandardCase.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWallType")) {
				GetAttributeSubIfcWallType GetAttributeSubIfcWallType = new GetAttributeSubIfcWallType(object, string);
				objectArrayList = GetAttributeSubIfcWallType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWarpingConstantMeasure")) {
				GetAttributeSubIfcWarpingConstantMeasure GetAttributeSubIfcWarpingConstantMeasure = new GetAttributeSubIfcWarpingConstantMeasure(object, string);
				objectArrayList = GetAttributeSubIfcWarpingConstantMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWarpingMomentMeasure")) {
				GetAttributeSubIfcWarpingMomentMeasure GetAttributeSubIfcWarpingMomentMeasure = new GetAttributeSubIfcWarpingMomentMeasure(object, string);
				objectArrayList = GetAttributeSubIfcWarpingMomentMeasure.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWasteTerminalType")) {
				GetAttributeSubIfcWasteTerminalType GetAttributeSubIfcWasteTerminalType = new GetAttributeSubIfcWasteTerminalType(object, string);
				objectArrayList = GetAttributeSubIfcWasteTerminalType.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWaterProperties")) {
				GetAttributeSubIfcWaterProperties GetAttributeSubIfcWaterProperties = new GetAttributeSubIfcWaterProperties(object, string);
				objectArrayList = GetAttributeSubIfcWaterProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWindow")) {
				GetAttributeSubIfcWindow GetAttributeSubIfcWindow = new GetAttributeSubIfcWindow(object, string);
				objectArrayList = GetAttributeSubIfcWindow.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWindowLiningProperties")) {
				GetAttributeSubIfcWindowLiningProperties GetAttributeSubIfcWindowLiningProperties = new GetAttributeSubIfcWindowLiningProperties(object, string);
				objectArrayList = GetAttributeSubIfcWindowLiningProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWindowPanelProperties")) {
				GetAttributeSubIfcWindowPanelProperties GetAttributeSubIfcWindowPanelProperties = new GetAttributeSubIfcWindowPanelProperties(object, string);
				objectArrayList = GetAttributeSubIfcWindowPanelProperties.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWindowStyle")) {
				GetAttributeSubIfcWindowStyle GetAttributeSubIfcWindowStyle = new GetAttributeSubIfcWindowStyle(object, string);
				objectArrayList = GetAttributeSubIfcWindowStyle.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWorkControl")) {
				GetAttributeSubIfcWorkControl GetAttributeSubIfcWorkControl = new GetAttributeSubIfcWorkControl(object, string);
				objectArrayList = GetAttributeSubIfcWorkControl.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWorkPlan")) {
				GetAttributeSubIfcWorkPlan GetAttributeSubIfcWorkPlan = new GetAttributeSubIfcWorkPlan(object, string);
				objectArrayList = GetAttributeSubIfcWorkPlan.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcWorkSchedule")) {
				GetAttributeSubIfcWorkSchedule GetAttributeSubIfcWorkSchedule = new GetAttributeSubIfcWorkSchedule(object, string);
				objectArrayList = GetAttributeSubIfcWorkSchedule.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcZShapeProfileDef")) {
				GetAttributeSubIfcZShapeProfileDef GetAttributeSubIfcZShapeProfileDef = new GetAttributeSubIfcZShapeProfileDef(object, string);
				objectArrayList = GetAttributeSubIfcZShapeProfileDef.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("IfcZone")) {
				GetAttributeSubIfcZone GetAttributeSubIfcZone = new GetAttributeSubIfcZone(object, string);
				objectArrayList = GetAttributeSubIfcZone.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else if (((IfcRoot) object).eClass().getName().equals("RenderEnginePluginDescriptor")) {
				GetAttributeSubIfcEnginePluginDescriptor GetAttributeSubIfcEnginePluginDescriptor = new GetAttributeSubIfcEnginePluginDescriptor(object, string);
				objectArrayList = GetAttributeSubIfcEnginePluginDescriptor.getResult();
				arrayListArrayList.add(objectArrayList);
			}
			else {
			}
		}
		return arrayListArrayList;
	}
}
