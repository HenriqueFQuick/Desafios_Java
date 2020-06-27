import java.net.*;
import java.io.*;
import java.util.Scanner;

public class WebScraper {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        boolean again = true;
        boolean erro;
        String site;
        do{
            do{
                site = "";
                erro = false;
                System.out.print("Digite uma url de um produto da STEAM: ");
                String siteInput = read.nextLine();
                //tentativa de ler a pagina e colcoar seu conteudo em uma variavel ( site )
                try{
                    URL url = new URL(siteInput);
                    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

                    String inputLine;
                    while ((inputLine = in.readLine()) != null)
                        site+=inputLine;
                    in.close();
                }catch (Exception e){
                    //caso ocorra erro, mostre o erro e faca a pergunta novamente.
                    System.out.println("Ocorreu um erro!\nDescricao: " + e.toString());
                    erro = true;
                }
            }while(erro);

            site.trim();

            //Leitura do nome do Jogo
            int gameTitleInitialIndex = site.indexOf("<title>");
            int gameTitleFinalIndex = site.indexOf("</title>");
            String gameTitle = site.substring(gameTitleInitialIndex+7, gameTitleFinalIndex-9);
            System.out.println("\nNome do jogo: "+gameTitle);

            //Leitura do nome do desenvolvedor do jogo (empresa)
            int developerIndex = site.indexOf("Developer:");
            int developerInitialIndex = site.indexOf("<a ", developerIndex);
            int developerFinalIndex = site.indexOf("</a>", developerIndex);

            String developer = site.substring(developerInitialIndex+73, developerFinalIndex);
            System.out.println("Desenvolvedores: "+developer);

            //leitura dos campos de requisitos minimos para rodar o jogo
            //OS, Processor, Memory, DirectX, Network, Storage
            int requisitosIndex = site.indexOf("sysreq_contents");
            int requisitosInitialIndex = site.indexOf("Minimum", requisitosIndex);
            int requisitosFinalIndex = site.indexOf("<div class=\"game_area_sys_req_rightCol\">", requisitosIndex);
            
            String requisitos = site.substring(requisitosInitialIndex, requisitosFinalIndex);

            int minimumOSInitial = requisitos.indexOf("OS:</strong>");
            int minimumOSFinal = requisitos.indexOf("<br>", minimumOSInitial);
            String minimumOS = requisitos.substring(minimumOSInitial+12, minimumOSFinal);

            int minimumProcessorInitial =  requisitos.indexOf("Processor:</strong>");
            int minimumProcessorFinal = requisitos.indexOf("<br>", minimumProcessorInitial);
            String minimumProcessor = requisitos.substring(minimumProcessorInitial+20, minimumProcessorFinal);

            int minimumMemoryInitial =  requisitos.indexOf("Memory:</strong>");
            int minimumMemoryFinal = requisitos.indexOf("<br>", minimumMemoryInitial);
            String minimumMemory = requisitos.substring(minimumMemoryInitial+17, minimumMemoryFinal);

            int minimumDirectXInitial =  requisitos.indexOf("DirectX:</strong>");
            int minimumDirectXFinal = requisitos.indexOf("<br>", minimumDirectXInitial);
            String minimumDirectX = requisitos.substring(minimumDirectXInitial+18, minimumDirectXFinal);

            int minimumNetworkInitial =  requisitos.indexOf("Network:</strong>");
            int minimumNetworkFinal = requisitos.indexOf("<br>", minimumNetworkInitial);
            String minimumNetwork = requisitos.substring(minimumNetworkInitial+18, minimumNetworkFinal);

            int minimumStorageInitial =  requisitos.indexOf("Storage:</strong>");
            int minimumStorageFinal = requisitos.indexOf("</li>", minimumStorageInitial);
            String minimumStorage = requisitos.substring(minimumStorageInitial+18, minimumStorageFinal);


            System.out.println("\nRequisitos minimos:");
            System.out.println("OS: "+minimumOS);
            System.out.println("Processador: "+minimumProcessor);
            System.out.println("Memoria: "+minimumMemory);
            System.out.println("DirectX: "+minimumDirectX);
            System.out.println("Rede: "+minimumNetwork);
            System.out.println("Armazenamento: "+minimumStorage);

            System.out.print("\nDeseja procurar outro jogo? (S/N) ");
            String resposta = read.nextLine();
            again = (resposta.trim().toUpperCase().equals("S")) ? true : false;
            
        }while(again);
    }
}