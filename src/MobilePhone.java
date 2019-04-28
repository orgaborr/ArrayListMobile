import java.util.ArrayList;

public class MobilePhone {
	private ArrayList<Contact> contactList = new ArrayList<>();
	
	public void addContact(String name, String phoneNumber) {
		Contact contact = new Contact(name, phoneNumber);
		contactList.add(contact);
	}
	
	public void listContacts() {
		System.out.println("Your contacts are: ");
		for(int i=0; i<contactList.size(); i++) {
			System.out.println((i+1) + ". " + contactList.get(i).getName() + ", " + contactList.get(i).getPhoneNumber());
		}
	}
	
	public void modifyContact(int position, String name, String phoneNumber) {
		Contact contact = new Contact(name, phoneNumber);
		contactList.set(position-1, contact);
	}
	
	public void removeContact(int position) {
		contactList.remove(position-1);
	}
	
	public Contact findContact(String name) {
		for(int i=0; i<contactList.size(); i++) {
			if(name.equals(contactList.get(i).getName())) {
				return contactList.get(i);
			}
		}
		
		return null;
	}
	
	public void displayInfo(Contact contact) {
		System.out.println(contactList.indexOf(contact)+1 + ". " + contact.getName() + ", " + contact.getPhoneNumber());
	}

}
