// methods

//def methodName(arg1: Type1, arg2, Type2): returnType = {
    // method body
    // which produces a result
//}

// what are the aesthetics of formatting this? don't particularly like the lack of whitespace as the book uses:

def multiplyByTow(x:Int):Int = {
    x * 2
}

// what happens when you get a lot of inputs to a method? preferred standard formatting regardless?

def method(x : Int, y : Int) : Int = {
    x * y
}

println( s"method(5, 4) = ${method(5, 4)}" )

def method2( x : Int )
    : Int = {
        x * x
    }

println( s"method2(5) = ${method2(5)}" )


// TODO: go read a variety of Scala code on GitHub and see what conventions are being used