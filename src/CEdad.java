import java.util.Comparator;

public class CEdad implements Comparator<Palabra>{

	@Override
	public int compare(Palabra o1, Palabra o2) {

		return o1.getEdad() - o2.getEdad();
	}

}
