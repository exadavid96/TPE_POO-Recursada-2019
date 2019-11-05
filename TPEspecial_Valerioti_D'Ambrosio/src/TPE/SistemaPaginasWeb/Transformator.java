package TPE.SistemaPaginasWeb;

public abstract class Transformator {
	protected final int SIZE_FONT = 12;
	protected final String TYPE_FONT = "Comic Sans";
	
	public Transformator() {
		
	
	}
	
	public abstract Page transform(Page p);
	
	
}
