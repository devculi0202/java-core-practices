package com.devculi.core.java.practices.generics.exercise4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayHandler {

  public static <T extends  Comparable<T> & Cloneable> List<T> mergeArrays(T[] arraysOne, T[] arraysTwo){
    List<T> mergedList =  new ArrayList<>(arraysOne.length + arraysTwo.length);
    Collections.addAll(mergedList, arraysOne);
    Collections.addAll(mergedList, arraysTwo);
    return mergedList;
  }

}
