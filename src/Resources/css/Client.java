package Resources.css;

import java.util.Date;

public class Client implements Comparable<Client> {

	private String name;
	private String surName;
	private Date birthDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public Date getDOB() {
		return birthDate;
	}
	public void setDOB(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public int compareTo(Client otherClient) {
		int compareSurname = surName.compareTo(otherClient.surName);
		if (compareSurname != 0) return compareSurname;
		int compareName = name.compareTo(otherClient.name);
		if (compareName != 0) return compareName;
		return birthDate.compareTo(otherClient.birthDate);
			
	}
	
	
	
}
