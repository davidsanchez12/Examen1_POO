public class ProductoAlimenticio extends Productos {
    private double fecha_expiracion;

    public ProductoAlimenticio(String nombre, double precio, int stock, double fecha_expiracion) {
        super(nombre, precio, stock);
        this.fecha_expiracion = fecha_expiracion;
    }

    public double getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(double fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }


    

}
