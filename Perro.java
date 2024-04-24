
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Perro
{
    // instance variables - replace the example below with your own
  double peso;
  double altura;
  String nombre;
  boolean sucio;
  
  public Perro(){
      Scanner palabra= new Scanner(System.in);
      
      System.out.println("Ingresa el nombre del perro");
      nombre=palabra.nextLine();
      
      System.out.println("Ingresa el peso del perro: ");
      peso=palabra.nextDouble();
      
      System.out.println("Ingresa la altura del perro");
      altura=palabra.nextDouble();
      
      System.out.println("¿Está limpio el perro?");
      sucio=palabra.nextBoolean();
  }
  
  public Perro(double peso, double altura, String nombre, boolean sucio){
      this.peso=peso;
      this.altura=altura;
      this.nombre=nombre;
      this.sucio=sucio;
  }
  
  public String daNombre(){
      return nombre;
  }
  
  public void banar(){
      sucio=false;
  }
  
  public boolean estaSucio(){
      return sucio;
  }
}
