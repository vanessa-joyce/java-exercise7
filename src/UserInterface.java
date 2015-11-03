import java.util.Scanner;
public class UserInterface {

	public static void main(String[] args) {
		Kundenmanager kMan = new Kundenmanager();

		String cmdInput = "";
		Scanner keyScan = new Scanner(System.in);
		while (!cmdInput.equals("exit")) {
			System.out.print("\nCMD>");
			cmdInput = keyScan.nextLine();
			if (cmdInput.equals("addKunde")) {
				System.out.print("Name>");
				String name = keyScan.nextLine();
				System.out.print("Adresse>");
				String adresse = keyScan.nextLine();
				System.out.print("Marge>");
				double marge = keyScan.nextDouble();
				keyScan.nextLine();
				kMan.addKunde(name, adresse, marge);
			} else if (cmdInput.equals("setMarge")) {
				System.out.print("Kundennummer>");
				int kundenNo = keyScan.nextInt();
				kundenNo -= 1;
				keyScan.nextLine();
				System.out.print("Marge>");
				double marge = keyScan.nextDouble();
				keyScan.nextLine();
				Kunde k = kMan.getKunde(kundenNo);
				k.setMarge(marge);
			} else if (cmdInput.equals("printKunden")) {
				kMan.printAllKunden();
			} 
		}
	}
}