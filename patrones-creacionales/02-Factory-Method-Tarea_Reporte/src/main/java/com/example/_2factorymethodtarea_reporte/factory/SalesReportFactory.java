package com.example._2factorymethodtarea_reporte.factory;

import com.example._2factorymethodtarea_reporte.product.Report;
import com.example._2factorymethodtarea_reporte.product.SalesReport;

public class SalesReportFactory extends ReportFactory {
    @Override
    protected  Report createReport() {
        return new SalesReport();
    }
}
