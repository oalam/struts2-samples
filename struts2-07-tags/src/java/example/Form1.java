package example;

import com.opensymphony.xwork2.ActionSupport;

public class Form1 extends ActionSupport {

    // constructeur sans paramètre
    public Form1() {
    }
    // champs du formulaire
    private Data data = new Data();

    /**
     * @return the data
     */
    public Data getData() {
	return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Data data) {
	this.data = data;
    }
}
