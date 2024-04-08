import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите количество строк в массиве: ");
        int n = scanner.nextInt();
        String[] initialArray = new String[n];
        System.out.println("Введите строки:");
        for (int i = 0; i < n; i++) {
            initialArray[i] = scanner.next();
        }


        String[] newArray = new String[n];
        int count = 0;
        for (String str : initialArray) {
            if (str.length() <= 3) {
                newArray[count] = str;
                count++;
            }
        }


        System.out.println("Новый массив со строками длиной <= 3:");
        for (int i = 0; i < count; i++) {
            System.out.println(newArray[i]);
        }
    }
}