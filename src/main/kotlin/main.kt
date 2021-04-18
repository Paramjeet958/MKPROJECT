import com.sun.source.tree.SwitchTree
import java.util.*
fun main(args: Array<String>){
    println("*******************************")
    println("         SIMPLE CALCULTOR         ")
    println("Basic calculator using kotlin")
    println( "1.Addtion\n2.Subtraction\n3.Multiplication\n4.Divide\n5.Percentage\n")
    println("Enter your choice:")
    var ch = readLine()!!.toInt()
    when(ch) {
        1 -> {
            val s = Scanner(System.`in`)
            println("Enter number of elements for Addition:")
            val size = s.nextInt()
            val doubleArray = DoubleArray(size)
            println("Enter array")
            for (i in doubleArray.indices) {
                kotlin.io.print("doublearray[$i]:")
                doubleArray[i] = s.nextDouble()
            }
            val sum: Double = 0.toDouble()
            for (i in doubleArray.indices) {

                val sum = doubleArray[i]
            }
            println("array:${doubleArray.contentToString()}")
            println("sum of elements:")
            println(doubleArray.sum())

        }

        2 -> {
            println("Enter two values for Subtraction")
            print("Enter  First number")
            var a = readLine()!!.toDouble()

            print("Enter second number")
            var b = readLine()!!.toDouble()
            println("subtraction of two elements= ${a - b}")
        }

        3 -> {
            println("Enter two elements for Multiplication")
            print("Enter first digit")
            var a = readLine()!!.toDouble()

            print("Enter Second digit")
            var b = readLine()!!.toDouble()
            println("subtraction of two digits= ${a * b}")
        }


        4 -> {
            println("Enter two values")
            print("Enter first value")
            var a = readLine()!!.toDouble()

            print("Enter second value")
            var b = readLine()!!.toDouble()
            println("The Divion of two values=${(a / b)}")

        }


        5 -> {
            println("Enter values for percentage")
            print("Enter the total marks ")
            var a = readLine()!!.toDouble()

            print("Enter the obtained marks")
            var b = readLine()!!.toDouble()
            val c = (a * 100) / b
            println("Percentage of elements: $c")

            if (c<40)
                println(" You are FAIL")
            else if(c>50)
                println("Grade E")
            else if (c>60)
                println("Grade D")
            else if (c>70)
                println("Grade C")
            else if (c>80)
                println("Grade B")
            else if (c>90)
                println("Grade A")
            else if (c>95)
                println("Grade O")
        }
        else -> {
            println("Wrong choice selected")
        }
    }
}

