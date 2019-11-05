package TPE.SistemaPaginasWeb;

public class TransformatorSizePage extends Transformator {
	
	private boolean increase;
	
	public TransformatorSizePage(boolean increase) {
		
		this.increase = increase;
	}
	
	public boolean getIncrease() {
		
		return this.increase;
	}
	
	public Page transform(Page p) {
		
		Page aux = (Page) p.copyElement(p);
		aux.changeSize(this.getIncrease());
		return aux;
	}
	
}
