package com.devculi.core.java.practices.generic.exercise2;

import com.devculi.core.java.practices.generic.GenericInvoker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component("excercise2")
public class Exercise2GenericInvoker implements GenericInvoker {

  @Override
  public void invoke() {
    System.out.println("Solve the exercise 2");
    String[] stringArray = {"Java", "Python", "C++", "JavaScript"};
    Handler<String> strArrays = new Handler<>(stringArray);
    strArrays.printArray();
  }
}
