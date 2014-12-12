package output;

import java.util.Objects;

public class ComponentNode {
    private String id;
    private String moduleName;
    private long time;
    private double energy;
    private long numberOfTimesUsed;

    public ComponentNode() {
        numberOfTimesUsed = 1;
    }
    
    public ComponentNode(OutputNode begin, OutputNode end) {
        id = begin.getId();
        moduleName = begin.getModuleName();
        time = end.getTime()-begin.getTime();
        energy = end.getEnergy();
        numberOfTimesUsed = 1;
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

    public long getNumberOfTimesUsed() {
        return numberOfTimesUsed;
    }

    public void setNumberOfTimesUsed(long numberOfTimesUsed) {
        this.numberOfTimesUsed = numberOfTimesUsed;
    }
    
    public void incNumberOfTimesUsed() {
        numberOfTimesUsed++;
    }

    void add(ComponentNode component) {
        time += component.getTime();
        energy = (energy+component.getEnergy())/2;
        incNumberOfTimesUsed();
    }

    @Override
    public String toString() {
        return moduleName + "::" + id + " (time = " + time + " energy = " + energy + " numberOfTimesUsed = " + numberOfTimesUsed + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ComponentNode other = (ComponentNode) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.moduleName, other.moduleName);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.moduleName);
        return hash;
    }
}
