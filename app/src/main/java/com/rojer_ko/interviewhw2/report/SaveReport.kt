package com.rojer_ko.interviewhw2.report

class SaveReport:IOutput {

    override fun output(items: MutableList<ReportItem>){
        println("Save report")
        for (item in items){

            val description = item.description
            val amount = item.amount
            println("SAVE $description - $amount")
        }
    }
}