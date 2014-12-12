package sell;

public class SELLAnalysis {
    private int numberOfComponents;
    private int numberOfTests;
    private ComponentSample[][] matrix;
    private ComponentSample[] oracleVector;
    private ComponentSimilarity[] similarityComponentVector;
    private ComponentSimilarityStrategy componentSimilarityStrategy;
    private OracleVectorConstructionStrategy oracleVectorConstructionStrategy;
    private TotalValueComponent totalValueComponentSimilarity;
    private double[] totalValueComponentsSimilarityVector;
    
    private SELLAnalysis() {}
    
    public SELLAnalysis(ComponentSimilarityStrategy componentSimilarityStrategy, OracleVectorConstructionStrategy oracleVectorConstructionStrategy, TotalValueComponent totalValueComponentSimilarity) {
        this.componentSimilarityStrategy = componentSimilarityStrategy;
        this.oracleVectorConstructionStrategy = oracleVectorConstructionStrategy;
        this.totalValueComponentSimilarity = totalValueComponentSimilarity;
    }

    public int getNumberOfComponents() {
        return numberOfComponents;
    }

    public int getNumberOfTests() {
        return numberOfTests;
    }

    public ComponentSample[][] getMatrix() {
        return matrix;
    }

    public ComponentSample[] getOracleVector() {
        return oracleVector;
    }

    public ComponentSimilarity[] getSimilarityComponentVector() {
        return similarityComponentVector;
    }

    public ComponentSimilarityStrategy getComponentSimilarityStrategy() {
        return componentSimilarityStrategy;
    }

    public OracleVectorConstructionStrategy getOracleVectorConstructionStrategy() {
        return oracleVectorConstructionStrategy;
    }

    public TotalValueComponent getTotalValueComponentSimilarity() {
        return totalValueComponentSimilarity;
    }

    public double[] getTotalValueComponentsSimilarityVector() {
        return totalValueComponentsSimilarityVector;
    }

    public void setNumberOfComponents(int numberOfComponents) {
        this.numberOfComponents = numberOfComponents;
    }

    public void setNumberOfTests(int numberOfTests) {
        this.numberOfTests = numberOfTests;
    }

    public void setMatrix(ComponentSample[][] matrix) {
        this.matrix = matrix;
    }

    public void setOracleVector(ComponentSample[] oracleVector) {
        this.oracleVector = oracleVector;
    }

    public void setSimilarityComponentVector(ComponentSimilarity[] similarityComponentVector) {
        this.similarityComponentVector = similarityComponentVector;
    }

    public void setComponentSimilarityStrategy(ComponentSimilarityStrategy componentSimilarityStrategy) {
        this.componentSimilarityStrategy = componentSimilarityStrategy;
    }

    public void setOracleVectorConstructionStrategy(OracleVectorConstructionStrategy oracleVectorConstructionStrategy) {
        this.oracleVectorConstructionStrategy = oracleVectorConstructionStrategy;
    }

    public void setTotalValueComponentSimilarity(TotalValueComponent totalValueComponentSimilarity) {
        this.totalValueComponentSimilarity = totalValueComponentSimilarity;
    }

    public void setTotalValueComponentsSimilarityVector(double[] totalValueComponentsSimilarityVector) {
        this.totalValueComponentsSimilarityVector = totalValueComponentsSimilarityVector;
    }
    
    public void calculateComponentsSimilarity() {
        similarityComponentVector = componentSimilarityStrategy.calculateComponentsProbability(matrix, numberOfComponents, numberOfTests, oracleVector);
    }
    
    public void constructOracleVector() {
        oracleVector = oracleVectorConstructionStrategy.constructOracleVector(matrix, numberOfComponents, numberOfTests);
    }
    
    public void calculateTotalValueComponentsSimilarity(SimilarityFormula similarityFormula) {
        totalValueComponentsSimilarityVector = totalValueComponentSimilarity.calculateTotalValueComponentsSimilarity(matrix, numberOfComponents, numberOfTests, oracleVector, similarityFormula);
    }
}
