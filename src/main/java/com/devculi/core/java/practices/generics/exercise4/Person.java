package com.devculi.core.java.practices.generics.exercise4;

/*
 * Basic Level:
 * Exercise 3:
 * Create a generic interface Comparable with a method compareTo that compares two objects of the same type
 */
public class Person implements Comparable<Person>, Cloneable {

  private Long id;
  private String name;
  private String address;
  private Integer age;

  public Person(Long id, String name, String address, Integer age) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.age = age;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public Person clone() {
    try {
      Person clone = (Person) super.clone();
      // TODO: copy mutable state here, so the clone can't change the internals of the original
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  @Override
  public int compareTo(Person otherPerson) {
    System.out.println(
        this.name + " is comparing the age " + this.age + " with the age " + otherPerson.getAge()
            + " of " + otherPerson.getName());
    return this.age - otherPerson.getAge();
  }
}
