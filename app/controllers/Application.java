package controllers;
import models.contact;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ObjectNode;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.*;
import play.mvc.Result;
import play.libs.Json;

import javax.servlet.FilterRegistration;
import java.util.List;

import static play.libs.Json.toJson;

public class Application extends Controller {

    static Form<contact> contactForm=new Form(contact.class);
    public static Result index() {

     List<contact> contacts= new Model.Finder(String.class,contact.class).all();

      return  ok(toJson(contacts));

  }
    public static Result indexbyid(Long id) {

        //List<contact> contacts= new Model.Find(String.class,contact.class);
        contact contacts=contact.find.byId(id);
        return  ok(toJson(contacts));

    }

  public static Result create() {
      JsonNode json = request().body().asJson();

     String name = json.findPath("name").getTextValue();
      String email = json.findPath("email").getTextValue();

      contact contect=new contact(name,email);
      contect.save();
      return ok("Name:"+name +" Email:"+email);
  }
    public static  Result edit(Long id){
        JsonNode json = request().body().asJson();

        String name = json.findPath("name").getTextValue();
        String email = json.findPath("email").getTextValue();

        contact contect=new contact(id,name,email);
        contect.update();
        return ok(id+" has been updated");
    }
  public static Result delete(Long id) {

      contact contect= contact.find.byId(id);

          contect.delete();

      return ok("Data of "+id+"has been deleted");
  }



}