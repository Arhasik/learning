package com.example.app1

class Bus() {
    private val seatsOnBus = mutableListOf<Passenger>()

    fun addPassenger (): Int {
        if (seatsOnBus.size < 10) {
            seatsOnBus.add(Passenger("${seatsOnBus.size} A"))
        }
        return seatsOnBus.size
    }

    fun removePassenger (): Int {
        if (seatsOnBus.isNotEmpty()) {
            seatsOnBus.removeAt(index = seatsOnBus.lastIndex)
        }
        return seatsOnBus.size
    }

    fun resetBus(): Int {
        seatsOnBus.clear()
        return 0
    }

    fun getPassengerCount(): Int = seatsOnBus.size

}