package classes.sharpieSet;

import java.util.ArrayList;
import java.util.List;
import classes.sharpie.Sharpie;

public class SharpieSet {

    List<Sharpie> sharpies;

    public SharpieSet() {
        this.sharpies = new ArrayList<>();
    }

    public int countUsable() {
        int counter = 0;
        for (Sharpie sharpie : this.sharpies) {
            if (sharpie.getInkAmount() != 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).getInkAmount() == 0) {
                sharpies.remove(i);
            }
        }
    }
}
