import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import processing.core.PApplet;

public class Logica {
	
	private PApplet app;
	private String[] nombreIni,datosIni,color;
	private ArrayList<Palabra> palabras;
	private ArrayList<Palabra> backup = new ArrayList<Palabra>();
	private TreeSet<Palabra> ord = new TreeSet<Palabra>(new CPeso());
	
	public Logica(PApplet app){
		this.app = app;
		nombreIni = app.loadStrings("../data/usuarios.txt");
		datosIni = app.loadStrings("informacion.txt");
		color = app.loadStrings("tonos.txt");
		
		palabras = new ArrayList<Palabra>();	
		dividirTexto();
	}
	
	public void dividirTexto(){
		for (int i = 0; i < nombreIni.length; i++) {
			String[] nombreDiv = nombreIni[i].split(":");
			String[] datosDiv = datosIni[i].split("/");
			String[] colorDiv = color[i].split("/");
			String nombre = nombreDiv[0];
			String apellido = nombreDiv[1];
			String cedula = datosDiv[0];
			int edad = Integer.valueOf(datosDiv[1]);
			int peso = Integer.valueOf(datosDiv[2]);
			int r = Integer.valueOf(colorDiv[0]);
			int g = Integer.valueOf(colorDiv[1]);
			int b = Integer.valueOf(colorDiv[2]);
			palabras.add(new Palabra(app,nombre,apellido,cedula,edad,peso,r,g,b));
			PApplet.printArray(peso);
		}
		
	backup.addAll(palabras);
	}
	
	public void pintar(){
		
		for (int i = 0; i < palabras.size(); i++) {
			Palabra p = palabras.get(i);
			p.pintar(100,70+(30*i));
		}
	}
	
	public void teclado() {
		
		if(app.key == '1'){
			//palabras.clear();
			//backup.addAll(palabras);
			Collections.sort(palabras);
		}
		
		if(app.key == '2'){
			palabras.clear();
			palabras.addAll(backup);
			Collections.sort(palabras, new CPeso());
		}
		
		if(app.key == '3'){
			palabras.clear();
			palabras.addAll(backup);
			Collections.sort(palabras, new CEdad());
		}
		
	}
	
}
