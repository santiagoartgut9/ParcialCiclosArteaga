package eci.edu.cvds.Parcial.model;

import java.util.List;

public interface Agent {
    void update (Product producto);

    List<String> getLog();

}
