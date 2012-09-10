/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.List;
import jpa.Employe;
import metier.IMetier;

/**
 *
 * @author Serge Tahé
 */
public class Config {

  // couche métier initialisée par Spring
  private IMetier metier;
  // liste des employés
  private List<Employe> employes;
  // erreurs
  private Exception initException;

  // constructeur
  public Config() {
  }

  // méthode Spring d'initialisation de l'objet
  public void init() {
    // on demande la liste des employés
    try {
      employes = metier.findAllEmployes();
    } catch (Exception ex) {
      initException = ex;
    }
  }

  // getters et setters
  public List<Employe> getEmployes() {
    return employes;
  }

  public void setEmployes(List<Employe> employes) {
    this.employes = employes;
  }

  public Exception getInitException() {
    return initException;
  }

  public void setInitException(Exception initException) {
    this.initException = initException;
  }

  public IMetier getMetier() {
    return metier;
  }

  public void setMetier(IMetier metier) {
    this.metier = metier;
  }
  
}
