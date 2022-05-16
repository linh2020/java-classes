public class MyClasses {

    // https://www.baeldung.com/java-generating-random-numbers-in-range
    // return (int) ((Math.random() * (max - min)) + min);
    public static String randomString(int numberOfCharacters) {
        String str = "";
        for (int i = 0; i < numberOfCharacters; i++) {
            str += (char) Math.round(Math.random() * (122 - 97) + 97);
        }
        return str;
    }

    public static void main(String[] args) {

    }
}
