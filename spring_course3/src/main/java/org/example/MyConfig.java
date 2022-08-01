package org.example;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("org.example")
@PropertySource("classpath:myApp.properties")

public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        //System.out.println("???");
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }

//    @Bean
//    public Pet dogBean() {
//        return new Dog();
//    }

}
