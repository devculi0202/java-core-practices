package com.devculi.core.java.practices.generics.exercise2;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer o1, Integer o2) {
    return o1.compareTo(o2);
  }
}
