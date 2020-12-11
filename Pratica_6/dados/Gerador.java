package dados;

import java.util.List;
import java.util.ArrayList;

public abstract class Gerador {
	protected List<Integer> sequencia = new ArrayList();
	
	public abstract void gerar(int quantidade);
	
	public abstract List<Integer> getSequencia();
	
	
}
