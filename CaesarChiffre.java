import java.util.Scanner;

public class CaesarChiffre
{
    public void start(boolean encrypting) {
        System.out.println("Bitte gib den Text an, der verschlüsselt, bzw. entschlüsselt werden soll. Zulässig sind nur lateinische Buchstaben.");
        final String enteredText = new Scanner(System.in).next().toUpperCase().trim();

        System.out.println("Bitte gib die Verschiebung an. Zulässig sind nur Zahlen zwischen 0 & 26.");
        final int shifting = new Scanner(System.in).nextInt();

        // Verschlüsseln / Entschlüsseln
        String result = "";
        for(int i = 0; i < enteredText.length(); i++) {
            result += Character.toString((char)(shift(((int) enteredText.charAt(i)) - 65, shifting, encrypting) + 65));
        }
        
        System.out.println("inputText: " + enteredText + " und shift: " + shifting + " result: " + result);
    }
    
    private int shift(int letter, int shift, boolean encrypting) {
        return encrypting ? (letter + shift) % 26 : (letter - (shift - 26)) % 26;
    }
}
