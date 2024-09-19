package edu.grinnell.csc207.util.predicates;

import edu.grinnell.csc207.util.Predicate;

/**
 * Predicates for small objects.  Uses a form of the Singleton pattern.
 * Clients cannot create SmallObject objects; they must reference
 * SmallObject.PRED.
 *
 * Based on SmallString by Samuel A. Rebelsky 
 * @authors Natalie Nardone and Jenifer Silva 
 *
 */
public class SmallObject implements Predicate<Object> {
  // +-----------+---------------------------------------------------
  // | Constants |
  // +-----------+

  /**
   * One copy of this predicate, following the singleton pattern.
   */
  public static final SmallObject PRED = new SmallObject();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new predicate. Made private to prevent clients from
   * creating new objects (part of the singleton pattern).
   */
  private SmallObject() {
  } // SmallString()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Determine if val is a small string.
   *
   * @param val
   *   The string we evaluate.
   *
   * @return
   *   true if val is small and false otherwise.
   */
  public boolean holds(Object val) {
    String temp = val.toString();
    return temp.length() < 5;
  } // holds(String)
} // class SmallString
