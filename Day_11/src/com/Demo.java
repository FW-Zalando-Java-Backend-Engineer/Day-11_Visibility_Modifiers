package com;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        person.showProtectedIds();
      //  person.showPrivateIds(); // showPrivateIds() has private access in com.Person
        person.showDefaultId();
    }
}
