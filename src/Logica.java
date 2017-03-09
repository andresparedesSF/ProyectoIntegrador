import java.util.ArrayList;

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
		dividirTexto();
	}
	
	public void dividirTexto(){
		for (int i = 0; i < nombreIni.length; i++) {
			String[] nombreDiv = nombreIni[i].split(":");
			String[] datosDiv = datosIni[i].split("/");
			String[] colorDiv = color[i].split("/");
			String nombre = nombreIni[0];
			String apellido = nombreIni[1];
			String cedula = datosIni[0];
			int edad = Integer.parseInt(datosIni[1]);
			int peso = Integer.parseInt(datosIni[2]);
			int r = Integer.parseInt(color[0]);
			int g = Integer.parseInt(color[1]);
			int b = Integer.parseInt(color[2]);

			palabras.add(new Palabra(app,nombre,apellido,cedula,edad,peso,r,g,b));
		}
	}
	
	public void pintar(){
		for (int i = 0; i < nombreIni.length; i++) {
			Palabra p = palabras.get(i);
			p.pintar();
		}
	}
	
}
