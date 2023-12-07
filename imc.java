//Se desea desarrollar un programa que calcule el índice de masa corporal de una persona. Para ello, se requiere definir el peso de la nersona (en kilogramos) y su estatura (en metros). El mace de masa corporal (IMC) se calcula utilizando la siguiente fórmula:
//IMC = peso / estatura ^2
//NOTA: Math.pow

//Luego, a partir del IMC obtenido se pueden calcular si una persona tiene un peso normal, inferior o superior al normal u obesidad;

//< 16 Delgadez severa
//[16-17) Delgadez moderada
//[17-18.5) Delgadez leve
//[18.5-25) Peso normal
//125-30) Sobrepeso
//[30-35) Obesidad leve
//[35-40) Obesidad moderada
//>=40 Obesidad mórbida


/// calculamos el (indice masa corporal) imc= p/(t*t)
/// p= peso
/// t= talla o estatura

import javax.swing.JOptionPane;

class CalculoIMC{
  public static void main(String[] args) {
  }
}

class Person{
  public float peso;
  public float talla;
}


Person asignar(float p,float t){
 
  peso=p;
  talla=t;

  return this;
}

public float imc(){
  return peso/(talla*talla);
}

//////////////////////
public class EstadoPersona{
if (imc <16) {
  System.out.println(x:"Delgadez Severa");
}else if(imc()<=16.00 || imc()<=16.99){
  cad="Delgadez moderada";
}else if(imc()<=17.00 ||imc()<=18.49){
  cad="Delgadez leve";
}else if(imc()<=18.50 || imc()<=24.99){
  cad="Peso Normal";
}else if(imc()<=25.00 || imc()<=29.99){
  cad="Sobrepeso";
}else if(imc()<=30.00 || imc()<=34.99){
  cad="Obeso: Tipo I";
}else if(imc()<=35.00 || imc()=40.00){
  cad="Obeso: Tipo III";
}else{
  cad="te pasaste el juego primo";
}
  return cad;


  JOptionPane.showMessageDialog()


  Person verDatos(){
  String res="Datos\n";
  res+="\npeso: "+peso;
  res+="\ntalla: "+talla;
  res+="\nIMC obtenido es: "+imc();
  res+="\nClasificacion obtenida es: "+clasificacion();
  JOptionPane.showMessageDialog(null, res,"Resultado",JOptionPane.PLAIN_MESSAGE,new ImageIcon("ferd.jpg"));
  return this;
}

public static void main(String[] args) {
  //instanciar clase 
  Person person= new Person();

  //asignamos los datos de los atributos, para eso usamos JOptionPane.showInputDialog()
  person.peso=Double.parseDouble(JOptionPane.showInputDialog("peso: "));
  person.talla=Double.parseDouble(JOptionPane.showInputDialog("talla: "));

  // y al final concatenamos los métodos
  person.asignar(person.peso,person.talla).verDatos();
}
