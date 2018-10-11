public class Main
{

    public static void main(String[] args)
    {
        int alter = 23;
        String name = "Julian";
        System.out.println("Hello " + name + "! Du bist " + alter  + " Jahre alt");
        System.out.println(String.format("Hello %s! Du bist %d Jahre alt.", name, alter));
    }
}