/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Algorithme;
import org.xtext.example.mydsl.myDsl.Delimiteur;
import org.xtext.example.mydsl.myDsl.Fichier;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Predire;
import org.xtext.example.mydsl.myDsl.Regression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RegressionImpl#getFichier <em>Fichier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RegressionImpl#getDelimiteur <em>Delimiteur</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RegressionImpl#getAlgorithme <em>Algorithme</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RegressionImpl#getPredire <em>Predire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegressionImpl extends MinimalEObjectImpl.Container implements Regression
{
  /**
   * The cached value of the '{@link #getFichier() <em>Fichier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFichier()
   * @generated
   * @ordered
   */
  protected Fichier fichier;

  /**
   * The cached value of the '{@link #getDelimiteur() <em>Delimiteur</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimiteur()
   * @generated
   * @ordered
   */
  protected Delimiteur delimiteur;

  /**
   * The default value of the '{@link #getAlgorithme() <em>Algorithme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgorithme()
   * @generated
   * @ordered
   */
  protected static final Algorithme ALGORITHME_EDEFAULT = Algorithme.TREE_REGRESSION;

  /**
   * The cached value of the '{@link #getAlgorithme() <em>Algorithme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgorithme()
   * @generated
   * @ordered
   */
  protected Algorithme algorithme = ALGORITHME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPredire() <em>Predire</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredire()
   * @generated
   * @ordered
   */
  protected Predire predire;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.REGRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fichier getFichier()
  {
    return fichier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFichier(Fichier newFichier, NotificationChain msgs)
  {
    Fichier oldFichier = fichier;
    fichier = newFichier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.REGRESSION__FICHIER, oldFichier, newFichier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFichier(Fichier newFichier)
  {
    if (newFichier != fichier)
    {
      NotificationChain msgs = null;
      if (fichier != null)
        msgs = ((InternalEObject)fichier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REGRESSION__FICHIER, null, msgs);
      if (newFichier != null)
        msgs = ((InternalEObject)newFichier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REGRESSION__FICHIER, null, msgs);
      msgs = basicSetFichier(newFichier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REGRESSION__FICHIER, newFichier, newFichier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Delimiteur getDelimiteur()
  {
    return delimiteur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelimiteur(Delimiteur newDelimiteur, NotificationChain msgs)
  {
    Delimiteur oldDelimiteur = delimiteur;
    delimiteur = newDelimiteur;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.REGRESSION__DELIMITEUR, oldDelimiteur, newDelimiteur);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDelimiteur(Delimiteur newDelimiteur)
  {
    if (newDelimiteur != delimiteur)
    {
      NotificationChain msgs = null;
      if (delimiteur != null)
        msgs = ((InternalEObject)delimiteur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REGRESSION__DELIMITEUR, null, msgs);
      if (newDelimiteur != null)
        msgs = ((InternalEObject)newDelimiteur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REGRESSION__DELIMITEUR, null, msgs);
      msgs = basicSetDelimiteur(newDelimiteur, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REGRESSION__DELIMITEUR, newDelimiteur, newDelimiteur));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Algorithme getAlgorithme()
  {
    return algorithme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlgorithme(Algorithme newAlgorithme)
  {
    Algorithme oldAlgorithme = algorithme;
    algorithme = newAlgorithme == null ? ALGORITHME_EDEFAULT : newAlgorithme;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REGRESSION__ALGORITHME, oldAlgorithme, algorithme));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Predire getPredire()
  {
    return predire;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredire(Predire newPredire, NotificationChain msgs)
  {
    Predire oldPredire = predire;
    predire = newPredire;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.REGRESSION__PREDIRE, oldPredire, newPredire);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPredire(Predire newPredire)
  {
    if (newPredire != predire)
    {
      NotificationChain msgs = null;
      if (predire != null)
        msgs = ((InternalEObject)predire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REGRESSION__PREDIRE, null, msgs);
      if (newPredire != null)
        msgs = ((InternalEObject)newPredire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REGRESSION__PREDIRE, null, msgs);
      msgs = basicSetPredire(newPredire, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REGRESSION__PREDIRE, newPredire, newPredire));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.REGRESSION__FICHIER:
        return basicSetFichier(null, msgs);
      case MyDslPackage.REGRESSION__DELIMITEUR:
        return basicSetDelimiteur(null, msgs);
      case MyDslPackage.REGRESSION__PREDIRE:
        return basicSetPredire(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.REGRESSION__FICHIER:
        return getFichier();
      case MyDslPackage.REGRESSION__DELIMITEUR:
        return getDelimiteur();
      case MyDslPackage.REGRESSION__ALGORITHME:
        return getAlgorithme();
      case MyDslPackage.REGRESSION__PREDIRE:
        return getPredire();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.REGRESSION__FICHIER:
        setFichier((Fichier)newValue);
        return;
      case MyDslPackage.REGRESSION__DELIMITEUR:
        setDelimiteur((Delimiteur)newValue);
        return;
      case MyDslPackage.REGRESSION__ALGORITHME:
        setAlgorithme((Algorithme)newValue);
        return;
      case MyDslPackage.REGRESSION__PREDIRE:
        setPredire((Predire)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.REGRESSION__FICHIER:
        setFichier((Fichier)null);
        return;
      case MyDslPackage.REGRESSION__DELIMITEUR:
        setDelimiteur((Delimiteur)null);
        return;
      case MyDslPackage.REGRESSION__ALGORITHME:
        setAlgorithme(ALGORITHME_EDEFAULT);
        return;
      case MyDslPackage.REGRESSION__PREDIRE:
        setPredire((Predire)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.REGRESSION__FICHIER:
        return fichier != null;
      case MyDslPackage.REGRESSION__DELIMITEUR:
        return delimiteur != null;
      case MyDslPackage.REGRESSION__ALGORITHME:
        return algorithme != ALGORITHME_EDEFAULT;
      case MyDslPackage.REGRESSION__PREDIRE:
        return predire != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (algorithme: ");
    result.append(algorithme);
    result.append(')');
    return result.toString();
  }

} //RegressionImpl