import java.util.Random;
public class Q6 {
    public static void main(String[] args) {
        Random ot=new Random();
        for (int i=0;i<5;i++)
            System.out.println("The random number is  "+ot.nextInt(6));
    }
}
