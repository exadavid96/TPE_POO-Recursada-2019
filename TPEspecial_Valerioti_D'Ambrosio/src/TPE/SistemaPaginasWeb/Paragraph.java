package TPE.SistemaPaginasWeb;

public class Paragraph extends Element {
	
	private int sizeFont;
	private String typeFont;
	private String paragraph;
	private final int MIN_CHANGE = 1;
	
	
	public void setSizeFont(int sizeFont) {
		
		this.sizeFont = sizeFont;
	}
	
	public void setTypeFont(String typeFont) {
		
		this.typeFont = typeFont;
	}
	
	public void setParagraph(String paragraph) {
		
		this.paragraph = paragraph;
	}
	
	
	public Paragraph (int sizeFont, String typeFont , String paragraph) {
		
		setSizeFont(sizeFont);
		setTypeFont(typeFont);
		setParagraph(paragraph);
		
	}
	
	public int getSizeFont() {
		
		return sizeFont;
	}
	
	public String getTypeFont() {
		
		return typeFont;
	}
	
	public String getParagraph() {
		
		return paragraph;
	}
	
	public int getBytes() {
		
		return paragraph.length();
	}
	
	public void changeSize(boolean increase) {
		
		if(increase) 
			this.setSizeFont(sizeFont+MIN_CHANGE);
		else 
			this.setSizeFont(sizeFont-MIN_CHANGE);
		}
	

	public Element copyElement(Element e) {
		
		Paragraph aux = (Paragraph) e;
		Paragraph copy = new Paragraph(aux.getSizeFont(),aux.getTypeFont(),aux.getParagraph());
		return copy;
	}

	@Override
	public String toString() {
		return "Size font: " + sizeFont + "\n" + "Type font: " + typeFont +"\n" + "Text: " +  paragraph + "\n" + "\n";
	}
	
	
	
}
	

