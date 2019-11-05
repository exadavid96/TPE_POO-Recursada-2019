package TPE.SistemaPaginasWeb;

import java.util.*;

public class Style extends Transformator {
	
	private String name;
	private List <Transformator> t;
	
	
	public void setName(String name) {
		
		this.name = name;
	}
	

	
	public Style (String name) {
		
		
		setName(name);
		t = new ArrayList<Transformator> ();
		
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void addTransformator(Transformator tr) {
		
		t.add(tr);
	}
	
	public Page transform(Page p) {
		
		Page aux = (Page) p.copyElement(p);
		for( Transformator tr : t)
			aux = tr.transform(aux);
		return aux;
	}
}
