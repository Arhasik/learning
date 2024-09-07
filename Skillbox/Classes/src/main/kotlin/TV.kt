import kotlin.random.Random

class TV(
    val mark: String,
    val model: String,
    val size: Double,
    val diagonal: Double,
) {
    var onOrOff: Boolean = false
        private set
    private var listOfChannels = Channel.getRandomChannel()

    init {
        println(listOfChannels)
    }

    fun turnOn() {
        println("TV turned on")
        onOrOff = true
    }

    fun turnOff() {
        println("TV turned off")
        onOrOff = false
    }

    var baseVolume = 0
        private set

    fun boostVolume(levelVolumeUser: Int): Int {
        if (!onOrOff) {
            onOrOff = true
            println("TV turned on")
        }
        if (levelVolumeUser > maxVolume) {
            println("Enter correct number")
        }
        baseVolume += levelVolumeUser
        if (baseVolume >= maxVolume) {
            baseVolume -= maxVolume
        }

        println(baseVolume)
        return baseVolume
    }

    fun decreaseVolume(levelVolumeUser: Int): Int {
        if (!onOrOff) {
            onOrOff = true
            println("TV turned on")
        }
        if (levelVolumeUser > maxVolume) {
            println("Enter correct number")
        }
        baseVolume -= levelVolumeUser
        if (baseVolume <= 0) {
            baseVolume = 0
        }
        println(baseVolume)
        return baseVolume
    }

    private var currentChannel = 1

    fun switchingChannel(buttonRemoteControl: Int) {

        currentChannel = buttonRemoteControl

        if (currentChannel > listOfChannels.size || currentChannel < 1) {
            println("Enter correct channel")
        } else if (onOrOff) {
            println("Channel: ${listOfChannels[currentChannel - 1]}")
        } else if (!onOrOff) {
            onOrOff = true
            println("TV turned on")
            println("Channel: ${listOfChannels[currentChannel - 1]}")
        }
    }


    fun switchingChannelUpDown(buttonRemoteControlUpDown: Boolean) {

        if (!onOrOff) {
            onOrOff = true
            println("TV turned on")
            println(listOfChannels[currentChannel - 1])
            return
        }

        if (buttonRemoteControlUpDown == true) {

            currentChannel += 1
            if (currentChannel > listOfChannels.size) {
                currentChannel = 1
            }
        }
        if (buttonRemoteControlUpDown == false) {
            currentChannel -= 1
            if (currentChannel < 1) {
                currentChannel = listOfChannels.size
            }
        }

        println(listOfChannels[currentChannel-1])
    }

    fun showListChanel () {
for (i in 0..listOfChannels.size-1)
            println("Channel number - ${i+1}, Channel name -${this.listOfChannels[i]} ")
    }



    companion object {
        const val maxVolume = 100
    }
}