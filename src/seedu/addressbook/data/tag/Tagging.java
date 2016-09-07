package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	private Person person;
	private Tag tag;
	private boolean isAdded;
	
	public static final String ADDPREFIX = "+";
	public static final String DELPREFIX = "-";
	
	public Tagging(Person person, Tag tag, boolean isAdded) {
		this.person = person;
		this.tag = tag;
		this.isAdded = isAdded;
	}
	public Person getPerson() {
		return this.person;
	}
	public Tag getTag() {
		return this.tag;
	}
	public boolean getStatus() {
		return isAdded;
	}
	@Override
	public String toString() {
		return (getStatus()? ADDPREFIX: DELPREFIX) + getPerson().getName().toString()
				+ getTag().toString();
		
	}
}
