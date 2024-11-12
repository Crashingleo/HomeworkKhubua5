public class Main {
    public static void main(String[] args) {
        // Zadacha 1 //

        System.out.println("Задача 1");
        for(int i = 1; i < 11; i++){
            System.out.print(i + ", ");
        }
        System.out.println();

        // Zadacha 2 //
        
        System.out.println("Задача 2");
        for (int i = 10; i > 0 ; i--) {
            System.out.print(i + ", ");
        }
        System.out.println();
        
        // Zadacha 3 //
        
        System.out.println("Задача 3");
        for (int i = 0; i < 18; i++) {
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
            System.out.println();
        }

        // Zadacha 4 //

        System.out.println("Задача 4");
        for (int i = 10; i > -11 ; i--) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // Zadacha 5 //

        System.out.println("Задача 5");
        for (int i = 1904; i < 2097; i++) {
            if(i % 4 == 0){
                System.out.println(i + " год является високосным");
            }
        }
        // Zadacha 6 //

        System.out.println("Задача 6");
        for (int i = 1; i < 99; i++) {
            if(i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Zadacha 7 //

        System.out.println("Задача 7");
        for (int i = 1; i < 513 ; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Zadacha 8 //

        System.out.println("Задача 8");
        int sum = 29000;
        for (int i = 1; i < 13; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (i * sum) + " рублей");
        }
        // Zadacha 9 //

        System.out.println("Задача 9");
        double summ = 29000;
        for (int i = 1; i < 13; i++) {

            summ = (summ * i) + (summ * 0.01);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summ + " рублей");
        }

        // Zadacha 10 //

        System.out.println("Задача 10");
        for (int i = 1; i < 11; i++) {
            System.out.println("2 * " + i + " = " + (2*i));
        }


    }
}