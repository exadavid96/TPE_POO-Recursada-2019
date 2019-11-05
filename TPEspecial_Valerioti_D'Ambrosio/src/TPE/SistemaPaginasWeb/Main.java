package TPE.SistemaPaginasWeb;

import java.util.*;

public class Main {
	
	public static void  main(String args[]){
		
		///////////////////////// C R E A C I Ó N  P Á R R A F O S //////////////////////////////////////     
		Element p1 = new Paragraph (12, "Comic Sans","Párrafo 1");
		Element p2 = new Paragraph (14,"Times New Roman", "Párrafo 2");
		Element p3 = new Paragraph (13,"Arial", "Párrafo 3");
		Element p4 = new Paragraph (15,"Comic Sans","Párrafo 4");
		
		///////////////////////// C R E A C I Ó N  I M Á G E N E S //////////////////////////////////////
		Element i1 = new Image ("Imagen 1",250,500);
		Element i2 = new Image ("Imagen 2",300,250);
		Element i3 = new Image ("Imagen 3",270,400);
		Element i4 = new Image ("Imagen 4",130,340);
		
		///////////////////////// C R E A C I Ó N  P Á G I N A S //////////////////////////////////////
		//Es necesario crear al objeto Page de tipo Page, para usar los métodos que necesita una Page, además de los abstractos
		Page pag1 = new Page ();  
		Page pag2 = new Page ();
		Page pag3 = new Page ();
		Page pag4 = new Page();
		
		///////////////////////// C R E A C I Ó N  L I N K S //////////////////////////////////////
		Element l1 = new Link (pag1);
		Element l2 = new Link (pag2);
		
		
		///////////////////////// A G R E G A D O    D E    E L E M E N T O S   A  L A S   P Á G I N A S  I N S T A N C I A D A S  /////
		pag1.addElement(p1);
		pag1.addElement(i2);
		pag1.addElement(p2);
		pag2.addElement(l1);
		pag2.addElement(p3);
		pag2.addElement(i1);
		pag3.addElement(l2);
		pag3.addElement(i4);
		pag3.addElement(p4);
		
		////////////////////////  C R E A C I Ó N    T R A N S F O R M A D O R E S   /////////////////////////////////////////////////
		Transformator t1 = new TransformatorBytes();
		Transformator t2 = new TransformatorSize();
		Transformator t3 = new TransformatorDate();
		Transformator t4 = new TransformatorHeader("Header page 1");
		Transformator t5 = new TransformatorFooter("Footer page 1");
		Transformator t6 = new TransformatorSizePage(true);
		
		///////////////////////  C R E A C I Ó N   E S T I L O S  Y   A G R E G A D O   D E   T R A N S F O R M A D O R E S  ///////////
		Style s = new Style("Todas");
		s.addTransformator(t1);
		s.addTransformator(t2);
		s.addTransformator(t3);
		s.addTransformator(t4);
		s.addTransformator(t5);
		s.addTransformator(t6);
		
		//////////////////////  A P L I C A R  E S T I L O  A  U N A  P Á G I N A  C O N  A N T E S  Y  D E S P U E S  D E  O R I G I N A L  Y  C O P I A ////
		System.out.println("Antes de aplicar el estilo: ");
		System.out.println("Original");
		System.out.println(pag1);
		System.out.println("Copia");
		System.out.println(pag4);
		
		pag4 = pag1.transformPage(pag1, s);
		
		System.out.println("Después de aplicar el estilo: ");
		System.out.println("Original");
		System.out.println(pag1);
		System.out.println("Copia");
		System.out.println(pag4);	
		
	}

}
