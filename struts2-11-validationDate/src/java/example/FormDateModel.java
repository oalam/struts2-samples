package example;

import java.util.Date;

public class FormDateModel {

  // constructeur sans paramètre
  public FormDateModel() {
  }
  // champs
  private String date1;
  private Date date2 = new Date();
  private Date date3 = new Date();
  private Date date4;
  private Date date5;
  private String date6;

  // raz modèle
  public void clearModel() {
    date1 = null;
    date2 = null;
    date3 = null;
    date4 = null;
    date5 = null;
    date6 = null;
  }

  /**
   * @return the date1
   */
  public String getDate1() {
    return date1;
  }

  /**
   * @param date1 the date1 to set
   */
  public void setDate1(String date1) {
    this.date1 = date1;
  }

  /**
   * @return the date2
   */
  public Date getDate2() {
    return date2;
  }

  /**
   * @param date2 the date2 to set
   */
  public void setDate2(Date date2) {
    this.date2 = date2;
  }

  /**
   * @return the date3
   */
  public Date getDate3() {
    return date3;
  }

  /**
   * @param date3 the date3 to set
   */
  public void setDate3(Date date3) {
    this.date3 = date3;
  }

  /**
   * @return the date4
   */
  public Date getDate4() {
    return date4;
  }

  /**
   * @param date4 the date4 to set
   */
  public void setDate4(Date date4) {
    this.date4 = date4;
  }

  /**
   * @return the date5
   */
  public Date getDate5() {
    return date5;
  }

  /**
   * @param date5 the date5 to set
   */
  public void setDate5(Date date5) {
    this.date5 = date5;
  }

  /**
   * @return the date6
   */
  public String getDate6() {
    return date6;
  }

  /**
   * @param date6 the date6 to set
   */
  public void setDate6(String date6) {
    this.date6 = date6;
  }
}
