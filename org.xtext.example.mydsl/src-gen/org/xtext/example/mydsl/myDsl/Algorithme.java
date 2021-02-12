/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.myDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Algorithme</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAlgorithme()
 * @model
 * @generated
 */
public enum Algorithme implements Enumerator
{
  /**
   * The '<em><b>Tree Regression</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TREE_REGRESSION_VALUE
   * @generated
   * @ordered
   */
  TREE_REGRESSION(0, "TreeRegression", "TR"),

  /**
   * The '<em><b>SVM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SVM_VALUE
   * @generated
   * @ordered
   */
  SVM(1, "SVM", "SVM"),

  /**
   * The '<em><b>Linear</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINEAR_VALUE
   * @generated
   * @ordered
   */
  LINEAR(2, "Linear", "Linear");

  /**
   * The '<em><b>Tree Regression</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TREE_REGRESSION
   * @model name="TreeRegression" literal="TR"
   * @generated
   * @ordered
   */
  public static final int TREE_REGRESSION_VALUE = 0;

  /**
   * The '<em><b>SVM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SVM
   * @model
   * @generated
   * @ordered
   */
  public static final int SVM_VALUE = 1;

  /**
   * The '<em><b>Linear</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINEAR
   * @model name="Linear"
   * @generated
   * @ordered
   */
  public static final int LINEAR_VALUE = 2;

  /**
   * An array of all the '<em><b>Algorithme</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Algorithme[] VALUES_ARRAY =
    new Algorithme[]
    {
      TREE_REGRESSION,
      SVM,
      LINEAR,
    };

  /**
   * A public read-only list of all the '<em><b>Algorithme</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Algorithme> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Algorithme</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Algorithme get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Algorithme result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Algorithme</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Algorithme getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Algorithme result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Algorithme</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Algorithme get(int value)
  {
    switch (value)
    {
      case TREE_REGRESSION_VALUE: return TREE_REGRESSION;
      case SVM_VALUE: return SVM;
      case LINEAR_VALUE: return LINEAR;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Algorithme(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Algorithme
