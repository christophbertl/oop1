
import java.util.Scanner;


public class Main {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("Hallo Welt");
	//}

	
	public static String mainMenu(Scanner scanner) {
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("Fahrzeug anlegen: 1");
		System.out.println("Kunde anlegen: 2");
		System.out.println("verfügbare Fahrzeuge anzeigen: 3");
		System.out.println("Fahrzeug mieten: 4");
		System.out.println("Fahrzeug zurückgeben: 5");
		System.out.println("Beenden: 6");
		return scanner.nextLine();
	}
	
	
	
	
	public static void main(String[] args) {
		// create necessary variables
		Scanner scanner = new Scanner(System.in);
		String eingabe;
		//List<Contact> contacts = new ArrayList<>();
		String fahrzeug, name, vorname;

		while (true) {
			// display main menu
			eingabe = mainMenu(scanner);
			
			// create simple contact
			if (eingabe.equals("1")) {
				// get name and surname
				System.out.println("    Fahrzeug anlegen");
				System.out.print("    Fahrzeug:");
				fahrzeug = scanner.nextLine();
			
				// create object
				//Contact contact = new Contact(name, vorname);
				
				// add mail address if valid to object and add object to list
				//contacts = addMail(contacts, contact, scanner);
				
			}
			// create business contact
			else if (eingabe.equals("2")) {
				// get name and surname
				System.out.println("    Kunde anlegen");
				System.out.print("    Name:");
				name = scanner.nextLine();
				System.out.print("    Vorname:");
				vorname = scanner.nextLine();
				
				// create object
				//CompanyContact compContact = new CompanyContact(name, vorname);
				
				// add mail address if valid to object and add object to list
				//contacts = addMail(contacts, compContact, scanner);
			}
			else if (eingabe.equals("3")) {
				// get name and surname
				System.out.println("     verfügbare Fahrzeuge anzeigen");
				System.out.print("    verfügbare Fahrzeuge:");
				fahrzeug = scanner.nextLine();
				
			}
			
			
			else if (eingabe.equals("4")) {
				// get name and surname
				System.out.println("    Fahrzeug mieten");
				System.out.print("    gemietetes Fahrzeug:");
				fahrzeug = scanner.nextLine();
				
			}
			
			else if (eingabe.equals("5")) {
				// get name and surname
				System.out.println("    Fahrzeug zurückgeben");
				System.out.print("    zurück gegebenes Fahrzeug:");
				fahrzeug = scanner.nextLine();
				}
			
			
			
			
			else if (eingabe.equals("6")) {
				break;
			}
		
		}
		System.out.println("beendet");
		scanner.close();
	}

}

	
	
	
	
	
	
	
	
	
	
	

