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
		System.out.println("---------");
		int basis = 2;
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    System.out.println("Potenziert wird nun die Zahl 2 mit einer Potenz deiner Wahl");
	    System.out.println("Gib eine Zahl ein: ");
	    String eingabe = br.readLine();
	    System.out.println("Du hast " + eingabe + " eingegeben.");
	    int potenz = Integer.valueOf(eingabe);
		int summe = 1;
		for (int i=1; i<=potenz; i++){
			
			summe = summe*basis;
			
		}
		System.out.println("das Ergebnis ist: "+summe);
	}

}
