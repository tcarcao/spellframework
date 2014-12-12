package sell;

public interface ComponentSimilarityStrategy {
    public ComponentSimilarity[] calculateComponentsProbability(ComponentSample[][] matrix, int numberOfComponents, int numberOfTests, ComponentSample[] oracleVector
    );
}
