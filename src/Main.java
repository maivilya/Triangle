import java.util.Scanner;

public class Main {
    private final static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(greeding());
        System.out.println(getNumberTerminal());
    }

    private static String greeding(){
        return "HI, IS A PROGRAM FOR CALCULATING THE NTH TRIANGULAR NUMBER";
    }
    private static int getNumberTerminal(){
        System.out.print("Enter number: ");
        return scan.nextInt();
    }
}