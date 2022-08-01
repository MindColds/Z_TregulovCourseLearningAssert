package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat = context.getBean("catBean", Cat.class);
//        cat.say();
//        Pet cat1 = context.getBean("catBean", Cat.class);

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        Person person1 = context.getBean("personBean", Person.class);
//        person.callYourPet();

        context.close();
    }
}
