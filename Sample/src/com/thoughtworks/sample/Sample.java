package com.thoughtworks.sample;

public class Sample {
    public static void main(String[] args) {

        Person person = new Person("foo", "bar", Gender.MALE, 3);
        Person.insert(person);

        Person p = (Person) Person.find(1);
        String fullName = p.fullName();

        System.out.println(fullName);
        System.out.println(p.getGender());

        p.setGender(Gender.FEMALE);
        p.update();
    }
}
