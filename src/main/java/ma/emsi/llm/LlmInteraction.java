package ma.emsi.llm;

public record LlmInteraction(
        String reponseExtraite,
        String questionJson,
        String reponseJson
) {
}