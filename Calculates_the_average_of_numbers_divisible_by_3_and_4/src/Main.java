import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int dividing=0,sum=0;
        System.out.println("Number:");
        num=input.nextInt();
        for(int i=1;i<=num;i++){
            if(i%3==0&&i%4==0){
                sum+=i;
                dividing++;

            }

        }
        System.out.println(sum/dividing);
    }
}
