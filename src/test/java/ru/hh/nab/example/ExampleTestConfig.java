package ru.hh.nab.example;

import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Import;
import ru.hh.nab.testbase.NabTestConfig;
import ru.hh.nab.testbase.hibernate.NabHibernateTestBaseConfig;

@Configuration
@Import({
    NabTestConfig.class,
    NabHibernateTestBaseConfig.class,
    ExampleCommonConfig.class
})
public class ExampleTestConfig {
}

