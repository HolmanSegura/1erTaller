/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import javax.swing.JOptionPane;

/**
 *
 * @author Holman
 */
public class Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long edad, telefono, edad1, telefono1, edad2, telefono2, edad3, telefono3, edad4, telefono4;
        String nombre, direccion, nombre1, direccion1, nombre2, direccion2, nombre3, direccion3, nombre4, direccion4;
        nombre = JOptionPane.showInputDialog("Digite nombre del empleado 1");
        direccion = JOptionPane.showInputDialog("Digite direccion del empleado 1");
        edad = Long.parseLong(JOptionPane.showInputDialog("Digite edad del empleado 1"));
        telefono = Long.parseLong(JOptionPane.showInputDialog("Digite telefono del empleado 1"));
        nombre1 = JOptionPane.showInputDialog("Digite nombre del empleado 2");
        direccion1 = JOptionPane.showInputDialog("Digite Direccion del empleado 2");
        edad1 = Long.parseLong(JOptionPane.showInputDialog("Digite edad del empleado 2"));
        telefono1 = Long.parseLong(JOptionPane.showInputDialog("Digite telefono del empleado 2"));
        nombre2 = JOptionPane.showInputDialog("Digite nombre del empleado 3");
        direccion2 = JOptionPane.showInputDialog("Digite dirteccion del empleado 3");
        edad2 = Long.parseLong(JOptionPane.showInputDialog("Digite edad del empleado 3"));
        telefono2 = Long.parseLong(JOptionPane.showInputDialog("Digite telefono del empleado 3"));
        nombre3 = JOptionPane.showInputDialog("Digite nombre del empleado 4");
        direccion3 = JOptionPane.showInputDialog("Digite direccion del empleado 4");
        edad3 = Long.parseLong(JOptionPane.showInputDialog("Digite edad del empleado 4"));
        telefono3 = Long.parseLong(JOptionPane.showInputDialog("Digite telefono del empleado 4"));
        nombre4 = JOptionPane.showInputDialog("Digite nombre del empleado 5");
        direccion4 = JOptionPane.showInputDialog("Digite direccion del empleado 5");
        edad4 = Long.parseLong(JOptionPane.showInputDialog("Digite edad del empleado 5"));
        telefono4 = Long.parseLong(JOptionPane.showInputDialog("Digite telefono del empleado 5"));
        Personas p1 = new Personas(nombre, direccion, edad, telefono);
        Personas p2 = new Personas(nombre1, direccion1, edad1, telefono1);
        Personas p3 = new Personas(nombre2, direccion2, edad2, telefono2);
        Personas p4 = new Personas(nombre3, direccion3, edad3, telefono3); 
        Personas p5 = new Personas(nombre4, direccion4, edad4, telefono4); 
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Seleccione empleado"));
        switch(a){
            case 1:
                JOptionPane.showMessageDialog(null, "Su empleado seleccionado es: \nNombre: "+nombre+"\nDireccion: "+direccion+"\nEdad: "+edad+"\nTelefono: "+telefono);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, a);
        }
    }
}
