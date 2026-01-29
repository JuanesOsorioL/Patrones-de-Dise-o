package com.example._1builder;

public class Computer {
    private String cpu = "cpu no definida";
    private String ram = "ram no definida";
    private String disk = "disk no definida";
    private String gpu = "gpu no definida";

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu = '" + this.getCpu() + '\'' +
                ", ram = '" + this.getRam() + '\'' +
                ", disk = '" + this.getDisk() + '\'' +
                ", gpu = '" + this.getGpu() + '\'' +
                '}';
    }
}
