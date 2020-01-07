import java.util.Scanner;

public class CaesarChiffre
{
    public String start(String text, int key, boolean wirdVerschluesselt) {
        text = text.toUpperCase().trim();
        
        // Verschlüsseln / Entschlüsseln
        String result = "";
        for(int i = 0; i < text.length(); i++)
            result += (char)(verschieb((text.charAt(i)) - 65, key, wirdVerschluesselt) + 65);
        
        return result;
    }
    
    private int verschieb(int letter, int shift, boolean wirdVerschluesselt) {
        return wirdVerschluesselt ? (letter + shift) % 26 : (letter - (shift - 26)) % 26;
    }
}
