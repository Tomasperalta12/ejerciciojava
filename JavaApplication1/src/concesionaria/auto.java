
package concesionaria;
public class auto extends vehiculo implements Metodosgenerales{
    private int Puertas;

    public auto(String marca,String modelo, Double precio,int Puertas) {
        super(marca,modelo, precio);
        this.Puertas = Puertas;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int Puertas) {
        this.Puertas = Puertas;
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
        return "Marca: "+this.getMarca()+" // Modelo: "+ this.getModelo()+" // Puertas: "+this.getPuertas()+" // Precio: "+this.getPrecio();
    }   

    @Override
    public String MayorAMenor() {
        return this.getMarca()+" "+ this.getModelo();
    }

    @Override
    public String BusquedaPorLetra() {
        return "Vehículo que contiene en el modelo la letra ‘Y’: "+this.getMarca()+" "+ this.getModelo()+" // Precio: "+this.getPrecio();
    }
    
}
