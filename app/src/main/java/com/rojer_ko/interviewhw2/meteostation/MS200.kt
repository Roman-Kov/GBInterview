package com.rojer_ko.interviewhw2.meteostation

import java.time.LocalDateTime

class MS200(private val id:Int): MeteoSensor {

    override fun getId(): Int {
        return id
    }

    override fun getTemperature(): Float {
        return 20f
    }

    override fun getHumidity(): Float {
        return 60f
    }

    override fun getPressure(): Float {
        return 752.4f
    }

    override fun getDateTime(): LocalDateTime {
        return  LocalDateTime.now()
    }
}