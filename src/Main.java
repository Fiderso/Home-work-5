public class Main {

    static int one;
    static int two;
    static int three;

    public static void main(String[] args) {

        byte people = 18; // Задача 1
        if (people >= 18) {
            System.out.println("Вы совершеннолетний!");
        } else {
            System.out.println("Ваш возраст совершеннолетия еще не наступил, нужно не много подождать.");
        }

        System.out.println();

        byte temp = 6; // Задача 2
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else if (temp > 5) {
            System.out.println("На улице " + temp + " градуcов, можно идти без шапки.");
        }

        System.out.println();

        byte speed = 70; // Задача 3
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойн.");
        }

        System.out.println();

        byte yearPeople = 25; // Задача 4
        if (yearPeople >= 2 && yearPeople <= 6) {
            System.out.println("Если возраст человека равен " + yearPeople + ", то ему нужно ходить в детский сад.");
        } else if (yearPeople >= 7 && yearPeople <= 17) {
            System.out.println("Если возраст человека равен " + yearPeople + ", то ему нужно ходить в школу.");
        } else if (yearPeople >= 18 && yearPeople <= 24) {
            System.out.println("Если возраст человека равен " + yearPeople + ", то ему нужно ходить в университет.");
        } else if (yearPeople > 24) {
            System.out.println("Если возраст человека равен " + yearPeople + ", то ему нужно ходить на работу.");
        }

        System.out.println();

        byte ageChild = 15; // Задача 5
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        } else if (ageChild > 5 && ageChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println();

        byte count = 67; // Задача 6
        byte oneRailcar = 102;
        byte mest = 60;
        if (count > mest ) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (count < oneRailcar) {
            System.out.println("Сидячих мест нет, но есть стоячие места.");
        } else {
            System.out.println("Вагон уже полностью забит.");
        }

        System.out.println();

        // Задача 7
        if (one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= one && two >= three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
















    }
}