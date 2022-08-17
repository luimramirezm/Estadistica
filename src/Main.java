/***********************************************************************
************************************************************************
************************************************************************
*****                                                              *****
*****  Name: stadistic                                             *****
*****  Description: Aplicación para sacar la media                 *****
*****  y la desviación estandar de una lista en archivo txt        *****
*****  Date: 1/06/2022                                            *****
*****  @author Luisa María Ramírez Medina                          *****   
*****  @version 01                                                 *****
*****                                                              *****
************************************************************************
************************************************************************
***********************************************************************/

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//Creamos un objeto de la clase archivos
        Archivo a = new Archivo();
//instanciamos la clase LinkedList con el elemento mis elementos, tomamos el objeto a de la clase archivos y llamamos el metodo leet que al final lee y recorta y mete en nodos
        LinkedList<Elemento> misElementos = a.leerTxt("D:\\DOCUMENTOS USUARIO\\Desktop\\stadistic\\txt\\archivo.txt");
        for (Elemento tmp : misElementos) {
            System.out.println("Proxy: " + tmp.getValor1() + " el valor es: " + tmp.getValor2());
        }
//Creamos el objeto de la clase Estadistica
        Stadistica estadistica = new Stadistica();
        List<Double> resultMedia = estadistica.media(misElementos);
        System.out.println("La media de la columna 1 es: " + resultMedia.get(0));
        System.out.println("La media de la columna 2 es: " + resultMedia.get(1));
// llamamos el metodo desviacion estandar de la clase estadistica que y le pasamos los argumentos de la linkendlist miselementos, y la lista del resutlado de la media
        List<Double> resultDesviacionEstandar = estadistica.desviacionEstandar(misElementos, resultMedia);
        System.out.println("La desviacion estandar de la columna 1 es: " + resultDesviacionEstandar.get(0));
        System.out.println("La desviacion estandar de la columna 2 es: " + resultDesviacionEstandar.get(1));

    }
}
