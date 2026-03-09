/**
 * OOPS Banner App - UC7
 * Demonstrates storing character patterns using an inner class.
 */

public class OOPSBannerAppUC7 {

    /**
     * Inner Static Class to store character and pattern
     */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a character
     */
    public static String[] getCharacterPattern(char ch, CharacterPattern[] patterns) {

        for (CharacterPattern cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CharacterPattern[] patterns = {

            new CharacterPattern('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }),

            new CharacterPattern('P', new String[]{
                    "**** ",
                    "*   *",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    ",
                    "*    "
            }),

            new CharacterPattern('S', new String[]{
                    " ****",
                    "*    ",
                    "*    ",
                    " *** ",
                    "    *",
                    "    *",
                    "**** "
            })
        };

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, patterns);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}