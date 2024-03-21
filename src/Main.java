import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        taskOnePrintInfoAboutYear(2012);
        taskTwoPrintVersionOfOs(1, 2021);
        int days = taskThreeCalculateDaysOfDelivery(95);
        if (days != -1) {
            System.out.println("Кол-во дней доставки " + days);
        } else {
            System.out.println("Доставки нет");
        }
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
            System.out.println("Установите обычную версию для IOS");
        } else if (os == 1 && currentYear == yearOfRelease) {
            System.out.println("Установите обычную версию для Android");
        } else if (os == 0 && yearOfRelease < currentYear) {
            System.out.println("Установите облегчённую версию для IOS");
        } else if (os == 1 && yearOfRelease < currentYear) {
            System.out.println("Установите облегчённую версию для Android");
        } else {
            System.out.println("Операционная система не подходит");
        }
    }

    static int taskThreeCalculateDaysOfDelivery (int deliveryDistance) {
        if (deliveryDistance < 0 || deliveryDistance > 100) {
            return - 1;
        }
        int days = 1;
        if (deliveryDistance >= 20) {
            days++;
        }
        if (deliveryDistance >= 60) {
            days++;
        }
        return days;
    }
}
