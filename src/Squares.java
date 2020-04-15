import java.util.Scanner;
public class Squares {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num2 = 0;
        int num = input.nextInt();
        for (int square = 1;square<=num;square+=1){
            num2 = square * square;
            System.out.println(square+"  "+num2);

        }
    }

}
