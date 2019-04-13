import java.util.*;

class Main(){

    final float vetor_abcissas[] = {0,1,2,2.5,3,4};
    final float vetor_ordenadas[] = {1.4,0.6,1.0,0.6,0.6,1.0};
    final float abcissas_npontosi[] = {-0.8,-0.6,-0.4,-0.2,0,0.2,0.4,0.6,0.8} //conjunto de n pontos igualmente espaçados
    final float ordenadas_npontosi = new float[9];

    /***
    * Construir polinómio interpolador usando Método de newton
    */
    public static void interpol_poli(float vetor_abcissas, float vetor_ordenadas{

    }

    public static void calcular_ordenadas(){
        for(int i=0;i<9;i++){
        ordenadas_npontosi[1] = 4 * (abcissas_npontosi[i]*abcissas_npontosi[i]) + Math.sin(9*abcissas_npontosi[i]);
        }
    }




    public static void Main(String[] args){
        float result = interpol_poli(vetor_abcissas,vetor_ordenadas);
        calcular_ordenadas();
        System.out.println(result);
    }
}
