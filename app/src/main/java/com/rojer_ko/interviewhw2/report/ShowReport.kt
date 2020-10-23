package com.rojer_ko.interviewhw2.report

class ShowReport:IOutput {

    override fun output(items: MutableList<ReportItem>){
        println("Output to DISPLAY")
        for (item in items){

            val description = item.description
            val amount = item.amount
            println("SHOW $description - $amount")
        }
    }
}