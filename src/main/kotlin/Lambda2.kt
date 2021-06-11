fun main() {
    val resultHighOrder =addTwoNum(myLambdaFunc(2,2),myLambdaFunc(2,2))
    print(resultHighOrder) // result = 8
}
//{x, y-> x + y} Lambda: A function without name
//Lambda Expression
fun addTwoNum(x: Int, y: Int):Int{ //Parameters
    return x + y //Method Body
}

//Higher-Order Function
val myLambdaFunc: (Int, Int)-> Int = {x, y-> x + y}