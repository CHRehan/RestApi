package models;


import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import  static play.data.validation.Constraints.*;
/**
 * Created by Innovetor on 2015-06-07.
 */
@Entity
public class contact extends Model {
    @Id
    Long id;
    @Required
    String name;
    @Required
     @Email
    String email;
      public static  Finder<Long,contact> find=new Finder<Long, contact>(Long.class,contact.class);

    public contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId(){return id;}

    public contact(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName(){return name;}
    public String getEmail(){return email;}


    public void setId(Long id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
}

