package example;

import com.opensymphony.xwork2.ActionSupport;
import java.util.HashMap;

public class Form extends ActionSupport {

  // champs du formulaire
  private String select1 = "jaune";
  private String[] select2 = new String[]{"vert", "rouge"};
  private String[] select3 = new String[]{"01", "03"};
  private String[] select4 = new String[]{"1", "3"};
  private String[] select5 = new String[]{"1", "3"};
  private HashMap<String, String> dico = new HashMap<String, String>();
  private Couleur[] couleurs;
  private String[] checkboxlist1 = new String[]{"01", "03"};
  private String[] checkboxlist2 = new String[]{"1", "3"};
  private String[] checkboxlist3 = new String[]{"1", "3"};
  private String radio1="01";
  private String radio2="1";
  private String radio3="1";

  private String submitText;

  // constructeur sans paramètre
  public Form() {
    // init dictionnaire de couleurs
    dico.put("1", "vert(1)");
    dico.put("2", "jaune(2)");
    dico.put("3", "bleu(3)");
    dico.put("4", "rouge(4)");
    dico.put("5", "blanc(5)");

    // init tableau d'objets Couleur
    couleurs = new Couleur[dico.size()];
    int i = 0;
    for (String key : dico.keySet()) {
      couleurs[i] = new Couleur();
      couleurs[i].setId(key);
      couleurs[i].setNom(dico.get(key));
      i++;
    }
  }

  // valeurs sélectionnées dans listes déroulantes
  public String getSelect2SelectedValues() {
    return getArrayValue(select2);
  }

  public String getSelect3SelectedValues() {
    return getArrayValue(select3);
  }

  public String getSelect4SelectedValues() {
    return getArrayValue(select4);
  }

  public String getSelect5SelectedValues() {
    return getArrayValue(select5);
  }

  public String getCheckboxlist1SelectedValues() {
    return getArrayValue(checkboxlist1);
  }

  public String getCheckboxlist2SelectedValues() {
    return getArrayValue(checkboxlist2);
  }
  public String getCheckboxlist3SelectedValues() {
    return getArrayValue(checkboxlist3);
  }

  // méthodes utilitaires
  public String getArrayValue(String[] values) {
    String result = "";
    for (String value : values) {
      result += " " + value;
    }
    return result;
  }

  /**
   * @return the select2
   */
  public String[] getSelect2() {
    return select2;
  }

  /**
   * @param select2 the select2 to set
   */
  public void setSelect2(String[] select2) {
    this.select2 = select2;
  }

  /**
   * @return the select3
   */
  public String[] getSelect3() {
    return select3;
  }

  /**
   * @param select3 the select3 to set
   */
  public void setSelect3(String[] select3) {
    this.select3 = select3;
  }

  /**
   * @return the submitText
   */
  public String getSubmitText() {
    return submitText;
  }

  /**
   * @param submitText the submitText to set
   */
  public void setSubmitText(String submitText) {
    this.submitText = submitText;
  }

  /**
   * @return the select1
   */
  public String getSelect1() {
    return select1;
  }

  /**
   * @param select1 the select1 to set
   */
  public void setSelect1(String select1) {
    this.select1 = select1;
  }

  /**
   * @return the checkboxlist1
   */
  public String[] getCheckboxlist1() {
    return checkboxlist1;
  }

  /**
   * @param checkboxlist1 the checkboxlist1 to set
   */
  public void setCheckboxlist1(String[] checkboxlist1) {
    this.checkboxlist1 = checkboxlist1;
  }

  /**
   * @return the dico
   */
  public HashMap<String, String> getDico() {
    return dico;
  }

  /**
   * @param dico the dico to set
   */
  public void setDico(HashMap<String, String> dico) {
    this.dico = dico;
  }

  /**
   * @return the select4
   */
  public String[] getSelect4() {
    return select4;
  }

  /**
   * @param select4 the select4 to set
   */
  public void setSelect4(String[] select4) {
    this.select4 = select4;
  }

  /**
   * @return the couleurs
   */
  public Couleur[] getCouleurs() {
    return couleurs;
  }

  /**
   * @return the select5
   */
  public String[] getSelect5() {
    return select5;
  }

  /**
   * @param select5 the select5 to set
   */
  public void setSelect5(String[] select5) {
    this.select5 = select5;
  }

  /**
   * @return the checkboxlist2
   */
  public String[] getCheckboxlist2() {
    return checkboxlist2;
  }

  /**
   * @param checkboxlist2 the checkboxlist2 to set
   */
  public void setCheckboxlist2(String[] checkboxlist2) {
    this.checkboxlist2 = checkboxlist2;
  }

  /**
   * @return the checkboxlist3
   */
  public String[] getCheckboxlist3() {
    return checkboxlist3;
  }

  /**
   * @param checkboxlist3 the checkboxlist3 to set
   */
  public void setCheckboxlist3(String[] checkboxlist3) {
    this.checkboxlist3 = checkboxlist3;
  }

  /**
   * @return the radio1
   */
  public String getRadio1() {
    return radio1;
  }

  /**
   * @param radio1 the radio1 to set
   */
  public void setRadio1(String radio1) {
    this.radio1 = radio1;
  }

  /**
   * @return the radio2
   */
  public String getRadio2() {
    return radio2;
  }

  /**
   * @param radio2 the radio2 to set
   */
  public void setRadio2(String radio2) {
    this.radio2 = radio2;
  }

  /**
   * @return the radio3
   */
  public String getRadio3() {
    return radio3;
  }

  /**
   * @param radio3 the radio3 to set
   */
  public void setRadio3(String radio3) {
    this.radio3 = radio3;
  }
}
