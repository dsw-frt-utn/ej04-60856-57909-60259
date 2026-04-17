package app;
import data.Persistencia;
import views.AgregarVehiculos;
import javax.swing.*;
import java.awt.*;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
     Persistencia.inicializar();
        
       
        java.awt.EventQueue.invokeLater(() -> {
            AgregarVehiculos ventanaIngreso = new AgregarVehiculos();
            ventanaIngreso.setLocationRelativeTo(null); 
            ventanaIngreso.setVisible(true);
        });
    }
}
