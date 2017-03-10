import java.util.Comparator;

public class CPeso implements Comparator<Palabra>{

	@Override
	public int compare(Palabra arg0, Palabra arg1) {
		return arg1.getPeso() - arg0.getPeso();
	}



}
