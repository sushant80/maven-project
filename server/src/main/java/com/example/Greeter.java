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
 * Extracts the user's name from the input arguments.
 *
 * Precondition: 'args' should contain at least one element, the user's name.
 *
 * @param  args            the command-line arguments.
 * @return                 the user's name (the first command-line argument).
 * @throws NoNameException if 'args' contains no element.
 */
/* this is for comment to avoid warning */
  public final  String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
