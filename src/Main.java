public class Main
{

    public static void main(String[] args)
    {
        String nachname = "Eisenmann";
        int alter = 23;
        String vorname = "Julian";
        System.out.println("Hallo " + vorname " " + nachname + "! Du bist " + alter  + " Jahre alt");
        System.out.println(String.format("Hello %s %s! Du bist %d Jahre alt.", vorname, nachname, alter));
    }
}
