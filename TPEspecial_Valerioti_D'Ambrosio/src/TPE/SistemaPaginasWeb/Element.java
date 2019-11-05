package TPE.SistemaPaginasWeb;

public abstract class Element {
	
	public Element() {
		
	}
	
	public abstract int getBytes();
	public abstract void changeSize(boolean increase);
	protected abstract Element copyElement(Element e);
	public abstract String toString();
	
}
