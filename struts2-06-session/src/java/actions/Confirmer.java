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
public class Confirmer extends ActionSupport implements SessionAware {

    // modèle
    private String nom;
    // session
    private Map<String, Object> session;

    // getters et setters
    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    @Override
    public void setSession(Map<String, Object> session) {
	this.session = session;
    }

    @Override
    public String execute() {
	// on met le nom dans la session
	session.put("nom", nom);
	// navigation
	return SUCCESS;
    }
}
