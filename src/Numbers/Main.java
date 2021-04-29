package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> positivList = new ArrayList();
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for (int search : intList) {
            if (search > 0 && search % 2 == 0) {
                positivList.add(search);
            }
        }
        for (int i = positivList.size()-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (positivList.get(j) > positivList.get(j + 1)) {
                    int tmp = positivList.get(j);
                    positivList.set(j, positivList.get(j + 1));
                    positivList.set(j + 1, tmp);
                }
            }
        }
        System.out.println(positivList);
    }
}
