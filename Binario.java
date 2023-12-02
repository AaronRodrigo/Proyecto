import java.nio.file.ProviderMismatchException;
import java.util.Scanner;
public class Binario{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Pon un numero binario de 8 bits: ");
        String binario = in.next();
        String not = "";
        boolean valido = true;
        int dec = 0;
        for(int i = 0;i<binario.length();i++){
            //Verifico que el número sea binario y que contenga 8 bits
            if(binario.charAt(i) != '1' && binario.charAt(i) != '0' || binario.length() != 8){
                valido = false;
                System.out.println("Entrada incorrecta");
                break;
            }
            //Creo la cadena del número binario invertido
            if(binario.charAt(i) == '1'){
                not = not + '0';
            }
            else{
                not = not+ '1';
            }
        }
        //Bucle para calcular el número en decimal
        for(int i = 0;i<not.length();i++){
            if(not.charAt(i) == '1')  dec = (int)(Math.pow(2,(not.length()-1)-i) + dec);
        }
        //Imprimo los resultados
        if(valido == true){ 
            System.out.println("not("+binario+") = "+not);
            System.out.println("El numero en decimal es: "+dec);
        }
        

    }
}