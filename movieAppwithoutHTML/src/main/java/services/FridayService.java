package services;

import java.time.LocalDate;

public class FridayService {

    public static boolean isItFriday() {
        LocalDate today = LocalDate.now();
        return today.getDayOfWeek().toString().equals("FRIDAY");
    }
}
