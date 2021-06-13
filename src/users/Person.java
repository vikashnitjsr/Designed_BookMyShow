package users;

import dataType.Address;

// No object of this class for implementation of this class we need to
// Extends this class and implement this like : Customer , Guest , Admin all will extends person class

public abstract class Person {

    private String name;
    private Address address;
    private String email;
    private String phoneNo;

    // has a relationship
    private Account account;

}
