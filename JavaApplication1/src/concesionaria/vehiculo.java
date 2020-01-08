
package concesionaria;
public abstract class vehiculo implements Metodosgenerales,Comparable<vehiculo> {
    protected String marca;
    protected String modelo;
    protected Double precio;

    public vehiculo(String marca,String modelo, Double precio) {
        this.marca  = marca;
        this.modelo = modelo;
        this.precio = precio;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    @Override
        public int compareTo(vehiculo v) {
            if (precio > v.precio) {
                return -1;
            }
            if (precio < v.precio) {
                return 1;
            }
            return 0;
        }
    }
    
   
  
    
    
    
    
    
    

