package app;

import data.Persistencia;
import views.MenuPrincipal; 
import java.util.InvalidPropertiesFormatException;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        
        java.awt.EventQueue.invokeLater(() -> {
            
            MenuPrincipal menu = new MenuPrincipal();
            menu.setLocationRelativeTo(null); 
            menu.setVisible(true);
        });
    }
}