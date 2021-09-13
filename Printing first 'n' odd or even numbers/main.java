import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to get first 'n' odd/even numbers ? (Say odd/even)");

        String N=sc.nextLine();

        if (N.contains("odd")) {
            
            System.out.println("Please input number of odd numbers to be printed - ");
            int no=sc.nextInt();
            int io=1;

            System.out.println("Ans - ");

            while(io<=no) {
                System.out.println(io);
                io+=2;
            }

        }

        else if (N.contains("even")) {
            
            System.out.println("Please input number of even numbers to be printed - ");
            int ne=sc.nextInt();
            int ie=0;

            System.out.println("Ans - ");

            while(ie<=ne) {
                System.out.println(ie);
                ie+=2;
            }

        }

        else {
            System.out.println("Sorry, wrong input !");
        }
    }
}