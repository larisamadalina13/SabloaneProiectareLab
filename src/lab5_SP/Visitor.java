package lab5_SP;

public interface Visitor {
	public void visit(Image i);
	public void visit(ImageProxy ip);
	public void visit(Table t);
	public void visit(Paragraph p);
	
	
}
