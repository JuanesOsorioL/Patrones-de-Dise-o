package com.example._2factorymethodtarea_reporte.factory;

import com.example._2factorymethodtarea_reporte.product.Report;

public abstract class ReportFactory {
    protected abstract Report createReport();

    public void generateReport() {
        Report report = createReport();
        report.generate();
    }
}
