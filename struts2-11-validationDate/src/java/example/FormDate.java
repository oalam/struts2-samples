package example;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

public class FormDate extends ActionSupport implements ModelDriven, SessionAware {

  // constructeur sans paramètre
  public FormDate() {
  }

  // modèle de l'action
  public Object getModel() {
    if (session.get("model") == null) {
      session.put("model", new FormDateModel());
    }
    return session.get("model");
  }

  @SkipValidation
  public String clearModel() {
    // raz du modèle
    ((FormDateModel) getModel()).clearModel();
    // résultat
    return INPUT;
  }

  public String cancel() {
    // on nettoie le modèle
    ((FormDateModel) getModel()).clearModel();
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
    // formatage des dates
    SimpleDateFormat formateurDate = new SimpleDateFormat("dd/MM/yyyy");
    formateurDate.setLenient(false);
    // saisie date1 valide ?
    if (getFieldErrors().get("date1") == null) {
      // vérification validité date
      try {
        formateurDate.parse(((FormDateModel) getModel()).getDate1());
      } catch (Exception e) {
        addFieldError("date1", getText("date1.error"));
      }
    }
    // saisie date6 valide ?
    if (getFieldErrors().get("date6") == null) {
      Date d = null;
      try {
        // vérification validité date
        d = formateurDate.parse(((FormDateModel) getModel()).getDate6());
        // vérification bornes
        if (d.after(formateurDate.parse("20/06/2001")) || d.before(formateurDate.parse("18/05/2000"))) {
          addFieldError("date6", getText("date6.error"));
          return;
        }
      } catch (Exception e) {
        addFieldError("date6", getText("date6.error"));
        return;
      }
    }
  }
}
