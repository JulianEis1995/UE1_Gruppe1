public class Main
{

    public static void main(String[] args)
    {
        String nachname = "Eisenmann";
        int alter = 23;
        String vorname = "Julian";
        int jahrgang = 2018;
        String herkunft = "Söll";
        System.out.println("Hallo " + vorname + " " + nachname + " aus " + herkunft + "! Du bist " + alter  + " Jahre alt und kommst aus dem Jahrgang " + jahrgang + "!");
        System.out.println(String.format("Hello %s %s aus %s! Du bist %d Jahre alt und vom Jahrgang %d!", vorname, nachname, herkunft, alter, jahrgang));
    }
}
