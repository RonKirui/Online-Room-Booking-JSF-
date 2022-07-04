/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package operationManagedBeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ronki
 */
@ManagedBean
@ViewScoped
public class operationsBean {
    String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Creates a new instance of operationsBean
     */
    public operationsBean() {
    }
    
    public List<String> Countries( String querry){
    
        ArrayList<String> countries = new ArrayList<>();
        if (querry.equalsIgnoreCase(".")){
        countries.add("afrKenya");
        countries.add("afrUganda");
        countries.add("afrTanzania");
        countries.add("afrEthiopia");
        countries.add("afrNigeria");
        
        }
        return countries;
}
    public List<String> afriCo(){
        return Countries(country);
    }
    
}
