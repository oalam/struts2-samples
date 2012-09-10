/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Serge Tahé
 */
public class Effacer extends ActionSupport implements SessionAware {

    // session
    private Map<String, Object> session;

    @Override
    public String execute() {
	// on récupère le nom dans la session
	String nom = (String) session.get("nom");
	// on l'enlève de la session si besoin est
	if (nom != null) {
	    session.remove("nom");
	}
	// navigation
	return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
	this.session = map;
    }
}
