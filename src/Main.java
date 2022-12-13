import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int year;
        while(true){
            System.out.println("Введите год");
            String line = scan.nextLine();
            try{
                year = Integer.parseInt(line);
                break;
            }catch(NumberFormatException e){
                System.out.println("Вы ввели не верное значение");
            }
        }
        if(year%400 ==0 || (year%4==0 && !(year%100 ==0)) ){
            System.out.println("Год високосный");
        }else{
            System.out.println("Год не високосный");
        }
    }
}