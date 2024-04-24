
 
/**
 * Paso 1: Crear la clase Perro y la clase Gato
 * 1.1 preguntar por atributos y que el constructor pida en pantalla los valores
 * Paso 2: Crear la clase Mascota, donde introduzcan un Perro y un Gato.
 * Paso 3: Crear el método da_nombre con condicional (perro o gato).
 * Paso 4: De acuerdo a los métodos creados en Perro y Gato, pensar en un método en conjunto.
 */
import java.util.*;
public class Mascota
{
  Perro perros[];
  Gato gatos[];
  Perro p;
  Gato g;
  
  public Mascota(){
      Scanner entrada = new Scanner(System.in);
      System.out.println("¿Cuántos perros tienes");
      int dimensionP= entrada.nextInt();
      System.out.println("¿Cuántos gatos tienes");
      int dimensionG= entrada.nextInt();
      boolean terminar=false;
      perros=new Perro[dimensionP];
      gatos= new Gato[dimensionG];
      int i=0;
      int j=0;
      while(terminar==false){
          System.out.println("Si quieres agregar un perro digita 1, si quieres agregar un gato escribe 2, si quieres terminar escribe 3");
          int numero=entrada.nextInt();
          if(numero==1){
              if(i<=dimensionP-1){
                  perros[i] = new Perro();
                  System.out.println("Haz agregado " + (i+1) + " perros de los " + dimensionP + " perros que tienes" );
                  i++;
              }
              else{
                  System.out.println("Ya haz agregado todos los perros");
              }
              
          }
          else if(numero==2){
              if(j<=dimensionG-1){
                  gatos[j]=new Gato();
                  System.out.println("Haz agregado " + (j+1) + " gatos de los " + dimensionG + " gatos que tienes" );
                  j++;
              }
              else{
                  System.out.println("Ya haz agregado todos los gatos");
              }
              
          }
          else{
              terminar=true;
          }
      }
  }
  
 
}
