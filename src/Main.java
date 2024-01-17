public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int adult = 21;
        int notAnAdult = 16;
        if (adult >= 18) {
            System.out.println("Если возраст человека равен " + adult + ", то он совершеннолетний");
        }
        if (notAnAdult < 18) {
            System.out.println("Если возраст человека равен " + notAnAdult + ", то он несовершеннолетний");
        }
        //Задача 2
        System.out.println("Задача 2");
        int temperature1 = 0;
        int temperature2 = 10;
        if (temperature2 > 5) {
            System.out.println("На улице " + temperature2 + " градусов, можно идти без шапки");
        }
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градусов, нужно надеть шапку");
        }
        //Задача 3
        System.out.println("Задача 3");
        int speed1 = 50;
        int speed2 = 70;
        if (speed2 > 60) {
            System.out.println("Если скорость " + speed2 + " , то придется заплатить штраф");
        }
        if (speed1 < 60) {
            System.out.println("Если скорость " + speed1 + " , то можно ездить спокойно");
        }
        //Задача 4
        System.out.println("Задача 4");
        int ageOfKindergarten = 5;
        int ageOfSchool = 15;
        int ageOfUniversity = 22;
        int ageOfWork = 27;
        if (ageOfKindergarten > 2 && ageOfKindergarten < 7) {
            System.out.println("Если возраст человека равен " + ageOfKindergarten + " , то ему нужно ходить в детский сад");
        } else {
            System.out.println("Человеку не нужно ходить в детский сад");
        }
        if (ageOfSchool > 7 && ageOfSchool < 17) {
            System.out.println("Если возраст человека равен " + ageOfSchool + " , то ему нужно ходить в школу");
        } else {
            System.out.println("Человеку не нужно ходить в школу");
        }
        if (ageOfUniversity >= 18 && ageOfUniversity <= 24) {
            System.out.println("Если возраст человека равен " + ageOfUniversity + " , то ему нужно ходить в университет");
        } else {
            System.out.println("Человеку не нужно ходить в университет");
        }
        if (ageOfWork > 24) {
            System.out.println("Если возраст человека равен " + ageOfWork + " , то ему нужно ходить на работу");
        } else {
            System.out.println("Человеку не нужно ходить на работу");
        }
        //Задача 5
        System.out.println("Задача 5");
        int ageOfChild1 = 4;
        int ageOfChild2 = 10;
        int ageOfChild3 = 16;
        if (ageOfChild1 < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild1 + " , то ему нельзя кататься на аттракционе");
        } else {
            System.out.println("Ребенку можно кататься на аттракционах без сопровождения либо с сопровождением взрослого");
        }
        if (ageOfChild2 > 5 && ageOfChild2 < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild2 + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Ребенку можно кататься на аттракционах без сопровождение либо вообще нельзя кататься");
        }
        if (ageOfChild3 > 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild3 + " , то ему можно кататься на аттракционе без сопровождении взрослого");
        } else {
            System.out.println("Ребенку можно кататься на аттракционах без сопровождение либо вообще нельзя кататься");
        }
        //Задача 6
        System.out.println("Задача 6");
        int capacityOfOneCarriage = 102;
        int seatPlace = 60;
        int standingRoom = capacityOfOneCarriage - seatPlace;
        System.out.println("Всего мест: " + capacityOfOneCarriage);
        System.out.println("Всего сидячих мест: " + seatPlace);
        System.out.println("Всего стоячих мест: " + standingRoom);
        if(seatPlace > 60 && standingRoom > 62) {
            System.out.println("Есть свободные сидячие и стоячие места");
        }
        if(seatPlace > 60 && standingRoom < 62) {
            System.out.println("Есть свободные стоячие места");
        }
        else {
            System.out.println("Нет свободных стоячих мест");
        }
        if(seatPlace < 60 && standingRoom > 62) {
            System.out.println("Есть свободные сидячие места");
        }
        else {
            System.out.println("Нет свободных сидячих мест");
        }
        if(seatPlace < 60 && standingRoom < 62) {
            System.out.println("Нет свободных мест в вагоне");
        }
        else {
            System.out.println("Есть свободные места в вагоне");
        }
        //Задача 7
        System.out.println("Задача 7");
        int one = 5;
        int two = 6;
        int three = 7;
        if (one >= two && one >= three) {
            System.out.println("Число " + one + " самое большое");
        } else {
            System.out.println("Число " + one + " не самое большое");
        }
        if (two >= one && two >= three) {
            System.out.println("Число " + two + " самое большое");
        } else {
            System.out.println("Число " + two + " не самое большое");
        }
        if (three >= one && three >= two) {
            System.out.println("Число " + three + " самое большое");
        } else {
            System.out.println("Число " + three + " не самое большое");
        }
    }
}