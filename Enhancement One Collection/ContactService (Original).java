package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContactService {
    private List<Contact> contacts = new ArrayList<>();

    // Add a contact
    public void addContact(Contact contact) {
        if (findContactById(contact.getContactId()).isPresent()) {
            throw new IllegalArgumentException("Contact with this ID already exists.");
        }
        contacts.add(contact);
    }

    // Update a contact's first name
    public void updateContactFirstName(String contactId, String newFirstName) {
        Contact contact = findContactById(contactId).orElseThrow(() ->
            new IllegalArgumentException("Contact with this ID does not exist.")
        );
        contact.setFirstName(newFirstName);
    }

    // Update a contact's last name
    public void updateContactLastName(String contactId, String newLastName) {
        Contact contact = findContactById(contactId).orElseThrow(() ->
            new IllegalArgumentException("Contact with this ID does not exist.")
        );
        contact.setLastName(newLastName);
    }

    // Update a contact's phone number
    public void updateContactPhone(String contactId, String newPhone) {
        Contact contact = findContactById(contactId).orElseThrow(() ->
            new IllegalArgumentException("Contact with this ID does not exist.")
        );
        contact.setPhone(newPhone);
    }

    // Update a contact's address
    public void updateContactAddress(String contactId, String newAddress) {
        Contact contact = findContactById(contactId).orElseThrow(() ->
            new IllegalArgumentException("Contact with this ID does not exist.")
        );
        contact.setAddress(newAddress);
    }

    // Delete a contact
    public void deleteContact(String contactId) {
        Contact contact = findContactById(contactId).orElseThrow(() ->
            new IllegalArgumentException("Contact with this ID does not exist.")
        );
        contacts.remove(contact);
    }

    // Find a contact by ID
    public Optional<Contact> findContactById(String contactId) {
        return contacts.stream()
                       .filter(contact -> contact.getContactId().equals(contactId))
                       .findFirst();
    }
}
