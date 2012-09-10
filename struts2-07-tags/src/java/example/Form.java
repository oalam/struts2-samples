package example;

import com.opensymphony.xwork2.ActionSupport;

public class Form extends ActionSupport {

    // constructeur sans paramètre
    public Form() {
    }
    // champs du formulaire
    private String textfield = "texte";
    private String password = "secret";
    private String textarea = "ligne1\nligne2\n";
    private String select1 = "zéro";
    private String[] select1Values = new String[]{"zéro", "un", "deux"};
    private String select2 = "trois";
    private String[] select2Values = new String[]{"zéro", "un", "deux", "trois", "quatre"};
    private String[] select3 = new String[]{"zéro", "deux"};
    private String[] select3Values = new String[]{"zéro", "un", "deux", "trois", "quatre"};
    private String radio = "bleu";
    private String[] radioValues = new String[]{"bleu", "blanc", "rouge"};
    private Boolean checkbox = false;
    private String[] checkboxlist = new String[]{"vélo", "bus"};
    private String[] checkboxlistValues = new String[]{"voiture", "tram", "vélo", "bus", "métro"};
    private String hidden = "initial";
    private String submitText;

    // valeurs sélectionnées dans champ select3
    public String getSelect3SelectedValues() {
	return getValue(select3);
    }

    // valeurs sélectionnées dans champ checkboxlist
    public String getCheckboxlistSelectedValues() {
	return getValue(checkboxlist);
    }

    // méthode utilitaire
    public String getValue(String[] values) {
	String result = "";
	for (String value : values) {
	    result += " " + value;
	}
	return result;
    }

    /**
     * @return the textfield
     */
    public String getTextfield() {
	return textfield;
    }

    /**
     * @param textfield the textfield to set
     */
    public void setTextfield(String textfield) {
	this.textfield = textfield;
    }

    /**
     * @return the password
     */
    public String getPassword() {
	return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
	this.password = password;
    }

    /**
     * @return the textarea
     */
    public String getTextarea() {
	return textarea;
    }

    /**
     * @param textarea the textarea to set
     */
    public void setTextarea(String textarea) {
	this.textarea = textarea;
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
     * @return the select1Values
     */
    public String[] getSelect1Values() {
	return select1Values;
    }

    /**
     * @return the select2
     */
    public String getSelect2() {
	return select2;
    }

    /**
     * @param select2 the select2 to set
     */
    public void setSelect2(String select2) {
	this.select2 = select2;
    }

    /**
     * @return the select2Values
     */
    public String[] getSelect2Values() {
	return select2Values;
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
     * @return the select3Values
     */
    public String[] getSelect3Values() {
	return select3Values;
    }

    /**
     * @return the radio
     */
    public String getRadio() {
	return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(String radio) {
	this.radio = radio;
    }

    /**
     * @return the checkbox
     */
    public Boolean getCheckbox() {
	return checkbox;
    }

    /**
     * @param checkbox the checkbox to set
     */
    public void setCheckbox(Boolean checkbox) {
	this.checkbox = checkbox;
    }

    /**
     * @return the checkboxlist
     */
    public String[] getCheckboxlist() {
	return checkboxlist;
    }

    /**
     * @param checkboxlist the checkboxlist to set
     */
    public void setCheckboxlist(String[] checkboxlist) {
	this.checkboxlist = checkboxlist;
    }

    /**
     * @return the hidden
     */
    public String getHidden() {
	return hidden;
    }

    /**
     * @param hidden the hidden to set
     */
    public void setHidden(String hidden) {
	this.hidden = hidden;
    }

    /**
     * @param submitText the submitText to set
     */
    public void setSubmitText(String submitText) {
	this.submitText = submitText;
    }

    /**
     * @return the radioValues
     */
    public String[] getRadioValues() {
	return radioValues;
    }

    /**
     * @return the checkboxlistValues
     */
    public String[] getCheckboxlistValues() {
	return checkboxlistValues;
    }

    /**
     * @return the submitText
     */
    public String getSubmitText() {
	return submitText;
    }
}
