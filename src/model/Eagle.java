package model;
/**
 * @author tyste
 *
 */
public class Eagle {
	private String region;
	private String type;
	private boolean male;

	/**
	 * 
	 */
	public Eagle() {
		super();
		
	}

	/**
	 * @return
	 */
	public String getregion() {
		return region;
	}
	
	/**
	 * @param region
	 * @param type
	 * @param male
	 */
	public Eagle(String region, String type, boolean male) {
		super();
		this.region = region;
		this.type = type;
		this.male = male;
	}
	
	/**
	 * @return
	 */
	public String getRegion() {
		return region;
	}
	
	/**
	 * @param region
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return
	 */
	public boolean getMale() {
		return male;
	}

	/**
	 * @param male
	 */
	public void setMale(boolean male) {
		this.male = male;
	}
	
	/**
	 * @return
	 */
	public String speak() {
		return "Chirp";
	}
	

}
