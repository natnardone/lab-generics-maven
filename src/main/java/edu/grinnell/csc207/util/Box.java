package edu.grinnell.csc207.util;

public class Box<T> {

  T value;

  public Box(T val) {
    this.value = val;
  }

  public void set(T val) {
    this.value = val;
  }

  public T get() {
    return this.value;
  }
}
