package com.example._2factorymethodtarea_reporte.product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SalesReport implements Report {
    @Override
    public void generate() {
        log.info("Se genera el reporte de ventas");
    }
}
