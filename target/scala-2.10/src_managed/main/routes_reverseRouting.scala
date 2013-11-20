// @SOURCE:/Users/TZ029887/Documents/computer-database/conf/routes
// @HASH:4bdc129c2f4b9bc6c02e46543711f7c71254c2de
// @DATE:Tue Nov 19 21:34:00 CST 2013

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
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:8
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
                          

// @LINE:11
// @LINE:10
class ReverseUserMgr {
    

// @LINE:10
def pmtmain(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usermain")
}
                                                

// @LINE:11
def pmtlist(e:String = "sample@saohuo.com", p:String = "abcd"): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "userpmts" + queryString(List(if(e == "sample@saohuo.com") None else Some(implicitly[QueryStringBindable[String]].unbind("e", e)), if(p == "abcd") None else Some(implicitly[QueryStringBindable[String]].unbind("p", p)))))
}
                                                
    
}
                          

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:25
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:8
def main(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "main")
}
                                                

// @LINE:17
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers/new")
}
                                                

// @LINE:21
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:22
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:14
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:18
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers")
}
                                                

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
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:8
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
              

// @LINE:11
// @LINE:10
class ReverseUserMgr {
    

// @LINE:10
def pmtmain : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserMgr.pmtmain",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usermain"})
      }
   """
)
                        

// @LINE:11
def pmtlist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserMgr.pmtlist",
   """
      function(e,p) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userpmts" + _qS([(e == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("e", e)), (p == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("p", p))])})
      }
   """
)
                        
    
}
              

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:25
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:8
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.main",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "main"})
      }
   """
)
                        

// @LINE:17
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/new"})
      }
   """
)
                        

// @LINE:21
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:22
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:18
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers"})
      }
   """
)
                        

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
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:8
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
                          

// @LINE:11
// @LINE:10
class ReverseUserMgr {
    

// @LINE:10
def pmtmain(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserMgr.pmtmain(), HandlerDef(this, "controllers.UserMgr", "pmtmain", Seq(), "GET", """""", _prefix + """usermain""")
)
                      

// @LINE:11
def pmtlist(e:String, p:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserMgr.pmtlist(e, p), HandlerDef(this, "controllers.UserMgr", "pmtlist", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """userpmts""")
)
                      
    
}
                          

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:25
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]), "POST", """ Delete a computer""", _prefix + """computers/$id<[^/]+>/delete""")
)
                      

// @LINE:8
def main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.main(), HandlerDef(this, "controllers.Application", "main", Seq(), "GET", """""", _prefix + """main""")
)
                      

// @LINE:17
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Seq(), "GET", """ Add computer""", _prefix + """computers/new""")
)
                      

// @LINE:21
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]), "GET", """ Edit existing computer""", _prefix + """computers/$id<[^/]+>""")
)
                      

// @LINE:22
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]), "POST", """""", _prefix + """computers/$id<[^/]+>""")
)
                      

// @LINE:14
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """ Computers pmtlist (look at the default values for pagination parameters)""", _prefix + """computers""")
)
                      

// @LINE:18
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Seq(), "POST", """""", _prefix + """computers""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Default path will just redirect to the computer pmtlist""", _prefix + """""")
)
                      
    
}
                          
}
        
    