package ru.hh.nab.example;

import ru.hh.nab.starter.NabApplication;

public class ExampleMain {

  public static void main(String[] args) {
    build().run(ExampleConfig.class);
  }

  public static NabApplication build() {
    return NabApplication.builder()
      .configureJersey(ExampleJerseyConfig.class).bindToRoot()
      .build();
  }
}
