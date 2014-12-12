package output;

import java.util.Map;
import java.util.TreeMap;

public class OutputNode {
    private String id;
    private String moduleName;
    private long time;
    private double energy;

    public OutputNode() {
        moduleName = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }
    
    public void setParameters(OutputNodeParameters parameters) {
        TreeMap<String, String> params = parameters.getValues();
        for (Map.Entry<String, String> parameter : params.entrySet()) {
            switch(parameter.getKey()) {
                case "m" :
                    moduleName = parameter.getValue();
                    break;
                case "t" :
                    time = Long.parseLong(parameter.getValue());
                    break;
                case "e" :
                    energy = Double.parseDouble(parameter.getValue());
                    break;
                default :
                    break;
            }
        }
    }  
}
