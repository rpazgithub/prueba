/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes;

/**
 *
 * @author Ruben
 */
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interes
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal tasa = BigDecimal.valueOf(0.05);
        
        System.out.printf("%s%20s\n", "Anio", "Monto en deposito para el usuario");
        
        for (int anio = 1; anio <= 10; ++anio)
        {
            BigDecimal monto = principal.multiply(tasa.add(BigDecimal.ONE).pow(anio));
            
            System.out.printf("%4d%20s\n", anio, NumberFormat.getCurrencyInstance().format(monto));
        }
    }
    
}
