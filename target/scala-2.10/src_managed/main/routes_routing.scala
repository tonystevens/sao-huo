// @SOURCE:/Users/TZ029887/Documents/computer-database/conf/routes
// @HASH:6f57ee82fc68a7d106b198a1246bbce7f3499b1c
// @DATE:Thu Dec 26 13:40:21 CST 2013


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
        

// @LINE:11
private[this] lazy val controllers_UserMgr_pmtmain2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usermain"))))
        

// @LINE:12
private[this] lazy val controllers_UserMgr_pmtlist3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts"))))
        

// @LINE:13
private[this] lazy val controllers_UserMgr_create4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts/new"))))
        

// @LINE:14
private[this] lazy val controllers_UserMgr_save5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts"))))
        

// @LINE:15
private[this] lazy val controllers_UserMgr_delete6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:16
private[this] lazy val controllers_UserMgr_update7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_UserMgr_edit8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userpmts/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_OrderMgr_ordermain9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders"))))
        

// @LINE:20
private[this] lazy val controllers_OrderMgr_orderlist10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders/main"))))
        

// @LINE:21
private[this] lazy val controllers_OrderMgr_create11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders/new"))))
        

// @LINE:22
private[this] lazy val controllers_OrderMgr_save12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders"))))
        

// @LINE:23
private[this] lazy val controllers_OrderMgr_delete13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:24
private[this] lazy val controllers_OrderMgr_update14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_OrderMgr_edit15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userorders/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Application_list16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers"))))
        

// @LINE:32
private[this] lazy val controllers_Application_create17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/new"))))
        

// @LINE:33
private[this] lazy val controllers_Application_save18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers"))))
        

// @LINE:36
private[this] lazy val controllers_Application_edit19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:37
private[this] lazy val controllers_Application_update20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:40
private[this] lazy val controllers_Application_delete21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:43
private[this] lazy val controllers_Assets_at22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:46
private[this] lazy val controllers_SignIn_blank23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
        

// @LINE:47
private[this] lazy val controllers_SignIn_signin24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
        

// @LINE:48
private[this] lazy val controllers_SignUp_blank25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:49
private[this] lazy val controllers_SignUp_signup26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """main""","""controllers.Application.main()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usermain""","""controllers.UserMgr.pmtmain()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts""","""controllers.UserMgr.pmtlist(p:Int ?= 0, s:String ?= "cc_name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts/new""","""controllers.UserMgr.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts""","""controllers.UserMgr.save()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts/$id<[^/]+>/delete""","""controllers.UserMgr.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts/$id<[^/]+>""","""controllers.UserMgr.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userpmts/$id<[^/]+>""","""controllers.UserMgr.edit(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders""","""controllers.OrderMgr.ordermain()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders/main""","""controllers.OrderMgr.orderlist(p:Int ?= 0, s:String ?= "item_name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders/new""","""controllers.OrderMgr.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders""","""controllers.OrderMgr.save()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders/$id<[^/]+>/delete""","""controllers.OrderMgr.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders/$id<[^/]+>""","""controllers.OrderMgr.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userorders/$id<[^/]+>""","""controllers.OrderMgr.edit(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers""","""controllers.Application.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/new""","""controllers.Application.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers""","""controllers.Application.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>/delete""","""controllers.Application.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.SignIn.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.SignIn.signin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.SignUp.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.SignUp.signup()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:8
case controllers_Application_main1(params) => {
   call { 
        invokeHandler(controllers.Application.main(), HandlerDef(this, "controllers.Application", "main", Nil,"GET", """""", Routes.prefix + """main"""))
   }
}
        

// @LINE:11
case controllers_UserMgr_pmtmain2(params) => {
   call { 
        invokeHandler(controllers.UserMgr.pmtmain(), HandlerDef(this, "controllers.UserMgr", "pmtmain", Nil,"GET", """ Users""", Routes.prefix + """usermain"""))
   }
}
        

// @LINE:12
case controllers_UserMgr_pmtlist3(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("cc_name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.UserMgr.pmtlist(p, s, o, f), HandlerDef(this, "controllers.UserMgr", "pmtlist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """userpmts"""))
   }
}
        

// @LINE:13
case controllers_UserMgr_create4(params) => {
   call { 
        invokeHandler(controllers.UserMgr.create(), HandlerDef(this, "controllers.UserMgr", "create", Nil,"GET", """""", Routes.prefix + """userpmts/new"""))
   }
}
        

// @LINE:14
case controllers_UserMgr_save5(params) => {
   call { 
        invokeHandler(controllers.UserMgr.save(), HandlerDef(this, "controllers.UserMgr", "save", Nil,"POST", """""", Routes.prefix + """userpmts"""))
   }
}
        

// @LINE:15
case controllers_UserMgr_delete6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserMgr.delete(id), HandlerDef(this, "controllers.UserMgr", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """userpmts/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:16
case controllers_UserMgr_update7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserMgr.update(id), HandlerDef(this, "controllers.UserMgr", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """userpmts/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_UserMgr_edit8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserMgr.edit(id), HandlerDef(this, "controllers.UserMgr", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """userpmts/$id<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_OrderMgr_ordermain9(params) => {
   call { 
        invokeHandler(controllers.OrderMgr.ordermain(), HandlerDef(this, "controllers.OrderMgr", "ordermain", Nil,"GET", """""", Routes.prefix + """userorders"""))
   }
}
        

// @LINE:20
case controllers_OrderMgr_orderlist10(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("item_name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.OrderMgr.orderlist(p, s, o, f), HandlerDef(this, "controllers.OrderMgr", "orderlist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """userorders/main"""))
   }
}
        

// @LINE:21
case controllers_OrderMgr_create11(params) => {
   call { 
        invokeHandler(controllers.OrderMgr.create(), HandlerDef(this, "controllers.OrderMgr", "create", Nil,"GET", """""", Routes.prefix + """userorders/new"""))
   }
}
        

// @LINE:22
case controllers_OrderMgr_save12(params) => {
   call { 
        invokeHandler(controllers.OrderMgr.save(), HandlerDef(this, "controllers.OrderMgr", "save", Nil,"POST", """""", Routes.prefix + """userorders"""))
   }
}
        

// @LINE:23
case controllers_OrderMgr_delete13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.OrderMgr.delete(id), HandlerDef(this, "controllers.OrderMgr", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """userorders/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:24
case controllers_OrderMgr_update14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.OrderMgr.update(id), HandlerDef(this, "controllers.OrderMgr", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """userorders/$id<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_OrderMgr_edit15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.OrderMgr.edit(id), HandlerDef(this, "controllers.OrderMgr", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """userorders/$id<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Application_list16(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """ Computers orderlist (look at the default values for pagination parameters)""", Routes.prefix + """computers"""))
   }
}
        

// @LINE:32
case controllers_Application_create17(params) => {
   call { 
        invokeHandler(controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Nil,"GET", """ Add computer""", Routes.prefix + """computers/new"""))
   }
}
        

// @LINE:33
case controllers_Application_save18(params) => {
   call { 
        invokeHandler(controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Nil,"POST", """""", Routes.prefix + """computers"""))
   }
}
        

// @LINE:36
case controllers_Application_edit19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]),"GET", """ Edit existing computer""", Routes.prefix + """computers/$id<[^/]+>"""))
   }
}
        

// @LINE:37
case controllers_Application_update20(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """computers/$id<[^/]+>"""))
   }
}
        

// @LINE:40
case controllers_Application_delete21(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]),"POST", """ Delete a computer""", Routes.prefix + """computers/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:43
case controllers_Assets_at22(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:46
case controllers_SignIn_blank23(params) => {
   call { 
        invokeHandler(controllers.SignIn.blank(), HandlerDef(this, "controllers.SignIn", "blank", Nil,"GET", """User""", Routes.prefix + """signin"""))
   }
}
        

// @LINE:47
case controllers_SignIn_signin24(params) => {
   call { 
        invokeHandler(controllers.SignIn.signin(), HandlerDef(this, "controllers.SignIn", "signin", Nil,"POST", """""", Routes.prefix + """signin"""))
   }
}
        

// @LINE:48
case controllers_SignUp_blank25(params) => {
   call { 
        invokeHandler(controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:49
case controllers_SignUp_signup26(params) => {
   call { 
        invokeHandler(controllers.SignUp.signup(), HandlerDef(this, "controllers.SignUp", "signup", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        
}

}
     