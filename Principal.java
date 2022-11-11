/** GUSTAVO PARCIANELLO CARDONA */
public class Principal
{
    public static void main(String[] args)
    {   
        Abertura abertura = new Abertura(); /** SERVE PARA O TAMAGOTCHI ASCII INICIAL */
        TempoAcao tempo = new TempoAcao(); /** SERVE PARA OS PONTOS DE CARREGAMENTO DE AÇÕES */
        Morte morreu = new Morte(); /** SERVE PARA O RIP EM ASCII */
        Prosseguir prosseguirAcoes = new Prosseguir(); /** PERGUNTA AO USUÁRIO SE DESEJA PROSSEGUIR PARA AS AÇÕES AÇÕES */
        
        abertura.abertura();
        
        char intro = Teclado.leChar("Olá! Seja bem-vindo ou bem-vinda ao Tamagotchi!\nVocê deseja ter um amiguinho novo? (S/N)");
        
        while(true)
        {
            if (intro == 'S' || intro == 's')
                break;
            else if (intro == 'N' || intro == 'n')
            {
                TempoAcao.tempo();
                System.out.println("Que pena, gostaria tanto de te dar um novo companheiro!");
                System.exit(0);
            }   
            else
            {
                System.out.print("\u000C");
                TempoAcao.tempo();
                System.out.println("Não entendi, pode repetir por favor?");
                intro = Teclado.leChar("Você deseja ter um amiguinho novo? (S/N)");
            }
        }
        System.out.print("\u000C");
        TempoAcao.tempo();
        String nome = Teclado.leString("Que legal! Dê um nome ao seu novo amiguinho e parceiro Tamagotchi!\nNome do Tamagotchi: ");
        
        int idade = 0;
        int peso = 1;
        
        Tamagotchi tamagotchi = new Tamagotchi(nome, idade, peso);
        
        char dormir;
        char comer;
        char tedio;
        char comerCaminhada;
        
        int vezesAcordado = 0;
        
        while (true)
        {
            System.out.print("\u000C");
            TempoAcao.tempo();
            char info = Teclado.leChar("Deseja saber informações do seu Tamagotchi? (S/N)");
            System.out.print("\u000C");
        
            while(true)
            {
                if (info == 'S' || info == 's')
                {
                    System.out.print("\u000C");
                    TempoAcao.tempo();
                        if (idade == 0 && peso == 1)
                        {   
                            System.out.println("Aqui estão algumas informações de "+nome+"!");
                            System.out.println("\n-"+nome+" tem "+idade+" dias de idade!");
                            System.out.println("-"+nome+" está com "+peso+" quilo!\n");
                            break;
                        }
                        else if (idade == 0 && peso > 1)
                        {
                            System.out.println("Aqui estão algumas informações de "+nome+"!");
                            System.out.println("\n-"+nome+" tem "+idade+" dias de idade!");
                            System.out.println("-"+nome+" está com "+peso+" quilos!\n");
                            break;
                        }
                        else if (idade == 1 && peso == 1)
                        {   
                            System.out.println("Aqui estão algumas informações de "+nome+"!");
                            System.out.println("\n-"+nome+" tem "+idade+" dia de idade!");
                            System.out.println("-"+nome+" está com "+peso+" quilo!\n");
                            break;
                        }
                        else if(idade > 1 && peso > 1)
                        {
                            System.out.println("Aqui estão algumas informações de "+nome+"!");
                            System.out.println("\n-"+nome+" tem "+idade+" dias de idade!");
                            System.out.println("\n-"+nome+" está com "+peso+" quilos!\n");
                            break;
                        }
                        else if(idade > 1 && peso == 1)
                        {
                            System.out.println("Aqui estão algumas informações de "+nome+"!");
                            System.out.println("\n-"+nome+" tem "+idade+" dias de idade!");
                            System.out.println("\n-"+nome+" está com "+peso+" quilo!\n");
                            break;
                        }
                        else if(idade == 1 && peso > 1)
                        {
                            System.out.println("Aqui estão algumas informações de "+nome+"!");
                            System.out.println("\n-"+nome+" tem "+idade+" dia de idade!");
                            System.out.println("\n-"+nome+" está com "+peso+" quilos!\n");
                            break;
                    }
                }
                else if (info == 'N' || info == 'n')
                {
                    TempoAcao.tempo();
                    break;
                }
                else
                {
                    System.out.print("\u000C");
                    TempoAcao.tempo();
                    System.out.println("Não entendi, pode repetir por favor?");
                    info = Teclado.leChar("Deseja saber informações do seu Tamagotchi? (S/N)");
                }
            }
            
            prosseguirAcoes.prosseguirAcoes();
            
            int aleatorio = (int)(Math.random()*3); /** 3 NÚMEROS POSSÍVEIS: 0, 1, 2; */
            
            if(aleatorio == 0) /** 0 É SENTIR SONO */
            {
                while(true)
                {
                    System.out.print("\u000C");
                    TempoAcao.tempo();
                    dormir = Teclado.leChar(nome+" está com sono! Você tem duas opções:\n\n• A- Dormir (+1 dia de vida!)\n• B- Permanecer acordado (Máximo 5 vezes seguidas!)\n");  
                    if(dormir == 'A' || dormir == 'a' || dormir == 'B' || dormir == 'b')
                        break;
                    else
                    {
                        System.out.print("\u000C");
                        TempoAcao.tempo();
                        System.out.println("Não compreendi sua resposta, poderia tentar novamente?\n");
                    }
                    }
                
                if (dormir == 'A' || dormir == 'a')
                {
                    TempoAcao.tempo();
                    System.out.println(nome+" dormiu!");
                    try{
                        Thread.sleep(900);
                        }catch(Exception e){}
                    idade++;
                    vezesAcordado = 0;
                }
                else if (dormir == 'B' || dormir == 'b')
                {
                    if (vezesAcordado > 5)
                    {
                        TempoAcao.tempo();
                        System.out.println(nome+" está acordado fazem 5 dias! Ele precisa dormir.");
                        try{
                            Thread.sleep(900);
                            }catch(Exception e){}
                        TempoAcao.tempo();
                        System.out.println(nome+" dormiu!");
                        try{
                            Thread.sleep(900);
                            }catch(Exception e){}
                        idade++;
                        vezesAcordado = 0;
                    }
                    else
                    {
                        vezesAcordado++;
                        System.out.print("\u000C");
                        TempoAcao.tempo();
                        System.out.println("Você escolheu permanecer "+nome+" acordado!\n");
                        try{
                            Thread.sleep(900);
                            }catch(Exception e){}
                        System.out.print("\u000C");
                    }
                }
            }
            
            else if(aleatorio == 1) /** 1 É SENTIR FOME */
            {
                while(true)
                {
                    System.out.print("\u000C");
                    TempoAcao.tempo();
                    comer = Teclado.leChar(nome+" está com fome! Você tem três opções:\n\n• A- Comer pouco (+1 quilo.)\n• B- Comer muito (+5 quilos.)\n• C- Não comer (-2 quilos, passa fome!)\n");  
                    if(comer == 'A' || comer == 'a' || comer == 'B' || comer == 'b' || comer == 'C' || comer == 'c')
                        break;
                    else
                        System.out.println("Não compreendi sua resposta, poderia tentar novamente?\n");
                }
                if (comer == 'A' || comer == 'a')
                {
                    TempoAcao.tempo();
                    System.out.println(nome+" Comeu o ideal!");
                    try{
                        Thread.sleep(900);
                        }catch(Exception e){}
                    System.out.print("\u000C");
                    peso++;
                }
                else if (comer == 'B' || comer == 'b')
                {
                    TempoAcao.tempo();
                    System.out.println(nome+" se empanturrou de tanto comer! Ele deve dormir.");
                    try{
                        Thread.sleep(900);
                        }catch(Exception e){}
                    TempoAcao.tempo();
                    System.out.println(nome+" dormiu!");
                    try{
                        Thread.sleep(900);
                        }catch(Exception e){}
                    peso += 5;
                    idade++;
                    vezesAcordado = 0;
                }
                else if (comer == 'C' || comer == 'c')
                {
                    TempoAcao.tempo();
                    System.out.println(nome+" não comeu. Não vai ficar fortinho.\n");
                    try{
                        Thread.sleep(900);
                        }catch(Exception e){}
                    System.out.print("\u000C");
                    peso -= 2;
                }
            }
            else if(aleatorio == 2) /** 2 É SENTIR TÉDIO */
            {
                while(true)
                {
                    System.out.print("\u000C");
                    TempoAcao.tempo();
                    tedio = Teclado.leChar(nome+" está entediado! Você tem duas opções:\n\n• A- Correr por 10 minutos (-4 quilos e come muito!)\n• B- Caminhar por 10 minutos (-1 quilo e fica com fome.)\n");
                    if(tedio == 'A' || tedio == 'a' || tedio == 'B' || tedio == 'b')
                        break;
                    else
                        System.out.println("Não compreendi sua resposta, poderia tentar novamente?\n");
                }
                
                if(tedio == 'A' || tedio == 'a')
                {
                    peso -= 5;
                    if (peso <= 0)
                    {   
                        System.out.print("\u000C");
                        TempoAcao.tempo();
                        morreu.morreu();
                        System.out.println("Seu Tamagotchi morreu desnutrido após correr por 10 minutos. 💀");
                        System.exit(0);
                    }
                    System.out.print("\u000C");
                    TempoAcao.tempo();
                    System.out.println(nome+" correu muito e ficou esfomeado! Ele deve comer muito.");
                    try{
                        Thread.sleep(900);
                        }catch(Exception e){}
                    TempoAcao.tempo();
                    System.out.println(nome+" comeu muito e deve dormir.");
                    try{
                        Thread.sleep(900);
                        }catch(Exception e){}
                    TempoAcao.tempo();
                    System.out.println(nome+" dormiu.");
                    try{
                        Thread.sleep(900);
                        }catch(Exception e){}
                    peso += 5;
                    idade++;
                }
                else if (tedio == 'B' || tedio == 'b')
                {
                    peso--;
                    if (peso <= 0)
                    {   
                        System.out.print("\u000C");
                        TempoAcao.tempo();
                        morreu.morreu();
                        System.out.println("Seu Tamagotchi morreu desnutrido após caminhar por 10 minutos. 💀");
                        System.exit(0);
                    }
                    while(true)
                    {
                        System.out.print("\u000C"); 
                        TempoAcao.tempo();
                        comerCaminhada = Teclado.leChar(nome+" caminhou moderadamente e ficou com fome!\nVocê tem três opções:\n\n• A- Comer pouco (+1 quilo.)\n• B- Comer muito (+5 quilos e dorme!)\n• C- Não comer (-2 quilos.)\n");  
                        if(comerCaminhada == 'A' || comerCaminhada == 'a' || comerCaminhada == 'B' || comerCaminhada == 'b' || comerCaminhada == 'C' || comerCaminhada == 'c')
                            break;
                        else
                            System.out.println("Não compreendi sua resposta, poderia tentar novamente?\n");
                    }
                    if (comerCaminhada == 'A' || comerCaminhada == 'a')
                    {
                        System.out.print("\u000C");
                        TempoAcao.tempo();
                        System.out.println(nome+" Comeu o ideal para ele!");
                        try{
                        Thread.sleep(900);
                        }catch(Exception e){}
                        peso++;
                    }
                    else if (comerCaminhada == 'B' || comerCaminhada == 'b')
                    {
                        System.out.print("\u000C");
                        TempoAcao.tempo();
                        System.out.println(nome+" se empanturrou de tanto comer! Ele deve dormir.");
                        try{
                            Thread.sleep(900);
                            }catch(Exception e){}
                        TempoAcao.tempo();
                        System.out.println(nome+" dormiu!");
                        try{
                            Thread.sleep(900);
                            }catch(Exception e){}
                        peso += 5;
                        idade++;
                        vezesAcordado = 0;
                    }
                    else if (comerCaminhada == 'C' || comerCaminhada == 'c')
                    {
                        System.out.print("\u000C");
                        TempoAcao.tempo();
                        System.out.println(nome+" não comeu. Não vai ficar fortinho...\n");
                        try{
                            Thread.sleep(900);
                            }catch(Exception e){}
                        peso -= 2;
                    }
                }
            }

            if (idade >= 15)
            {
                System.out.print("\u000C");
                TempoAcao.tempo();
                morreu.morreu();
                System.out.println("Seu Tamagotchi morreu velho, com "+idade+" dias. 💀");
                break;
            }
            else if(peso <= 0)
            {
                System.out.print("\u000C");
                TempoAcao.tempo();
                morreu.morreu();
                System.out.println("Seu Tamagotchi morreu desnutrido, com 0 quilos. 💀");
                break;   
            }
            else if(peso > 20)
            {
                System.out.print("\u000C");
                TempoAcao.tempo();
                morreu.morreu();
                System.out.println("Seu Tamagotchi explodiu devido aos "+peso+" quilos. 💀");
                break;   
            }
        }
    }
}