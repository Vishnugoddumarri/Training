package programs;

import org.testng.annotations.Test;

public class Char_Repeating {
    @Test
    public  void test(){

        repeatingChar();
    }

    static void repeatingChar() {
        char first[] = { '3','S','4','5','D','2','7'};
        char second[]={'2','D','S','7'};
        for (int i = 0; i <= first.length- 1; i++) {
            int count = 1;
            for (int j = 0; j <= second.length- 1; j++) {
                if (first[i] == second[j]) {
                    count++;
                }
            }
            System.out.println("No.of duplicates found for " + first[i] + " = " + count);
        }
    }
}
