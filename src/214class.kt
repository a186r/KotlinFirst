/*
fun main(args : Array<String>){
    val name = if(args.size>0) args[0] else "Kotlin"
    println("Hello,$name!")

    //还可以进行更复杂的表达式
    if(args.size>0){
        println("Hello,${args[0]}!")
    }
}*/

/*
fun main(args : Array<String>){
    println("Hello,${if(args.size > 0) args[0] else "someone"} !")
}*/

//class Person(val name : String)

/*
class Person(s: String, b: Boolean) {
    val name : String = ""
    var isMarried:Boolean = false
}

var person = Person("Bob",true)
*/

/*
class Rectangle(val height:Int,val width:Int){
    val isSquare:Boolean
        get() = height == width

        */
/*get(){
            return height == width
        }*//*

}*/


//Kotlin不区分导入的是类还是函数，允许导入任何种类的声明，顶层函数可以直接导入
import java.util.Random

class Rectangle(val height: Double, val width: Double){
    val isSquare:Boolean
        get() = height == width
}

fun createRandomRectangle():Rectangle{
    val  random = Random()
    return Rectangle(random.nextInt(),random.nextInt())
}

//也可以直接在包名称之后加上.*来导入包中定义的所有声明，这种导入不仅让包中定义的类课件，也会让顶层函数和属性可见。