package lesson15.exception;

import java.util.ArrayList;
import java.util.List;

public class ServicesPart {

    private DBPart dbPart = new DBPart();

    public List<Person> getContacts(String contactsFor) throws MyException {
        List<String> contacts = dbPart.getContacts(contactsFor);

        List<String> emails = dbPart.getEmails(contactsFor);

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < contacts.size(); i++) {
            Person person = new Person(contacts.get(i), emails.get(i));
            persons.add(person);
        }

        return persons;
    }
}
