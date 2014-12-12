package sell;

public interface TotalValueComponent {
    public double[] calculateTotalValueComponentsSimilarity(ComponentSample[][] matrix, int numberOfComponents, int numberOfTests, ComponentSample[] oracleVector, SimilarityFormula similarityFormula);
}
