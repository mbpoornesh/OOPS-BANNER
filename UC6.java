class UC6OOPSBannerApp {

    // Method to return pattern for letter O
    static String[] getO() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Method to return pattern for letter P
    static String[] getP() {
        return new String[] {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    // Method to return pattern for letter S
    static String[] getS() {
        return new String[] {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        // Get patterns using helper methods
        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        int height = o.length;

        // Loop to print banner line by line
        for (int i = 0; i < height; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}
