/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.actions;

import com.opensymphony.xwork2.ActionSupport;
import web.entities.Menu;

/**
 *
 * @author Serge Tahé
 */
public class Voir extends ActionSupport{
  // menu
  private Menu menu=new Menu(false,false,false,false,true,true);
  // getters et setters

  public Menu getMenu() {
    return menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }
  
}
