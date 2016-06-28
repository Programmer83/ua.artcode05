package ua.artcode05.ACO14.week1.contact_list;

/**
 * Created by Dima Tolm on 26/06/2016.
 */
public class ContactList {

    Contact[] contacts = new Contact[10];
    int size =0;

    public void addContact(Contact contact) {
        contacts[size] = contact;
        size++;
    }

    public String asString(){

        return "";
    }
}

