fun main() {
    // printing hello world
    println("hello world")

    // variables
    // val = used when we want variables to be read-only
    val firstName = "Naresh"
    val PI = 3.14

    // var is used when we want out variables both read and write
    var weight = 70

    // variables can be declared directly like above or we can specify the type also
    val num: Int = 7

    // DataTypes
    val myNum: Int = 7 // integer
    val myDoubleNum: Double = 7.0 // double
    val myLetter: Char = 'A' // character
    val myBoolean: Boolean = true // boolean
    val myString: String = "Hello" // string

    // operators
    val n1 = 10
    val n2 = 20

    // addition
    var result = n1 + n2
    println(result)

    // subtraction
    result = n1 - n2
    println(result)

    // multiplication
    result = n1 * n2
    println(result)

    // division
    result = n1 / n2
    println(result)

    // modules
    result = n1 % n2
    println(result)

    // logical operators avaliable are >, >= , <, <=, ==, !=

    // strings
    val name = "KOTLIN"
    // accessing characters of a string using indexing
    println(name[0])
    println(name[1])

    // to check if a string is empty or not
    println(name.isEmpty())

    // Length of a string
    println(name.length)

    // substring
    println(name.substring(2, 4)) // [startIndex, endIndex)

    // printing value of a varible inside a string we use "$"
    println("The name of language is $name")


    // conditional statements
    // flow control statement
    // simple if statement
    var examScore = 80
    if(examScore > 70) {
        println("you passed!")
    }

    // if else statement

    examScore = 69
    if(examScore > 70) {
        println("you passed!")
    } else {
        println("You Failed! prepare Well")
    }

    // else if when we have more than one condition to check
    examScore = 68
    if(examScore > 70) {
        println("A grade")
    } else if(examScore > 60){
        println("B grade")
    } else {
        println("Failed :(")
    }
    
    // collectios 
    // to store multiple same type of varibles
    // listof
    val names = listOf("Naresh", "Manoj", "Vinay")
    println(names[2]) //printing 3rd variable from names 

    // by default collections in kotlin are immutable 

    // we want to change the values of collection varable we have to make them mutable

    val mutableName = mutableListOf("naresh", "manoj", "vinay")
    println(mutableName[1])

    // now we can add or update values 
    mutableName.add("king")

    // now if we want to do something on every value in collections we can use for loop
    for(name in mutableName) {
        println(name)
    }

    // other use of for loops
    // including last value we can use this
    for(i in 1..5) {
        println(i)
    }

    // exclude the last value
    for(i in 1 until 5) {
        println(i)
    }
}
