import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        // Программа для чтения из файла
        System.out.println(greeding());
        String FILE = "src/number.txt";
        String getNumber = getNumberFromFile(FILE);
        int convertNumber = convertFromStringToInt(getNumber);
        System.out.printf("И так, мы ищем %d-е треугольное число\n", convertNumber);
        System.out.println("Происходит вычисление...");// хотел сделать в потоке метод thread.slip(),
                                                       // чтобы был красивый вывод загрузки, но подумал, что рановато
        int resultNumber = TriangleDigit(convertNumber);
        System.out.printf("%d-e треугольное число = %d\n", convertNumber, resultNumber);

        // Программа получения числа из консоли
        /*System.out.println(greeding());
        int resultNumber = getNumberTerminal();
        System.out.printf("И так, вы ввели число %d\n", resultNumber);
        System.out.println("Производится расчет...");
        System.out.printf("%d-e треугольное число = %d\n", resultNumber, TriangleDigit(resultNumber));*/

    }

    private static int TriangleDigit(int number) {
        return (number * (number + 1)) / 2;
    }


    // Конвертация только возможных значений, строку конвертировать в число невозможно
    private static int convertFromStringToInt(String stringNumber) {
        try {
            int resultConvert = Integer.parseInt(stringNumber.trim());
            return resultConvert;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static String getNumberFromFile(String fileName) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        try {
            String currentLine = bufferedReader.readLine();
            return currentLine;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "СТРОКА ПУСТАЯ";
    }

    private static String greeding() {
        return "ПРИВЕТ, ЭТО ПРОГРАММА ВЫЧИСЛЕНИЯ Н-ГО ТРЕУГОЛЬНОГО ЧИСЛА";
    }

    private static int getNumberTerminal() {
        System.out.print("Введи число: ");
        return scan.nextInt();
    }
}