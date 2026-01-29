package com.example._2factorymethodtarea_reporte;

import com.example._2factorymethodtarea_reporte.factory.InventoryReportFactory;
import com.example._2factorymethodtarea_reporte.factory.ReportFactory;
import com.example._2factorymethodtarea_reporte.factory.SalesReportFactory;
import com.example._2factorymethodtarea_reporte.model.ReportType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;


@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    CommandLineRunner demo() {
        Scanner sc = new Scanner(System.in);

        return args -> {

            log.info("Tipo de reporte (inventory/sales): ");
            String input = sc.nextLine().trim().toUpperCase();

            ReportType type = tryParseReportType(input);

            ReportFactory report = switch (type) {
                case INVENTORY -> new InventoryReportFactory();
                case SALES -> new SalesReportFactory();

            };
            log.info("Cliente ordenó: {}", type);
            report.generateReport();

        };
    }


    private ReportType tryParseReportType(String input) {
        try {
            return ReportType.valueOf(input);
        } catch (IllegalArgumentException e) {
            log.warn("Tipo inválido '{}', usando el reporte de Ventas", input);
            return ReportType.SALES;
        }
    }

}
