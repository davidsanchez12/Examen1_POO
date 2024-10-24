import java.util.HashMap;
import java.util.Map;

public class PagoPayPal implements MetodoPago {

    Map<Integer, String> cuentaspaypal = new HashMap<>();

    public PagoPayPal() {
        cuentaspaypal.put(1234, "Josue1234");
        cuentaspaypal.put(12345,"denis54321");
        cuentaspaypal.put(9876,"Johana9876");
    }

    public void procesarpago(double monto, String cuenta ) {
        if (cuentaspaypal.containsValue(cuenta)) {
            System.out.println("Pago realizado con exito");
            
        } else{
            System.out.println("Cuenta no encontrada");
        }
            
        }

    }
