package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @author José Ricardo
   * @param Parametro algo
   * @return Hola Nombre
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
