
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1\n");
        byte age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершенноллетия\n" +
                    "нужно немного подождать\n");
        }
        System.out.println("Задание 2\n");
        byte temp = -20;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов нужно надеть шапку\n");
        } else if (temp >= 5) {
            System.out.println("На улице +" + temp + " градусов можно идти без шапки\n");
        }
        System.out.println("Задание 3\n");
        short speed = 200;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф\n");
        } else {
            System.out.println("Можно ездитьспокойно\n");
        }
        System.out.println("Задание 4\n");
        byte age2 = 45;
        if (age2 >= 2 && age2 < 7) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад\n");
        } else if (age2 >= 7 && age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу\n");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете\n");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу\n");
        } else {
            System.out.println("введён не корректный возраст\n");
        }
        System.out.println("Задание 5\n");
        byte age3 = 16;
        if (age3 < 5) {
            System.out.println("Если ребёнку " + age3 + ", то он не может кататься на атракционе\n");
        } else if (age3 >= 5 && age3 <= 14) {
            System.out.println("Если ребёнку " + age3 + ", то он может кататься\n" +
                    "только в сопровождении взрослого\n");
        } else {
            System.out.println("Если ребенку " + age3 + ", то он может кататья без сопровождения\n");
        }
        System.out.println("Задание 6\n");
        int tickets = 40;
        int placesTotal = 102;
        int placesSeated = 60;
        int placesStanding = placesTotal - placesSeated;
        if (tickets > 0 && tickets <= 60) {
            System.out.println("Осталось " + (placesTotal - placesStanding - tickets) + " сидячих мест и "
                    + placesStanding + " стоячих\n");
        } else if (tickets <= 102 && tickets > 60) {
            System.out.println(" Сидячих мест не осталось, но осталось " + (placesTotal - tickets) + " стоячих\n");
        } else {
            System.out.println("Вагон уже полностью забит\n");
        }
        System.out.println("Задание 7\n");
        int one = 11;
        int two = -200;
        int three = 30;
        if (one > two && one > three) {
            System.out.println("Большее число " + one);
        } else if (two > one && two > three) {
            System.out.println("Большее число " + two);
        } else {
            System.out.println("Большее число " + three);
        }
    }
}
