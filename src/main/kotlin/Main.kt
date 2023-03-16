fun main() {
    numberss()
    robot(5)
    robot(12)
    robot(23)
    var v =names(arrayOf("fruit","wanjiru","build","AkiraChix","mentor","karen","success","Nairobi"))
    println(v)
    will()


}
fun numberss(){
    for(num in 1..100){
        if (num%2!=0){
            println(num)
        }
    }
}

fun names(name:Array<String>):Int{
    var c =0
    name.forEach { k ->
        if (k.length>5){
            c ++
        }
    }
    return c

}

fun robot(age: Int) {
    when (age) {
        in 0..6 -> println("milk")
        in 6..15 -> println("fanta orange")
        else -> println("coca cola")
    }
}
fun will(){
    for (c in 1..100){
        if (c % 3 == 0&& c % 5==0){
            println("fizzbuzz")
        }
        else if (c%3 ==0){
            println("fizz")
        }
        else if (c%5 ==0){
            println("buzz")
        }
        else{
            println(c)
        }
    }
}


