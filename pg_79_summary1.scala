// Summary 1 exercises

//1. Store and print an Int value.
val x = 1
println(x)

//2. Try to change the value. What happened?
// fail: "error: reassignment to val"

//3. Create a var and initialize it to an Int, then try reassigning to a Double. What happened?
// var i:Int = 1
// reassignment fails:
// scala> i = 1.1
// <console>:11: error: type mismatch;
//  found   : Double(1.1)
//  required: Int
//        i = 1.1
//            ^

//4. Store and print a Double. Did you use type inference? Try declaring the type.
val d:Double = 1.1
println(d)

//5. What happens if you try to store the number 15 in a Double value?
// necessary to specify the type:
// scala> val d:Double = 15
// d: Double = 15.0
//
// scala> val i = 15
// i: Int = 15

//6. Store a multiline String (see Data Types) and print it.
val multilineString = """Hey
Kiddos
    Indented...
"""
println(multilineString)

//7. What happens if you try to store the String “maybe” in a Boolean?
// expect a type mismatch, whereas Groovy would coerce to Groovy Truth
// yep:
// scala> val b:Boolean = "maybe"
// <console>:10: error: type mismatch;
//  found   : String("maybe")
//  required: Boolean
//        val b:Boolean = "maybe"
//                        ^

//8. What happens if you try to store the number 15.4 in an Int value?
// fails:
// scala> val i:Int = 15.4
// <console>:10: error: type mismatch;
//  found   : Double(15.4)
//  required: Int
//        val i:Int = 15.4
//                    ^

//9. Modify weightStatus in CompoundBMI.scala to produce Unit instead of String.
val lbs = 150.0
val height = 68.0
val weightStatus = {
    val bmi = lbs/(height * height) * 703.07
    val result = {
        if (bmi < 18.5) "Underweight"
        else if (bmi < 25) "Normal weight"
        else "Overweight"
    }
    println(result)
}

//10. Modify CompoundBMI.scala to produce an idealWeight based on a BMI of 22.0. Hint: idealWeight = bmi * (height * height) / 703.07
val weightStatusBmi22 = {
    val bmi = lbs/(height * height) * 703.07
    //val idealWeight = bmi * (height * height) / 703.07
    val result = {
        if (bmi == 22.0) "Ideal weight"
        else if (bmi < 18.5) "Underweight"
        else if (bmi < 25) "Normal weight"
        else "Overweight"
    }
    println(result)
}

// hmm, solution from the book's website is:

// Solution-10.scala
// Solution to Exercise 10 in "Summary 1"

val aHeight = 68.0
val idealBMI = 22.0
val idealWeight = {
  idealBMI * (aHeight*aHeight) / 703.07
}
println(idealWeight)

/* OUTPUT_SHOULD_BE
144.69114028475116
*/

// find the requirements on this one rather unclear... :)