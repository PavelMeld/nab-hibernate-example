package ru.hh.nab.example;

import org.springframework.test.context.ContextConfiguration;
import ru.hh.nab.starter.NabApplication;
import ru.hh.nab.testbase.NabTestBase;

@ContextConfiguration(classes = ExampleTestConfig.class)
public class ExampleTestBase extends NabTestBase {
  @Override
  protected NabApplication getApplication() {
    return ExampleMain.build();
  }
}
