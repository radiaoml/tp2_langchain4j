package ma.emsi.radia;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String cle = System.getenv("GEMINI_API_KEY");

        ChatModel model = GoogleAiGeminiChatModel
                .builder()
                .apiKey(cle)
                .modelName("gemini-2.5-flash")
                .temperature(0.7)
                .build();

        // La question de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir votre qst: ");
        String question = scanner.nextLine();

        // Envoi de la question au modèle
        String reponse = model.chat(question);

        // Affichage de la réponse du modèle
        System.out.println("=====================================================");
        System.out.println("Réponse du modèle : " + reponse);
        System.out.println("=====================================================");

    }
}