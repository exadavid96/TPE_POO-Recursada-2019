package TPE.SistemaPaginasWeb;

public class TransformatorFooter extends Transformator {
	
	private String footer;
	
	public TransformatorFooter(String footer) {
		
		this.footer = footer;
	}
	
	public String getFooter() {
		
		return this.footer;
	}
	
	public Page transform(Page p) {
		
		Page aux = (Page) p.copyElement(p);
		Paragraph aux_p = new Paragraph(SIZE_FONT,TYPE_FONT,this.getFooter());
		aux.addElement(aux_p);
		return aux;
		
	}
}
