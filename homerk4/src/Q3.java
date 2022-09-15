import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner ont=new Scanner(System.in);
        System.out.println("enter the sentence");
        String you=ont.nextLine();
        System.out.println(" sentence = "+you);
        you=you.replace("s","$");
        you=you.replace("i","!");
        System.out.println(" +sentence = "+you);

    }
}
