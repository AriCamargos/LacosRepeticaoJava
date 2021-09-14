package loops;
/**
* @author AriCamargos
*@version 8.0 (Sept 13, 2021)
*Aninhamento é a Combinação entre estruturas de repetição aqui enre WHILE e FOR
*Looping que informa as horas de 1 a 12 e os minutos para cada respectiva hora.
*/
public class Aninhados_Hora {
    public static void main (String[] args){
        for (int hora=1; hora<=12; hora++){
            System.out.println(hora + " hr");   
            for(int minuto=1; minuto <=60; minuto++){
                System.out.print(minuto + " min, ");
            }
            System.out.println(" \n");
        }
    }
}
