fun main () {
 val tv = TV(mark = "Samsung", model = "IP123", size = 32.0, diagonal = 17.0)
 tv.turnOn()
 tv.turnOff()

for (i in 0..10 ) {
 tv.boostVolume(35)
}
 Thread.sleep(1000)
println("----------------")
 for (i in 0..10 ) {
  tv.decreaseVolume(20)
 }
 Thread.sleep(1000)
 println("----------------")

 for (i in 0..10) {
  tv.switchingChannel(i)
 }
 Thread.sleep(1000)
 println("----------------")

for (i in 0..20) {
 tv.switchingChannelUpDown(true)
 if (i == 10) {
  tv.turnOff()
continue
 }
}
 Thread.sleep(1000)
 println("----------------")

 for (i in 0..20) {
  tv.switchingChannelUpDown(false)
  if (i == 10) {
   tv.turnOff()
   continue
  }
 }
 Thread.sleep(1000)
 println("----------------")






tv.showListChanel()





}




