package ru.hh.nab.example;


import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class ExampleDao {
  private final SessionFactory sessionFactory;

  public ExampleDao(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Transactional
  public ExampleEntity create(String name) {
    ExampleEntity exampleEntity = new ExampleEntity();
    exampleEntity.setEntityName(name);

    sessionFactory.getCurrentSession().save(exampleEntity);

    return exampleEntity;
  }

  @Transactional
  public List<ExampleEntity> getByName(String name) {
    return sessionFactory.getCurrentSession()
        .createQuery("SELECT e FROM ExampleEntity e WHERE e.entityName = :name", ExampleEntity.class)
        .setParameter("name", name)
        .getResultList();
  }

}
