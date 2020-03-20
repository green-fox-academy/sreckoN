package classes.dominos;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {

    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();

        for (int i = 0; i < dominoes.size() - 1; i++) {
            Domino current = dominoes.get(i);
            for (int j = 1 + i; j < dominoes.size(); j++) {
                Domino next = dominoes.get(j);
                if(current.getRightSide() == next.getLeftSide()) {
                    dominoes.remove(next);
                    dominoes.add(i + 1, next);
                    break;
                }
            }
        }
        System.out.println(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
