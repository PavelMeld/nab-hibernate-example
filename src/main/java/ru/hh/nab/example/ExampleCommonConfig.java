package ru.hh.nab.example;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.hh.nab.common.properties.FileSettings;
import ru.hh.nab.datasource.DataSourceFactory;
import ru.hh.nab.datasource.DataSourceType;
import ru.hh.nab.hibernate.MappingConfig;
import ru.hh.nab.hibernate.NabHibernateCommonConfig;
import ru.hh.nab.starter.NabCommonConfig;

@Configuration
@Import({
    NabCommonConfig.class,
    NabHibernateCommonConfig.class,
    ExampleDao.class
})
public class ExampleCommonConfig {

  @Bean
  public MappingConfig mappingConfig() {
    return new MappingConfig(ExampleEntity.class);
  }

  @Bean
  DataSource dataSource(DataSourceFactory dataSourceFactory, FileSettings settings) {
    return dataSourceFactory.create(DataSourceType.MASTER, false, settings);
  }
}
