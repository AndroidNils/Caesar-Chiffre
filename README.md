# Cäsar-Chiffre

Für den Informatik-Unterricht in der Schule mit BlueJ die Cäsar-Chiffre in Java programmiert.

## Implementierung von Cäsar-Chiffre
```
public class CaesarChiffre
{
    public String start(String text, int key, boolean wirdVerschluesselt) {
        text = text.toUpperCase().trim();
        
        String result = "";
        for(int i = 0; i < text.length(); i++)
            result += (char)(verschieb((text.charAt(i)) - 65, key, wirdVerschluesselt) + 65);
        
        return result;
    }
    
    private int verschieb(int letter, int key, boolean wirdVerschluesselt) {
        return wirdVerschluesselt ? (letter + key) % 26 : (letter - (key - 26)) % 26;
    }
}
```
