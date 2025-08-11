package lesson15.exception;

import java.util.List;

public class WebPart {

    ServicesPart servicesPart = new ServicesPart();

    public String getResult(String contactsFor) {
        try {
            List<Person> contacts = servicesPart.getContacts(contactsFor);
            StringBuilder builder = new StringBuilder()
                    .append("Hello ").append(contactsFor).append("\n")
                    .append("your contacts list:\n");
            for (int i = 0; i < contacts.size(); i++) {
                builder.append("\n* ").append(contacts.get(i).getName()).append(" - ").append(contacts.get(i).getEmail());
            }

            return builder.append("\nend").toString();

        } catch (MyException e) {
            Throwable cause = e.getCause(); // null
            StackTraceElement[] stackTrace = e.getStackTrace();
            e.printStackTrace();
            e.getLocalizedMessage();


            return new StringBuilder().append("Dear ").append(contactsFor)
                    .append("\nyour contact list is not available. try later.")
                    .append("\nreason: ").append(e.getMessage())
                    .append("\nerror code: ").append(e.getErrorCode())
                    .append("\nTY")
                    .toString();
        }
    }
}
