package com.itsqmet.ejercicio10;

import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main(String[] args) {
        /*
            Crear un programa que permita calcular el área del cuadrado, (A = lado*lado )
            el área del triángulo (A= (base*altura) /2 ) y el área del circulo ( A = PI* radio*radio)
            El usuario va a elegir que figura va a calcular
        */
        
        double lado, base, altura, radio, area=0, PI=3.1416;
        String figura;
        
        
        //Ingresar Información
        
        figura = JOptionPane.showInputDialog("Ingrese la figura a  calcular el área \n Triangulo \n Cuadrado \n Circulo");
        
        if( figura.equals("triangulo")){
            base = Double.parseDouble( JOptionPane.showInputDialog("Ingresar la base") );
            altura = Double.parseDouble( JOptionPane.showInputDialog("Ingresar la altura") );
            area= (base * altura)/2;
            
        }else if ( figura.equals("cuadrado") ){
            lado = Double.parseDouble( JOptionPane.showInputDialog("Ingresar el lado del cuadrado") );
            area = lado * lado;
            
        }else if( figura.equals("circulo")){
            radio = Double.parseDouble( JOptionPane.showInputDialog("Ingresar el radio del círculo"));
            area = PI *radio * radio;
            
        }else{
            JOptionPane.showMessageDialog(null, "Solo se permite las figura las menú");
        }
        
        if( area !=0){
            JOptionPane.showMessageDialog(null, "El área del " + figura + " es: " + area);
        }
          
        
        
        
    }
}
