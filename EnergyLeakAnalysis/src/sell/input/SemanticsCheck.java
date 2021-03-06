package sell.input;

import java.util.ArrayList;
import java.util.Iterator;
import sell.ComponentSample;

public class SemanticsCheck {
    public static void checkSemantics(DataRetrieved data) {
        //number of all columns ok?
        //number of components columns ok?
        
        ArrayList<DataLineRetrieved> dataMatrix = data.getDataMatrix();
        
        checkMatrix(dataMatrix);
        checkTotalColumn(dataMatrix);
        checkErrorColumn(dataMatrix);
    }
    
    public static void checkMatrix(ArrayList<DataLineRetrieved> dataMatrix) {
        boolean constrainProblem = false;
        int columns = 0;
        int line = 0;
        for (Iterator<DataLineRetrieved> iterator = dataMatrix.iterator(); iterator.hasNext() && !constrainProblem;) {
            DataLineRetrieved dataVector = iterator.next();
            ArrayList<ComponentSample> vector = dataVector.getVectorArrayList();
            
            int actualLineNumberOfColumns = vector.size();
            
            if (line == 0)
                columns = actualLineNumberOfColumns;
            
            if (columns != actualLineNumberOfColumns) {
                constrainProblem = true;
            }
            
            line++;
        }
        
        if (constrainProblem)
            throw new RuntimeException("Inconsistent size of columns in the components matrix");
    }

    private static void checkTotalColumn(ArrayList<DataLineRetrieved> dataMatrix) {
        boolean constrainProblem = false;
        boolean hasTotalColumn = false;
        int line = 0;
        for (Iterator<DataLineRetrieved> iterator = dataMatrix.iterator(); iterator.hasNext() && !constrainProblem;) {
            DataLineRetrieved dataVector = iterator.next();
            
            if (line == 0) {
                hasTotalColumn = dataVector.hasTotal();
            }
            
            if (hasTotalColumn != dataVector.hasTotal()) {
               constrainProblem = true;
            }
            
            line++;
        }
        
        if (constrainProblem)
            throw new RuntimeException("Not all tests have the total defined");
    }
    
    private static void checkErrorColumn(ArrayList<DataLineRetrieved> dataMatrix) {
        boolean constrainProblem = false;
        boolean hasErrorColumn = false;
        int line = 0;
        for (Iterator<DataLineRetrieved> iterator = dataMatrix.iterator(); iterator.hasNext() && !constrainProblem;) {
            DataLineRetrieved dataVector = iterator.next();
            
            if (line == 0) {
                hasErrorColumn = dataVector.hasError();
            }
            
            if (hasErrorColumn != dataVector.hasError()) {
               constrainProblem = true;
            }
            
            line++;
        }
        
        if (constrainProblem)
            throw new RuntimeException("Not all tests have the error output defined");
    }
}
