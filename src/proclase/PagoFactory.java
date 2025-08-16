/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proclase;

import java.util.HashMap;
import java.util.Map;

public class PagoFactory {
    private final static Map<TipoDePago,Pagos> pagos = new HashMap<>(){{
        put(TipoDePago.PAYPAL, new PagoPayPal());
        put(TipoDePago.EFECTIVO, new PagoEfectivo());
        put(TipoDePago.TARJETA_DEBITO, new PagoTarjetaDebito());
        put(TipoDePago.TARJETA_CREDITO, new PagoTarjetaCredito());
        put(TipoDePago.TRANSFERENCIAS, new PagoTransferencias());
        put(TipoDePago.BITCOIN, new PagoBitcoin());
        put(TipoDePago.CONSIGNACION, new PagoConsignacion());
        put(TipoDePago.APPLE_PAY, new PagoApplePay());
        put(TipoDePago.GOOGLE_PAY, new PagoGooglePay());
    }};
    
   public Pagos obtenerPago(TipoDePago tipoDePago){
       return pagos.get(tipoDePago);
   }
}
