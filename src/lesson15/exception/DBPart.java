package lesson15.exception;

import java.util.List;
import java.util.Random;

public class DBPart {

    public List<String> getContacts(String contactsFor) throws MyException {
        //connect to db
        //....
        if (new Random().nextBoolean()) {
                throw new MyException("Can't connect", 4944);
        }

        return List.of("Alex", "Anton", "Anna");
    }


    public List<String> getEmails(String contactsFor) throws MyException {

        return List.of("Alex@", "Anton@", "Anna@");
    }
}
