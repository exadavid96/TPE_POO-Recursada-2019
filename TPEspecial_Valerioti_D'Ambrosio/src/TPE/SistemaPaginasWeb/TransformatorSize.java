package TPE.SistemaPaginasWeb;

public class TransformatorSize extends Transformator {
	
	public Page transform(Page p) {
		
		
		Page aux = (Page) p.copyElement(p);
		Paragraph aux_p = new Paragraph(SIZE_FONT,TYPE_FONT, new Integer(aux.getSize()).toString());
		aux.addElement(aux_p);
		return aux;
		
	}
	
	
}
