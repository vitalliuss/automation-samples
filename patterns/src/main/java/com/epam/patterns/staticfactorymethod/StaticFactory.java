package com.epam.patterns.staticfactorymethod;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public class StaticFactory {

    public static User createSimpleUser() {
        User user = new User();
        user.setFirstName("Vitali");
        user.setLastName("Shulha");
        user.setAge(25);
        return user;
    }

    public static User createUserFromFirstName(String firstName) {
        User user = new User();
        user.setFirstName(firstName);
        return user;
    }

    public static User createUserFromLastName(String lastName) {
        User user = new User();
        user.setLastName(lastName);
        return user;
    }

    public static User createUserFromBirthDate(int year) {
        User user = new User();
        user.setAge(2015 - year);
        return user;
    }
}
