package eci.edu.cvds.Parcial.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AgentLog implements Agent{
   

    public void update(Product producto){
        String mensaje = producto.getName()+": xbox one s -> " + producto.getUnits()+" unidades disponibles";
      
        System.out.println(mensaje);
    }

   
}
