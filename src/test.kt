fun main(args: Array<String>){
    println(max(12,4))//可以省略每行代码后面的分号
}

fun max(a:Int,b:Int) : Int{
    return if(a>b) a else b
}


//表达式体函数
fun mix(a:Int,b:Int) : Int = if(a > b) a else b

//声明变量
val question = "no question"

val answer = 42

val answer2 : Int = 42 //不可变变量

var answer3 : Int = 44 // 可变变量