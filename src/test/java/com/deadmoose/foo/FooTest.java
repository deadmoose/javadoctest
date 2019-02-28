package com.deadmoose.foo;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FooTest {

  @Test
  public void echo() {
    assertThat(Foo.echo()).isEqualTo("foo");
  }
}
