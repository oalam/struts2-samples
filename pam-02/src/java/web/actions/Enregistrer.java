/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import web.entities.Menu;
import web.entities.Simulation;

/**
 *
 * @author Serge Tahé
 */
public class Enregistrer extends ActionSupport implements SessionAware {

  // session
  private Map<String, Object> session;
  // menu
  private Menu menu;

  @Override
  public void setSession(Map<String, Object> session) {
    this.session = session;
  }

  // exécution de l'action
  public String execute() {
    // on récupère la dernière simulation dans la session
    Simulation simulation = (Simulation) session.get("simulation");
    if (simulation == null) {
      return ERROR;
    }
    // on récupère le N° de la dernière simulation
    Integer numDerniereSimulation = (Integer) session.get("numDerniereSimulation");
    if (numDerniereSimulation == null) {
      numDerniereSimulation = 0;
    }
    // on l'incrémente
    numDerniereSimulation++;
    // on la remet le nouveau n° dans la session
    session.put("numDerniereSimulation", numDerniereSimulation);
    // on récupère la liste des simulations
    List<Simulation> simulations = (List<Simulation>) session.get("simulations");
    if (simulations == null) {
      simulations = new ArrayList<Simulation>();
      session.put("simulations", simulations);
    }
    // on lui ajoute la simulation courante
    simulation.setNum(numDerniereSimulation);
    simulations.add(simulation);
    // on affiche la liste des simulations
    menu = new Menu(false, false, false, false, true, true);
    return "simulations";
  }

  // getters et setters
  public Menu getMenu() {
    return menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }
}
