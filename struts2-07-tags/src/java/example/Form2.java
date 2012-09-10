package example;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Form2 extends ActionSupport implements ModelDriven {

    // constructeur sans paramètre
    public Form2() {
    }
    // modèle de l'action

    public Object getModel() {
	return new Data();
    }
}
