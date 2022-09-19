import java.time.LocalDate;
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        LocalDate aliceArriveDate = LocalDate.of(2022,Integer.parseInt(arriveAlice.substring(0,2)), Integer.parseInt(arriveAlice.substring(3,5)));
        LocalDate aliceLeaveDate = LocalDate.of(2022,Integer.parseInt(leaveAlice.substring(0,2)), Integer.parseInt(leaveAlice.substring(3,5)));
        LocalDate bobArriveDate = LocalDate.of(2022,Integer.parseInt(arriveBob.substring(0,2)), Integer.parseInt(arriveBob.substring(3,5)));
        LocalDate bobLeaveDate = LocalDate.of(2022,Integer.parseInt(leaveBob.substring(0,2)), Integer.parseInt(leaveBob.substring(3,5)));

        if((aliceLeaveDate.isBefore(bobArriveDate)) || (bobLeaveDate.isBefore(aliceArriveDate))) return 0;
        return ((Math.min(aliceLeaveDate.getDayOfYear(), bobLeaveDate.getDayOfYear())) -(Math.max(aliceArriveDate.getDayOfYear(), bobArriveDate.getDayOfYear())) +1);

    }
}