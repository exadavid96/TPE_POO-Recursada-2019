package TPE.SistemaPaginasWeb;

import java.util.*;

public class Page extends Element {
	
	private List <Element> page;
	
	public Page() {
		
		page = new ArrayList<> ();
	}
	
	public int getBytes() {
		
		int c_bytes = 0;
		for(Element e : page)
			c_bytes += e.getBytes();
		return c_bytes;
	}
	
	public void addElement(Element e) {
		
		page.add(e);
	}
	
	public void addElement(Element e, int pos) {
		
		page.add(pos, e);
	}
	
	
	public void changeSize(boolean increase) {
		
		for(Element e : page)
			e.changeSize(increase);
	}
	
	public int getSize() {
		
		return page.size();	
	}
	
	public Element copyElement(Element e) {
		
		Page copy = new Page();
		for(Element elem: page) 
			copy.addElement(elem);
		
		return copy;
	}
	
	public Page transformPage(Page p, Transformator t ) {
		
		return t.transform(p);
		
	}
	
	@Override
	public String toString() {
		System.out.println("************************");
		String conc ="";
		for(Element e:page)
			 conc+=e.toString();
		
		return conc;
	}
	
	
}
