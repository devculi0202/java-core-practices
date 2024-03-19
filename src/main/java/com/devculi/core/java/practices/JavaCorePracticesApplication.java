package com.devculi.core.java.practices;

import com.devculi.core.java.practices.generic.GenericInvoker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaCorePracticesApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(JavaCorePracticesApplication.class, args);
    context.getBean(GenericInvoker.class).invoke();
  }

}
