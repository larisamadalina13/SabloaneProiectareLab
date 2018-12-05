package lab5_SP;

import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element {

	private String name;
	private Image image = null;
	private Visitor visitor;
	
	public ImageProxy (String name) {
		this.name = name;
		
	}
	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getChild(int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		
		if(image == null) 
		{
			image = new Image(name);
		}
		
		image.print();
		
	}
	
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	
	

	
}
