package s1t3n1ex3;

import java.io.FileWriter;
import java.io.IOException;

public class EscriureFitxer {
	
	public void escriure() {
		String frase = "Estic escrivint.";
		
		try {
			FileWriter escriptura = new FileWriter("C:\\\\Users\\Arnau\\eclipse-workspace\\S1T3n1ex3\\classificacio.txt", true);
			
			for(int i = 0; i < frase.length(); i++) {
				escriptura.write(frase.charAt(i));
			}
			
			escriptura.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
