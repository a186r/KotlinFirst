package my.demo

import org.omg.PortableInterceptor.INACTIVE
import java.util.*

fun sum(a:Int,b:Int) : Int{
    return a+b
}

//fun main(args: Array<String>){
//    println("sum of 19 and 23 is ${sum(19,23)}")
//}

fun printSum(a:Int,b:Int){
    println("sum of $a and $b is ${sum(a, b)}")
}

fun test(){
    val a : Int = 1

    val b = 2

    val c : Int = 3

    println("a = $a,b = $b,c=$c")
}

fun test2(){
    var x= 5
    x+=1
    println("x = $x")
}

//顶层变量
val PI = 3.14
var x = 0

fun incrementx(){
    x += 1
}

//fun main(args : Array<String>){
//    println("x = $x;PI = $PI")
//    incrementx()
//    println("incrementx()")
//    println("x = $x;PI = $PI")
//}

//字符串模板
fun main(args:Array<String>){
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is","was")},but now is $a"
    println(s2)
}

//条件表达式
fun maxOf(a:Int,b:Int) : Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxOf2(a:Int,b:Int) = if(a>b)a else b

//可空值
fun parseInt(str:String):Int?{
    return 2
}

fun parseInt2(str :String):Int?{
    return str.toIntOrNull()
}

fun printProduct (arg1:String,arg2:String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    //直接使用x*y会编译错误，因为它们可能为空
    if(x != null && y != null){
        //空检测之后x,y会自动转换为非空值
        println(x*y)
    }else{
        println("either")
    }
}

//类型检测以及自动类型转换
fun getStringLength(obj:Any) : Int?{
    if(obj is String){
        return obj.length
    }

    //离开类型检测分支后，obj仍然是Any类型
    return null
}

fun main3(args: Array<String>){
    fun printLength(obj: Any){
        println("'$obj' string length is ${getStringLength(obj)?:"...err,not a string"}")
    }
}

fun getStringLength2(obj: Any):Int?{
    if(obj !is String) return null

    return obj.length
}

fun getStringLength3(obj: Any):Int?{
    if(obj is String && obj.length>0){
        return obj.length
    }

    return null
}

//for循环
fun main4(args: Array<String>){
    val items = listOf("a","b","c")
    for (item in items){
        println(item)
    }
}

fun main5(args: Array<String>){
    val items = listOf("a","b","c")

    for(index in items.indices){
        println("item at $index is ${items[index]}")
    }
}

//while循环
fun main6(args: Array<String>){
    val items = listOf("a","b","c")
    var index = 0;

    while (index < items.size){
        println("item at $index is ${items[index]}")
        index++
    }
}

//when循环
fun describe (obj:Any): String =
    when (obj) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        is Long -> "isLong"
        !is String -> "not a string"
        else -> "Unknow"
    }


//检测某个数字是否在指定区间内
fun main7(args: Array<String>){
    val x = 10
    val y = 9
    if (x in 1.. y+1){
        println("fits in range")
    }
}

//检测某个数字是否在指定区间外
fun main8(args: Array<String>){
    val list = listOf("a","b","c")

    if(-1 !in 0..list.lastIndex){
        println("-1 is not in lastIndex")
    }

    if(list.size !in list.indices){
        println("list size is out of valid list indices range too")
    }
}

//区间迭代
fun main9(args: Array<String>){
    for (x in 1..5){
        print(x)
    }
}

//数列迭代
fun main10 (args: Array<String>){
    for(x in 1..10 step 2){
        print(x)
    }

    println()

    for (x in 9 downTo 0 step 3){
        print(x)
    }
}

//对集合进行迭代
fun main11(args: Array<String>){
    val items = listOf("a","b","c")

    for(item in items){
        print(item)
    }
}

//使用in来判断集合内是否包含某实例
fun main12(args: Array<String>){
    val items = listOf("a","b","c")

    when{
        "a" in items -> println("a")
        "b" in items -> println("b")
    }
}

//使用lambda表达式过滤filter和map集合
fun main13(args: Array<String>){
    val fruits = listOf("a","b","c")

    fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}