/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.edu.Csfunerario.Controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author user
 */
@Named(value = "idiomasControlador")
@SessionScoped
public class IdiomasControlador implements Serializable {

    private static final long serialVersionUID=1L;
    private String localidad;
    private static Map<String, Object> listIdi;
    
    public IdiomasControlador() {
    }
    
    public String getLocalidad() {
        return localidad;
    }
    
    public Map<String, Object> getListIdi() {
        return listIdi;
    }

    public static void setListIdi(Map<String, Object> ListIdi) {
        listIdi = ListIdi;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    static{
        listIdi = new LinkedHashMap<String, Object>();
        Locale espanol = new  Locale("ES");
        listIdi.put("Español", espanol);
        listIdi.put("English", Locale.ENGLISH);
        
    }
    public void cambiarIdioma(ValueChangeEvent e){
        String newLocaleValue = e.getNewValue().toString();
        for (Map.Entry<String, Object> entry : listIdi.entrySet()) {
            if (entry.getValue().toString().equals(newLocaleValue)) {
                FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale)entry.getValue());
                        
            }
        }
 
            
        }  
    }


