public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int adult = 20;
        if (adult >= 18) {
            System.out.println("Он совершеннолетний");
        }
        else {
            System.out.println("Он несовершеннолетний");
        }
        //Задача 2
        System.out.println("Задача 2");
        int temperature = 0;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        //Задача 3
        System.out.println("Задача 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }
        else if (speed < 60) {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }
        //Задача 4
        System.out.println("Задача 4");
        int age = 5;
        if (age > 2 && age <= 7) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        } else if (age > 7 && age < 17) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }
        //Задача 5
        System.out.println("Задача 5");
        int age1 = 10;
        if (age1 <= 5) {
            System.out.println("Если возраст ребенка равен " + age1 + " , то ему нельзя кататься на аттракционе");
        } else if (age1 > 5 && age1 <= 14) {
            System.out.println("Если возраст ребенка равен " + age1 + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age1 > 14) {
            System.out.println("Если возраст ребенка равен " + age1 + " , то ему можно кататься на аттракционе без сопровождении взрослого");
        }
        //Задача 6
        System.out.println("Задача 6");
        int capacityOfOneCarriage = 102;
        int seatPlace = 60;
        int standingRoom = capacityOfOneCarriage - seatPlace;
        int occupiedSeats = 65;
        int standingRoomOccupied = 35;
        System.out.println("Всего мест: " + capacityOfOneCarriage);
        System.out.println("Всего сидячих мест: " + seatPlace);
        System.out.println("Всего стоячих мест: " + standingRoom);
        if(occupiedSeats > seatPlace && standingRoomOccupied > standingRoom) {
            System.out.println("Нет свободных мест в вагоне");
        }
        else if(occupiedSeats > seatPlace && standingRoomOccupied < standingRoom) {
            System.out.println("Есть свободные стоячие места");
        }
        else if(occupiedSeats < seatPlace && standingRoomOccupied > standingRoom) {
            System.out.println("Есть свободные сидячие места");
        }
        else if(occupiedSeats < seatPlace && standingRoomOccupied < standingRoom) {
            System.out.println("Есть и стоячие и сидячие свободные места в вагоне");
        }
        //Задача 7
        System.out.println("Задача 7");
        int one = 5;
        int two = 6;
        int three = 7;
        if (one >= two && one >= three) {
            System.out.println("Число " + one + " самое большое");
        } else if (two >= one && two >= three) {
            System.out.println("Число " + two + " самое большое");
        } else if (three >= one && three >= two) {
            System.out.println("Число " + three + " самое большое");
        }
    }
}