/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jpa.Employe;
import metier.FeuilleSalaire;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;
import web.Config;
import web.entities.Erreur;
import web.entities.Menu;
import web.entities.Simulation;

/**
 *
 * @author Serge Tahé
 */
public class Formulaire extends ActionSupport implements Preparable, SessionAware {

  // configuration initialisée par Spring
  private Config config;
  // liste des employés
  private List<Employe> employes;
  // liste des erreurs
  private List<Erreur> erreurs;
  // feuille de salaire
  private FeuilleSalaire feuilleSalaire;
  // saisies
  private String comboEmployesValue;
  private Double heuresTravaillees;
  private Integer joursTravailles;
  // session
  private Map<String, Object> session;
  // menu
  private Menu menu;

  @Override
  public void prepare() throws Exception {
    // erreur de configuration ?
    Exception initException = config.getInitException();
    if (initException != null) {
      erreurs = new ArrayList<Erreur>();
      Throwable th = initException;
      while (th != null) {
        erreurs.add(new Erreur(th.getClass().getName(), th.getMessage()));
        th = th.getCause();
      }
    } else {
      employes = config.getEmployes();
    }
  }

  @Override
  public String input() {
    if (erreurs == null) {
      // menu
      menu = new Menu(true, false, false, true, false, true);
      return SUCCESS;
    } else {
      // menu
      menu = new Menu(false, false, false, false, false, false);
      return "exception";
    }
  }

  // calcul du salaire
  public String calculSalaire() {
    try {
      // calcul salaire
      feuilleSalaire = config.getMetier().calculerFeuilleSalaire(comboEmployesValue, heuresTravaillees, joursTravailles);
      // on met la simulation dans la session
      session.put("simulation", new Simulation(0, "" + heuresTravaillees, "" + joursTravailles, feuilleSalaire));
      // menu
      menu = new Menu(true, true, true, true, false, true);
      // fini
      return "simulation";
    } catch (Throwable th) {
      erreurs = new ArrayList<Erreur>();
      while (th != null) {
        erreurs.add(new Erreur(th.getClass().getName(), th.getMessage()));
        th = th.getCause();
      }
      // menu
      menu = new Menu(false, false, false, false, true, true);
      return "exception";
    }
  }

  @Override
  public void validate() {
    // des erreurs ?
    if (!getFieldErrors().isEmpty()) {
      // menu
      menu = new Menu(true, false, false, true, false, true);
    }
  }

  @Override
  public void setSession(Map<String, Object> map) {
    session = map;
  }

  // getters et setters
  public List<Employe> getEmployes() {
    return employes;
  }

  public List<Erreur> getErreurs() {
    return erreurs;
  }

  public void setErreurs(List<Erreur> erreurs) {
    this.erreurs = erreurs;
  }

  public void setEmployes(List<Employe> employes) {
    this.employes = employes;
  }

  public String getComboEmployesValue() {
    return comboEmployesValue;
  }

  public void setComboEmployesValue(String comboEmployesValue) {
    this.comboEmployesValue = comboEmployesValue;
  }

  public Double getHeuresTravaillees() {
    return heuresTravaillees;
  }

  public void setHeuresTravaillees(Double heuresTravaillees) {
    this.heuresTravaillees = heuresTravaillees;
  }

  public Integer getJoursTravailles() {
    return joursTravailles;
  }

  public void setJoursTravailles(Integer joursTravailles) {
    this.joursTravailles = joursTravailles;
  }

  public FeuilleSalaire getFeuilleSalaire() {
    return feuilleSalaire;
  }

  public void setFeuilleSalaire(FeuilleSalaire feuilleSalaire) {
    this.feuilleSalaire = feuilleSalaire;
  }

  public void setConfig(Config config) {
    this.config = config;
  }

  public Menu getMenu() {
    return menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }
}
