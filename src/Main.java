
public class Main {
    public static void main(String[] args) {
        //Задача 1
        //переменная clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).
        // В зависимости переменная 1 или 0 будет выведено соответствующее сообщение

        int clienOS = 0;
        if (clienOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clienOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("           ");
        // Задача 2
        // так как мы не используем глобальные перенные обьявим clienOS1 для версии OS
        // Добавляется переменная clientDeviceYear по которой будет сравнение
        // если моб тел выпущен ранее 2015г то будет выведено об установке облегченной версии
        // если нет обычной в зависимости clienOS1 равен 1 или 0
        int clienOS1 = 1;
        int clientDeviceYear = 2015;
        if (clienOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (clienOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clienOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clienOS1== 0 && clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");}

        else {System.out.println("У вас другой  телефон");}
        System.out.println("         ");
        // Задача 3
        // переменная year обозначена в задаче как 2021г
        //Из условия я понял что отсчет високосного года начинаем с 1584г
        // проверяю остаток от деления на 4 и учитываю условие 400 и 100 лет
        int year = 2021;
         if ( year < 1584) {
             System.out.println("Отсчет високосного года не был введен");
         }else if(year % 4 ==0 && year % 100!=0 || year % 400==0 ) {
             System.out.println("год является високосным");
        }else { System.out.println(" год не является високосным");}
        System.out.println("         ");
        // Задача 4
        //Обьявляю целочисленную переменную deliveryDistance
        // И переменную время доставки deliveryTime.... String т.к. в условии об этом не сказанно
        int  deliveryDistance = 95;
        int  deliveryTimeShort =1 ;

        if (deliveryDistance<=20){
            System.out.println("Потребуется дней: "+deliveryTimeShort);
        } else if (deliveryDistance>=20 && deliveryDistance<=60) {
            deliveryTimeShort=deliveryTimeShort+1;
            System.out.println("Потребуется дней: "+deliveryTimeShort);
        } else if (deliveryDistance>=60 && deliveryDistance<=100) {
            deliveryTimeShort=deliveryTimeShort+2;
            System.out.println("Потребуется дней: "+deliveryTimeShort);

        }else
        {System.out.println("  нет доставки   ");}
        System.out.println("    ");

        // Задача 5
        // в условии сказанно расписать каждый месяц
        int monthNumber = 12;
        switch (monthNumber){
            case 1,2,12:
                System.out.println("Сезон зима");
                break;

            case 3,4,5:
                System.out.println("Сезон весна");
                break;


            case 6,7,8:
                System.out.println("Сезон лето");
                break;

            case 9,10,11:
                System.out.println("Сезон осень");
                break;

            default:
                System.out.println("Такого месяца не существует");

        }
    }


}


