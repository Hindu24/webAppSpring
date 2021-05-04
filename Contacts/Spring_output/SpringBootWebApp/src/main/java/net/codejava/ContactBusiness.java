package net.codejava;

import java.util.ArrayList;
import java.util.List;
 
public class ContactBusiness {
    public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();
         
        listContact.add(new Contact("Saanvi", "saanu244@gmail.com", "USA"));
        listContact.add(new Contact("Tommy", "tommy84@outlook.com", "England"));
        listContact.add(new Contact("Damon", "damon28@yahoo.com", "Australia"));
        listContact.add(new Contact("Pratik", "pratik0011@gmail.com", "India"));
         
        return listContact;
    }
}