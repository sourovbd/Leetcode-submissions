import java.time.LocalDate;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);
        if (localDate1.isAfter(localDate2)) {
            return (int) (localDate1.toEpochDay() - localDate2.toEpochDay());
        } else {
            return (int) (localDate2.toEpochDay() - localDate1.toEpochDay());
        }
    }
}