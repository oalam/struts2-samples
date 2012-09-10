package example;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import java.util.Set;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class Action1 extends ActionSupport implements SessionAware, RequestAware, ParameterAware {

    // constructeur sans paramètre
    public Action1() {
    }
    // Session, Request, Parametres
    Map<String, Object> session;
    Map<String, Object> request;
    Map<String, String[]> parameters;

    @Override
    public String execute() {
	// liste des paramètres
	System.out.println("Paramètres...");
	Set<String> clés = parameters.keySet();
	for (String clé : clés) {
	    for (String valeur : parameters.get(clé)) {
		System.out.println(String.format("[%s,%s]", clé, valeur));
	    }
	}
	// session
	System.out.println("Session...");
	if (session.get("compteur") == null) {
	    session.put("compteur", new Integer(0));
	}
	Integer compteur = (Integer) session.get("compteur");
	compteur = compteur + 1;
	session.put("compteur", compteur);
	System.out.println(String.format("compteur=%s", compteur));
	// requête
	request.put("info1", "information1");
	// affichage page JSP
	return SUCCESS;
    }

    // session
    public void setSession(Map<String, Object> session) {
	this.session = session;
    }

    // requête
    public void setRequest(Map<String, Object> request) {
	this.request = request;
    }

    // paramètres
    public void setParameters(Map<String, String[]> parameters) {
	this.parameters = parameters;
    }
}
