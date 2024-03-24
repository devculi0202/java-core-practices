package com.devculi.core.java.practices.generics.exercise4;

import com.devculi.core.java.practices.generics.GenericInvoker;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

/*
 * Create a generic method called mergeArrays that merges two arrays of elements that implement the Comparable interface into a single sorted array.
 * The method should only accept arrays of types that implement both the Comparable and Cloneable interfaces.
 * Use bounded type parameters to enforce these constraints.
 */
@Component("excercise4")
public class Exercise4GenericInvoker implements GenericInvoker {


  @Override
  public void invoke() {
    Person[] arr1 = {new Person(2L, "Kenvin", "Bangkok", 43), new Person(54L, "Onana", "MU", 23)};
    Person[] arr2 = {new Person(3L, "Messi", "Argentina", 36),
        new Person(54L, "Dempele", "Frank", 30)};
    List<Person> personsMerged = ArrayHandler.mergeArrays(arr1, arr2);
    System.out.println("person before sort\n");
    personsMerged.forEach(person -> System.out.println(person.toString()));
    Collections.sort(personsMerged);
    System.out.println("person after sort\n");
    personsMerged.forEach(person -> System.out.println(person.toString()));
    ;
  }
}
