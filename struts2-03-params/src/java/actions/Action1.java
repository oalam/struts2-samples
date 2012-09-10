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
public class Action1 extends ActionSupport {

    // modèle de l'action
    private String param1 = "valeur1";
    private String param2 = "valeur2";

    @Override
    public String execute() {
	// choix aléatoire entre deux vues
	int i = (int) (Math.random() * 2);
	if (i == 0) {
	    return "page1";
	} else {
	    return "page2";
	}
    }

    // getters et setters
    public String getParam1() {
	return param1;
    }

    public void setParam1(String param1) {
	this.param1 = param1;
    }

    public String getParam2() {
	return param2;
    }

    public void setParam2(String param2) {
	this.param2 = param2;
    }
}
