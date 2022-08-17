
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Stadistica { 
     /**
     * Este método recibe una LinkedList y esta funcion debe retornar una lista con la media de los datos
     * @param misElementos
     * @return resultadoMedia
     */
// crear funcion media que recibe una 
    public List<Double> media(LinkedList<Elemento> misElementos){ 

        Double media= 0.0;
        Double media2= 0.0;
// recorremos el elemento tmp hasta que recorra lo que hay en la LinkedList llamada miselementos
        for (Elemento tmp: misElementos ){ 
            media = media + tmp.getValor1();
            media2 = media2 + tmp.getValor2();  
        } 
        media = media / misElementos.size();
        media2 = media2 / misElementos.size();
//Creamos una lista double para meter los resultados, porque la lista está vacia y necesitamos usar una arrayList q e suna interfaz para poder hacer uso de la lista vacia
        List<Double> resultadoMedia = new ArrayList<Double>();
        resultadoMedia.add(media); 
        resultadoMedia.add(media2); 

        return resultadoMedia;
     }


     /**
     * Este método recibe una LinkedList y la lista del resultado de la media para sacar la desviación estandar en otra lista
     * @param misElementos, resultadoMedia
     * @return desvacionesEstandarList
     */
     public List<Double> desviacionEstandar(LinkedList<Elemento> misElementos,List<Double> resultadoMedia){ 

        Double media = resultadoMedia.get(0); 
        Double media2 = resultadoMedia.get(1);
        Double desviacionEstandar1 = 0.0; 
        Double desviacionEstandar2 = 0.0;
        List<Double> desvacionesEstandarList = new ArrayList<Double>(); 

        for (Elemento temp: misElementos){
// Este metodo math nos permite poner el valor y elevado a lo q necesitemos ene l segundo valor
            desviacionEstandar1 = desviacionEstandar1 + Math.pow((temp.getValor1()- media),2); 
            desviacionEstandar2 = desviacionEstandar2 + Math.pow((temp.getValor2()- media2),2);
         }
        desviacionEstandar1 = desviacionEstandar1 / (misElementos.size() -1); 
        desviacionEstandar1 = Math.sqrt(desviacionEstandar1);
        desvacionesEstandarList.add(desviacionEstandar1);

        desviacionEstandar2 = desviacionEstandar2 / (misElementos.size() -1);
        desviacionEstandar2 = Math.sqrt(desviacionEstandar2);
        desvacionesEstandarList.add(desviacionEstandar2);

        return desvacionesEstandarList;
     }
}