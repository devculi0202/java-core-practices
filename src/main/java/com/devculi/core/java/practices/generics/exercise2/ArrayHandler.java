package com.devculi.core.java.practices.generics.exercise2;

import java.util.Arrays;
import java.util.Comparator;


/*
 * Basic Level:
 * Exercise 2:
 * 2.1 Write a generic method printArray that prints elements of an array of any type.
 * Test it with arrays of integers, doubles, and strings.
 * 2.2 Write a static generic method be able to find the elements the largest of an array of any type use Comparator interface
 * Strings: a, b,c => string largest is a follow by ABC
 * Numbers: 1, 6,8,10 => number largest is 10
 */
public final class ArrayHandler<T> {

  private final T[] elements;

  public ArrayHandler(T[] elements) {
    this.elements = elements;
  }

  public void printArray() {
    Arrays.stream(elements).forEach(System.out::println);
  }

  public static <T> T findLargestElement(T[] elements, Comparator<T> comparator) throws Exception {
    return Arrays.stream(elements).max(comparator)
        .orElseThrow(() -> new Exception("The largest element not found"));
  }

}
