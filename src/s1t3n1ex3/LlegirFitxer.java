package s1t3n1ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LlegirFitxer {

	public void dataToHashMap() {
		String linea = "";
		String country = "";
		String capital = "";
		char lletra = ' ';
		FileReader fitxerCapitals = null;
		BufferedReader buffer = null;
		Map<String, String> hashMap = new HashMap<>();

		try {
			fitxerCapitals = new FileReader("C:\\Users\\Arnau\\eclipse-workspace\\S1T3n1ex3\\countries.txt");
			buffer = new BufferedReader(fitxerCapitals);
			
			while(linea != null) {
				
				for(int i = 0; i < linea.length(); i++) {
					if(linea.charAt(i) != ' ' ) {
						country = country + linea.charAt(i);
					}else {
						i = linea.length();
					}
				}

				for(int i = (country.length() + 1); i < (linea.length()); i++) {
					capital = capital + linea.charAt(i);
				}
				
				hashMap.put(country, capital);
				linea = buffer.readLine();
			}
			System.out.println(hashMap.get("Moldova"));
			
		} catch (IOException e) {
			System.out.println("No s'ha trobat l'arxiu.");

		}finally {
			try {
				fitxerCapitals.close();
				buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static public void recorrerFitxer() {
		
	}

}
