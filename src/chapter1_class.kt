import java.awt.Shape
import java.io.File

fun main(args:Array<String>){

}

abstract class Shape(val sides:List<Double>){
    val perimeter: Double get() = sides.sum()

    abstract fun calculateArea():Double
}

interface RectangleProperties{
    val isSquare:Boolean
}

class Rectangle(
        var height:Double,
        var length:Double
):Shape(listOf(height,length,height,length)),RectangleProperties{
    override val isSquare:Boolean get() = length == height
    override fun calculateArea():Double = height * length
}

class Triangle(
        var sideA:Double,
        var sideB:Double,
        var sideC:Double
):Shape(listOf(sideA,sideB,sideC)){
    override fun calculateArea():Double{
        val s = perimeter / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }

    println("Name $Name")
}


data class Customer(val name:String,val email:String)

fun foo(a:Int = 0,b:String=""){}

val list = listOf(1,2,3,4,5)
val positives = list.filter{x -> x > 0}
val positives2 = list.filter { it > 0 }

when (x){
    is Foo -> ""
    is Bar -> ""
    else ->{}
}

//遍历map/pair型list
for((k,v) in map){
    println("$k -> $v")
}


//区间
for (i in 1..100){}
for (i in 1 until 100){}
for (x in 2..10 step 2){}
for(x in 10 downTo 1){}
if(x in 1..10){}

//只读list
val list = listOf("a","b","c")

val map = mapOf("a" to 1,"b" to 2,"c" to 3)

val p :String by lazy {  }
fun String.spaceToCameCase(){}

"Cover".spaceTpCameCase();

//创建单例
object Resource{
    val name = "Name"
}

//if not null缩写

val files = File("Test").listFiles()
println(files?.size);

val files = File("Test").listFiles()
println(files?.size ?: "empty");

fun transform(color:String):Int{
    return when(color){
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2

        else -> throw IllegalAccessException("Invalid color param value")
    }
}

fun test(){
    val result = try{
        count()
    }catch (e : ArithmeticException){
        throw IllegalStateException(e)
    }
}
