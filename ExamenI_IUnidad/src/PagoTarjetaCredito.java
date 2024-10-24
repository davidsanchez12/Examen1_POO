import java.util.HashMap;
import java.util.Map;

public class PagoTarjetaCredito  implements MetodoPago{

     Map<Integer, String> tarjetadecredito = new HashMap<>();

    public PagoTarjetaCredito() {
        tarjetadecredito.put(1234, "0002-0002-0033-0055");
        tarjetadecredito.put(12345,"0031-2002-0152-02354");
        tarjetadecredito.put(9876,"0021-2222-0123-00223");

    }

        public void procesarpago(double monto, String tarjeta) {
            for (Map.Entry<Integer, String> entry : tarjetadecredito.entrySet()) {
                if (entry.getValue().equals(tarjeta)) {
                    int clave = entry.getKey();
                    if (monto <= clave) {
                        System.out.println("Pago realizado con éxito");
                    } else {
                        System.out.println("El monto no puede ser mayor que  su saldo  de la tarjeta");
                    }
                    return; 
                }
            }
            System.out.println("Tarjeta no encontrada");
        }


}

