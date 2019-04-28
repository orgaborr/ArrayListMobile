import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static MobilePhone contactList = new MobilePhone();

	public static void main(String[] args) {
		boolean quit = false;
		printInstructions();
		
		while(!quit) {
			int action = sc.nextInt();
			sc.nextLine();
			
			switch(action) {
			case 0:
				printInstructions();
				break;
			case 1:
				newContact();
				break;
			case 2:
				listContacts();
				break;
			case 3:
				modifyContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				searchContact();
				break;
			case 6:
				quit = true;
				break;
			}
		}
	
		sc.close();
	}
	
	public static void printInstructions() {
		System.out.println("Choose action: ");
		System.out.println("0: Print instructions");
		System.out.println("1: Add new contact");
		System.out.println("2: List contacts");
		System.out.println("3: Modify existing contact");
		System.out.println("4: Remove contact");
		System.out.println("5: Search contact ");
		System.out.println("6: Quit menu ");
	}
	
	public static void newContact() {
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter phone number: ");
		String phoneNumber = sc.nextLine();
		contactList.addContact(name, phoneNumber);
		System.out.println("Contact saved");
	}
	
	public static void listContacts() {
		contactList.listContacts();
	}
	
	public static void modifyContact() {
		System.out.println("Choose the contact you wish to chnage: ");
		int position = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new name: ");
		String name = sc.nextLine();
		System.out.println("Enter phone number: ");
		String phoneNumber = sc.nextLine();
		contactList.modifyContact(position, name, phoneNumber);
		System.out.println("Contact modified");
	}
	
	public static void removeContact() {
		System.out.println("Choose the contact you wish to remove: ");
		int position = sc.nextInt();
		sc.nextLine();
		contactList.removeContact(position);
		System.out.println("Contact removed");
	}
	
	public static void searchContact() {
		System.out.println("Enter contact name: ");
		String name = sc.nextLine();
		Contact contact = contactList.findContact(name);
		contactList.displayInfo(contact);
	}
	
	

}
