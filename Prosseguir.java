/** GUSTAVO PARCIANELLO CARDONA */
public class Prosseguir
{
    public void prosseguirAcoes() /** PERGUNTA AO USUÁRIO SE DESEJA PROSSEGUIR COM AS AÇÕES */
    {
        char continuar = Teclado.leChar("Deseja prosseguir para as ações? (S/N)");
        while (true)
        {
            if (continuar == 'S' || continuar == 's')
            {
                System.out.print("\u000C");
                break;
            }
            else if (continuar == 'N' || continuar == 'n')
            {
                System.out.print("\u000C");
                TempoAcao.tempo();
                System.out.println("Ok. Fico triste! Finalizando.");
                try{
                    Thread.sleep(900);
                    }catch(Exception e){}
                TempoAcao.tempo();
                System.out.println("Finalizado.");
                System.exit(0);
            }
            else
            {
                System.out.print("\u000C"); 
                TempoAcao.tempo();
                System.out.println("Não entendi, pode repetir por favor?");
                continuar = Teclado.leChar("Deseja prosseguir? (S/N)");
            }
        }
    }
}