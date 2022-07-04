/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package authManagedBeans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author ronki
 */
@ManagedBean(name = "login")
@ViewScoped
public class LogInConfigBean {

    /**
     * Creates a new instance of LogInConfigBean
     */
    public LogInConfigBean() {
    }
    
    public void logIn(){
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Logged in successfully!!") );
        
        //return "landlordHome.xhtml?faces=redirect=true";
    }
}
