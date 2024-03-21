package com.devculi.core.java.practices;

import com.devculi.core.java.practices.generic.GenericInvoker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import org.springframework.aop.support.AopUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaCorePracticesApplication {
  private static final String BEAN_EXERCISE_PREFIX = "excercise";
  private static final String METHOD_NAME = "invoke";

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(
        JavaCorePracticesApplication.class, args);
    final String[] beanNames = context.getBeanDefinitionNames();
    Arrays.stream(beanNames).filter(bean -> bean.contains(BEAN_EXERCISE_PREFIX)).toList()
        .forEach(bean -> {
          final Object beanObject = context.getBean(bean);
          try {
            Method method = beanObject.getClass().getMethod(METHOD_NAME);
            method.invoke(beanObject);
            System.out.println("-----------------");
          } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
          }
        });
  }
}
