
import java.util.ArrayList;

public class MaPu {

    // toteuta apumetodit tänne
    public static double keskiarvo(ArrayList<Integer> luvut){
        int summa=0;
        for (int luku : luvut){
            summa=summa+luku;
        }
        if (luvut.isEmpty()){
            return 0.0;
        }
        else {
            return 1.0*summa/luvut.size();
        }
        
    }
}
