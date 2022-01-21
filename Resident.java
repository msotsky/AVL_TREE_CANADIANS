/**
 * @author Liam Keliher
 * @version 2021
 * 
 * Class to store information for a resident.
 */
public class Resident implements Comparable<Resident> {
	private String fName;
	private String lName;
	private String street;
	private String city;
	private String prov;
	private String postal;
	private String phone;
	private String email;
	//--------------------------------------------------------------------
	public Resident(String fName, String lName, String street, String city, String prov, String postal, String phone, String email) {
		this.fName = fName;
		this.lName = lName;
		this.street = street;
		this.city = city;
		this.prov = prov;
		this.postal = postal;
		this.phone = phone;
		this.email = email;
	} // constructor Resident(String,String,String,String,String,String,String,String)
	//--------------------------------------------------------------------
	/**
	 * Returns a clone of *this* Resident object.
	 * 
	 * Overrides the clone() method inherited from Object.
	 */
     @Override
	public Resident clone() {
		return new Resident(fName, lName, street, city, prov, postal, phone, email);
	} // clone()
	//--------------------------------------------------------------------
	@Override
	public int compareTo(Resident other) {
		return this.email.compareTo(other.email);
	} // compareTo(Resident)
	//--------------------------------------------------------------------
	public String getFirstName() {
		return fName;
	} // getFirstName()
	//--------------------------------------------------------------------
	public String getLastName() {
		return lName;
	} // getLastName()
	//--------------------------------------------------------------------
	public String getStreet() {
		return street;
	} // getStreet()
	//--------------------------------------------------------------------
	public String getCity() {
		return city;
	} // getCity()
	//--------------------------------------------------------------------
	public String getProvince() {
		return prov;
	} // getProvince()
	//--------------------------------------------------------------------
	public String getPostalCode() {
		return postal;
	} // getPostalCode()
	//--------------------------------------------------------------------
	public String getPhone() {
		return phone;
	} // getPhone()
	//--------------------------------------------------------------------
	public String getEmail() {
		return email;
	} // getEmail()
	//--------------------------------------------------------------------
} // class Resident
