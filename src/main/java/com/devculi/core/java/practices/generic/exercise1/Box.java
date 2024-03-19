package com.devculi.core.java.practices.generic.exercise1;

import org.springframework.stereotype.Component;

/*
 * Basic Level:
 * Exercise 1:
 * Define a generic class Box that can hold any type of object.
 * Implement methods to set and get the value of the object.
 */
public class Box<T> {

  private T t;

  public T getValue() {
    return t;
  }

  public void setValue(T t) {
    this.t = t;
  }
}
