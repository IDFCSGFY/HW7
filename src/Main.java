public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("#1\n");
        int capital = 0, j = 0, monthly = 15000;
        while (capital < 2_459_000) {
            j++;
            capital += monthly;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + capital + " рублей");
        }

        //2
        System.out.println("\n#2\n");
        j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j += 1;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        //3
        System.out.println("\n\n#3\n");
        int YPopulation = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            int increase = YPopulation / 1000 * 17;
            int decrease = YPopulation / 1000 * 8;
            YPopulation = YPopulation + increase - decrease;
            System.out.println("Год " + i + ", численность населения составляет " + YPopulation);
        }

        //4
        System.out.println("\n#4\n");
        j = 0;
        capital = 0;
        float interest = 1.07f;
        while (capital < 12_000_000) {
            capital *= interest;
            capital += monthly;
            j++;
            System.out.println("Месяц " + j + ", накопления составляют " + capital + " рублей");
        }

        //5
        System.out.println("\n#5\n");
        j = 0;
        capital = 0;
        while (capital < 12000000) {
            capital *= interest;
            capital += monthly;
            j++;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ", накопления составляют " + capital + " рублей");
            }
        }

        //6
        System.out.println("\n#6\n");
        capital = 0;
        for (int i = 1; i <= 9 * 12; i++) {
            capital *= interest;
            capital += monthly;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", накопления составляют " + capital + " рублей");
            }
        }

        //7
        System.out.println("\n#7\n");
        int firstFridayDate = 2; //дата первой пятницы
        for (int i = firstFridayDate; i <= 31; i++) {
            if ((i - firstFridayDate) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }

        //8
        System.out.println("\n#8\n");
        for (int i = 79; i <= 2124; i += 79) {
            if (i >= 1824) {
                System.out.println(i);
            }
        }
    }
}
