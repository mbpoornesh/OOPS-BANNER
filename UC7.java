public class UC7CharacterPatternMap {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Pattern for O
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Create objects for each character
        CharacterPatternMap[] letters = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        // Print banner line by line
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap letter : letters) {
                line.append(letter.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}
