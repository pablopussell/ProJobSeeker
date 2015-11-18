import java.text.SimpleDateFormat;

import org.joda.time.*;



public class Job {
	private static int _lastID=0;
	
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
	
	private static final int DAYS_TO_BE_NEW = 15;

	public boolean isNew() {
		DateTime now=new DateTime();
		Days daysBetweenDateAndNow= Days.daysBetween(date, now);
		int days=daysBetweenDateAndNow.getDays();
		return days<=DAYS_TO_BE_NEW;
	}
	
	public String getTimeFromNow() {
		DateTime now=new DateTime();
		Days daysBetweenDateAndNow= Days.daysBetween(date, now);
		int days=daysBetweenDateAndNow.getDays();
		if (days==0) return "Today";
		int months=days/30;
		if (months==0) {
			if (days==1) return "about 1 day ago";
			return "about "+days+" days ago";
		}
		if (months==1) return "about 1 month ago";
		return "about "+months+" months ago";
	}
	
	private String firstLetterToUpperCase(String str) {
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
	
	public String getShortDate() {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MMM dd");
		String dateAsString=simpleDateFormat.format(this.date.toDate());
		return firstLetterToUpperCase(dateAsString);
	}
	
	public void setDate(DateTime date) {
		this.date = date;
	}

	
	public int getID() {
		return id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
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
