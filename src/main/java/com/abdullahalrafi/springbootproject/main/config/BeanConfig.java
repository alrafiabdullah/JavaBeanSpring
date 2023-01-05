package com.abdullahalrafi.springbootproject.main.config;

import com.abdullahalrafi.springbootproject.main.model.Coder;
import com.abdullahalrafi.springbootproject.main.model.Computer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Coder coder1(@Qualifier("computer1") Computer computer){
        Coder c1 = new Coder();

        c1.setId(1002);
        c1.setName("Abdullah Al Rafi");
        c1.setLanguage("Java");
        c1.setComputer(computer);

        return c1;
    }

    @Bean
    public Coder coder2(@Qualifier("computer2") Computer computer){
        return new Coder(1003, "Abdullah", "Python", computer);
    }

    @Bean
    public Computer computer1(){
        Computer computer = new Computer();

        computer.setBrand("Apple");
        return computer;
    }

    @Bean
    public Computer computer2(){
        return new Computer("Intel");
    }
}
