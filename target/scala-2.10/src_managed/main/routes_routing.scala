// @SOURCE:/Users/TZ029887/Documents/computer-database/conf/routes
// @HASH:b9cdb75027b5469b19c944e15240ce61e647dbd1
// @DATE:Sun Nov 24 16:16:47 CST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_main1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("main"))))
        

// @LINE:10
private[this] lazy val controllers_UserMgr_pmtmain2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usermain"))))
        

// @LINE:11
private[this] lazy val controllers_UserMgr_pmtlist3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts"))))
        

// @LINE:12
private[this] lazy val controllers_UserMgr_create4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts/new"))))
        

// @LINE:13
private[this] lazy val controllers_UserMgr_save5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts"))))
        

// @LINE:16
private[this] lazy val controllers_Application_list6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers"))))
        

// @LINE:19
private[this] lazy val controllers_Application_create7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/new"))))
        

// @LINE:20
private[this] lazy val controllers_Application_save8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers"))))
        

// @LINE:23
private[this] lazy val controllers_Application_edit9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_Application_update10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:27
private[this] lazy val controllers_Application_delete11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:30
private[this] lazy val controllers_Assets_at12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:33
private[this] lazy val controllers_SignIn_blank13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
        

// @LINE:34
private[this] lazy val controllers_SignIn_signin14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
        

// @LINE:35
private[this] lazy val controllers_SignUp_blank15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:36
private[this] lazy val controllers_SignUp_signup16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """main""","""controllers.Application.main()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usermain""","""controllers.UserMgr.pmtmain()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts""","""controllers.UserMgr.pmtlist()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts/new""","""controllers.UserMgr.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts""","""controllers.UserMgr.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers""","""controllers.Application.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/new""","""controllers.Application.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers""","""controllers.Application.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>/delete""","""controllers.Application.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.SignIn.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.SignIn.signin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.SignUp.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.SignUp.signup()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Default path will just redirect to the computer pmtlist""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_main1(params) => {
   call { 
        invokeHandler(controllers.Application.main(), HandlerDef(this, "controllers.Application", "main", Nil,"GET", """""", Routes.prefix + """main"""))
   }
}
        

// @LINE:10
case controllers_UserMgr_pmtmain2(params) => {
   call { 
        invokeHandler(controllers.UserMgr.pmtmain(), HandlerDef(this, "controllers.UserMgr", "pmtmain", Nil,"GET", """""", Routes.prefix + """usermain"""))
   }
}
        

// @LINE:11
case controllers_UserMgr_pmtlist3(params) => {
   call { 
        invokeHandler(controllers.UserMgr.pmtlist(), HandlerDef(this, "controllers.UserMgr", "pmtlist", Nil,"GET", """""", Routes.prefix + """userpmts"""))
   }
}
        

// @LINE:12
case controllers_UserMgr_create4(params) => {
   call { 
        invokeHandler(controllers.UserMgr.create(), HandlerDef(this, "controllers.UserMgr", "create", Nil,"GET", """""", Routes.prefix + """userpmts/new"""))
   }
}
        

// @LINE:13
case controllers_UserMgr_save5(params) => {
   call { 
        invokeHandler(controllers.UserMgr.save(), HandlerDef(this, "controllers.UserMgr", "save", Nil,"POST", """""", Routes.prefix + """userpmts"""))
   }
}
        

// @LINE:16
case controllers_Application_list6(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """ Computers pmtlist (look at the default values for pagination parameters)""", Routes.prefix + """computers"""))
   }
}
        

// @LINE:19
case controllers_Application_create7(params) => {
   call { 
        invokeHandler(controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Nil,"GET", """ Add computer""", Routes.prefix + """computers/new"""))
   }
}
        

// @LINE:20
case controllers_Application_save8(params) => {
   call { 
        invokeHandler(controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Nil,"POST", """""", Routes.prefix + """computers"""))
   }
}
        

// @LINE:23
case controllers_Application_edit9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]),"GET", """ Edit existing computer""", Routes.prefix + """computers/$id<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_Application_update10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """computers/$id<[^/]+>"""))
   }
}
        

// @LINE:27
case controllers_Application_delete11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]),"POST", """ Delete a computer""", Routes.prefix + """computers/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:30
case controllers_Assets_at12(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:33
case controllers_SignIn_blank13(params) => {
   call { 
        invokeHandler(controllers.SignIn.blank(), HandlerDef(this, "controllers.SignIn", "blank", Nil,"GET", """User""", Routes.prefix + """signin"""))
   }
}
        

// @LINE:34
case controllers_SignIn_signin14(params) => {
   call { 
        invokeHandler(controllers.SignIn.signin(), HandlerDef(this, "controllers.SignIn", "signin", Nil,"POST", """""", Routes.prefix + """signin"""))
   }
}
        

// @LINE:35
case controllers_SignUp_blank15(params) => {
   call { 
        invokeHandler(controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:36
case controllers_SignUp_signup16(params) => {
   call { 
        invokeHandler(controllers.SignUp.signup(), HandlerDef(this, "controllers.SignUp", "signup", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        
}

}
     