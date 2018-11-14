package lab5_SP;

public class BookStatistics implements Visitor {
	
	int numOfImages=0;
	int numOfParagraph=0;
	int numOfTables=0;
	
	@Override
	public void visit(Image i) {
		// TODO Auto-generated method stub
		this.numOfImages++;
	}

	@Override
	public void visit(ImageProxy ip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Table t) {
		// TODO Auto-generated method stub
		this.numOfTables++;
	}

	@Override
	public void visit(Paragraph p) {
		// TODO Auto-generated method stub
		this.numOfParagraph++;
	}
	public void printStatistics() {
		System.out.println("Numbers of images: "+ this.numOfImages);
		System.out.println("Numbers of paragraphs: " + this.numOfParagraph);
		System.out.println("Numbers of tables:  "+ this.numOfTables);
		
	}
	
	

}
