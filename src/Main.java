//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        {
            byte ageOne = 21;
            byte ageTwo = 16;
            if (ageOne >= 18) {
                System.out.println(" Если возраст человека равен " + ageOne + ", то он совершеннолетний");
            }
            if (ageTwo >= 16) {
                System.out.println(" Если возраст человека равен " + ageTwo + ", то он не достиг совершеннолетия, нужно немного подождать");
            }
        }
        System.out.println("Задание 2");
        byte tempOne = 4;
        byte tempTwo = 6;
        if (tempOne < 5) {
            System.out.println(" На улице " + tempOne + " градусов, нужно надеть шапку");
        }
        if (tempTwo > 5) {
            System.out.println(" На улице " + tempTwo + " градусов, можно идти без шапки");
        }
        System.out.println("Задание 3");
        byte speedOne = 61;
        byte speedTwo = 60;
        if (speedOne > 60) {
            System.out.println(" Если скорость " + speedOne + ", то придется заплатить штраф");
        }
        if (speedTwo <= 60) {
            System.out.println(" Если скорость " + speedTwo + ", можно ездить спокойно");
        }
        System.out.println("Задание 4");
        {
            byte age = 21;
            if (age >= 2 && age <= 6) {
                System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            } else if (age >= 7 && age <= 17) {
                System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else if (age >= 18 && age <= 24) {
                System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в университет");
            } else if (age > 24) {
                System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить на работу");
            } else if (age < 2) {
                System.out.println(" Если возраст человека равен " + age + ", то он должен быть дома");
            }
        }
        System.out.println("Задание 5");
        byte age = 16;
        if (age < 5) {
            System.out.println(" Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println(" Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослых");
        } else if (age > 14) {
            System.out.println(" Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без споровождения взрослого");
        }
        System.out.println("Задание 6");
        byte numberOfPlaces = 102;
        byte numberOfSittingPlaces = 60;
        byte numberOfStandingPlaces = (byte) (numberOfPlaces - numberOfSittingPlaces);
        byte totalNumberOfPassengers = 2;
        byte freePlacesLeft = (byte) (numberOfPlaces - totalNumberOfPassengers);
        byte freeSittingPlacesLeft = (byte) (numberOfSittingPlaces - totalNumberOfPassengers);
        byte freeStandingPlacesLeft = (byte) (numberOfPlaces - totalNumberOfPassengers);
        if (totalNumberOfPassengers >= 102) {
            System.out.println(" Вагон полностью забит");
        } else if (totalNumberOfPassengers < 102) {
            System.out.println(" В вагоне осталось " + freePlacesLeft + " свободных мест.");
        }
        if (totalNumberOfPassengers < 102 && freeSittingPlacesLeft > 0) {
            System.out.println(" Из них " + freeSittingPlacesLeft + " сидячие, " + numberOfStandingPlaces + " стоячие.");
        } else if (totalNumberOfPassengers < 102 && freeSittingPlacesLeft <= 0) {
            System.out.println(" Из них " + freeStandingPlacesLeft + " стоячие");
        }
        System.out.println("Задание 7");
        int one = 900;
        int two = 8;
        int three = 8;
        if (one > two && one > three && one != two && one != three) {
            System.out.println(one + " это число является наибольшим");
        } else if (one == two || one == three) {
            System.out.println(one + " это число равно одному или другому числу или сразу двум заданным числам");
        } else if (two > one && two > three) {
            System.out.println(two + " это число является наибольшим");
        } else if (two == one || two == three) {
            System.out.println(two + " это число равно одному или другому числу или сразу двум заданным числам");
        } else if (three > one && three > two) {
            System.out.println(three + " это число является наибольшим");
        } else if (three == one || three == two) {
            System.out.println(three + " это число равно одному или другому числу или сразу двум заданным числам");
        }
    }
}