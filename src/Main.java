import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача 1");
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();
        if(age<18) System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать.");
        else System.out.println("Если возраст человека равен "+age+", то он совершеннолетний.");
        System.out.println();

        System.out.println("Задача 2");
        System.out.println("Введите температуру воздуха: ");
        int t = sc.nextInt();
        System.out.println((t>=5)?"На улице " + t + " градусов, можно идти без шапки.":"На улице "
                + t + " градусов, нужно надеть шапку.");
        /*if(t<=5) System.out.println("На улице " + t + " градусов, нужно надеть шапку.")
        else if(t>5) System.out.println("На улице " + t + " градусов, можно идти без шапки.");*/
        System.out.println();

        System.out.println("Задача 3");
        System.out.println("Введите скорость: ");
        int speed = sc.nextInt();
        if(speed<=60 && speed>=-60) System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        else  System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        System.out.println();

        System.out.println("Задача 4");
        System.out.println("Введите возраст: ");
        int age4 = sc.nextInt();
        System.out.print("Если возраст человека равен " + age4 + " ,то ему нужно ходить ");
        if(age4>=2 && age4<=6) System.out.println("в детский сад.");
        else if(age4>=7 && age4<18) System.out.println("в школу.");
        else if(age4>=18 && age4<24) System.out.println("в университет.");
        else if(age4>=24) System.out.println("на работу.");
        System.out.println();

        System.out.println("Задача 5");
        System.out.println("Введите возраст: ");
        int age5 = sc.nextInt();
        System.out.print("Если возраст ребенка равен " + age5 + " , то он ");
        if(age5<=4) System.out.println("не может кататься на аттракционе.");
        else if(age5<14) System.out.println("может кататься только в сопровождении взрослого. " +
                "Если взрослого нет, то кататься нельзя.");
        else System.out.println("может кататься без сопровождения взрослого.");
        System.out.println();

        System.out.println("Задача 6");
        int allPlace = 102;
        int seatPlace = 60;
        int standingPlace = allPlace - seatPlace;
        System.out.println("Введите количество занятых сидячих мест: ");
        int usedSeatPlace = sc.nextInt();
        System.out.println("Введите количество занятых стоячих мест: ");
        int usedStandingPlace = sc.nextInt();
        if((seatPlace-usedSeatPlace==0) && (standingPlace-usedStandingPlace==0)) System.out.println("Свободных мест нет.");
        else System.out.println("Осталось "+(standingPlace-usedStandingPlace)+ " стоячих мест и " +(seatPlace-usedSeatPlace)+" сидячих мест.");
        System.out.println();

        System.out.println("Задача 7");
        System.out.println("Введите первое число: ");
        int first = sc.nextInt();
        System.out.println("Введите второе число: ");
        int second = sc.nextInt();
        System.out.println("Введите третье число: ");
        int third = sc.nextInt();
        if(first == second && second == third) System.out.println("Числа равны.");
        else if(first>=second && first>=third) System.out.println("Первое число наибольшее.");
        else if(second>=first && second>=third) System.out.println("Второе число наибольшее.");
        else System.out.println("Третье число наибольшее.");
    }
}