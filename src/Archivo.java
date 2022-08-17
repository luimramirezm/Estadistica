import java.io.BufferedReader; //clase importada
import java.io.FileReader;
import java.util.LinkedList;

public class Archivo {

     /**
     * Este método recibe la direccion y nombre del archivo txt que contiene los datos
     * @param direccion
     * @return miselementos
     */
    public LinkedList leerTxt(String direccion){ 
        String texto = "";
//Creamos un elemento llamado miselementos de la LinkeList que es una clase de java encontrada en internet https://quejava.com/linkedlist-en-java-con-ejemplo/ 

        LinkedList<Elemento> misElementos = new LinkedList<Elemento>(); 
        try {
//BufferedReader bf = new BufferedReaderes para declarar nuestro objeto y con new FileReader(direccion) recibimos la direccion con la info del archivo q mandamos arriba
            BufferedReader bf = new BufferedReader(new FileReader(direccion)); 
// variable para leer el objeto bf, aqui está vacía
            String bfRead; 
//para leer las lineas de bf y todo esta en un metodo el metodo readline devuelve un string y todo esto se ejecuta en la variable bfRead
            while ((bfRead = bf.readLine()) != null){ 
//el ciclo será hasta que bfREad no tenga datos
                String[] fragmentos = bfRead.split(",");
//Ahora vamso a coger todo lo del arreglo y meterlo en un objeto
                Elemento elem = new Elemento();
                elem.setValor1(Integer.valueOf(fragmentos[0]));
                elem.setValor2(Double.valueOf(fragmentos[1]));
//Agregamos al elemento que creamos toda la info de elem, aqui esta clase internamente lo mete en los nodos
                misElementos.add(elem); 

            }
 
        }catch(Exception e){ 
            System.err.println("No se encontró el archivo");
        }
        return misElementos;
    }
}