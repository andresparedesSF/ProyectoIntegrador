import processing.core.PApplet;

public class MainApp extends PApplet{

	public static void main(String[] args) {
		PApplet.main("MainApp");
	}

	Logica app;
	
	@Override
	public void settings() {
		size(600,400);
	}
	
	@Override
	public void setup() {
		app = new Logica(this);
	}
	
	@Override
	public void draw() {
		app.pintar();
	}
}
