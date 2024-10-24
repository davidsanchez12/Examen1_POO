public class ConfiguracionTienda {

    private String nombreTienda;
    private String direccion;
    private String moneda;

    // Variable estática para almacenar la instancia única
    private static ConfiguracionTienda instancia;

    // Constructor privado para evitar la creación de instancias externas
    private ConfiguracionTienda() {
        // Inicialización de atributos por defecto (opcional)
        this.nombreTienda = "Tienda Ejemplo";
        this.direccion = "Calle Ejemplo 123";
        this.moneda = "USD";
    }

    // Método público estático para obtener la instancia única
    public static ConfiguracionTienda getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionTienda();
        }
        return instancia;
    }

    // Métodos getters y setters
    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}

/* ConfiguracionTienda config = ConfiguracionTienda.getInstancia();
        
        // Configurando la tienda
        config.setNombreTienda("Mi Tienda");
        config.setDireccion("Avenida Principal 456");
        config.setMoneda("EUR");

        // Mostrando la configuración
        System.out.println("Nombre de la tienda: " + config.getNombreTienda());
        System.out.println("Dirección: " + config.getDireccion());
        System.out.println("Moneda: " + config.getMoneda());
    } */
