/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package example;

/**
 *
 * @author st
 */
public class Couleur {

  // champs
  private String id;
  private String nom;

  // constructeur
  public Couleur(){
  }

  // getters et setters
  /**
   * @return the nom
   */
  public String getNom() {
    return nom;
  }

  /**
   * @param nom the nom to set
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  
}
