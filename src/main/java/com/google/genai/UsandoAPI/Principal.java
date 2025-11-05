package com.google.genai.UsandoAPI;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import com.google.genai.types.GenerationConfig;
import org.apache.http.HttpException;
import com.google.genai.UsandoAPI.HistoricoPDF;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws HttpException, IOException {
        Scanner scan = new Scanner(System.in);
        String escolha = scan.nextLine();

<<<<<<< HEAD
        String caminhoExtrato = "C:/Users/Skillo-Danilo/Desktop/Extrato-01-10-2025-a-30-10-2025-PDF.pdf";
=======
        String caminhoExtrato = "C:/Users/Skillo-Danilo/Desktop/Extrato-01.pdf";
>>>>>>> 4d464b4 (Primeiro commit)
        String textoExtrato = LeitorPDF.lerTextoDoPDF(caminhoExtrato);

       String caminhoPrompts = "C:/Users/Skillo-Danilo/Desktop/historico_prompts.pdf";
       String textoPrompts = LeitorPDF.lerTextoDoPDF(caminhoPrompts);






        while (true) {

<<<<<<< HEAD
            escolha = scan.nextLine();
=======

>>>>>>> 4d464b4 (Primeiro commit)
            Client client = Client.builder().apiKey("AIzaSyDQwNQ3rC7lIylLeX4ir9ywErfnd_Q_UJk").build();

            GenerateContentResponse response =
                    client.models.generateContent(
                            "gemini-2.5-flash",
<<<<<<< HEAD
                               textoPrompts +escolha + textoExtrato,
                            null);
=======
                               textoPrompts+ "Ignore tudo antes dos dois pontos. Seja breve. Se não entender a pergunta," +
                                       " diga que não entendeu Leia o extrato abaixo, separe os gastos por categoria de forma " +
                                       "clara e fácil de entender. Se houver gastos que você não reconhece ou não sabe classificar, " +
                                       "pergunte ao cliente o que são. Depois, dê dicas práticas para o cliente economizar mais e controlar" +
                                       " os gastos. Pergunte se ele tem alguma meta de compra. Se tiver, pergunte o que é, quanto custa e " +
                                       "explique como ele pode alcançar essa meta com base nos dados. Por fim, diga que o dinheiro " +
                                       "economizado pode ser investido e dê uma explicação breve e simples sobre o que é investimento " +
                                       "e por que é importante.:" + escolha
                                         + textoExtrato,
                             null);
>>>>>>> 4d464b4 (Primeiro commit)

            System.out.println(response.text());
            String historico = "Prompt:\n" + escolha + "\n\nResposta:\n" + response.text() + "\n\n------------------------\n";
            HistoricoPDF.salvarPrompt(historico, caminhoPrompts);
        }
    }
}
