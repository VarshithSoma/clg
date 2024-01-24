import java.util.Random;
public class PasswordGenerator {
    public static void main(String[] args) {
        int length = 12; // Default password length
        if (args.length > 0) {
            try {
                length = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid length argument. Using default length of 12.");
            }
        }
        String password = generatePassword(length);
        System.out.println("Generated password: " + password);
    }
    private static String generatePassword(int length) {
        // Character arrays for different character types
        char[] lowercase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] numbers = "0123456789".toCharArray();
        char[] symbols = "!@#$%^&*()_+-=[]{}|;':\",.<>/?".toCharArray();

        // Combine all character arrays
        char[] allChars = new char[lowercase.length + uppercase.length + numbers.length + symbols.length];
        System.arraycopy(lowercase, 0, allChars, 0, lowercase.length);
        System.arraycopy(uppercase, 0, allChars, lowercase.length, uppercase.length);
        System.arraycopy(numbers, 0, allChars, lowercase.length + uppercase.length, numbers.length);
        System.arraycopy(symbols, 0, allChars, lowercase.length + uppercase.length + numbers.length, symbols.length);

        // Create a random password using a random character from each character type
        StringBuilder passwordBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int charIndex = random.nextInt(allChars.length);
            passwordBuilder.append(allChars[charIndex]);
        }
        return passwordBuilder.toString();
    }
}
