import java.util.Map;
import java.util.HashMap;

public class OOPSBannerAppUC8 {

    // Method to create character pattern map
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Method to print banner
    public static void printBanner(String word, Map<Character, String[]> map) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                line.append(map.get(c)[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        printBanner("OOPS", patternMap);
    }
}