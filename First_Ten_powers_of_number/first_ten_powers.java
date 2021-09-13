import java.util.*;

public class first_ten_powers {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number : ");
        int N=sc.nextInt();
        int i = 1;

        while(i<=10){
            System.out.println(Math.pow(N, i));
            i++;
        }
    }
}