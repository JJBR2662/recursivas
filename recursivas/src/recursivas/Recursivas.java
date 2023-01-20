
package recursivas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Recursivas {

//    public static void main(String[] args) {
//        int MATRIZ[][] = {{2,5,4},{1,6,9},{7,10,18}};
//        for (int i = 0; i < MATRIZ.length; i++) {
//            for (int j = 0; j < MATRIZ[0].length; j++) {
//                System.out.print(MATRIZ[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int[] arreglo = new int[MATRIZ[0].length];
//        int array[] = arreglo(MATRIZ, 0, 0, 0, 0, arreglo);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//        }
//    }
    
    
    
    
    // fechassssssssssssssssssssssssssssssssssssssss
    
    
    public static void main(String[] args) {
        Date fechainicial = new Date(2023-1900, 0, 2, 0, 0, 0);
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        
        Date fechafinal = new Date(2023-1900, 11, 24, 0, 0, 0);
        System.out.println(sd.format(fechainicial));
        escribir(fechainicial, fechafinal);
    }
    
    public static void escribir(Date fechainicial, Date fechafinal){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        boolean comparofecha = compararfechas(fechainicial, fechafinal);
        if (comparofecha) {  
            System.out.println("Se ha llegado al dia indicado");
        }else{
            fechainicial.setDate(fechainicial.getDate()+1);
            boolean chekear = seraelmes(fechainicial);
            if (chekear==true) {
                if (fechainicial.getDate()==1) {
                System.out.println("NUEVO MESSSSSSSS.....");
                }
                System.out.println(sd.format(fechainicial));
                escribir(fechainicial, fechafinal);
            }else{
                System.out.println(sd.format(fechainicial));
                fechainicial.setMonth(fechainicial.getMonth()+1);
                fechainicial.setDate(0);
                escribir(fechainicial, fechafinal);
            }
        }
    }
    
    public static boolean compararfechas (Date fechainicial, Date Fechafinal){
        if (fechainicial.equals(Fechafinal)) {
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean seraelmes (Date fechainicial){
        int mes = fechainicial.getMonth();
        switch(mes){
            case 0, 2, 4, 6, 7, 9, 11:
                if (fechainicial.getDate()==31) {
                    return false;
                }else{
                    return true;
                }
                
            case 3, 5, 8, 10:
                if (fechainicial.getDate()==31) {
                    return false;
                }else{
                    return true;
                }
                
            default:
                if (fechainicial.getDate()==29) {
                    return false;
                }else{
                    return true;
                }
        }
    }
    
    //fechassssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
    
//    public static int suma(int matriz[][], int filas, int cols, int suma, int pos) {
//        if (filas==matriz.length-1 && cols == matriz[0].length-1) {
//            return suma + matriz[filas][cols];
//        }else{
//            if (cols == matriz[0].length-1) {
//                return suma + matriz[filas][cols] + suma(matriz, filas +1, 0, suma);
//            }else
//                return suma + matriz[filas][cols] + suma(matriz, filas, cols+1, suma);
//        }
//   }
    
    public static int[] arreglo(int matriz[][], int filas, int cols, int suma, int pos, int[] arreglo){
        if (filas==matriz.length-1&&cols==matriz[0].length-1){
            suma += matriz[filas][cols];
            arreglo[matriz.length-1]=suma;
            return arreglo;
        }else{
            if (cols==matriz[0].length-1){
                suma += matriz[filas][cols];
                arreglo[pos] = suma;
                pos++;
                arreglo(matriz, filas +  1, 0, 0, pos, arreglo);
                return arreglo;
            }else{
                suma += matriz[filas][cols];
                arreglo(matriz, filas, cols + 1, suma, pos, arreglo);
                return arreglo;
            }
        }
    }
    
//    public static int sumaPares(int matriz[][], int filas, int cols) {
//       if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
//           return matriz[filas][cols]%2==0?matriz[filas][cols]:0;
//       } else {
//           if (cols == matriz[0].length-1) {
//               return (matriz[filas][cols]%2==0?matriz[filas][cols]:0) + sumaPares(matriz, filas+1, 0);
//           } else {
//               return (matriz[filas][cols]%2==0?matriz[filas][cols]:0) + sumaPares(matriz, filas, cols+1);
//           }
//       }
//   }
    
}
