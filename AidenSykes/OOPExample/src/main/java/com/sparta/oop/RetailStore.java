package com.sparta.oop;

public class RetailStore {
    public static void main(String[] args) {



        Customer jyoti = new Customer("Jyoti", "Suresh", 1234);
        System.out.println(jyoti);

        Customer sami = new Customer();
        sami.setFirstName("Sami");
        System.out.println(sami);
        sami.delete();

        Employee e = new Employee("Brandon", "Johnson");
        e.setDepartmentName("Java Engineering");
        e.setSalary(100000.00F);
        System.out.println(e);
        e.delete();

        Person thePerson = new Customer(); // why does this work? a customer IS A person
        // Person testVariable = new ArrayList(); // an arraylist IS NOT A person
        // thePerson = new Person();
        System.out.println(thePerson.getFirstName());
        System.out.println(thePerson); // polymorphism in action
    }
}
