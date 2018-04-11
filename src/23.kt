//枚举类并不是值的列表，可以给枚举类声明枚举常量的属性、指定属性值并且定义方法
/*
enum class Color(val r : Int , val g:Int ,val b:Int ){

    RED(255,0,0),ORANGE(255,0,0),YELLOW(255,0,0),GREEN(255,0,0),BLUE(255,0,0),INDIGO(255,0,0),VIOLET(255,0,0);//这里必须要有分号

    fun rgb() = (r*256+g)*256 + b

}

fun getMnemonic(color:Color) =
        when (color){
            Color.RED -> "Richard"
            Color.GREEN -> ""
            else -> {
            }
        }*/

import kotlin.coroutines.experimental.*

fun main(args: Array<String>){
    var seq = buildSequence {
        for (i in 1..5){
            yield(i * i)
        }

        yield(26..28)
    }

    println(seq.toList())
}

