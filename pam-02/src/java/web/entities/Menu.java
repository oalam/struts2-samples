/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.entities;

import java.io.Serializable;

/**
 *
 * @author Serge Tahé
 */
public class Menu implements Serializable {
  // éléments du menu

  private boolean faireSimulation;
  private boolean effacerSimulation;
  private boolean enregistrerSimulation;
  private boolean voirSimulations;
  private boolean retourFormulaire;
  private boolean terminerSession;

  public Menu() {
  }

  public Menu(boolean faireSimulation, boolean effacerSimulation, boolean enregistrerSimulation, boolean voirSimulations, boolean retourFormulaire, boolean terminerSession) {
    this.faireSimulation = faireSimulation;
    this.effacerSimulation = effacerSimulation;
    this.enregistrerSimulation = enregistrerSimulation;
    this.voirSimulations = voirSimulations;
    this.retourFormulaire = retourFormulaire;
    this.terminerSession = terminerSession;
  }
  
  // getters et setters

  public boolean isEffacerSimulation() {
    return effacerSimulation;
  }

  public void setEffacerSimulation(boolean effacerSimulation) {
    this.effacerSimulation = effacerSimulation;
  }

  public boolean isEnregistrerSimulation() {
    return enregistrerSimulation;
  }

  public void setEnregistrerSimulation(boolean enregistrerSimulation) {
    this.enregistrerSimulation = enregistrerSimulation;
  }

  public boolean isFaireSimulation() {
    return faireSimulation;
  }

  public void setFaireSimulation(boolean faireSimulation) {
    this.faireSimulation = faireSimulation;
  }

  public boolean isRetourFormulaire() {
    return retourFormulaire;
  }

  public void setRetourFormulaire(boolean retourFormulaire) {
    this.retourFormulaire = retourFormulaire;
  }

  public boolean isTerminerSession() {
    return terminerSession;
  }

  public void setTerminerSession(boolean terminerSession) {
    this.terminerSession = terminerSession;
  }

  public boolean isVoirSimulations() {
    return voirSimulations;
  }

  public void setVoirSimulations(boolean voirSimulations) {
    this.voirSimulations = voirSimulations;
  }
  
}
