public class bb {
    public static void main(String[] args) {
        String str = "jdvxed 345678^!@@###";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                counter++;
            }
        }
        System.out.println("totalisalaphabetic  "+" +  " +counter);

    }
}