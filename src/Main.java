public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte age = 21;
        if (age >= 18){
    System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия");
        }

        System.out.println("Задание 2");
        byte temperature = -5;
        if (temperature < 5){
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("Задание 3");
        short speed = 30;
        if (speed < 60){
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }

        System.out.println("Задание 4");

        byte ageHuman = 25;
        if (ageHuman >= 2 && ageHuman <= 6){
            System.out.println("Если возраст человека равен " + ageHuman + " то ему нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <= 17){
            System.out.println("Если возраст человека равен " + ageHuman + " то ему нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <= 24){
            System.out.println("Если возраст человека равен " + ageHuman + " то его место в университете");
        }
        if (ageHuman > 24){
            System.out.println("Если возраст человека равен " + ageHuman + " то ему пора ходить на работу");
        }

        System.out.println("Задание 5");

        byte childAge = 14;
        if (childAge < 5){
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge < 14){
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему можно кататься только в сопровождении взрослого");
        }
        if (childAge >= 14){
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему можно кататься без сопровождения взрослого");
        }

        System.out.println("Задание 6");

        short totalPlaces = 102;
        short seatPlaces = 60;
        short passenger = 35;
        int remainSeatPlaces = seatPlaces - passenger;
        int remainStandPlaces = totalPlaces - (passenger + remainSeatPlaces);
        if (passenger > totalPlaces){
            System.out.println("Если в пассажиров в вагоне " + passenger + " , то вагон переполнен");
        }
        else if (passenger <= seatPlaces){
            System.out.println("Если в пассажиров в вагоне " + passenger + " , то в вагоне еще есть ещё " + remainSeatPlaces + " сидячих мест и " + remainStandPlaces + " стоячих мест");
        }
        else if (passenger > seatPlaces && passenger < totalPlaces){
            System.out.println("Если в пассажиров в вагоне " + passenger + " ,то в вагоне еще есть ещё " + (totalPlaces- passenger) + " стоячих мест");
        }

        System.out.println("Задание 7");

        int one = 10;
        int two = 5;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one + " больше " + two + " и больше " + three);
        }
        else if (two > one && two > three){
            System.out.println(two + " больше " + one + " и больше " + three);
        }
        else if (three > two && three > one){
            System.out.println(three + " больше " + two + " и больше " + one);
        }
    }
}