package TPE.SistemaPaginasWeb;

public class Image extends Element {
	
	private String name;
	private int lenght;
	private int width;
	private final int MIN_CHANGE = 100;
	
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setLenght(int lenght) {
		
		this.lenght = lenght;
	}
	
	public void setWidth(int width) {
		
		this.width = width;
	}
	
	
	public Image (String name , int lenght , int width ) {
		
		setName(name);
		setLenght(lenght);
		setWidth(width);
	
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getLength() {
		
		return lenght;
	}
	
	public int getWidth() {
		
		return width;
	}
	
	public int getBytes() {
		
		return (lenght * width);
	}
	
	public void changeSize(boolean increase) {
		
		if(increase) {
			this.setWidth(width+MIN_CHANGE);
			this.setLenght(lenght+MIN_CHANGE);
		}
		else {
			this.setWidth(width-MIN_CHANGE);
			this.setLenght(lenght-MIN_CHANGE);
		}
	}
	
	public Element copyElement(Element e) {
		
		Image aux = (Image) e;
		Image copy = new Image (aux.getName(), aux.getLength(), aux.getWidth());
		return copy;
	}

	@Override
	public String toString() {
		return "Name Image: " + name + "\n" + "Lenght: " + lenght +"\n" + "Width: " +  width + "\n" + "\n";
	}
	
	
	

}
