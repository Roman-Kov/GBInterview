package com.rojer_ko.interviewhw2.meteostation

import java.time.LocalDateTime

class ST500Info {
    fun getData():SensorTemperature{
        return object: SensorTemperature{
            override fun identifier(): Int {
                return 1
            }

            override fun temperature(): Double {
                return 22.0
            }

            override fun year(): Int {
                return LocalDateTime.now().year
            }

            override fun day(): Int {
                return LocalDateTime.now().dayOfYear
            }

            override fun second(): Int {
                val now = LocalDateTime.now();
                return now.hour *3600 + now.minute *60 + now.second
            }
        }
    }
}