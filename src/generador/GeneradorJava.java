package generador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneradorJava {

	public Map<String, List<String>> leerArchivo() {
		BufferedReader br = null;
		Map<String, List<String>> diccionario = new HashMap<>();

		try {
			br = new BufferedReader(new FileReader("meta.txt"));
			String linea;
			Pattern pattern = Pattern.compile("(\\w+) = \\{\\((\\w+):(\\w+)\\),\\((\\w+):(\\w+)\\)\\}");

			while ((linea = br.readLine()) != null) {
				// Encuentra coincidencia con Regex
				Matcher matcher = pattern.matcher(linea);

				// Verifica si la cadena completa coincide con el patrón
				if (matcher.matches()) {
					String clase = matcher.group(1);
					String atributo1 = matcher.group(2);
					String tipo1 = matcher.group(3);
					String atributo2 = matcher.group(4);
					String tipo2 = matcher.group(5);

					// Proporciona una lista vacía si la clave no está presente
					List<String> atributosTipos = diccionario.getOrDefault(clase, new ArrayList<String>());
					atributosTipos.add(atributo1);
					atributosTipos.add(tipo1);
					atributosTipos.add(atributo2);
					atributosTipos.add(tipo2);

					diccionario.put(clase, atributosTipos);
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return diccionario;
	}

	public void generarJavaDesdeDiccinario() {

		Map<String, List<String>> datosCargados = leerArchivo();

		try {
			BufferedWriter bw = null;

			for (Map.Entry<String, List<String>> entry : datosCargados.entrySet()) {
				String key = entry.getKey();
				List<String> val = entry.getValue();

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {
		GeneradorJava gj = new GeneradorJava();
		gj.leerArchivo();

	}

}
