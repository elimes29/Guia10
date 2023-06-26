/*
 Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */
package entidad;

import enumeraciones.FormaPago;

/**
 *
 * @author usuario
 */
public class Poliza {
    private Cliente propietario;
    private Vehiculo carro;
    private int numPoliza;
    private int cantCuotas;
    private FormaPago formaPago;
    private float montoAsegurado;
    private boolean incluyeGranizo;
    private float montoMaxGranizo;
    private String tipoCobertura;
    
}
