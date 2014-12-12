package sell.input;

import java.util.ArrayList;
import sell.ComponentSample;

public class DataLineRetrieved {
    private ArrayList<ComponentSample> vector;
    private ComponentSample totalComponent;
    private ComponentSample errorComponent;

    public DataLineRetrieved() {
        vector = new ArrayList<ComponentSample>();
        totalComponent = null;
        errorComponent = null;
    }
    
    public ComponentSample[] getVector() {
        return (ComponentSample[]) vector.toArray(new ComponentSample[vector.size()]);
    }

    public ArrayList<ComponentSample> getVectorArrayList() {
        return vector;
    }

    public ComponentSample getTotal() {
        return totalComponent;
    }

    public ComponentSample getError() {
        return errorComponent;
    }
    
    public boolean hasTotal() {
        return totalComponent != null;
    }
    
    public boolean hasError() {
        return errorComponent != null;
    }
    
    public void addComponent(ComponentSample component) {
        vector.add(component);
    }
    
    public void addTotal(ComponentSample total) {
        totalComponent = total;
    }
    
    public void addError(ComponentSample error) {
        errorComponent = error;
    }
}
