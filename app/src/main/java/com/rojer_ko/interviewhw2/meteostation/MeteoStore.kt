package com.rojer_ko.interviewhw2.meteostation

class MeteoStore {

    // Сохранение данных в базу
    fun save(meteoSensor: MeteoSensor):Pair<Boolean, String>{

        val id = meteoSensor.getId()
        val dateTime = meteoSensor.getDateTime().toString()
        val temperature = meteoSensor.getTemperature().toString()
        val humidity = meteoSensor.getHumidity().toString()
        val pressure = meteoSensor.getPressure().toString()

        val textLog: String = "Saving data from sensor $id at $dateTime " +
                "temperature - $temperature; humidity - $humidity; pressure - $pressure"

        return Pair(true, textLog)
    }
}