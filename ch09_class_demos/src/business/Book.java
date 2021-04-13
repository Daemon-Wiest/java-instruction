package business;

public class  Book extends Product implements Printable {

    private String author;

    public Book(String string, String string2, double d, String string3) {
        super();
        author = "";
        count++;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String getDisplayText() {
        return super.toString() + " by " + author;
    }

	@Override
	public void print() {
		System.out.println(super.getDescription()+", by "+author);
		
	}
}
