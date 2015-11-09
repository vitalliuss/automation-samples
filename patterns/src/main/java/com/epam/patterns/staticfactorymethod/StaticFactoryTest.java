package com.epam.patterns.staticfactorymethod;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public class StaticFactoryTest {

    public static void main(String[] args){
//        User vitali = new User("Vitali", "Shulha", 25);
        User vitali = StaticFactory.createSimpleUser();
        User firstName = StaticFactory.createUserFromFirstName("FirstName");
        User lastName = StaticFactory.createUserFromLastName("LastName");
        User birthDate = StaticFactory.createUserFromBirthDate(1990);
        System.out.println(vitali.toString());
        System.out.println(firstName.toString());
        System.out.println(lastName.toString());
        System.out.println(birthDate.toString());
    }
}
