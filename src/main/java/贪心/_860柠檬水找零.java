package 贪心;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _860柠檬水找零 {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer,Integer> change = new HashMap<>();
        if (bills[0] != 5) {
            return false;
        }else {
            change.put(5,1);
            change.put(10,0);
        }


        for (int i = 1; i < bills.length; i++) {
            if(bills[i] == 5) {
                change.put(5,change.get(5)+1);
            }
            if (bills[i] == 10) {
                int five = change.get(5);
                if ( five > 0) {
                    change.put(5,change.get(5)-1);
                    change.put(10,change.get(10)+1);
                }
                else {
                    return false;
                }
            }
            if (bills[i] == 20 ) {
                int five = change.get(5);
                int ten = change.get(10);
                if ( five == 0) {
                    return false;
                }

                if (ten > 0 ) {
                    change.put(5,change.get(5)-1);
                    change.put(10,change.get(10)-1);
                } else if (five >= 3) {
                    change.put(5,change.get(5)-3);
                } else {
                    return false;
                }

            }
        }
        return true;
    }
}
