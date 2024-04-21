//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        {
            byte clientOS = 0;
            switch (clientOS) {
                case 0:
                    System.out.println(" Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println(" Установите версию приложения для Android по ссылке");
                    break;
            }
        }
        System.out.println("Задание 2");
        {
            byte clientOS = 1;
            short clientDeviceYear = 2018;
            switch (clientOS) {
                case 0:
                    if (clientDeviceYear >= 2015) {
                        System.out.println(" Установите версию приложения для iOS по ссылке");
                    } else if (clientDeviceYear < 2015) {
                        System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
                    }
                    break;
                case 1:
                    if (clientDeviceYear >= 2015) {
                        System.out.println(" Установите версию приложения для Android по ссылке");
                    } else if (clientDeviceYear < 2015) {
                        System.out.println(" Установите облегченную версию приложения для Android по ссылке");
                    }
                    break;
            }
        }
        System.out.println("Задание 3");
        {
            short year = 2019;
            boolean firstYear = (year < 1584);
            if (firstYear) {
                System.out.println(" Введите значение больше 1584");
            } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
        System.out.println("Задание 4");
        {
            short deliveryDistance = 95;
            if (deliveryDistance <= 20) {
                System.out.println(" Потребуется дней: 1");
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println(" Потребуется дней: 2");
            } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                System.out.println(" Потребуется дней: 3");
            } else if (deliveryDistance > 100) {
                System.out.println(" Свыше 100 км доставки нет");
            }
        }
        System.out.println("Задание 5");
        {
            byte monthNumber = 11;
            switch (monthNumber) {
                case 12, 1, 2:
                    System.out.println(" Зима");
                    break;
                case 3, 4, 5:
                    System.out.println(" Весна");
                    break;
                case 6, 7, 8:
                    System.out.println(" Лето");
                    break;
                case 9, 10, 11:
                    System.out.println(" Осень");
                    break;
                default:
                    System.out.println(" Такого сезона не существует");
            }
        }
    }
}
