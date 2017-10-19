/**
 * generated by Xtext 2.12.0
 */
package com.yakindu.solidity.solidity.impl;

import com.yakindu.solidity.solidity.Block;
import com.yakindu.solidity.solidity.ContractDefinition;
import com.yakindu.solidity.solidity.ContractType;
import com.yakindu.solidity.solidity.FunctionDefinition;
import com.yakindu.solidity.solidity.ImportDirective;
import com.yakindu.solidity.solidity.ModifierDefinition;
import com.yakindu.solidity.solidity.ModifierInvocationLiteral;
import com.yakindu.solidity.solidity.ParameterList;
import com.yakindu.solidity.solidity.PragmaDirective;
import com.yakindu.solidity.solidity.SolidityFactory;
import com.yakindu.solidity.solidity.SolidityModel;
import com.yakindu.solidity.solidity.SolidityPackage;
import com.yakindu.solidity.solidity.SourceUnit;
import com.yakindu.solidity.solidity.VariableDefinition;
import com.yakindu.solidity.solidity.Visibility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yakindu.base.base.BasePackage;

import org.yakindu.base.expressions.expressions.ExpressionsPackage;

import org.yakindu.base.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolidityPackageImpl extends EPackageImpl implements SolidityPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass solidityModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifierInvocationLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pragmaDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contractDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifierDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum contractTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum visibilityEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.yakindu.solidity.solidity.SolidityPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SolidityPackageImpl()
  {
    super(eNS_URI, SolidityFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SolidityPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SolidityPackage init()
  {
    if (isInited) return (SolidityPackage)EPackage.Registry.INSTANCE.getEPackage(SolidityPackage.eNS_URI);

    // Obtain or create and register package
    SolidityPackageImpl theSolidityPackage = (SolidityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SolidityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SolidityPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ExpressionsPackage.eINSTANCE.eClass();
    BasePackage.eINSTANCE.eClass();
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSolidityPackage.createPackageContents();

    // Initialize created meta-data
    theSolidityPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSolidityPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SolidityPackage.eNS_URI, theSolidityPackage);
    return theSolidityPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSolidityModel()
  {
    return solidityModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSolidityModel_Sourceunit()
  {
    return (EReference)solidityModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterList()
  {
    return parameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterList_Parameter()
  {
    return (EReference)parameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Expression()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModifierInvocationLiteral()
  {
    return modifierInvocationLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSourceUnit()
  {
    return sourceUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSourceUnit_Pragma()
  {
    return (EReference)sourceUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSourceUnit_Imports()
  {
    return (EReference)sourceUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPragmaDirective()
  {
    return pragmaDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPragmaDirective_Version()
  {
    return (EAttribute)pragmaDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportDirective()
  {
    return importDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportDirective_ImportedNamespace()
  {
    return (EAttribute)importDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportDirective_Alias()
  {
    return (EAttribute)importDirectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContractDefinition()
  {
    return contractDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractDefinition_Type()
  {
    return (EAttribute)contractDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDefinition()
  {
    return variableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_Visibility()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDefinition_InitialValue()
  {
    return (EReference)variableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModifierDefinition()
  {
    return modifierDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModifierDefinition_List()
  {
    return (EReference)modifierDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModifierDefinition_Block()
  {
    return (EReference)modifierDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDefinition()
  {
    return functionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDefinition_ReturnTypes()
  {
    return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDefinition_Block()
  {
    return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getContractType()
  {
    return contractTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVisibility()
  {
    return visibilityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SolidityFactory getSolidityFactory()
  {
    return (SolidityFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    solidityModelEClass = createEClass(SOLIDITY_MODEL);
    createEReference(solidityModelEClass, SOLIDITY_MODEL__SOURCEUNIT);

    parameterListEClass = createEClass(PARAMETER_LIST);
    createEReference(parameterListEClass, PARAMETER_LIST__PARAMETER);

    blockEClass = createEClass(BLOCK);
    createEReference(blockEClass, BLOCK__EXPRESSION);

    modifierInvocationLiteralEClass = createEClass(MODIFIER_INVOCATION_LITERAL);

    sourceUnitEClass = createEClass(SOURCE_UNIT);
    createEReference(sourceUnitEClass, SOURCE_UNIT__PRAGMA);
    createEReference(sourceUnitEClass, SOURCE_UNIT__IMPORTS);

    pragmaDirectiveEClass = createEClass(PRAGMA_DIRECTIVE);
    createEAttribute(pragmaDirectiveEClass, PRAGMA_DIRECTIVE__VERSION);

    importDirectiveEClass = createEClass(IMPORT_DIRECTIVE);
    createEAttribute(importDirectiveEClass, IMPORT_DIRECTIVE__IMPORTED_NAMESPACE);
    createEAttribute(importDirectiveEClass, IMPORT_DIRECTIVE__ALIAS);

    contractDefinitionEClass = createEClass(CONTRACT_DEFINITION);
    createEAttribute(contractDefinitionEClass, CONTRACT_DEFINITION__TYPE);

    variableDefinitionEClass = createEClass(VARIABLE_DEFINITION);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__VISIBILITY);
    createEReference(variableDefinitionEClass, VARIABLE_DEFINITION__INITIAL_VALUE);

    modifierDefinitionEClass = createEClass(MODIFIER_DEFINITION);
    createEReference(modifierDefinitionEClass, MODIFIER_DEFINITION__LIST);
    createEReference(modifierDefinitionEClass, MODIFIER_DEFINITION__BLOCK);

    functionDefinitionEClass = createEClass(FUNCTION_DEFINITION);
    createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__RETURN_TYPES);
    createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__BLOCK);

    // Create enums
    contractTypeEEnum = createEEnum(CONTRACT_TYPE);
    visibilityEEnum = createEEnum(VISIBILITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    modifierInvocationLiteralEClass.getESuperTypes().add(theExpressionsPackage.getLiteral());
    sourceUnitEClass.getESuperTypes().add(theTypesPackage.getPackage());
    pragmaDirectiveEClass.getESuperTypes().add(theTypesPackage.getPackageMember());
    importDirectiveEClass.getESuperTypes().add(theTypesPackage.getPackageMember());
    contractDefinitionEClass.getESuperTypes().add(theTypesPackage.getComplexType());
    variableDefinitionEClass.getESuperTypes().add(theTypesPackage.getProperty());
    modifierDefinitionEClass.getESuperTypes().add(theTypesPackage.getOperation());
    functionDefinitionEClass.getESuperTypes().add(theTypesPackage.getOperation());

    // Initialize classes and features; add operations and parameters
    initEClass(solidityModelEClass, SolidityModel.class, "SolidityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSolidityModel_Sourceunit(), theTypesPackage.getPackage(), null, "sourceunit", null, 0, -1, SolidityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterList_Parameter(), theTypesPackage.getParameter(), null, "parameter", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlock_Expression(), theExpressionsPackage.getExpression(), null, "expression", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifierInvocationLiteralEClass, ModifierInvocationLiteral.class, "ModifierInvocationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sourceUnitEClass, SourceUnit.class, "SourceUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSourceUnit_Pragma(), theTypesPackage.getPackageMember(), null, "pragma", null, 0, 1, SourceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSourceUnit_Imports(), theTypesPackage.getPackageMember(), null, "imports", null, 0, -1, SourceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pragmaDirectiveEClass, PragmaDirective.class, "PragmaDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPragmaDirective_Version(), ecorePackage.getEString(), "version", null, 0, 1, PragmaDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importDirectiveEClass, ImportDirective.class, "ImportDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportDirective_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ImportDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportDirective_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, ImportDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contractDefinitionEClass, ContractDefinition.class, "ContractDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContractDefinition_Type(), this.getContractType(), "type", null, 0, 1, ContractDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDefinitionEClass, VariableDefinition.class, "VariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDefinition_Visibility(), this.getVisibility(), "visibility", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDefinition_InitialValue(), theExpressionsPackage.getExpression(), null, "initialValue", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifierDefinitionEClass, ModifierDefinition.class, "ModifierDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModifierDefinition_List(), this.getParameterList(), null, "list", null, 0, 1, ModifierDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModifierDefinition_Block(), this.getBlock(), null, "block", null, 0, -1, ModifierDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDefinitionEClass, FunctionDefinition.class, "FunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionDefinition_ReturnTypes(), theTypesPackage.getTypeSpecifier(), null, "returnTypes", null, 0, -1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDefinition_Block(), this.getBlock(), null, "block", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(contractTypeEEnum, ContractType.class, "ContractType");
    addEEnumLiteral(contractTypeEEnum, ContractType.CONTRACT);
    addEEnumLiteral(contractTypeEEnum, ContractType.LIBRARY);
    addEEnumLiteral(contractTypeEEnum, ContractType.INTERFACE);

    initEEnum(visibilityEEnum, Visibility.class, "Visibility");
    addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
    addEEnumLiteral(visibilityEEnum, Visibility.INTERNAL);
    addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
    addEEnumLiteral(visibilityEEnum, Visibility.CONSTANT);

    // Create resource
    createResource(eNS_URI);
  }

} //SolidityPackageImpl
