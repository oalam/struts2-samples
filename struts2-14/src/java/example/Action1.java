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
    private Map<String, Object> session;
    private Map<String, Object> request;
    private Map<String, String[]> parameters;
    private Config config;

    @Override
    public String execute() {
	// paramètres
	System.out.println("Paramètres...");
	Set<String> clés = parameters.keySet();
	for (String clé : clés) {
	    for (String valeur : parameters.get(clé)) {
		System.out.println(String.format("[%s,%s]", clé, valeur));
	    }
	}

	// configuration
	System.out.println("Configuration...");
	if (config != null) {
	    System.out.println(String.format("nbMaxUsers=%s", config.getNbMaxUsers()));
	}

	// session
	System.out.println("Session...");
	if (session.get("compteur") == null) {
	    session.put("compteur", new Integer(0));
	}
	Integer compteur = (Integer) session.get("compteur");
	compteur++;
	session.put("compteur", compteur);
	System.out.println(String.format("compteur=%s", compteur));

	// requête
	if (config != null) {
	    request.put("nbMaxUsers", config.getNbMaxUsers());
	}

	// affichage page JSP
	return SUCCESS;
    }

    public void setSession(Map<String, Object> session) {
	this.session = session;
    }

    public void setRequest(Map<String, Object> request) {
	this.request = request;
    }

    public void setParameters(Map<String, String[]> parameters) {
	this.parameters = parameters;
    }

    /**
     * @return the config
     */
    public Config getConfig() {
	return config;
    }

    /**
     * @param config the config to set
     */
    public void setConfig(Config config) {
	this.config = config;
    }
}
