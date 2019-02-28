package com.deadmoose.bar;

import com.deadmoose.foo.Foo;

/** It's a Bar! */
public interface Bar {
  /** Does nothing of consequence. */
  void bar();

  /** Does something with a Foo. */
  void bar(Foo foo);

  /** @return the String "bar" */
  public static String echo() {
    return "bar";
  }
}
