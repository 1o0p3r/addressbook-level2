package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	Person person;
	Tag tag;
	boolean isAdded;
	
	public Tagging(Person person, Tag tag, boolean isAdded) {
		this.person = person;
		this.tag = tag;
		this.isAdded = isAdded;
	}
}
