import java.util.Scanner;

public class Main {//n=> number , c=> count
    public static int counter=0;
    public static int prime(int n, int c)
    {
        if(c>0)
        {
            if(n%c==0) // tam bölünenleri bulmak için kullanıyoruz
                counter++;// public tanımladığımız için tekrar girdiğinde arttı haliyle kalır
            prime(n,c-1); // burada recursive metot olması için kendine döndürüyoruz
            return counter;
        }
        else
            return counter;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number;
        System.out.print("Bir sayı giriniz: ");
        number=inp.nextInt();


        if (prime(number,number)==2) // tam bölünen sayısı kendisi ve 1 sayısı olacağı için asal sayı için 2 olmak zorunda
            System.out.println(number+" sayısı asaldır.");
        else
            System.out.println(number+" sayısı asal değildir.");
    }
}