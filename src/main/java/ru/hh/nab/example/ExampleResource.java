package ru.hh.nab.example;

import java.util.List;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/")
public class ExampleResource {

  private final ExampleDao exampleDao;

  public ExampleResource(ExampleDao exampleDao) {
    this.exampleDao = exampleDao;
  }

  @GET
  @Path("/hello")
  public String hello(@DefaultValue("world") @QueryParam("name") String name) {
    return String.format("Hello, %s!", name);
  }

  @GET
  @Path("/entity/{name}")
  public List<ExampleEntity> getList(@PathParam("name") String name) {
    return exampleDao.getByName(name);
  }

  @POST
  @Path("/entity")
  public ExampleEntity create(@FormParam("name") String name) {
    return exampleDao.create(name);
  }
}
