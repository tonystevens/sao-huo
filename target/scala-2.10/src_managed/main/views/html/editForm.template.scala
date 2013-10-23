
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Computer],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, computerForm: Form[Computer]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Edit computer</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Application.update(id))/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(computerForm("name"), '_label -> "Computer name"))),format.raw/*15.73*/("""
            """),_display_(Seq[Any](/*16.14*/inputText(computerForm("introduced"), '_label -> "Introduced date"))),format.raw/*16.81*/("""
            """),_display_(Seq[Any](/*17.14*/inputText(computerForm("discontinued"), '_label -> "Discontinued date"))),format.raw/*17.85*/("""
            
            """),_display_(Seq[Any](/*19.14*/select(
                computerForm("company.id"), 
                options(Company.options), 
                '_label -> "Company", '_default -> "-- Choose a company --",
                '_showConstraints -> false
            ))),format.raw/*24.14*/("""
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this computer" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*30.23*/routes/*30.29*/.Application.list())),format.raw/*30.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*33.6*/("""
    
    """),_display_(Seq[Any](/*35.6*/form(routes.Application.delete(id), 'class -> "topRight")/*35.63*/ {_display_(Seq[Any](format.raw/*35.65*/("""
        <input type="submit" value="Delete this computer" class="btn danger">
    """)))})),format.raw/*37.6*/("""
    
""")))})),format.raw/*39.2*/("""
"""))}
    }
    
    def render(id:Long,computerForm:Form[Computer]): play.api.templates.HtmlFormat.Appendable = apply(id,computerForm)
    
    def f:((Long,Form[Computer]) => play.api.templates.HtmlFormat.Appendable) = (id,computerForm) => apply(id,computerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 23 14:50:28 CDT 2013
                    SOURCE: /Users/TZ029887/Documents/computer-database/app/views/editForm.scala.html
                    HASH: 1a0eefb4a580f5711afff27110c010fc0b693417
                    MATRIX: 790->1|932->62|964->86|1048->41|1076->60|1104->140|1142->144|1153->148|1191->150|1269->193|1313->228|1353->230|1440->281|1521->340|1571->354|1660->421|1710->435|1803->506|1866->533|2117->762|2329->938|2344->944|2385->963|2471->1018|2517->1029|2583->1086|2623->1088|2738->1172|2776->1179
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|47->19|52->24|58->30|58->30|58->30|61->33|63->35|63->35|63->35|65->37|67->39
                    -- GENERATED --
                */
            