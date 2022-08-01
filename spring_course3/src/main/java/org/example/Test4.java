package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Dog dog = context.getBean("myPet", Dog.class);
//        dog.setName("Belka");
        Dog myDog = context.getBean("myPet", Dog.class);
//       myDog.setName("Strelka");
//
//        System.out.println(dog.getName() + "\n" + myDog.getName());
//
        System.out.println("Переменные ссыдаются на один объект? " + (dog == myDog));
//        System.out.println(dog);
//        System.out.println(myDog);

        context.close();

    }
}
