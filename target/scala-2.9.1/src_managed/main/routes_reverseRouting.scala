// @SOURCE:C:/Users/Rehan/WorkSpace/crudapp/conf/routes
// @HASH:607dfcf9a2c13d193be4e5c7719bc745c3fa7623
// @DATE:Tue Jul 07 21:56:01 PKT 2015

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def indexbyid(id:Long) = {
   Call("GET", "/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:10
def delete(id:Long) = {
   Call("DELETE", "/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:8
def create() = {
   Call("POST", "/")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:9
def edit(id:Long) = {
   Call("PUT", "/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def indexbyid = JavascriptReverseRoute(
   "controllers.Application.indexbyid",
   """
      function(id) {
      return _wA({method:"GET", url:"/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:10
def delete = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:8
def create = JavascriptReverseRoute(
   "controllers.Application.create",
   """
      function() {
      return _wA({method:"POST", url:"/"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:9
def edit = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(id) {
      return _wA({method:"PUT", url:"/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def indexbyid(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.indexbyid(id), HandlerDef(this, "controllers.Application", "indexbyid", Seq(classOf[Long]))
)
                              
 
// @LINE:10
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:8
def create() = new play.api.mvc.HandlerRef(
   controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:9
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                