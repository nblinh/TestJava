import java.util.*;

public class ComputeDayGains {
    static int nbSeats = 3;
    static int[] payingGuests = {2, 4, 6, 8, 10};
    static int[] guestMovements = {0, 1, 2, 3, 3, 4, 0, 1, 2, 4};

    public static void main(String args[]) {
        System.out.println(computeDayGains3(nbSeats, payingGuests, guestMovements));
    }

    public static int computeDayGains3(int nbSeats, int[] payingGuests, int[] guestMovements) {
        Map<Integer, Integer> payedGuest = new HashMap<>();
        List<Integer> eatingGuest = new ArrayList<>();//guests seat present
        List<Integer> waitingGuest = new ArrayList<>();
        for (int i = 0; i < guestMovements.length; i++) {
            if (eatingGuest.contains(guestMovements[i])) {
                eatingGuest.remove(Integer.valueOf(guestMovements[i]));  //guest left
                if (waitingGuest.size() > 0) {          //guest in queue
                    int guest = waitingGuest.get(0);    //guest get out form queue
                    waitingGuest.remove(0);
                    eatingGuest.add(guest);             //guest eating
                    payedGuest.put(guest, payingGuests[guest]); //and pay
                }
            }else{
                if (eatingGuest.size() < nbSeats) {
                    eatingGuest.add(guestMovements[i]);//guest eating
                    payedGuest.put(guestMovements[i], payingGuests[guestMovements[i]]);//and pay
                }else{
                    //waiting guest left
                    if(waitingGuest.contains(guestMovements[i])){
                        waitingGuest.remove(Integer.valueOf(guestMovements[i]));
                    }else{
                        waitingGuest.add(guestMovements[i]);//wait in queue
                    }
                }
            }
        }
        return payedGuest.values().stream().reduce(0, Integer::sum);
    }

    public static int computeDayGains2(int nbSeats, int[] payingGuests, int[] guestMovements) {
        Map<Integer, Integer> payedGuest = new HashMap<>();
        List<Integer> eatingGuest = new ArrayList<>();//guests seat present
        List<Integer> waitingGuest = new ArrayList<>();
        for (int i = 0; i < guestMovements.length; i++) {
            if (eatingGuest.contains(guestMovements[i])) {
                eatingGuest.remove(guestMovements[i]);
            } else {
                if (eatingGuest.size() < nbSeats) {
                    eatingGuest.add(guestMovements[i]);
                    if (waitingGuest.size() > 0) {
                        int guest = waitingGuest.get(0);
                        waitingGuest.remove(0);
                        payedGuest.put(guest, payingGuests[guest]);
                    } else {
                        payedGuest.put(guestMovements[i], payingGuests[guestMovements[i]]);
                    }
                } else {
                    if(waitingGuest.contains(guestMovements[i])){
                        waitingGuest.remove(Integer.valueOf(guestMovements[i]));
                    }else{
                        waitingGuest.add(guestMovements[i]);
                    }
                }
            }

        }


        return payedGuest.values().stream().reduce(0, Integer::sum);

    }

}
