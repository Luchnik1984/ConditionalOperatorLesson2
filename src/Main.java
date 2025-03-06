import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача 1.
        System.out.println("\nЗадача 1.");
        Scanner input = new Scanner(System.in);
        System.out.println("Если у Вас система iOS введите 0");
        System.out.print("Если у Вас система Android введите 1\n" +
                "Какая у Вас система?: ");
        byte clientOS = input.nextByte();
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Вы ввели недопустимое значение. Программа прервана");
            // System.exit(0);
        }

        // Задача 2.
        short clientDeviceYear;
        System.out.println("\nЗадача 2. ");
        System.out.print("Укажите год создания телефона: ");
        clientDeviceYear = input.nextShort();
        System.out.println("Если у Вас система iOS введите 0");
        System.out.print("Если у Вас система Android введите 1\n" +
                "Какая у Вас система?: ");
        clientOS = input.nextByte();
        if (clientDeviceYear >= 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Вы ввели недопустимое значение.");
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегчённую версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Вы ввели недопустимое значение.");
            }
        }

        // Задача 3.
        System.out.println("\nЗадача 3. ");
        System.out.print("Определитель високосного года\n ведите год не старше 1584: ");
        int year;
        year = input.nextInt();
        if (year < 1584) {
            System.out.println("Вы ввели год, старше 1584 года, первого високосного года ");
        } else if (year % 400 == 0) {
            System.out.println(year + " Год является високосным");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }
        // Задача 4.
        System.out.println("\nЗадача 4. ");
        int deliveryDistance = 95; // Инициализировался с числом 95 по условию задачи
        byte deliveryTime;
        String text = "Потребуется дней для доставки карты: ";
        System.out.print("Укажите расстояние от офиса банка до места доставки: ");
        deliveryDistance = input.nextInt();
        //System.out.println("Расстояние до клиента = " + deliveryDistance);
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println(text + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println(text + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println(text + deliveryTime);
        } else {
            System.out.println("Доставки нет!");
        }
        // Задача 5.
        System.out.println("\nЗадача 5. ");
        byte monthNumber = 12; // Инициализировался с числом 12 по условию задачи
        String monthName;
        System.out.print("Введите номер месяца: ");
        monthNumber = input.nextByte();
        switch (monthNumber) {
            case 1 -> monthName = "Январь";
            case 2 -> monthName = "Февраль";
            case 3 -> monthName = "Март";
            case 4 -> monthName = "Апрель";
            case 5 -> monthName = "Май";
            case 6 -> monthName = "Июнь";
            case 7 -> monthName = "Июль";
            case 8 -> monthName = "Август";
            case 9 -> monthName = "Сентябрь";
            case 10 -> monthName = "Октябрь";
            case 11 -> monthName = "Ноябрь";
            case 12 -> monthName = "Декабрь";
            default -> monthName = "Неизвестно";
        }
        System.out.println(monthNumber + "-й месяц, он же " + monthName);
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.print("Это зима");
                break;
            case 3, 4, 5:
                System.out.print("Это весна");
                break;
            case 6, 7, 8:
                System.out.print("Это лето");
                break;
            case 9, 10, 11:
                System.out.print("Это осень");
                break;
            default:
                System.out.print("Нет такого месяца");
        }
    }
}



