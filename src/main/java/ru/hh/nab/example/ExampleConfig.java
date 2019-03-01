package ru.hh.nab.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.hh.nab.hibernate.NabHibernateProdConfig;
import ru.hh.nab.starter.NabProdConfig;

@Configuration
@Import({
    NabProdConfig.class,
    NabHibernateProdConfig.class,
    ExampleCommonConfig.class
})
public class ExampleConfig {
}
