// @SOURCE:C:/Users/Rehan/WorkSpace/crudapp/conf/routes
// @HASH:607dfcf9a2c13d193be4e5c7719bc745c3fa7623
// @DATE:Tue Jul 07 21:56:01 PKT 2015

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Application_indexbyid1 = Route("GET", PathPattern(List(StaticPart("/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:8
val controllers_Application_create2 = Route("POST", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_edit3 = Route("PUT", PathPattern(List(StaticPart("/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:10
val controllers_Application_delete4 = Route("DELETE", PathPattern(List(StaticPart("/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:13
val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/$id<[^/]+>""","""controllers.Application.indexbyid(id:Long)"""),("""POST""","""/""","""controllers.Application.create()"""),("""PUT""","""/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""DELETE""","""/$id<[^/]+>""","""controllers.Application.delete(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_Application_indexbyid1(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.indexbyid(id), HandlerDef(this, "controllers.Application", "indexbyid", Seq(classOf[Long])))
   }
}
                    

// @LINE:8
case controllers_Application_create2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_edit3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:10
case controllers_Application_delete4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:13
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                