package addressBook;
import java.util.Scanner;

class Contact{
	public final String firstName;
	public final String lastName;
	public final String address;
	public final String city;
	public final String state;
	public final String zip;
	public final String phoneNumber;
	public final String email;

	public Contact(String firstName, String lastName, String address, String city , String state, String zip, String phoneNumber, String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String toString(){
		return "Details of: "+ firstName+ " "+lastName+"\n"
									+"Address: "+address+"\n"
									+"City: "+city+"\n"
									+"State: "+state+"\n"
									+"Zip: "+zip+"\n"
									+"Phone Number: "+phoneNumber+"\n"
									+"Email: "+email;
	}
}

public class AddressBook {
	private int numOfContacts = 0;
	private Contact[] contact;

	public AddressBook(){
		contact = new Contact[3];
	}

	public void details(String firstName, String lastName, String address, String city , String state, String zip, String phoneNumber1, String email){
		contact [ numOfContacts ] = new Contact(firstName, lastName, address, city, state, zip, phoneNumber1, email);
		numOfContacts++;
	}

	private void AddDetails(){
		for (int i=0; i<numOfContacts; i++){
			System.out.println(contact[i]);
		}
		System.out.println("Contact added Successfully!");
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book Problem\n");
		
		AddressBook user = new AddressBook();
		user.details("Surendra", "Chouhan", "Wadala", "Mumbai", "Maharashtra", "400037", "855811692", "surendra@gmail.com");
		user.AddDetails();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number Of Contacts to Add");
		int numOfContact=sc.nextInt();
		for (int i = 1; i <= numOfContact; i++) 
		{
			System.out.println("Enter no. of details of: "+i);

			System.out.println("Enter FirstName");
			String firstName=sc.next();
			System.out.println("Enter LastName");
			String lastName=sc.next();
			System.out.println("Enter Address");
			String address=sc.next();
			System.out.println("Enter City");
			String city=sc.next();
			System.out.println("Enter State");
			String state=sc.next();
			System.out.println("Enter ZipCode");
			String zip=sc.next();
			System.out.println("Enter PhoneNumber");
			String phoneNumber=sc.next();
			System.out.println("Enter Email");
			String email=sc.next();
		
			user.details(firstName, lastName, address, city, state, zip, phoneNumber, email);
			user.AddDetails();
		}
	}
}