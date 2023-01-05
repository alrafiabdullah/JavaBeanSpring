package com.abdullahalrafi.springbootproject.main;

import com.abdullahalrafi.springbootproject.main.config.BeanConfig;
import com.abdullahalrafi.springbootproject.main.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BeanConfig.class})
public class SpringBootProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);

        Coder coder1 = (Coder) context.getBean("coder1");
        System.out.println(coder1.getName() + " works on " + coder1.getLanguage() + " using " + coder1.getComputer().getBrand());

        Coder coder2 = (Coder) context.getBean("coder2");
        System.out.println(coder2.getName() + " works on " + coder2.getLanguage() + " using " + coder2.getComputer().getBrand());
    }
}
