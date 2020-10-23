package com.rojer_ko.interviewhw2.report

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rojer_ko.interviewhw2.R

class ReportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        val report = Report()
        report.calculate()
        report.output()
    }
}