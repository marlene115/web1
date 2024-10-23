
import java.util.Scanner;
public class Calificacion
{
  
    int fil,col=4;
    double n_final=0;
    Object[][] lista;
    Scanner in= new Scanner(System.in);
    //reutilizable
    private void crearMatriz(int f, int c)
    {
        lista= new Object[f][c];
    }
    //parte de la IU
    private void llenarMatriz()
    {
        System.out.println("Proceso de egistro:\n---------------------------------\n");
        for(int f=0; f<fil;f++){
            System.out.println("Registro numero "+ (f+1)+"\n");
            System.out.println("Ingrese el nombre: ");
            lista[f][0]=in.next();
             System.out.println("Ingrese el nota1: ");
            lista[f][1]=in.next();
             System.out.println("Ingrese el nota2: ");
            lista[f][2]=in.next();
             System.out.println("Ingrese el nota3: ");
            lista[f][3]=in.next();
        }
        
    }
    private void moostrarMatriz()
    {
        System.out.println("Planilla de notas:\n-----------------------------------\n");
        System.out.println("NOMBRE\tNOTA1\tNOTA2\tNOTA3\tFINAL");
        for(int f=0;f<fil;f++){
            System.out.println(lista[f][0]+"\t"+lista[f][1] +"\t"+ lista[f][2] +"\t"+ lista[f][3] +"\t"+n_final);
        }
    }
    public void main()
    {
        System.out.println("Ingrese cantidad de registros: ");
        fil=in.nextInt();
        crearMatriz(fil,col);
        llenarMatriz();
    }
} 

