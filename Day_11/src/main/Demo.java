package main;

import com.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Demo {
    public static void main(String[] args) {
        Box b1 = new Box(10,5,3);
     //   System.out.println(b1);
        Box b2 = b1;
     //   System.out.println(b2);

        b1 = null;

        // System.out.println(b1.width); // Cannot read field "width" because "b1" is null

//        Counter.count();
//        Counter.count();
//        Counter.printCount();

        Person person = new Person();
        person.showPublicIds();
      //  person.showProtectedIds(); //  showProtectedIds() has protected access in com.Person
      //  person.showPrivateIds(); // showPrivateIds() has private access in com.Person
     // person.showDefaultId(); // showDefaultId() is not public in com.Person; cannot be accessed from outside package


    }
}