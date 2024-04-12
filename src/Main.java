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
            if (ageTwo <= 18) {
                System.out.println(" Если возраст человека равен " + ageTwo + ", то он не достиг совершеннолетия, нужно немного подождать");
            }
        }
        System.out.println("Задание 2");
        {
            byte tempOne = 4;
            byte tempTwo = 6;
            if (tempOne < 5) {
                System.out.println(" На улице " + tempOne + " градусов, нужно надеть шапку");
            }
            if (tempTwo > 5) {
                System.out.println(" На улице " + tempTwo + " градусов, можно идти без шапки");
            }
        }
        System.out.println("Задание 3");
        {
            byte speedOne = 61;
            byte speedTwo = 60;
            if (speedOne > 60) {
                System.out.println(" Если скорость " + speedOne + ", то придется заплатить штраф");
            }
            if (speedTwo <= 60) {
                System.out.println(" Если скорость " + speedTwo + ", можно ездить спокойно");
            }
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
        {
            byte age = 16;
            if (age < 5) {
                System.out.println(" Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
            } else if (age > 5 && age < 14) {
                System.out.println(" Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослых");
            } else if (age > 14) {
                System.out.println(" Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без споровождения взрослого");
            }
        }
        System.out.println("Задание 6");
        {
            byte numberOfPlaces = 102;
            byte numberOfSittingPlaces = 60;
            byte numberOfStandingPlaces = (byte) (numberOfPlaces - numberOfSittingPlaces);
            byte sittingPassengers = 59;
            byte standingPassengers = 42;
            byte totalNumberOfPassengers = (byte) (sittingPassengers + standingPassengers);
            byte freePlacesLeft = (byte) (numberOfPlaces - totalNumberOfPassengers);
            byte freeSittingPlacesLeft = (byte) (numberOfSittingPlaces - sittingPassengers);
            byte freeStandingPlacesLeft = (byte) (numberOfStandingPlaces - standingPassengers);
            if (totalNumberOfPassengers >= 102) {
                System.out.println(" Вагон полностью забит");
            } else if (totalNumberOfPassengers < 102) {
                System.out.println(" В вагоне осталось " + freePlacesLeft + " свободных мест.");
            }
            if (totalNumberOfPassengers < 102 && freeSittingPlacesLeft > 0 && freeStandingPlacesLeft > 0) {
                System.out.println(" Из них " + freeSittingPlacesLeft + " сидячих, " + freeStandingPlacesLeft + " стоячих.");
            } else if (totalNumberOfPassengers < 102 && freeSittingPlacesLeft == 0) {
                System.out.println(" Остались только стоячие места в количестве " + freeStandingPlacesLeft + " шт");
            } else if (totalNumberOfPassengers < 102 && freeStandingPlacesLeft == 0) {
                System.out.println(" Остались только сидячие места в количестве " + freeSittingPlacesLeft + " шт");
            }
        }
        System.out.println("Задание 7");
        {
            int one = 990;
            int two = 991;
            int three = 990;
            boolean allNumbersAreEqual = (one == two && one == three);
            boolean oneTwo = (one == two);
            boolean twoThree = (two == three);
            boolean threeOne = (three == one);
            if (allNumbersAreEqual) {
                System.out.println(" Все три числа равны");
            } else if (one > two && one > three && one != two && one != three) {
                System.out.println(one + " это число является наибольшим (первое число)");
            } else if (two > one && two > three && two != one && two != three) {
                System.out.println(two + " это число является наибольшим (второе число)");
            } else if (three > one && three > two && three != two && three != one) {
                System.out.println(three + " это число является наибольшим (третье число)");
            } else if (oneTwo) {
                System.out.println(" Первое и второе числа равнозначны и являются наибольшими из трех (" + one + ")");
            } else if (twoThree) {
                System.out.println(" Второе и третье числа равнозначны и являются наибольшими из трех (" + two + ")");
            } else if (threeOne) {
                System.out.println(" Первое и третье числа равнозначны и являются наибольшими из трех (" + three + ")");
            }
        }
    }
}