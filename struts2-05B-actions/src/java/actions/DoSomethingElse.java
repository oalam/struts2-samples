/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Serge Tahé
 */
public class DoSomethingElse extends ActionSupport {

  public DoSomethingElse() {
    System.out.println("DoSomethingElse");
  }
  
  @Override
  public String execute() {
    System.out.println("DoSomethingElse.execute");
    return SUCCESS;
  }
  
  public String action2() {
    System.out.println("DoSomethingElse.action2");
    return SUCCESS;
  }
}
