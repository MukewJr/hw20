import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Бир кунду жазыныз:");
        String st=scan.nextLine();
        try{
            Days day=Days.valueOf(st);
            System.out.println(day);
        }catch (IllegalArgumentException e){
            System.out.println("Мындай кун жок.");
        }

    }
}