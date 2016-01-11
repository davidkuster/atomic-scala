// sample script to experiment as an alternative to the REPL

println("Hello, Scala!")

val x = (42 * 11.3)

// need to do printlns, doesn't automatically return the last evaluated statement
// REPL is nicer in that regard...

// println takes a comma-separated list of values...
println("x = $x", x, "What up")
// which doesn't look appealing: (x = $x,474.6,What up)

// specifying type:
//val y:String = 1    // type mismatch
val y:String = "1"

val multilineString = """Hey
Kiddos
    Indented...
"""
println(multilineString)


// multi-line expressions
val c = {
    val i = 2
    val j = 4
    i * j
}
println("c = " + c)
// and string interpolation:
println("c = $c")
// doesn't work. have to add the "s":
println(s"c = $c")
// that sucks.
println(s"c+1 = ${c + 1}")
// hmm...maybe some more interesting things with "f" and "json" at http://docs.scala-lang.org/overviews/core/string-interpolation.html

