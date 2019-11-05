package TPE.SistemaPaginasWeb;

public class TransformatorBytes extends Transformator {
	
	public Page transform(Page p) {
		
		Page aux = new Page();
		aux = (Page) p.copyElement(p);
		Paragraph aux_p = new Paragraph(SIZE_FONT,TYPE_FONT, new Integer(aux.getBytes()).toString());
		aux.addElement(aux_p); 
		return aux;
		
	}
	
}
