import processing.core.PApplet;

public class Palabra {
	private PApplet app;
	private String nombre,apellido,cedula;
	private int edad,peso,r,g,b;
	
	public Palabra(PApplet app, String nombre, String apellido, String cedula,int edad, int peso,int r,int g, int b){
		
		this.app = app;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.edad = edad;
		this.peso =peso;
		this.r = r;
		this.g = g;
		this.b = b ;
		
	}
}
