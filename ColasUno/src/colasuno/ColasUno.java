
package colasuno;

import java.util.Scanner;

/**
 *
 * @author OHMASTER
 */
public class ColasUno {

    char v1[] = new char[26];
    int tope = 26;
    
    public void llenarcola(){
        char letra = 'A';
        for(int i=0; i<tope;i++){
            v1[i]=letra;
            letra++;
        }
        System.out.println("agregados "+tope+" elementos a la cola");
    }
    
    public void mostrarcola(){
        for(int i=0; i<tope;i++){
            System.out.println("valor de la posicion ["+i+"] es: "+v1[i]);
        }
    }
    
    public void eliminarcola(){
        //eliminar el primer elemento   0-A
        //A B C....Z  ---- B C D....Z
        tope--;
        for(int i=0; i<tope; i++){
            v1[i]=v1[i+1];
        }
        System.out.println("elemento eliminado...");
    }
    
    public void agregarCola(){
        v1[tope]='@';
        tope++;
        System.out.println("dato agregado....");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ColasUno c = new ColasUno();
        Scanner sc = new Scanner(System.in);
        int opt=0;
        do{
            System.out.println("1 llenar \n2 mostrar \n3 eliminar \n4 add");
            switch(opt= sc.nextInt()){
                case 1:
                    c.llenarcola();
                break;
                case 2:
                    c.mostrarcola();
                break;
                case 3:
                    c.eliminarcola();
                break;
                case 4:
                    c.agregarCola();
                break;
            }
        }while(opt != 5);
    }
    
}
