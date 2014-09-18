import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ZahlenQuadrieren {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		for (int i=1; i<=10; i++){
			int summe = i*i;
			System.out.println(summe);
		}	    
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
		System.out.println("---------");
		System.out.println("Potenziere Zahlen:");
		System.out.println("");
	    System.out.println("Gib eine Zahl ein: ");
	    String eingabe1 = br.readLine();
		int basis = Integer.valueOf(eingabe1);
	    System.out.println("Du hast " + eingabe1 + " eingegeben.");
	    System.out.println("");
	    System.out.println("Potenziert wird nun die Zahl "+eingabe1+" mit einer Potenz deiner Wahl");
	    System.out.println("Gib eine Zahl ein: ");
	    String eingabe = br.readLine();
	    System.out.println("Du hast " + eingabe + " eingegeben.");
	    int potenz = Integer.valueOf(eingabe);
		int summe = 1;
		for (int i=1; i<=potenz; i++){
			
			summe = summe*basis;
			
		}
		System.out.println("");
		System.out.println("das Ergebnis ist: "+summe);
		System.out.println("Auf wiedersehen");
	}

}
