public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else  {
            System.out.println("Возраст совершеннолетия не наступил");
        }
        if (age >= 7) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age >=18) {
            System.out.println("Человек уже закончил в школу и может отправляться в университет");
        }
        else  {
            System.out.println("Человек окончил университет и пора искать первую работу");
        }
        int seats = 62;
        if (seats < 60) {
            System.out.println("В вагоне есть сидячее место");
        }
        else  {
            System.out.println("В вагоне есть стоячее место");
        }
        if (seats >=102) {
            System.out.println("В вагоне не осталось мест");
        }
        int yearsOld = 13;
        if (yearsOld >= 2 && yearsOld<= 6) {
            System.out.println("Если возраст человека равен" + yearsOld + " то ему нужно ходить в детский сад");
        }
        else if (yearsOld > 6 && yearsOld <=18) {
            System.out.println("Если возраст человека равен "+yearsOld+ " то ему нужно ходить в школу");
        }
            else if (yearsOld > 18 && yearsOld <=24) {
            System.out.println("Если возраст человека равен" + yearsOld + " то ему нужно ходить в университет");
        }
        else if (yearsOld > 24) {
            System.out.println("Если возраст человека равен" + yearsOld + " то ему нужно ходить на работу");
        }
        if (yearsOld <5) {
            System.out.println("Ребёнок не может кататься на аттракционе");
        }
        else if (yearsOld >= 5 && yearsOld < 14) {
            System.out.println("Ребёнок может кататься на аттракционе только в сопровождении взрослого");
        }
        else if (yearsOld >= 14) {
            System.out.println("Ребёнок может кататься на аттракционе без сопровождения взрослого");
        }
        int one = 1;
        int two =2;
        int three =3;
        if (one >= two) {
            if (one > three) {
                System.out.println("Максимальное число- " + one);
            }
            else if (three>one) {
                System.out.println("Максимальное число- "+ three);
            } else {
                System.out.println("Числа " + one + " и" + three + " равны");
            }
        } else if (two>one) {
            if (two > three) {
                System.out.println("Максимальное число- " + two);
            } else if (three > two) {
                System.out.println("Максимальное число- " + three);
            } else {
                System.out.println("Числа " + two + " и " + three + "равны");
            }
        }else {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Все числа равны");
            }
        }

        }
        }









