/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl;

import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;

import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.OmtPackageImpl;

import edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.Federate;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.RtiapiFactory;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.RtiapiPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtiapiPackageImpl extends EPackageImpl implements RtiapiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass federateEClass = null;

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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.RtiapiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RtiapiPackageImpl() {
		super(eNS_URI, RtiapiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RtiapiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RtiapiPackage init() {
		if (isInited) return (RtiapiPackage)EPackage.Registry.INSTANCE.getEPackage(RtiapiPackage.eNS_URI);

		// Obtain or create and register package
		RtiapiPackageImpl theRtiapiPackage = (RtiapiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RtiapiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RtiapiPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OmtPackageImpl theOmtPackage = (OmtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OmtPackage.eNS_URI) instanceof OmtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OmtPackage.eNS_URI) : OmtPackage.eINSTANCE);

		// Load packages
		theOmtPackage.loadPackage();

		// Create package meta-data objects
		theRtiapiPackage.createPackageContents();

		// Initialize created meta-data
		theRtiapiPackage.initializePackageContents();

		// Fix loaded packages
		theOmtPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRtiapiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RtiapiPackage.eNS_URI, theRtiapiPackage);
		return theRtiapiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederate() {
		return federateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtiapiFactory getRtiapiFactory() {
		return (RtiapiFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		federateEClass = createEClass(FEDERATE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(federateEClass, Federate.class, "Federate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RtiapiPackageImpl
