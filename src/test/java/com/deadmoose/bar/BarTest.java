package com.deadmoose.bar;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.truth.StringSubject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BarTest {

  @Test
  public void echo() {
    assertThat(Bar.echo()).isEqualTo("bar");
  }

  public void nonsense(StringSubject foo) {
    // Exists just to generate javadoc referencing StringSubject
  }
}
