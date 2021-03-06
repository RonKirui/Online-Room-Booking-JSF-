/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package navigationBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author ronki
 */
@ManagedBean
@ViewScoped
public class buttonNavBean {
    boolean renderBl,renderReg,renderLogIn = true, renderMenu=false;


    /**
     * Creates a new instance of buttonNavBean
     */
    public buttonNavBean() {
    }

    public buttonNavBean(boolean renderB, boolean renderReg, boolean renderLogIn) {
        this.renderBl = renderB;
        this.renderReg = renderReg;
        this.renderLogIn = renderLogIn;
    }
    public boolean isRenderMenu() {
        return renderMenu;
    }

    public void setRenderMenu(boolean renderMenu) {
        this.renderMenu = renderMenu;
    }
    

    public boolean isRenderLogIn() {
        return renderLogIn;
    }

    public void setRenderLogIn(boolean renderLogIn) {
        this.renderLogIn = renderLogIn;
        this.renderReg = false;
    }
    public boolean isRenderReg() {
        return renderReg;
    }

    public void setRenderReg(boolean renderReg) {
        this.renderReg = renderReg;
        this.renderLogIn = false;
    }
    public boolean isRenderBl() {
        return renderBl;
    }

    public void setRenderBl(boolean renderB) {
        this.renderBl = renderB;
    }
   
    public void show(){
        setRenderBl(true);
    }
    public void menuOption(){
        if(renderMenu!=false){
            setRenderMenu(false);
        }
        else{
            setRenderMenu(true);
        }
    }
}
