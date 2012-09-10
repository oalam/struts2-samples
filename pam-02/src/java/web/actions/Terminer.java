/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Serge Tahé
 */
public class Terminer extends ActionSupport implements SessionAware {

  // session
  private Map<String, Object> session;
  
  @Override
  public String execute() {
    // abandon de la session courante
    session.clear();
    return SUCCESS;
  }

  @Override
  public void setSession(Map<String, Object> session) {
    this.session = session;
  }
}
