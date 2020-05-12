
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author OHMASTER
 */
public class PilaUnion {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opt=0, cont=0, aux; 
        Scanner sc = new Scanner(System.in);
        //pedir datos de tamaño de pila A, B
        System.out.println("ingresa el tamaño de pila A");
        int a = sc.nextInt();
        System.out.println("ingresa el tamaño de pila B");
        int b = sc.nextInt();
        //crear pilas
        int [] pilaA = new int [a];
        int [] pilaB = new int [b];
        int [] pilaC = new int [a+b];
        //menu
        do{
            System.out.println("1 llenar pilas A,B");
            System.out.println("2 mostrar pilas A,B,C");
            System.out.println("3 unir pilas en C");
            System.out.println("4 ordenar C");
            System.out.println("5 salir");
            switch(opt = sc.nextInt()){
                case 1:
                    //llenar con random pila A
                    for(int i=0; i<a; i++){
                        pilaA[i] = (int)(Math.random() * 100 +1);
                    }
                    //llenar con random pila B
                    for(int i=0; i<b; i++){
                        pilaB[i] = (int)(Math.random() * 100 +1);
                    }
                    System.out.println("valores generados correctamente...");
                break;
                case 2:
                    //mostrar pila A
                    for(int i=0; i<a; i++){
                        System.out.println("el valor de la pila A, posicion ["+i+"] es: "+pilaA[i]);
                    }
                    //mostrar pila B
                    for(int i=0; i<b; i++){
                        System.out.println("el valor de la pila B, posicion ["+i+"] es: "+pilaB[i]);
                    }
                    //mostrar union A,B en C
                    if(cont == 1){
                        for(int i=0; i<pilaC.length; i++){
                        System.out.println("el valor de la pila C, posicion ["+i+"] es: "+pilaC[i]);
                        }
                    }
                    //mostrar orden C
                    if(cont == 2){
                        for(int i=0; i<pilaC.length; i++){
                        System.out.println("el valor de la pila C, posicion ["+i+"] es: "+pilaC[i]);
                        }
                    }
                break;
                case 3:
                    //llenar pila C con los valores de pila A
                    for(int i= 0; i<a;i++){
                        pilaC[i]=pilaA[i];
                    }
                    //llenar pila C con los valores de pila B
                    int x=0;
                    for(int i=a; i< pilaC.length; i++){
                        pilaC[i] = pilaB[x];
                        x++;
                    }
                    cont=1;
                    System.out.println("valores de pila A y B en C");
                break;
                case 4:
                    //ordenar pila C
                    //62 34 63 44 71 53  cont = 6 --- 0
                    //44 88 77 55 99 11
                    //34 62 63 44 71 53 
                    //34 62 44 63 71 53 
                    //34 62 44 63 53 73
                    //34 44 62 63 53 73
                    //0   1  2  3  4  5
                    for(int i=0; i<pilaC.length -1; i++){
                    //      i=2;        i<6-1     ; i++ 
                                       //0<5 cumple
                        for(int j=0; j<pilaC.length-1; j++){
                        //      j=2;        j<6-1     ; j++ 
                                   //2<5 cumple
                            if(pilaC[j] > pilaC[j+1]){
                                //63   >  44   cumple
                                aux=pilaC[j];
                              // aux = 63
                                pilaC[j]=pilaC[(j+1)];
                              //pilaC[j]=44 
                              //34 62 44 44 71 53 
                                pilaC[j+1]=aux;
                              // pilaC[j+1]=63
                            }
                        }
                    }
                    System.out.println("valores ordenados..");
                    cont=2;
                break;
            }
        }while(opt != 5);
    }
    
}
