package TPE.SistemaPaginasWeb;

public class Link extends Element {
	
	private Page page;
	
	public void setPage(Page page) {
		
		this.page = page;
	}
	
	public Link() {
		
	}
	
	public Link (Page page) {
		
		setPage(page);
	}
	
	public Page getPage() {
		
		return page;
	}
	
	public int getBytes() {
		
		return this.page.getBytes(); 
	}
	
	public void changeSize(boolean increase) {
		
	}
	
	public Element copyElement(Element e) {
		
		return this.page.copyElement(e);
	}
	
	@Override
	public String toString() {
		return this.page.toString();
	}
	
	
	
	
}
