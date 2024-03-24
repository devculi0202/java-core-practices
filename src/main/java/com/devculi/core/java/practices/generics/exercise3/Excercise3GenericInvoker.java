package com.devculi.core.java.practices.generics.exercise3;

import com.devculi.core.java.practices.generics.GenericInvoker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

@Component("excercise3")
public class Excercise3GenericInvoker implements GenericInvoker {

  @Override
  public void invoke() {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person(23L, "Join", "NewYork", 34));
    persons.add(new Person(1L, "Kevin", "AliBang", 54));
    Collections.sort(persons);
    System.out.println("Persons after sorted\n");
    persons.forEach(element -> System.out.println(element.toString()));
  }
}
