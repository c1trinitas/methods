import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        taskOnePrintInfoAboutYear(2012);
        taskTwoPrintVersionOfOs(1, 2021);
        taskThreeCalculateDaysOfDelivery(95 , 1);
    }

    static void taskOnePrintInfoAboutYear (int year) {
        if (leapYear (year)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }
    static boolean leapYear (int year) {
        return year % 4 == 0 && year / 100 != 0 || year / 400 == 0;
    }

    static void taskTwoPrintVersionOfOs (int os, int yearOfRelease) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && yearOfRelease == currentYear) {
            System.out.println("Установите версию для IOS");
        } else if (os == 1 && currentYear == yearOfRelease) {
            System.out.println("Установите версию для Android");
        } else if (os == 0 && yearOfRelease < currentYear) {
            System.out.println("Установите облегчённую версию для IOS");
        } else if (os == 1 && yearOfRelease < currentYear) {
            System.out.println("Установите облегчённую версию для Android");
        } else {
            System.out.println("Операционная система не подходит");
        }
    }

    static void taskThreeCalculateDaysOfDelivery (int deliveryDistance, int days) {
        if (deliveryDistance < 0 || deliveryDistance > 100) {
            days = days - 1;
            System.out.println("Доставки нет");
        } else if (deliveryDistance == 20) {
            System.out.println("Доставка займёт " + days + " сутки");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            days = days + 1;
            System.out.println("Доставка займёт " + days + " сутки");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            days = days + days + days;
            System.out.println("Доставка займёт " + days + " сутки");
        }

    }
}
