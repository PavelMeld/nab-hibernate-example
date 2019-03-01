package ru.hh.nab.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleJerseyConfig {
  @Bean
  public ExampleResource exampleResource(ExampleDao exampleDao) {
    return new ExampleResource(exampleDao);
  }
}
