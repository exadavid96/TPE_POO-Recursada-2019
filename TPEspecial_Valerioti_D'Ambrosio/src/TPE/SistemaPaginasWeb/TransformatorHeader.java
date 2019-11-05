package TPE.SistemaPaginasWeb;

public class TransformatorHeader extends Transformator {
	
	private String header;
	
	public TransformatorHeader(String header) {
		
		this.header = header;
	}
	
	public String getHeader() {
		
		return this.header;
	}
	
	public Page transform(Page p) {
		
		Page aux = (Page) p.copyElement(p);
		Paragraph aux_p = new Paragraph(SIZE_FONT,TYPE_FONT,this.getHeader());
		aux.addElement(aux_p, 0);
		return aux;
		
	}
	
}
