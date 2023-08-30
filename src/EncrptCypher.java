public class EncrptCypher {

    static String caesarCipher(String s, int k) {
        StringBuilder encryptedString = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char encryptedChar = (char) ('A' + (c - 'A' + k) % 26);
                encryptedString.append(encryptedChar);
            } else if (Character.isLowerCase(c)) {
                char encryptedChar = (char) ('a' + (c - 'a' + k) % 26);
                encryptedString.append(encryptedChar);
            } else {
                encryptedString.append(c); // Non-alphabet characters remain unchanged
            }
        }

        return encryptedString.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        String input = "Hello, World!";
        int rotationFactor = 3;
        String encryptedText = caesarCipher(input, rotationFactor);
        System.out.println(encryptedText); // Output: "Khoor, Zruog!"
    }
}
