import processing.core.PApplet;

public class Palabra implements Comparable<Palabra>{
	
	private PApplet app;
	private String nombre,apellido,cedula;
	private int edad,peso,r,g,b,posX,posY;
	
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
		posX = 100;
		posY = 100;
		
	}
	
	public void pintar(int x, int y){
		app.fill(r,g,b);
		app.text(nombre + " " + apellido + " " + cedula + " " + edad + " "+ peso + " " , x, y);
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	@Override
	public int compareTo(Palabra o) {
		return this.peso - o.getPeso();
	}
}
