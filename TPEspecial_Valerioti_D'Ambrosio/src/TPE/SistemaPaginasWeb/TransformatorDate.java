package TPE.SistemaPaginasWeb;

import java.util.*;

public class TransformatorDate extends Transformator {
	
	
	public Page transform(Page p) {
		
		Page aux = (Page) p.copyElement(p);
		Paragraph aux_p = new Paragraph(SIZE_FONT, TYPE_FONT, new Date().toString());
		aux.addElement(aux_p,0);	
		
		return aux;
	}
}
