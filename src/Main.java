import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача №1 " + " Ф.И.О сотрудников ");
        String firstName = "Иван";
        String middleNAme = "Иванович";
        String lastName = "Иванов";
        String fullName = "Иванов Иван Иванович";
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задача №2 " + " Ф.И.О сотрудников заглавные буквы ");
        String firstName = "Иван";
        String middleNAme = "Иванович";
        String lastName = "Иванов";
        String fullName = "иванов иван иваночвич";
        System.out.println(fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача №3 " + " Ф.И.О сотрудников без буквы ё ");
        String firstName = "Артём";
        String middleNAme = "Семёнович";
        String lastName = "Берёза";
        String fullName = "Берёза Артём Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
    public static void task4(){
        System.out.println("Задача №4 " + "Scanner-Приветствие");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you username ");
        String userName = scanner.next();
        System.out.println("Hello! " + userName);
        return;
    }

    public static void task5() {
        System.out.println("Задача №5 " + "температура ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature");
        int t = scanner.nextInt();
        if (t % 2 == 0) {
            System.out.println("Температура воздуха сегодня: " + t + "  градусов. ");
        }else{
            t++;
            System.out.println("Температура воздуха сегодня: " + t + " градусов. ");
        }
    }

    public static void task6() {
        System.out.println("Задача №6 " + " Дата");
        Scanner scanner = new Scanner(System.in);
        System.out.print("DD:");
        System.out.print("MM:");
        System.out.print("YYYY.");
    }

    public static void task7(){
        System.out.println("Задача №7 " + " помощник для почты");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username");
        String name = scanner.nextLine();
        System.out.println("Enter your assistant");
        String lastName = scanner.nextLine();
        System.out.println("Enter number of messages");
        int messages = scanner.nextInt();
        System.out.println("Привет," + name + " это твой помощник " + lastName + "." + " у тебя " + messages + " новых сообщений");
    }


}
