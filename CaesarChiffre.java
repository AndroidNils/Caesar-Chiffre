import java.util.Scanner;

public class CaesarChiffre
{
    public String start(String text, int key, boolean wirdVerschluesselt) {
        text = text.toUpperCase().trim();
        
        String result = "";
        for(int i = 0; i < text.length(); i++)
            result += (char)(verschieb((text.charAt(i)) - 65, key, wirdVerschluesselt) + 65);
        
        return result;
    }
    
    private int verschieb(int buchstabe, int key, boolean wirdVerschluesselt) {
        return wirdVerschluesselt ? (buchstabe + key) % 26 : (buchstabe - (key - 26)) % 26;
    }
}
