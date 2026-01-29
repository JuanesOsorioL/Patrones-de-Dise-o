package com.example._1builderreactivo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class ComputerService {

    public Mono<Computer> creationComputer() {
        return Mono.just(Computer.builder()
                .cpu("intel")
                .disk("25T")
                .ram("64G")
                .build()).doOnNext(a -> log.info(a.toString()));
    }
}
