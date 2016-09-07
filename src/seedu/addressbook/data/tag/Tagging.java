package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	private Person person;
	private Tag tag;
	private String status;
	
	public static final String ADDPREFIX = "+";
	public static final String DELPREFIX = "-";
	
	public Tagging(Person person, Tag tag, String status) {
		this.person = person;
		this.tag = tag;
		this.status = status;
	}
	public void addPerson() {
		status = ADDPREFIX;
	}
	public void delPerson() {
		status = DELPREFIX;
	}
	public Person getPerson() {
		return this.person;
	}
	public Tag getTag() {
		return this.tag;
	}
	public String getStatus() {
		return this.status;
	}
	@Override
	public String toString() {
		return getStatus() + " " +getPerson().getName().toString()
				+ " " + getTag().toString();
	}
}
