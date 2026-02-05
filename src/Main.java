
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1\n");
        byte age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
       else if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершенноллетия \n" +
                    "нужно немного подождать \n");
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
        byte agePerson = 45;
        if (agePerson >= 2 && agePerson < 7) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад\n");
        } else if (agePerson >= 7 && agePerson < 18) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу\n");
        } else if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то его место в университете\n");
        } else if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему пора ходить на работу\n");
        } else {
            System.out.println("введён не корректный возраст\n");
        }
        System.out.println("Задание 5\n");
        byte ageChildren = 16;
        if (ageChildren < 5) {
            System.out.println("Если ребёнку " + ageChildren + ", то он не может кататься на атракционе\n");
        } else if (ageChildren >= 5 && ageChildren <= 14) {
            System.out.println("Если ребёнку " + ageChildren + ", то он может кататься\n" +
                    "только в сопровождении взрослого\n");
        } else {
            System.out.println("Если ребенку " + ageChildren + ", то он может кататья без сопровождения\n");
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
