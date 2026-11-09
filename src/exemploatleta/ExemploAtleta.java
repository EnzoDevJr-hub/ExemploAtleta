package exemploatleta;

import java.util.Scanner;

public class ExemploAtleta {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        double salto1, salto2, salto3, maior;
        
         System.out.println("informe a altura do salto 1");
        salto1 = entrada.nextDouble();
        maior = salto1;
        System.out.println("Informe a altura do segundo salto");
        salto2 = entrada.nextDouble();
        System.out.println("Informe a altura do terceiro salto");
        salto3 = entrada.nextDouble();
        if (salto2 > maior) {
            maior = salto2;
            if (salto3 > maior) {
                maior = salto3;
            }
        } else {
            if (salto3 > maior) {
                maior = salto3;
            }
        }
        System.out.println("A maior marca é de: " + maior + " ms");
        
    }
    
}
