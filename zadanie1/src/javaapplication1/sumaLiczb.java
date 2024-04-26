//import java.util.Scanner;

package javaapplication1;

public class sumaLiczb {

    public static void main(String[] args) {
//        int [] liczby = {1, 2, 3, 4, 5, 6};
        int suma = 0;
        int kwadratSumy = 0;
        int sumaKwadratow = 0;
        for (int i=1; i<101; i++) {
            suma = suma + i;
            int liczba = i * i;
            sumaKwadratow = sumaKwadratow + liczba;
//            System.out.println("Kwadratem liczby "+i+" jest: "+liczba);
//            System.out.println("Suma kwadratow to: "+ sumaKwadratow);
        }
        System.out.println("Suma kwadratow to: "+ sumaKwadratow);
        kwadratSumy = suma * suma;
        System.out.println("Wynikiem kwadratu z sumy pierwszych 100 liczb jest: " + kwadratSumy);
        int roznica = kwadratSumy - sumaKwadratow;
        System.out.println("Roznica wynosi: " + roznica);
    }
    
}
