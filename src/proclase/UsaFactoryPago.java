/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proclase;

/**
 *
 * @author Aprendiz
 */
public class UsaFactoryPago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PagoFactory pagoFactory = new PagoFactory();
        
        Pagos pagos = pagoFactory.obtenerPago(TipoDePago.PAYPAL);
        Pagos pagos0 = pagoFactory.obtenerPago(TipoDePago.EFECTIVO);  
        Pagos pagos1= pagoFactory.obtenerPago(TipoDePago.TARJETA_DEBITO);
        Pagos pagos2 = pagoFactory.obtenerPago(TipoDePago.TARJETA_CREDITO);
        Pagos pagos3 = pagoFactory.obtenerPago(TipoDePago.TRANSFERENCIAS);
        Pagos pagos4 = pagoFactory.obtenerPago(TipoDePago.BITCOIN);
        Pagos pagos5 = pagoFactory.obtenerPago(TipoDePago.CONSIGNACION);
        Pagos pagos6 = pagoFactory.obtenerPago(TipoDePago.APPLE_PAY);
        Pagos pagos7 = pagoFactory.obtenerPago(TipoDePago.GOOGLE_PAY);
        
        
        
        pagos.crearPago();
        pagos0.crearPago();
        pagos1.crearPago();
        pagos2.crearPago();
        pagos3.crearPago();
        pagos4.crearPago();
        pagos5.crearPago();
        pagos6.crearPago();
        pagos7.crearPago();
        
    }
    
}
