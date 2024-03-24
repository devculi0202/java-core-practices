package com.devculi.core.java.practices.generics.exercise2;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
  @Override
  public int compare(String string1, String string2) {
    return string1.compareTo(string2);
  }
}
