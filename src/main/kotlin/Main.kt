package cloud.yusuke.kt.contest

private fun readStr() = readln()
private fun readInt() = readStr().toInt()
private fun readLong() = readStr().toLong()
private fun readFloat() = readStr().toFloat()
private fun readIntArray() = readStr().split(" ").map { it.toInt() }

fun main() {
    var t = readInt()

    do {
        println(t)
        t--
    } while(t > 0)
}