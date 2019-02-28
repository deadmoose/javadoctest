package com.deadmoose.foo;

/** It's a Foo! */
public interface Foo {
  /** Does nothing of consequence. */
  void foo();

  /** @return the String "foo" */
  public static String echo() {
    return "foo";
  }
}
