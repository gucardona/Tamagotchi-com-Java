/** GUSTAVO PARCIANELLO CARDONA */
public class TempoAcao /** SERVE PARA OS PONTOS DE CARREGAMENTO DE AÇÕES */
{
    public static void tempo()
    {
        for(int i = 0; i <= 3; i++)
        {  
            try{
                Thread.sleep(100);
                }catch(Exception e){}
                
            if (i == 0)
            {
                System.out.print("\u000C");
                System.out.println(".");
            }   
            else if(i == 1)
            {
                System.out.print("\u000C");
                System.out.println(" .");
            }
            else if(i == 2)
            {
                System.out.print("\u000C");
                System.out.println("  .");
            }
            else if(i == 3)
            {
                System.out.print("\u000C");
                System.out.println("...");
            }
        }
    }
}