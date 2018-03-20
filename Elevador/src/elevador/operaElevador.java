package elevador;
import javax.swing.JOptionPane;
/**
 *
 * @author HARBEY
 */
public class operaElevador {
    
int piso,peso,piso2;
public void Entrar(){
do{
peso=Integer.parseInt(JOptionPane.showInputDialog("Ingres el Peso"));
if(peso<=200){
JOptionPane.showMessageDialog(null,"Â¡Ting!"+"\n"+" Bienvenido");

}
else if(peso>=200){
JOptionPane.showMessageDialog(null,"Revaso el peso limite soportado"+"\n"+"Intente de nuevo");
}
}
while(peso>200);
}
public void subir(){
do{
piso=Integer.parseInt(JOptionPane.showInputDialog("Â¿A que piso deseas llegar"));
if(piso<=8) {
for(int x=1;x<=piso;x++)
JOptionPane.showMessageDialog(null,"Estas en el piso "+x);
}
else{
JOptionPane.showMessageDialog(null,"No existe ese piso "+"\n"+"Intente de nuevo");
}
}
while(piso>8);
}
public void bajar(){
piso2=Integer.parseInt(JOptionPane.showInputDialog("Â¿A que piso deseas llegar"));
if(piso>piso2){
for(int x=1;x<=piso;x++)
JOptionPane.showMessageDialog(null,"Estas en el piso "+x);
}
else{
JOptionPane.showMessageDialog(null,"No existe ese piso "+"\n"+"Intente de nuevo");
}
}
}
