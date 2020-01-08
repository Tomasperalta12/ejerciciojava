
package concesionaria;
public class moto extends vehiculo implements Metodosgenerales{
    private int cilindrado;

    public moto(String marca, String modelo, Double precio,int cilindrado) {
        super(marca, modelo, precio);
        this.cilindrado=cilindrado;
    }

    public int getCilindrado() {
        return cilindrado;
    }

    public void setCilindrado(int cilindrado) {
        this.cilindrado = cilindrado;
    }
    

    @Override
    public String MostarVehiculoBarato(){
        
        return "Vehiculo Mas barato: "+this.getMarca()+" "+ this.getModelo();
        
    }

    @Override
    public String MostarVehiculocaro() {
        return "Vehiculo Mas caro: "+this.getMarca()+" "+ this.getModelo();
    }
    
    @Override
    public String ListaVehiculos() {
        return "Marca: "+this.getMarca()+" // Modelo: "+ this.getModelo()+" // Cilindrada: "+this.getCilindrado()+" // Precio: "+this.getPrecio();
    }   

    @Override
    public String MayorAMenor() {
        return this.getMarca()+" "+ this.getModelo();
    }
    
    @Override
    public String BusquedaPorLetra() {
        return "Vehículo que contiene en el modelo la letra ‘Y’: "+this.getMarca()+" "+ this.getModelo()+" "+this.getPrecio();
    }

    
    
}
