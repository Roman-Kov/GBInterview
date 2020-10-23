package com.rojer_ko.interviewhw2.report

class Report {

    //пришлось убрать приватность, иначе не смог получить доступ для использования
    val items: MutableList<ReportItem> = mutableListOf()

    fun calculate(){
        items.add(ReportItem("First", 5f))
        items.add(ReportItem("Second", 6f))
    }

   fun output(){
        val printReport = PrintReport()
        printReport.output(items)
    }
}