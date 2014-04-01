// @SOURCE:/Users/TZ029887/Documents/computer-database/conf/routes
// @HASH:407b25cb31dd7fbd83e3f41f49bed13df0fb25b8
// @DATE:Thu Mar 27 15:20:01 CDT 2014


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
        

// @LINE:10
private[this] lazy val controllers_UserMgr_pmtmain1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usermain"))))
        

// @LINE:11
private[this] lazy val controllers_UserMgr_pmtlist2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts"))))
        

// @LINE:12
private[this] lazy val controllers_UserMgr_create3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts/new"))))
        

// @LINE:13
private[this] lazy val controllers_UserMgr_save4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts"))))
        

// @LINE:14
private[this] lazy val controllers_UserMgr_delete5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:15
private[this] lazy val controllers_UserMgr_update6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_UserMgr_edit7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:18
private[this] lazy val controllers_OrderMgr_ordermain8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders"))))
        

// @LINE:19
private[this] lazy val controllers_OrderMgr_orderlist9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders/main"))))
        

// @LINE:20
private[this] lazy val controllers_OrderMgr_create10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders/new"))))
        

// @LINE:21
private[this] lazy val controllers_OrderMgr_save11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders"))))
        

// @LINE:22
private[this] lazy val controllers_OrderMgr_delete12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:23
private[this] lazy val controllers_OrderMgr_update13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_OrderMgr_edit14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:31
private[this] lazy val controllers_SignIn_blank16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
        

// @LINE:32
private[this] lazy val controllers_SignIn_signin17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
        

// @LINE:33
private[this] lazy val controllers_SignUp_blank18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:34
private[this] lazy val controllers_SignUp_signup19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usermain""","""controllers.UserMgr.pmtmain()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts""","""controllers.UserMgr.pmtlist(p:Int ?= 0, s:String ?= "cc_name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts/new""","""controllers.UserMgr.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts""","""controllers.UserMgr.save()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts/$id<[^/]+>/delete""","""controllers.UserMgr.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts/$id<[^/]+>""","""controllers.UserMgr.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts/$id<[^/]+>""","""controllers.UserMgr.edit(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders""","""controllers.OrderMgr.ordermain()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders/main""","""controllers.OrderMgr.orderlist(p:Int ?= 0, s:String ?= "item_name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders/new""","""controllers.OrderMgr.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders""","""controllers.OrderMgr.save()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders/$id<[^/]+>/delete""","""controllers.OrderMgr.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders/$id<[^/]+>""","""controllers.OrderMgr.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders/$id<[^/]+>""","""controllers.OrderMgr.edit(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.SignIn.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.SignIn.signin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.SignUp.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.SignUp.signup()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Default path will just redirect to the computer orderlist""", Routes.prefix + """"""))
   }
}
        

// @LINE:10
case controllers_UserMgr_pmtmain1(params) => {
   call { 
        invokeHandler(controllers.UserMgr.pmtmain(), HandlerDef(this, "controllers.UserMgr", "pmtmain", Nil,"GET", """ Users""", Routes.prefix + """usermain"""))
   }
}
        

// @LINE:11
case controllers_UserMgr_pmtlist2(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("cc_name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.UserMgr.pmtlist(p, s, o, f), HandlerDef(this, "controllers.UserMgr", "pmtlist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """userpmts"""))
   }
}
        

// @LINE:12
case controllers_UserMgr_create3(params) => {
   call { 
        invokeHandler(controllers.UserMgr.create(), HandlerDef(this, "controllers.UserMgr", "create", Nil,"GET", """""", Routes.prefix + """userpmts/new"""))
   }
}
        

// @LINE:13
case controllers_UserMgr_save4(params) => {
   call { 
        invokeHandler(controllers.UserMgr.save(), HandlerDef(this, "controllers.UserMgr", "save", Nil,"POST", """""", Routes.prefix + """userpmts"""))
   }
}
        

// @LINE:14
case controllers_UserMgr_delete5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserMgr.delete(id), HandlerDef(this, "controllers.UserMgr", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """userpmts/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:15
case controllers_UserMgr_update6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserMgr.update(id), HandlerDef(this, "controllers.UserMgr", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """userpmts/$id<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_UserMgr_edit7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserMgr.edit(id), HandlerDef(this, "controllers.UserMgr", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """userpmts/$id<[^/]+>"""))
   }
}
        

// @LINE:18
case controllers_OrderMgr_ordermain8(params) => {
   call { 
        invokeHandler(controllers.OrderMgr.ordermain(), HandlerDef(this, "controllers.OrderMgr", "ordermain", Nil,"GET", """""", Routes.prefix + """userorders"""))
   }
}
        

// @LINE:19
case controllers_OrderMgr_orderlist9(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("item_name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.OrderMgr.orderlist(p, s, o, f), HandlerDef(this, "controllers.OrderMgr", "orderlist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """userorders/main"""))
   }
}
        

// @LINE:20
case controllers_OrderMgr_create10(params) => {
   call { 
        invokeHandler(controllers.OrderMgr.create(), HandlerDef(this, "controllers.OrderMgr", "create", Nil,"GET", """""", Routes.prefix + """userorders/new"""))
   }
}
        

// @LINE:21
case controllers_OrderMgr_save11(params) => {
   call { 
        invokeHandler(controllers.OrderMgr.save(), HandlerDef(this, "controllers.OrderMgr", "save", Nil,"POST", """""", Routes.prefix + """userorders"""))
   }
}
        

// @LINE:22
case controllers_OrderMgr_delete12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.OrderMgr.delete(id), HandlerDef(this, "controllers.OrderMgr", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """userorders/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:23
case controllers_OrderMgr_update13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.OrderMgr.update(id), HandlerDef(this, "controllers.OrderMgr", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """userorders/$id<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_OrderMgr_edit14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.OrderMgr.edit(id), HandlerDef(this, "controllers.OrderMgr", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """userorders/$id<[^/]+>"""))
   }
}
        

// @LINE:28
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:31
case controllers_SignIn_blank16(params) => {
   call { 
        invokeHandler(controllers.SignIn.blank(), HandlerDef(this, "controllers.SignIn", "blank", Nil,"GET", """User""", Routes.prefix + """signin"""))
   }
}
        

// @LINE:32
case controllers_SignIn_signin17(params) => {
   call { 
        invokeHandler(controllers.SignIn.signin(), HandlerDef(this, "controllers.SignIn", "signin", Nil,"POST", """""", Routes.prefix + """signin"""))
   }
}
        

// @LINE:33
case controllers_SignUp_blank18(params) => {
   call { 
        invokeHandler(controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:34
case controllers_SignUp_signup19(params) => {
   call { 
        invokeHandler(controllers.SignUp.signup(), HandlerDef(this, "controllers.SignUp", "signup", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        
}

}
     