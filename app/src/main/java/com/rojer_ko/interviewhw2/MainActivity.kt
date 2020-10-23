package com.rojer_ko.interviewhw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rojer_ko.interviewhw2.meteostation.MeteoActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toMeteoStation()
        toBillingReport()
    }

    private fun toMeteoStation(){
        toMeteoStationBtn.setOnClickListener {
            startActivity(Intent(this, MeteoActivity::class.java))
        }
    }

    private fun toBillingReport(){
        toBillingReportBtn.setOnClickListener {
            startActivity(Intent(this, ReportActivity::class.java))
        }
    }
}