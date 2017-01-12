package OfficeManager;

import java.io.Serializable;

/**
 * Stores information about customers and their orders.
 * Can return this information on call to getters.
 */
public class Order implements Serializable{

    String name;
    String email;
    String contactNumber;
    String address;
    String order;

    public Order(String name, String email, String contactNumber, String address, String order) {
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.address = address;
        this.order = order;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getOrder() {
        return order;
    }
}
