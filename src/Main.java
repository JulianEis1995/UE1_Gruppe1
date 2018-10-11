public class Main
{

    public static void main(String[] args)
    {
        String nachname = "Eisenmann";
        int alter = 23;
        String vorname = "Julian";
        int jahrgang = 2018;
        System.out.println("Hallo " + vorname + " " + nachname + "! Du bist " + alter  + " Jahre alt und kommst aus dem Jahrgang " + jahrgang + "!");
        System.out.println(String.format("Hello %s %s! Du bist %d Jahre alt und vom Jahrgang %d!", vorname, nachname, alter, jahrgang));
    }
}
