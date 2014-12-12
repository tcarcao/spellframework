package sell;

public class PowerConsumption {
    public double cpu;
    public double memory;
    public double disk;
    public double fans;
    public double gpu;
    public double total;

    public PowerConsumption() {
        cpu = 0;
        memory = 0;
        disk = 0;
        fans = 0;
        gpu = 0;
        total = 0;
    }

    public PowerConsumption(double cpu) {
        this.cpu = cpu;
    }
    
    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getDisk() {
        return disk;
    }

    public void setDisk(double disk) {
        this.disk = disk;
    }

    public double getFans() {
        return fans;
    }

    public void setFans(double fans) {
        this.fans = fans;
    }

    public double getGPU() {
        return gpu;
    }

    public void setGPU(double gpu) {
        this.gpu = gpu;
    }

    public double getTotal() {
        double possibleTotal = cpu+memory+disk+fans+gpu;
        if (possibleTotal > total)
            total = possibleTotal;
        
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PowerConsumption{" + "cpu=" + cpu + ", memory=" + memory + ", disk=" + disk + ", fans=" + fans + ", gpu=" + gpu + ", total=" + total + '}';
    }
}
