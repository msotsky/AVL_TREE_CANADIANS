/**
 * @author Liam Keliher
 * @version 2021
 * 
 * A node for an AVL tree that stores a database of residents.
 */
public class AVL_Node implements Comparable<AVL_Node> {
	public static final int NONSENSE_BALANCE_FACTOR = -999;

	private Resident resident;
	private AVL_Node parent;
	private AVL_Node leftChild;
	private AVL_Node rightChild;
	private int bFactor;   // balance factor
	//--------------------------------------------------------------------
	public AVL_Node() {
		resident = null;
		parent = null;
		leftChild = null;
		rightChild = null;
		bFactor = NONSENSE_BALANCE_FACTOR;
	} // constructor AVL_Node()
	//--------------------------------------------------------------------
	public AVL_Node(Resident res) {
		this();
		setResident(res);
	} // constructor AVL_Node(Resident)
	//--------------------------------------------------------------------
	public AVL_Node(Resident res, AVL_Node par, AVL_Node left, AVL_Node right, int bf) {
		resident = res.clone();   // defensive copy
		parent = par;
		leftChild = left;
		rightChild = right;
		bFactor = bf;
	} // constructor AVL_Node(Resident,AVL_Node,AVL_Node,AVL_Node,int)
	//--------------------------------------------------------------------
	/**
	 * Returns a new AVL_Node object whose internal data (in the resident
     * instance variable) are the same as those of this node, but whose links
     * are set to null, and whose balance factor is NONSENSE_BALANCE_FACTOR.
	 * 
	 * Overrides the clone() method inherited from Object.
	 */
	@Override
	public AVL_Node clone() {
		return new AVL_Node(resident.clone(), null, null, null, NONSENSE_BALANCE_FACTOR);
	} // clone()
	//--------------------------------------------------------------------
	@Override
	/**
	 * Implements compareTo in the Comparable interface.
	 */
	public int compareTo(AVL_Node other) {
		return this.getResident().compareTo(other.getResident());
	} // compareTo(AVL_Node)
	//--------------------------------------------------------------------
    // Returns a defensive copy of the resident instance variable
	public Resident getResident() {
		return resident.clone();
	} // getResident()
	//--------------------------------------------------------------------
	public AVL_Node getParent() {
		return parent;
	} // getParent()
	//--------------------------------------------------------------------
	public AVL_Node getLeftChild() {
		return leftChild;
	} // getLeftChild()
	//--------------------------------------------------------------------
	public AVL_Node getRightChild() {
		return rightChild;
	} // getRightChild()
	//--------------------------------------------------------------------
	public int getBalanceFactor() {
		return bFactor;
	} // getBalanceFactor()
	//--------------------------------------------------------------------
	public void setResident(Resident res) {
		resident = res.clone();
	} // setResident()
	//--------------------------------------------------------------------
	public void setParent(AVL_Node newParent) {
		parent = newParent;
	} // setParent(AVL_Node)
	//--------------------------------------------------------------------
	public void setLeftChild(AVL_Node newLeft) {
		leftChild = newLeft;
	} // setLeftChild(AVL_Node)
	//--------------------------------------------------------------------
	public void setRightChild(AVL_Node newRight) {
		rightChild = newRight;
	} // setRightChild(AVL_Node)
	//--------------------------------------------------------------------
	public void setBalanceFactor(int newBF) {
		bFactor = newBF;
	} // setBalanceFactor(int)
	//--------------------------------------------------------------------
} // class AVL_Node
