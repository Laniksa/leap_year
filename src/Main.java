import java.util.Scanner;

public class Main {
    public static void vYear(int num){
        if(num%400 ==0 || (num%4==0 && !(num%100 ==0)) ){
            System.out.println("Год високосный,количество дней 366");
        }else{
            System.out.println("Год не високосный, количество дней 365");
        }
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int year;
        while(true){
            System.out.println("Введите год в формате 'уууу'");
            String line = scan.nextLine();
            try{
                year = Integer.parseInt(line);
                break;
            }catch(NumberFormatException e){
                System.out.println("Вы ввели не верное значение");
            }
        }
        vYear(year);
    }
}