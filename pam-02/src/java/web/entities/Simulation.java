package web.entities;

import java.io.Serializable;
import metier.FeuilleSalaire;

public class Simulation implements Serializable{
  
  public Simulation() {
  }

  // champs d'une simulation
  private Integer num;
  private FeuilleSalaire feuilleSalaire;
  private String heuresTravaillées;
  private String joursTravaillés;
  
  // constructeur
  public Simulation(Integer num,String heuresTravaillées, String joursTravaillés, FeuilleSalaire feuilleSalaire){
    this.setNum(num);
    this.setFeuilleSalaire(feuilleSalaire);
    this.setHeuresTravaillées(heuresTravaillées);
    this.setJoursTravaillés(joursTravaillés);
  }
  
  public double getIndemnites(){
    return feuilleSalaire.getElementsSalaire().getIndemnitesEntretien()+ feuilleSalaire.getElementsSalaire().getIndemnitesRepas();
  }

  // getters et setters

  public String getHeuresTravaillées() {
    return heuresTravaillées;
  }

  public void setHeuresTravaillées(String heuresTravaillées) {
    this.heuresTravaillées = heuresTravaillées;
  }

  public String getJoursTravaillés() {
    return joursTravaillés;
  }

  public void setJoursTravaillés(String joursTravaillés) {
    this.joursTravaillés = joursTravaillés;
  }

  public FeuilleSalaire getFeuilleSalaire() {
    return feuilleSalaire;
  }

  public void setFeuilleSalaire(FeuilleSalaire feuilleSalaire) {
    this.feuilleSalaire = feuilleSalaire;
  }

  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }
}
