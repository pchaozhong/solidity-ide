/**
 * generated by Xtext 2.12.0
 */
package com.yakindu.solidity.solidity.util;

import com.yakindu.solidity.solidity.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.yakindu.base.base.NamedElement;

import org.yakindu.base.expressions.expressions.Literal;

import org.yakindu.base.types.AnnotatableElement;
import org.yakindu.base.types.ComplexType;
import org.yakindu.base.types.Declaration;
import org.yakindu.base.types.GenericElement;
import org.yakindu.base.types.Operation;
import org.yakindu.base.types.PackageMember;
import org.yakindu.base.types.Property;
import org.yakindu.base.types.Type;
import org.yakindu.base.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.yakindu.solidity.solidity.SolidityPackage
 * @generated
 */
public class SolidityAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SolidityPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SolidityAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SolidityPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SoliditySwitch<Adapter> modelSwitch =
    new SoliditySwitch<Adapter>()
    {
      @Override
      public Adapter caseSolidityModel(SolidityModel object)
      {
        return createSolidityModelAdapter();
      }
      @Override
      public Adapter caseParameterList(ParameterList object)
      {
        return createParameterListAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseModifierInvocationLiteral(ModifierInvocationLiteral object)
      {
        return createModifierInvocationLiteralAdapter();
      }
      @Override
      public Adapter caseSourceUnit(SourceUnit object)
      {
        return createSourceUnitAdapter();
      }
      @Override
      public Adapter casePragmaDirective(PragmaDirective object)
      {
        return createPragmaDirectiveAdapter();
      }
      @Override
      public Adapter caseImportDirective(ImportDirective object)
      {
        return createImportDirectiveAdapter();
      }
      @Override
      public Adapter caseContractDefinition(ContractDefinition object)
      {
        return createContractDefinitionAdapter();
      }
      @Override
      public Adapter caseVariableDefinition(VariableDefinition object)
      {
        return createVariableDefinitionAdapter();
      }
      @Override
      public Adapter caseModifierDefinition(ModifierDefinition object)
      {
        return createModifierDefinitionAdapter();
      }
      @Override
      public Adapter caseFunctionDefinition(FunctionDefinition object)
      {
        return createFunctionDefinitionAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter casePackage(org.yakindu.base.types.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseAnnotatableElement(AnnotatableElement object)
      {
        return createAnnotatableElementAdapter();
      }
      @Override
      public Adapter casePackageMember(PackageMember object)
      {
        return createPackageMemberAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseGenericElement(GenericElement object)
      {
        return createGenericElementAdapter();
      }
      @Override
      public Adapter caseComplexType(ComplexType object)
      {
        return createComplexTypeAdapter();
      }
      @Override
      public Adapter caseTypedElement(TypedElement object)
      {
        return createTypedElementAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.solidity.solidity.SolidityModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.solidity.solidity.SolidityModel
   * @generated
   */
  public Adapter createSolidityModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.solidity.solidity.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.solidity.solidity.ParameterList
   * @generated
   */
  public Adapter createParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.solidity.solidity.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.solidity.solidity.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.solidity.solidity.ModifierInvocationLiteral <em>Modifier Invocation Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.solidity.solidity.ModifierInvocationLiteral
   * @generated
   */
  public Adapter createModifierInvocationLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.solidity.solidity.SourceUnit <em>Source Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.solidity.solidity.SourceUnit
   * @generated
   */
  public Adapter createSourceUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.solidity.solidity.PragmaDirective <em>Pragma Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.solidity.solidity.PragmaDirective
   * @generated
   */
  public Adapter createPragmaDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.solidity.solidity.ImportDirective <em>Import Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.solidity.solidity.ImportDirective
   * @generated
   */
  public Adapter createImportDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.solidity.solidity.ContractDefinition <em>Contract Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.solidity.solidity.ContractDefinition
   * @generated
   */
  public Adapter createContractDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.solidity.solidity.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.solidity.solidity.VariableDefinition
   * @generated
   */
  public Adapter createVariableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.solidity.solidity.ModifierDefinition <em>Modifier Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.solidity.solidity.ModifierDefinition
   * @generated
   */
  public Adapter createModifierDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.yakindu.solidity.solidity.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.yakindu.solidity.solidity.FunctionDefinition
   * @generated
   */
  public Adapter createFunctionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.expressions.expressions.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.expressions.expressions.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.base.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.base.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.types.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.types.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.types.AnnotatableElement <em>Annotatable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.types.AnnotatableElement
   * @generated
   */
  public Adapter createAnnotatableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.types.PackageMember <em>Package Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.types.PackageMember
   * @generated
   */
  public Adapter createPackageMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.types.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.types.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.types.GenericElement <em>Generic Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.types.GenericElement
   * @generated
   */
  public Adapter createGenericElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.types.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.types.ComplexType
   * @generated
   */
  public Adapter createComplexTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.types.TypedElement <em>Typed Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.types.TypedElement
   * @generated
   */
  public Adapter createTypedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.types.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.types.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.types.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.types.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yakindu.base.types.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yakindu.base.types.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SolidityAdapterFactory
