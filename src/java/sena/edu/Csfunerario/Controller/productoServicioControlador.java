/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.edu.Csfunerario.Controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import sena.edu.Csfunerario.Entity.ProductoServicio;
import sena.edu.Csfunerario.Entity.TipoServicio;
import sena.edu.Csfunerario.Facade.ProductoServicioFacade;
import sena.edu.Csfunerario.Facade.TipoServicioFacade;
import sena.edu.Csfunerario.Controller.TransaccionesController;
import sena.edu.Csfunerario.Entity.Usuario;

/**
 *
 * @author user
 */
@ManagedBean
@SessionScoped
public class productoServicioControlador implements Serializable{

    /**
     * Creates a new instance of productoServicioControlador
     */
    public productoServicioControlador() {
     productoServicio = new ProductoServicio();
        tipoServicio = new TipoServicio();    
    }
    
    @EJB
    ProductoServicioFacade productoServicioFacade;
    
    @EJB
    TipoServicioFacade tipoServicioFacade;
    
    private TipoServicio tipoServicio;
    private ProductoServicio productoServicio;
    private List<ProductoServicio> listfilP;


   

    public List<ProductoServicio> listProd(){
        return productoServicioFacade.findAll();
    }
    public List<TipoServicio> listTProd(){
        tipoServicio= new TipoServicio();
        return tipoServicioFacade.findAll();
    }

    
    
    public String crearProducto(){
        productoServicio.setIdProductoServicio(1);
        productoServicio.setIdTipoServicio(tipoServicio);
        productoServicioFacade.create(productoServicio);
        productoServicio =new ProductoServicio();
        return "adminProducts?faces-redirect=true";
    }
    public String editarProducto(ProductoServicio productoServ){
        productoServicio = productoServ;
        System.out.println(productoServicio);
        return "editarProducts?faces-redirect=true";
        
    }
    public String editProducto(){
        
         productoServicio.setIdTipoServicio(tipoServicio);
        productoServicioFacade.edit(productoServicio);
        return "adminProducts?faces-redirect=true";
    }
    
    public void eliminarProducto(){
        productoServicioFacade.remove(productoServicio);
        
        
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public ProductoServicio getProductoServicio() {
        return productoServicio;
    }

    public void setProductoServicio(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    public List<ProductoServicio> getListfilP() {
        return listfilP;
    }

    public void setListfilP(List<ProductoServicio> listfilP) {
        this.listfilP = listfilP;
    }
    
    
}
