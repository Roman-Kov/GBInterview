package com.rojer_ko.interviewhw2.report

class PrintReport {

    fun output(items: MutableList<ReportItem>){
        println("Output to PRINTER")
        for (item in items){

            val description = item.description
            val amount = item.amount
            println("PRINTER $description - $amount")
        }
    }
}