package org.javaConfig.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean("ParrotAnnConfig-Kesha")
    public Parrot getParrot() {
        return new Parrot();
    }

    @Bean("dog")
    @Scope("prototype")
    public Dog getDog() {
        return new Dog();
    }

    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "- hunter");
        return cat;
    }

}
