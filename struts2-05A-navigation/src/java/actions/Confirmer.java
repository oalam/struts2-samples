/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Serge Tahé
 */
public class Confirmer extends ActionSupport {

    // modèle
    private String nom;

    // getters et setters
    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }
    

}
