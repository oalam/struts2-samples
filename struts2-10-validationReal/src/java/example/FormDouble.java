package example;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

public class FormDouble extends ActionSupport implements ModelDriven, SessionAware {

  // constructeur sans paramètre
  public FormDouble() {
  }

  // modèle de l'action
  public Object getModel() {
    if (session.get("model") == null) {
      session.put("model", new FormDoubleModel());
    }
    return session.get("model");
  }

  @SkipValidation
  public String clearModel() {
    // raz du modèle
    ((FormDoubleModel) getModel()).clearModel();
    // résultat
    return INPUT;
  }

  public String cancel() {
    // on nettoie le modèle
    ((FormDoubleModel) getModel()).clearModel();
    // résultat
    return "cancel";
  }
  // SessionAware
  Map<String, Object> session;

  public void setSession(Map<String, Object> session) {
    this.session = session;
  }

  // validation
  @Override
  public void validate() {
    // saisie double6 valide ?
    if (getFieldErrors().get("double6") == null) {
      // on remplace la virgule par le point dans la chaîne double6
      String strDouble6 = (((FormDoubleModel) getModel()).getDouble6()).replace(',', '.');
      // String --> double
      double double6 = Double.parseDouble(strDouble6);
      // vérification
      if (double6 < 2.64 || double6 > 8.32) {
        addFieldError("double6", getText("double6.error"));
      }
    }
  }
}
