import java.util.Comparator;

public class CPeso implements Comparator<Palabra>{

	@Override
	public int compare(Palabra arg0, Palabra arg1) {
		return arg0.getPeso() - arg1.getPeso();
	}



}
