// @SOURCE:/Users/TZ029887/Documents/computer-database/conf/routes
// @HASH:407b25cb31dd7fbd83e3f41f49bed13df0fb25b8
// @DATE:Thu Mar 27 15:20:01 CDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers {

// @LINE:32
// @LINE:31
class ReverseSignIn {
    

// @LINE:32
def signin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signin")
}
                                                

// @LINE:31
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signin")
}
                                                
    
}
                          

// @LINE:28
class ReverseAssets {
    

// @LINE:28
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:34
// @LINE:33
class ReverseSignUp {
    

// @LINE:34
def signup(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:33
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseUserMgr {
    

// @LINE:14
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "userpmts/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:10
def pmtmain(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usermain")
}
                                                

// @LINE:12
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userpmts/new")
}
                                                

// @LINE:16
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userpmts/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:15
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "userpmts/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:11
def pmtlist(p:Int = 0, s:String = "cc_name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userpmts" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "cc_name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:13
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "userpmts")
}
                                                
    
}
                          

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseOrderMgr {
    

// @LINE:22
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "userorders/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:18
def ordermain(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userorders")
}
                                                

// @LINE:20
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userorders/new")
}
                                                

// @LINE:24
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userorders/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:23
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "userorders/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:21
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "userorders")
}
                                                

// @LINE:19
def orderlist(p:Int = 0, s:String = "item_name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userorders/main" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "item_name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.javascript {

// @LINE:32
// @LINE:31
class ReverseSignIn {
    

// @LINE:32
def signin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignIn.signin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
      }
   """
)
                        

// @LINE:31
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignIn.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
      }
   """
)
                        
    
}
              

// @LINE:28
class ReverseAssets {
    

// @LINE:28
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:34
// @LINE:33
class ReverseSignUp {
    

// @LINE:34
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignUp.signup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:33
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignUp.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        
    
}
              

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseUserMgr {
    

// @LINE:14
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserMgr.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userpmts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:10
def pmtmain : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserMgr.pmtmain",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usermain"})
      }
   """
)
                        

// @LINE:12
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserMgr.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userpmts/new"})
      }
   """
)
                        

// @LINE:16
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserMgr.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userpmts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:15
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserMgr.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userpmts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def pmtlist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserMgr.pmtlist",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userpmts" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:13
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserMgr.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userpmts"})
      }
   """
)
                        
    
}
              

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseOrderMgr {
    

// @LINE:22
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OrderMgr.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userorders/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:18
def ordermain : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OrderMgr.ordermain",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userorders"})
      }
   """
)
                        

// @LINE:20
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OrderMgr.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userorders/new"})
      }
   """
)
                        

// @LINE:24
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OrderMgr.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userorders/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:23
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OrderMgr.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userorders/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:21
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OrderMgr.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userorders"})
      }
   """
)
                        

// @LINE:19
def orderlist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OrderMgr.orderlist",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userorders/main" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.ref {


// @LINE:32
// @LINE:31
class ReverseSignIn {
    

// @LINE:32
def signin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignIn.signin(), HandlerDef(this, "controllers.SignIn", "signin", Seq(), "POST", """""", _prefix + """signin""")
)
                      

// @LINE:31
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignIn.blank(), HandlerDef(this, "controllers.SignIn", "blank", Seq(), "GET", """User""", _prefix + """signin""")
)
                      
    
}
                          

// @LINE:28
class ReverseAssets {
    

// @LINE:28
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:34
// @LINE:33
class ReverseSignUp {
    

// @LINE:34
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignUp.signup(), HandlerDef(this, "controllers.SignUp", "signup", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:33
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Seq(), "GET", """""", _prefix + """signup""")
)
                      
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseUserMgr {
    

// @LINE:14
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserMgr.delete(id), HandlerDef(this, "controllers.UserMgr", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """userpmts/$id<[^/]+>/delete""")
)
                      

// @LINE:10
def pmtmain(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserMgr.pmtmain(), HandlerDef(this, "controllers.UserMgr", "pmtmain", Seq(), "GET", """ Users""", _prefix + """usermain""")
)
                      

// @LINE:12
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserMgr.create(), HandlerDef(this, "controllers.UserMgr", "create", Seq(), "GET", """""", _prefix + """userpmts/new""")
)
                      

// @LINE:16
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserMgr.edit(id), HandlerDef(this, "controllers.UserMgr", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """userpmts/$id<[^/]+>""")
)
                      

// @LINE:15
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserMgr.update(id), HandlerDef(this, "controllers.UserMgr", "update", Seq(classOf[Long]), "POST", """""", _prefix + """userpmts/$id<[^/]+>""")
)
                      

// @LINE:11
def pmtlist(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserMgr.pmtlist(p, s, o, f), HandlerDef(this, "controllers.UserMgr", "pmtlist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """userpmts""")
)
                      

// @LINE:13
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserMgr.save(), HandlerDef(this, "controllers.UserMgr", "save", Seq(), "POST", """""", _prefix + """userpmts""")
)
                      
    
}
                          

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseOrderMgr {
    

// @LINE:22
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OrderMgr.delete(id), HandlerDef(this, "controllers.OrderMgr", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """userorders/$id<[^/]+>/delete""")
)
                      

// @LINE:18
def ordermain(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OrderMgr.ordermain(), HandlerDef(this, "controllers.OrderMgr", "ordermain", Seq(), "GET", """""", _prefix + """userorders""")
)
                      

// @LINE:20
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OrderMgr.create(), HandlerDef(this, "controllers.OrderMgr", "create", Seq(), "GET", """""", _prefix + """userorders/new""")
)
                      

// @LINE:24
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OrderMgr.edit(id), HandlerDef(this, "controllers.OrderMgr", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """userorders/$id<[^/]+>""")
)
                      

// @LINE:23
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OrderMgr.update(id), HandlerDef(this, "controllers.OrderMgr", "update", Seq(classOf[Long]), "POST", """""", _prefix + """userorders/$id<[^/]+>""")
)
                      

// @LINE:21
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OrderMgr.save(), HandlerDef(this, "controllers.OrderMgr", "save", Seq(), "POST", """""", _prefix + """userorders""")
)
                      

// @LINE:19
def orderlist(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.OrderMgr.orderlist(p, s, o, f), HandlerDef(this, "controllers.OrderMgr", "orderlist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """userorders/main""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Default path will just redirect to the computer orderlist""", _prefix + """""")
)
                      
    
}
                          
}
        
    