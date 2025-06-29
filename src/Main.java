public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача 1");
        System.out.println();

        int savings = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + savings;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        int b = 11;
        while (b > 1) {
            b--;
            System.out.print(b + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        int population = 12_000_000;
        int birthRate = (17 * 1000);
        int deathRate = (8 * 1000);
        int year = 0;
        while (year < 10) {
            population = population + (birthRate - deathRate);
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population + ".");
        }

        System.out.println();
        System.out.println("Задача 4");
        System.out.println();

        int contribution = 15_000;
        int totalContribution = 12_000_000;
        float profit = 0.07f;
        int month1 = 0;
        while (contribution < totalContribution) {
            contribution += contribution * profit;
            month1++;
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + contribution + " рублей");
        }

        System.out.println();
        System.out.println("Задача 5");
        System.out.println();

        int contribution1 = 15_000;
        int totalContribution1 = 12_000_000;
        float profit1 = 0.07f;
        int month2 = 0;
        while (contribution1 < totalContribution1) {
            contribution1 += contribution1 * profit1;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + contribution1 + " рублей");
            }
        }

        System.out.println();
        System.out.println("Задача 6");
        System.out.println();

        int contribution2 = 15_000;
        int totalContribution2 = 12_000_000;
        float profit2 = 0.07f;
        int month3 = 0;
        int totalMonth = 12 * 9;
        while (contribution2 < totalContribution2 && month3 <= totalMonth) {
            contribution2 += contribution2 * profit2;
            month3++;
            totalMonth++;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + contribution2 + " рублей");
            }
        }

        System.out.println();
        System.out.println("Задача 7");
        System.out.println();

        int friday = 6;
         while(friday <= 31) {
             friday += 7;
             System.out.println("Сегодня пятница, " + friday + " число, необходимо подготовить отчет!");
        }

        System.out.println();
        System.out.println("Задача 8");
        System.out.println();

        int currentYear = 2025;
        int previousYear = currentYear - 200;
        int futureYear = currentYear + 100;
        for (int i = previousYear; i <= futureYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
