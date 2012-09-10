package example;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

public class FormInt extends ActionSupport implements ModelDriven, SessionAware {

  // constructeur sans paramètre
  public FormInt() {
  }

  // modèle de l'action
  public Object getModel() {
    if (session.get("model") == null) {
      session.put("model", new FormIntModel());
    }
    return session.get("model");
  }

  public String cancel() {
    // on nettoie le modèle
    ((FormIntModel) getModel()).clearModel();
    // résultat
    return "cancel";
  }

  @SkipValidation
  public String clearModel() {
    // raz du modèle
    ((FormIntModel) getModel()).clearModel();
    // résultat
     return INPUT;
  }
  
  // SessionAware
  private Map<String, Object> session;

  public void setSession(Map<String, Object> session) {
    this.session = session;
  }

  // validation
  @Override
  public void validate() {
    // saisie int6 valide ?
    if (getFieldErrors().get("int6") == null) {
      int int6 = Integer.parseInt(((FormIntModel) getModel()).getInt6());
      if (int6 < 2 || int6 > 20) {
        addFieldError("int6", getText("int6.error"));
      }
    }
  }
}
