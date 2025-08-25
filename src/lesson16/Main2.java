package lesson16;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Alex", "Alex@gmail.com", "qwerty", 12345678);
        Contact contact2 = new Contact("Jack", "jack@gmail.com", "qwerty123", 123456789);
        Contact contact3 = new Contact("John", "john@gmail.com", "12345678", 123456);
        List<Contact> contactList = List.of(contact1, contact2, contact3);

        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }

        try (FileOutputStream fos = new FileOutputStream("contactsList.data");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)
        ){
            for (int i = 0; i < contactList.size(); i++) {
                oos.writeObject(contactList.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
