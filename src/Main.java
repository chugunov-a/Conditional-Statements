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
            short year = 2023;
            boolean firstYear = (year < 1584);
            if (firstYear) {
                System.out.println(" Введите значение больше 1584");
            }

            }
        }
    }
