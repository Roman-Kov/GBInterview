package com.rojer_ko.interviewhw2.report

class ReportDecorator (private val report: Report):IReport {

    override fun calculate() {
        report.calculate()
    }

    override fun output(outputMethod: IOutput) {
        outputMethod.output(report.items)
    }

}