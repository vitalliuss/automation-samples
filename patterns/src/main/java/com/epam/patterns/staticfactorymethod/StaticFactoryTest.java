package com.epam.patterns.staticfactorymethod;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public class StaticFactoryTest {

    public static void main(String[] args){
        User user = new User("Vitali", "Shulha", 27);

        User yahor = new User();
        yahor.setFirstName("Yahor");
        yahor.setLastName("Fralou");
        yahor.setAge(31);

        User vitali = StaticFactory.createSimpleUser();

        User helen = new User()
                .withAge(31)
                .withName("Helen");

        User firstName = StaticFactory.createUserFromFirstName("FirstName");
        User lastName = StaticFactory.createUserFromLastName("LastName");

        User birthDate = StaticFactory.createUserFromBirthDate(1990);

        System.out.println(vitali.toString());
        System.out.println(firstName.toString());
        System.out.println(lastName.toString());
        System.out.println(birthDate.toString());
    }
}
