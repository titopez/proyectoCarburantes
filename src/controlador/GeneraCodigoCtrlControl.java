/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author HOUSE
 */
public class GeneraCodigoCtrlControl {

    public GeneraCodigoCtrlControl() {
    }
    
    public String generar( int num_Autorizacion, int num_Factura, int nit_ci, String fecha_transaccion, int monto)
    {
      String cod="6A-DC-53-05-14";
      String strHexNumber;
      int i =0;
//        for(byte j = 1 ; j <= 5; j++)    {}
            
             i= num_Autorizacion + num_Factura  + monto;
             String k = Integer.toHexString(i); 
             //String limiteHex = "AAAAAAAA"; 
             int limite = Integer.parseInt("FF", 16);
             long lim = Long.parseLong("FFFFFFFFFF",16);
        System.out.println(limite);
                System.out.println(lim);
         strHexNumber = Integer.toHexString(i);
         System.out.print(strHexNumber);
//         for(byte j = 1 ; j <= 10; j++)    {
//         
//         

         
         System.out.println(strHexNumber);
      
        return  cod;
     } 
    
    public static void main(String args[]){
    
    String numHexadecimal;
    GeneraCodigoCtrlControl gen= new GeneraCodigoCtrlControl();
    numHexadecimal = gen.generar(5,9,19,"la",59);
   
    
    }
}

