
/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato
{
    // instance variables - replace the example below with your own
   double peso;
   double altura;
   String nombre;
   boolean hambre;
   boolean sucio;
   
   public Gato(){
      peso=12.12;
      altura=23.23;
      nombre="A";
      hambre=true;
      sucio=false;
  }
  
  public Gato(double peso, double altura, String nombre, boolean hambre,boolean sucio){
      this.peso=peso;
      this.altura=altura;
      this.nombre=nombre;
      this.hambre=hambre;
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
  
  public void alimentar(){
      if(hambre==true){
          hambre=false;
      }
  }
}
  

