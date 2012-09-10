package example;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

public class FormDivers extends ActionSupport implements ModelDriven, SessionAware {

  // constructeur sans paramètre
  public FormDivers() {
  }

  // modèle de l'action
  public Object getModel() {
    if (session.get("model") == null) {
      session.put("model", new FormDiversModel());
    }
    return session.get("model");
  }

  @SkipValidation
  public String clearModel() {
    // raz du modèle
    ((FormDiversModel) getModel()).clearModel();
    // résultat
    return INPUT;
  }

  public String cancel() {
    // on nettoie le modèle
    ((FormDiversModel) getModel()).clearModel();
    // résultat
    return "cancel";
  }

  // SessionAware
  Map<String, Object> session;

  public void setSession(Map<String, Object> session) {
    this.session = session;
  }
}







