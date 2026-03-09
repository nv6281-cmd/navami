import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    // Method to create character patterns
    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    // Method to display banner
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder row = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    row.append(pattern[i]).append("  ");
                }
            }

            System.out.println(row);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createCharacterPatterns();

        String message = "OOPS";

        displayBanner(message, patternMap);

        System.out.println("Program Exited Successfully");
    }
}