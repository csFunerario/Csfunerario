/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.edu.Csfunerario.Controller;

import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.HorizontalBarChartModel;
import sena.edu.Csfunerario.Entity.ClasePlan;
import sena.edu.Csfunerario.Facade.ClasePlanFacade;

/**
 *
 * @author user
 */
@Named(value = "clasePlanController")
@Dependent
public class ClasePlanController {

    /**
     * Creates a new instance of ClasePlanController
     */
    public ClasePlanController() {
    }
    @EJB
    ClasePlanFacade clasePlanFacade;
     private ClasePlan clasePlan;
     private HorizontalBarChartModel horizontalChart;
     
    

    public HorizontalBarChartModel getHorizontalChart() {
        return horizontalChart;
    }

    public void setHorizontalChart(HorizontalBarChartModel horizontalChart) {
        this.horizontalChart = horizontalChart;
    }
    private void crearhorizontalChart(){
        horizontalChart = new HorizontalBarChartModel();
        List<ClasePlan> listClase = clasePlanFacade.findAll();
        for (ClasePlan cla :listClase ) {
             ChartSeries ClasePlanes = new ChartSeries();
             ClasePlanes.setLabel(cla.getNombre());
             ClasePlanes.set(1, cla.getPrecio());
        }


    }

    public ClasePlan getClasePlan() {
        return clasePlan;
    }

    public void setClasePlan(ClasePlan clasePlan) {
        this.clasePlan = clasePlan;
    }
   
    
     
     
    
    
}
