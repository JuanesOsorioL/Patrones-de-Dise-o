package com.example._2factorymethodtarea_reporte.factory;

import com.example._2factorymethodtarea_reporte.product.InventoryReport;
import com.example._2factorymethodtarea_reporte.product.Report;

public class InventoryReportFactory extends ReportFactory {
    @Override
    Report createReport() {
        return new InventoryReport();
    }
}
