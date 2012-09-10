package example;

public class FormDiversModel {

  // constructeur sans paramètre
  public FormDiversModel() {
  }
  
  // champs
  private String email;
  private String url1 ;
  private String chaine;

    // raz modèle
  public void clearModel() {
    email = null;
    url1 = null;
    chaine = null;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

 
  /**
   * @return the chaine
   */
  public String getChaine() {
    return chaine;
  }

  /**
   * @param chaine the chaine to set
   */
  public void setChaine(String chaine) {
    this.chaine = chaine;
  }

  /**
   * @return the url1
   */
  public String getUrl1() {
    return url1;
  }

  /**
   * @param url1 the url1 to set
   */
  public void setUrl1(String url1) {
    this.url1 = url1;
  }

  
}
