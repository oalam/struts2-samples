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
public class DoSomething extends ActionSupport {

  public DoSomething() {
    System.out.println("DoSomething");
  }

  @Override
  public String execute() {
    System.out.println("DoSomething.execute");
    return SUCCESS;
  }

  public String action1() {
    System.out.println("DoSomething.action1");
    return SUCCESS;
  }

  public String action3() {
    System.out.println("DoSomething.action3");
    return SUCCESS;
  }
}
