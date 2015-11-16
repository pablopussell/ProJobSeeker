import org.joda.time.*;



public class Job {
	private static int _lastID=0;
	private static final int DAYS_TO_BE_NEW = 15;
	
	public boolean isNew() {
		date = 
	}
	
	public Job() {
		_lastID++;
		id=_lastID;
		date=new DateTime();
	}
	
	private int id;
	private String title;
	private String company;
	private String location;
	private String description;
	private DateTime date;
	private String categoryName;
	
	public DateTime getHumanDate() {
		
		return date;
	}
	
	public void setDate(DateTime date) {
		this.date = date;
	}

	
	public int getID() {
		return id;
	}
	
	private String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	private DateTime getDate() {
		return date;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getDescription () {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
