package com.devculi.core.java.practices.generic.exercise2;

import java.util.Arrays;
import java.util.List;

/*
 * Basic Level:
 * Exercise 2:
 * Write a generic method printArray that prints elements of an array of any type.
 * Test it with arrays of integers, doubles, and strings.
 *
 */
public class Handler<T> {
  private final T[] elements;

  public Handler(T[] elements){
    this.elements = elements;
  }
  public void printArray(){
    Arrays.stream(elements).forEach(System.out::println);
  }
}
