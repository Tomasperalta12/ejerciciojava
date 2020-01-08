package concesionaria;

import java.util.Arrays;

public class main {
    public static int VehiculoBarato(vehiculo vehiculos[]){
        Double precio;
        int indice=0;
        
        precio = vehiculos[0].getPrecio();
        for(int i=1; i<vehiculos.length; i++){
            if(vehiculos[i].getPrecio()< precio){
                precio = vehiculos[i].getPrecio();
                indice=i;
            }
        }
        return indice;
    }
    public static int VehiculoCaro(vehiculo vehiculos[]){
        Double precio;
        int indice=0;
        
        precio = vehiculos[0].getPrecio();
        for(int i=1; i<vehiculos.length; i++){
            if(vehiculos[i].getPrecio()>precio){
                precio = vehiculos[i].getPrecio();
                indice=i;
            }
        }
        return indice;
    }
    public static int BuscarLetra(vehiculo vehiculos[]){
        int indice=0;
        for(int i=0; i<vehiculos.length; i++){
            if(vehiculos[i].getModelo().substring(0,1).equals("Y")){
                indice=i;
            }
        }
        return indice;
    }
    
    public static void main(String args[]){
        vehiculo vehiculos[]= new vehiculo[4];
        
  
        vehiculos[0]= new auto("Peugeot","206",200000.00,4);
        vehiculos[1]= new moto("Honda","Titan",60000.00,125);
        vehiculos[2]=new auto("Peugeot","208",250000.00,5); 
        vehiculos[3]= new moto("Yamaha","YBR",80500.50,160);
        
        int indice=VehiculoBarato(vehiculos);
        int indiceCaro=VehiculoCaro(vehiculos);
        int indiceletra=BuscarLetra(vehiculos);
       
        
        
        for(int i=0; i<vehiculos.length; i++){
            System.out.println(vehiculos[i].ListaVehiculos());
               
            
        }
        System.out.println();
         
        
        System.out.println(vehiculos[indiceCaro].MostarVehiculocaro());
        System.out.println(vehiculos[indice].MostarVehiculoBarato());
        System.out.println(vehiculos[indiceletra].BusquedaPorLetra());
        
        System.out.println();
        
        Arrays.sort(vehiculos);
          for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i].MayorAMenor());
        }
        
       
        
        
     
    }
    
}
