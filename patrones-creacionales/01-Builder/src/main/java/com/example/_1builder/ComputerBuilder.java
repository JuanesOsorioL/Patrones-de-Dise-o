package com.example._1builder;

public class ComputerBuilder {

    private final Computer computer;

    public ComputerBuilder() {
        this.computer = new Computer();
    }

    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder setDisk(String disk) {
        computer.setDisk(disk);
        return this;
    }

    public ComputerBuilder setGpu(String gpu) {
        computer.setGpu(gpu);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
}
