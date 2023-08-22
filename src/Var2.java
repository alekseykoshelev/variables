public class Var2 {
    public static void main(String[] args) {

        /*
        Задача 1qqq
        Объявите переменные типа int, byte, short, long, float, double.

        Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.

        Выведите в консоль значение каждой переменной в формате «».
         */

        int i = 5;
        byte b = 1;
        short s = 16;
        long l = 14555L;
        float f = 16.5f;
        double d = 19.1;

        System.out.println("Значение переменной int с типом равно " + i);
        System.out.println("Значение переменной byte с типом равно " + b);
        System.out.println("Значение переменной short с типом равно " + s);
        System.out.println("Значение переменной long с типом равно " + l);
        System.out.println("Значение переменной float с типом равно " + f);
        System.out.println("Значение переменной double с типом равно " + d);
        System.out.println();

        /*
        Задача 2
        Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.

        Значения:

        27.12
        987 678 965 549
        2,786
        569
        -159
        27897
        67
         */

        float f1 = 27.12f;
        long l1 = 987_678_965_549L;
        double d1 = 2.786;
        int i1 = 569;
        short s1 = -159;
        short s2 = 27897;
        byte b1 = 67;

        /*
        Задача 3
        Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.

        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.

        Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.

        Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».

        Для объявления переменных не используйте тип var.

         */
        int luda = 23;
        int anna = 27;
        int kate = 30;
        int totalCount = anna + luda + kate;
        int paperCount = 480;
        int paperPerChild = paperCount / totalCount;
        System.out.println("На каждого ученика рассчитано " + paperPerChild + " листов бумаги");
        System.out.println();


        /*
        Задача 4
        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:

        - за 20 минут,
        - в сутки,
        - за 3 дня,
        - за 1 месяц?
        Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.

        Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».

        Для объявления переменных не используйте тип var.
         */

        int performancePerMin = 16 / 2;
        int performancePer20Min = 20 * performancePerMin;
        int performancePerDay = 24 * 60 * performancePerMin;
        int performancePer3Days = 3 * 24 * 60 * performancePerMin;
        int performancePerMonth = 30 * 24 * 60 * performancePerMin;
        System.out.println("За 20 минут машина произвела " + performancePer20Min + " штук бутылок");
        System.out.println("За 1 день машина произвела " + performancePerDay + "штук бутылок");
        System.out.println("За 3 дня машина произвела " + performancePer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + performancePerMonth + " штук бутылок");
        System.out.println();

        /*
        Задача 5
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2
        банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?

        Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».

        Для объявления переменных не используйте тип var.
         */

        int jarCount = 120;
        int whiteCountPerClass = 2;
        int brownCountPerClass = 4;
        int classCount = jarCount / (whiteCountPerClass + brownCountPerClass);
        int totalWhiteCount = whiteCountPerClass * classCount;
        int totalBrownCount = brownCountPerClass * classCount;
        System.out.println("В школе, где " + classCount + " классов, нужно " + totalWhiteCount + " банок белой краски и " + totalBrownCount + " банок коричневой краски");
        System.out.println();

        /*
        Задача 6
        Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.

        Вот один из рецептов, по которому спортсмен готовит себе завтрак:

        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Смешать всё в блендере — и готово.

        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.

        Результат в граммах и килограммах напечатайте в консоль.
         */

        int bananaCount = 5;
        int bananaGramsPerOne = 80;
        int milkMl = 200;
        double totalMilkGrams = milkMl * 1.05;
        int iceCreamCount = 2;
        int iceCreamGramsPerOne = 100;
        int eggCount = 4;
        int eggGramsPerOne = 70;

        int totalBananaGrams = bananaCount * bananaGramsPerOne;
        int totalIceCreamGrams = iceCreamCount * iceCreamGramsPerOne;
        int totalEggGrams = eggCount * eggGramsPerOne;

        double totalGrams = totalBananaGrams + totalIceCreamGrams + totalEggGrams + totalMilkGrams;
        double totalKg = (totalGrams) / 1000;
        System.out.println(totalGrams + " гр.");
        System.out.println(totalKg + " кг.");
        System.out.println();



        /*
        Задача 7
        Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории,
        нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе
        от 250 до 500 грамм в день.

        Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
        а сколько — если каждый день будет худеть на 500 грамм.

        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.

        Результаты всех подсчетов выведите в консоль.
         */

        int weight = 7 * 1000;
        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;
        int maximumDays = weight / minGramsPerDay;
        int minimumDays = weight / maxGramsPerDay;
        double averageDays = (maximumDays + minimumDays) / 2d;
        System.out.println(maximumDays);
        System.out.println(minimumDays);
        System.out.println(averageDays);
        System.out.println();




        /*
        Задача 8
        Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        Каждый год повышение составляет 10% от текущей зарплаты.

        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:

        Маша получает 67 760 рублей в месяц.
        Денис получает 83 690 рублей в месяц.
        Кристина получает 76 230 рублей в месяц.
        Каждому нужно увеличить зарплату на 10% от текущей месячной.
        Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.

        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.

        Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».

         */

        int mariaSalary = 67760;
        int denisSalary = 83_690;
        int krisSalary = 76_230;

        float mariaIncreasedStartSalary = mariaSalary * 1.1f;
        float denisIncreasedStartSalary = denisSalary * 1.1f;
        float krisIncreasedStartSalary = krisSalary * 1.1f;

        int yearMariaStartSalary = mariaSalary * 12;
        int yearDenisStartSalary = denisSalary * 12;
        int yearKrisStartSalary = krisSalary * 12;

        float yearMariaStartSalaryAfterIncrease = mariaIncreasedStartSalary * 12f;
        float yearDenisStartSalaryAfterIncrease = denisIncreasedStartSalary * 12f;
        float yearKrisStartSalaryAfterIncrease = krisIncreasedStartSalary * 12f;

        System.out.println("Маша теперь получает " + mariaIncreasedStartSalary + " рублей. Годовой доход вырос на "
                           + (yearMariaStartSalaryAfterIncrease - yearMariaStartSalary) + " рублей");
        System.out.println("Денис теперь получает " + yearDenisStartSalary + " рублей. Годовой доход вырос на "
                           + (yearDenisStartSalaryAfterIncrease - yearDenisStartSalary) + " рублей");
        System.out.println("Кристина теперь получает " + yearKrisStartSalary + " рублей. Годовой доход вырос на "
                           + (yearKrisStartSalaryAfterIncrease - yearKrisStartSalary) + " рублей");


    }
}
