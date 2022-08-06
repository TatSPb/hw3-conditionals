public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task4my();
       task5my();
       task5();
    }

        public static void task1() {
            System.out.println("Задание-1");
            int clientOs = 1;

            if (clientOs ==0) {
                System.out.println("Установите версию приложения для iOs по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
                }
        }
        public static void task2() {
            System.out.println("Задание-2");
            int clientOs = 1;
            int clientDeviceYear = 2014;

            if (clientOs == 0) {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию для iOs по ссылке");
                } else {
                    System.out.println("Установите версию для iOs по ссылке");
                }
            } else {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию для Android по ссылке");
                } else {
                    System.out.println("Установите версию для Android по ссылке");
                }

            }
        }
        public static void task3() {
            System.out.println("Задание-3");
            int year = 2024;

            if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ) {
                System.out.println(year + " является високосным");
            } else {
                System.out.println(year + " не является високосным");
            }
        }
        public static void task4() {
            System.out.println("Задание-4-разбор");
            int deliveryDistance = 95;
            int deliveryDays = 1;

            if (deliveryDistance >20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryDays++;
            }
                System.out.println("Потребуется на доставку: " + deliveryDays);
        }
        public static void task4my() {
            System.out.println("Задание-4-мой вариант (добавлен случай, если дистанция больше 100 км)");
            int deliveryDistance = 95;
            int deliveryDays = 1;

            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryDays++;
            }
            System.out.println("Потребуется на доставку: " + deliveryDays);
            if (deliveryDistance > 100) {
                System.out.println("Для расчета срока доставки обратитесь к оператору ");
            }
        }
        public static void task5my() {
             System.out.println("Задание-5-мой вариант - названия месяцев");
             int monthNumber = 12;

             switch (monthNumber) {
                    case 1:
                        System.out.println("Январь");
                        break;
                    case 2:
                        System.out.println("Февраль");
                        break;
                    case 3:
                        System.out.println("Март");
                        break;
                    case 4:
                        System.out.println("Апрель");
                        break;
                    case 5:
                        System.out.println("Май");
                        break;
                    case 6:
                        System.out.println("Июнь");
                        break;
                    case 7:
                        System.out.println("Июль");
                        break;
                    case 8:
                        System.out.println("Август");
                        break;
                    case 9:
                        System.out.println("Сентябрь");
                        break;
                    case 10:
                        System.out.println("Октябрь");
                        break;
                    case 11:
                        System.out.println("Ноябрь");
                        break;
                    case 12:
                        System.out.println("Декабрь");
                        break;
                    default:
                        System.out.println("Такого месяца не существует");
                }
        }

        public static void task5() {
            System.out.println("Задание-5");
            int monthNumber = 5;

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Некорректный номер месяца " + monthNumber);
            }
        }




}
