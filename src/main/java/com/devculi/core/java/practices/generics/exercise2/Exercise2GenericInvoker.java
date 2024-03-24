package com.devculi.core.java.practices.generics.exercise2;

import com.devculi.core.java.practices.generics.GenericInvoker;
import org.springframework.stereotype.Component;

@Component("excercise2")
public class Exercise2GenericInvoker implements GenericInvoker {

  @Override
  public void invoke() {
    System.out.println("Solve the exercise 2");
    String[] stringArray = {"Analog", "Java", "Python", "C++", "JavaScript"};
    ArrayHandler<String> strArraysHandler = new ArrayHandler<>(stringArray);
    strArraysHandler.printArray();
    try {
      String strLargest = ArrayHandler.findLargestElement(stringArray, new StringComparator());
      System.out.println("String largest is " + strLargest);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

    Integer[] integerArray = {40, 33, 101, 99, 65, 34, 1};
    ArrayHandler<Integer> integerArraysHandler = new ArrayHandler<>(integerArray);
    integerArraysHandler.printArray();
    try {
      int intLargest = ArrayHandler.findLargestElement(integerArray, new IntegerComparator());
      System.out.println("Integer largest is " + intLargest);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
