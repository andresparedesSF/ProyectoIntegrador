import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;

public class Logica {
	
	private PApplet app;
	private String[] nombreIni,datosIni,color;
	private ArrayList<Palabra> palabras;
	
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
			PApplet.printArray(peso);
			palabras.add(new Palabra(app,nombre,apellido,cedula,edad,peso,r,g,b));
		}
	}
	
	public void pintar(){
		
		for (int i = 0; i < palabras.size(); i++) {
			Palabra p = palabras.get(i);
			p.pintar(100,70+(30*i));
		}
	}
	
	public void teclado() {
		
		if(app.key == 'q'){
			Collections.sort(palabras);
		}
		
		
	}
	
}
