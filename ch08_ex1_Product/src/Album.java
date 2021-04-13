
public class Album extends Product{
	  public Album() {
	        super();
	        Artist = "";
	        count++;
	    }
	private String Artist;
	 
	


	public Album(String artist) {
		super();
		Artist = artist;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String artist) {
		Artist = artist;
	}

	@Override
	public String toString() {
		return super.toString() + "("+ Artist +")";
	}

	
	
	
	
	
	
	
	
	

}
