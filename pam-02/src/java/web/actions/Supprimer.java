/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import web.entities.Menu;
import web.entities.Simulation;

/**
 *
 * @author Serge Tahé
 */
public class Supprimer extends ActionSupport implements SessionAware {

  // session
  private Map<String, Object> session;
  // id de la simulation à supprimer
  private String id;
  // menu
  private Menu menu;

  @Override
  public void setSession(Map<String, Object> session) {
    this.session = session;
  }

  // exécution de l'action
  public String execute() {
    // on récupère les simulations dans la session
    List<Simulation> simulations = (List<Simulation>) session.get("simulations");
    if (simulations == null) {
      // cas anormal - la session a du expirer
      menu = new Menu(false, false, false, false, true, true);
      return "erreur";
    }
    // test de id
    int num = 0;
    boolean erreur = false;
    try {
      num = Integer.parseInt(id);
      erreur = num <= 0;
    } catch (NumberFormatException ex) {
      // anormal
      erreur = true;
    }
    // erreur ?
    if (erreur) {
      menu = new Menu(false, false, false, false, true, true);
      return "erreur";
    }
    // on recherche la simulation à supprimer
    for (int i = 0; i < simulations.size(); i++) {
      if (num == simulations.get(i).getNum()) {
        simulations.remove(i);
        break;
      }
    }
    // on affiche la liste des simulations
    menu = new Menu(false, false, false, false, true, true);
    return "simulations";
  }

  // getters et setters
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Menu getMenu() {
    return menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }
}
