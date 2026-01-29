package com.example._1builderreactivo;

import lombok.Builder;

//@Value          // inmutable (solo getters)
//@Builder        // genera el builder
//@ToString       // genera toString
//public class Computer {
//    String cpu;
//    String ram;
//    String disk;
//    String gpu;
//}


@Builder
public record Computer(String cpu, String ram, String disk, String gpu) {
}