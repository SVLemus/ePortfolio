package Project;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    // Replacing ArrayList with HashMap to improve performance
    private Map<String, Contact> contactsMap = new HashMap<>();

    // Add a contact
    public void addContact(Contact contact) {
        if (!validateContact(contact)) {
            throw new IllegalArgumentException("Invalid contact data.");
        }
        if (contactsMap.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact with this ID already exists.");
        }
        contactsMap.put(contact.getContactId(), contact);
    }

    // Update a contact's first name
    public void updateContactFirstName(String contactId, String newFirstName) {
        Contact contact = contactsMap.get(contactId);
        if (contact == null) {
            throw new IllegalArgumentException("Contact with this ID does not exist.");
        }
        if (!isValidName(newFirstName)) {
            throw new IllegalArgumentException("First name is invalid.");
        }
        contact.setFirstName(newFirstName);
    }

    // Update a contact's last name
    public void updateContactLastName(String contactId, String newLastName) {
        Contact contact = contactsMap.get(contactId);
        if (contact == null) {
            throw new IllegalArgumentException("Contact with this ID does not exist.");
        }
        if (!isValidName(newLastName)) {
            throw new IllegalArgumentException("Last name is invalid.");
        }
        contact.setLastName(newLastName);
    }

    // Update a contact's phone number
    public void updateContactPhone(String contactId, String newPhone) {
        Contact contact = contactsMap.get(contactId);
        if (contact == null) {
            throw new IllegalArgumentException("Contact with this ID does not exist.");
        }
        if (!isValidPhoneNumber(newPhone)) {
            throw new IllegalArgumentException("Phone number is invalid.");
        }
        contact.setPhone(newPhone);
    }

    // Update a contact's address
    public void updateContactAddress(String contactId, String newAddress) {
        Contact contact = contactsMap.get(contactId);
        if (contact == null) {
            throw new IllegalArgumentException("Contact with this ID does not exist.");
        }
        contact.setAddress(newAddress); // Assuming address doesn't require validation
    }

    // Delete a contact
    public void deleteContact(String contactId) {
        if (contactsMap.containsKey(contactId)) {
            contactsMap.remove(contactId);
        } else {
            throw new IllegalArgumentException("Contact with this ID does not exist.");
        }
    }

    // Find a contact by ID
    public Contact findContactById(String contactId) {
        return contactsMap.get(contactId); // Returns null if not found, which can be handled in the calling method
    }

    // Helper function for validation of names
    private boolean isValidName(String name) {
        return name != null && name.length() <= 10;
    }

    // Helper function for phone number validation
    private boolean isValidPhoneNumber(String phone) {
        return phone != null && phone.matches("^[0-9]{10}$");
    }

    // Helper function for validating contact data
    private boolean validateContact(Contact contact) {
        return contact != null &&
               isValidName(contact.getFirstName()) &&
               isValidName(contact.getLastName()) &&
               isValidPhoneNumber(contact.getPhone());
    }
}
