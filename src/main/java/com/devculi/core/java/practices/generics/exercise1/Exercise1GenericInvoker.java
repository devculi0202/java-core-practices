package com.devculi.core.java.practices.generics.exercise1;

import com.devculi.core.java.practices.generics.GenericInvoker;
import org.springframework.stereotype.Component;

@Component("excercise1")
public class Exercise1GenericInvoker implements GenericInvoker {

  @Override
  public void invoke() {
    System.out.println("Solve the exercise 1");
    Box<Integer> integerBox = new Box<>();
    integerBox.setValue(3);
    System.out.println("Value in integer box: " + integerBox.getValue());

    Box<String> stringBox = new Box<>();
    stringBox.setValue("Hello, Generics");
    System.out.println("Value in string box: " + stringBox.getValue());
  }
}