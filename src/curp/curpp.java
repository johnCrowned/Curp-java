
package curp;

import javax.swing.JOptionPane;


public class curpp {
    
    
    public curpp(){
        
    }
    String nombre="", apellidoP="", apellidoM="";
    String estado="";
    String sexo="";
    Integer dia=0, año=0,mes=0;
    
    public void getFecha (String a, String b, String c){
        dia=Integer.parseInt(a);
        mes=Integer.parseInt(b);
        año=Integer.parseInt(c);
        
        
        
    }
    public void getSexo(String radio){
        sexo=radio;
    }
     public void getEstado(String boxEstado){
        estado = boxEstado;
    }
     
    public void mostrarDatos(){
       JOptionPane.showMessageDialog(null,"La fecha es:"+dia+"/"+mes+"/"+año);
       JOptionPane.showMessageDialog(null,"El boton de radio seleccionado es:"+ sexo);
       JOptionPane.showMessageDialog(null, "El item del combo box es: "+estado);
       JOptionPane.showMessageDialog(null, "El nombre es: "+nombre+""+apellidoP+""+apellidoM);
    }
    public void getNombreCompleto(String a, String b, String c){
        nombre=a;
        apellidoP=b;
        apellidoM=c;
        
    }
    
   
    
}
