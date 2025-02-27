package eci.edu.cvds.Parcial.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AgentWarning implements Agent{
   
    public void update(Product producto) {
        if (producto.getUnits()<5){
            String mensaje = "ALERTA!!! El stock del Producto: "+producto.getName()+" es muy bajo, solo quedan "+ (producto.getUnits()) +" unidades.";
    
            System.out.println(mensaje);
        }
    }

   
}
