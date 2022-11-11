/** GUSTAVO PARCIANELLO CARDONA */
public class Abertura /** SERVE PARA O TAMAGOTCHI ASCII INICIAL */
{
    public static void abertura()
    {
        for(int i = 0; i < 5; i++)
        {
            try{
                Thread.sleep(600);
                }catch(Exception e){}
                
            if(i == 0)
            {
                System.out.println("Carregando…\n█▒▒▒▒▒▒▒▒▒");
            }
            else if(i == 1)
            {
                System.out.print("\u000C"); 
                System.out.println("19%\n███▒▒▒▒▒▒▒");
            }
            else if(i == 2)
            {
                System.out.print("\u000C"); 
                System.out.println("35%\n█████▒▒▒▒▒");
            }
            else if(i == 3)
            {
                System.out.print("\u000C"); 
                System.out.println("68%\n███████▒▒▒");
            }
            else if(i == 4)
            {
                System.out.print("\u000C"); 
                System.out.println("100%\n██████████");
            }
        }
        System.out.print("\u000C");
        System.out.println(" _____                                  _       _     _ ");
        System.out.println("/__   \\__ _ _ __ ___   __ _  __ _  ___ | |_ ___| |__ (_)");
        System.out.println("  / /\\/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\| __/ __| '_ \\| |");
        System.out.println(" / / | (_| | | | | | | (_| | (_| | (_) | || (__| | | | |");
        System.out.println(" \\/   \\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \\__\\___|_| |_|_|");
        System.out.println("                            |___/                       ");
        System.out.println();
    }
}