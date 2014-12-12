package sell.input;

import java.util.ArrayList;
import java.util.Iterator;
import sell.ComponentSample;

public class DataRetrieved {
    private ArrayList<DataLineRetrieved> dataMatrix;
    private ComponentSample[][] matrix;
    private ComponentSample[] totalVector;
    private ComponentSample[] errorVector;
    private Boolean hasTotalVector;
    private Boolean hasErrorVector;
    private boolean dataExtracted;
    
    public DataRetrieved() {
        dataMatrix = new ArrayList<DataLineRetrieved>();
        dataExtracted = false;
        hasTotalVector = null;
        hasErrorVector = null;
    }

    public DataRetrieved(ArrayList<DataLineRetrieved> dataMatrix) {
        this.dataMatrix = dataMatrix;
        extractDataRetrieved();
        hasTotalVector = null;
        hasErrorVector = null;
    }

    public ArrayList<DataLineRetrieved> getDataMatrix() {
        return dataMatrix;
    }
    
    public ComponentSample[][] getComponentsMatrix() {
        if (!dataExtracted) extractDataRetrieved();
        return matrix;
    }
    
    public ComponentSample[] getTotalComponentsVector() {
        if (!dataExtracted) extractDataRetrieved();
        return totalVector;
    }
    
    public ComponentSample[] getErrorVector() {
        if (!dataExtracted) extractDataRetrieved();
        return errorVector;
    }
    
    public void addVector(DataLineRetrieved vector) {
        dataMatrix.add(vector);
    }
    
    public boolean hasTotalVector() {
        if (hasTotalVector == null) {
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

            if (!constrainProblem) {
                hasTotalVector = hasTotalColumn;
                return hasTotalColumn;
            }
            else {
                hasTotalVector = false;
                return hasTotalVector;
            }
        }
        else {
            return hasTotalVector;
        }
    }
    
    public boolean hasErrorVector() {
        if (hasErrorVector == null) {
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

            if (!constrainProblem) {
                hasErrorVector = hasErrorColumn;
                return hasErrorVector;
            }
            else {
                hasErrorVector = false;
                return hasErrorVector;
            }
        }
        else {
            return hasErrorVector;
        }
    }
    
    private void extractDataRetrieved() {
        int numberOfLines = dataMatrix.size();
        int numberOfColumns = dataMatrix.get(0).getVectorArrayList().size();
        
        if (numberOfColumns > 0){
            matrix = new ComponentSample[numberOfLines][numberOfColumns];
            int actualLine = 0;
            
            if (hasErrorVector())
                errorVector = new ComponentSample[numberOfLines];
            if (hasTotalVector())
                totalVector = new ComponentSample[numberOfLines];
            
            for (DataLineRetrieved vector : dataMatrix) {
                matrix[actualLine] = vector.getVector();
                
                if (hasErrorVector())
                    errorVector[actualLine] = vector.getError();
                if (hasTotalVector())
                    totalVector[actualLine] = vector.getTotal();
                
                actualLine++;
            }
        }
        dataExtracted = true;
    }
}
