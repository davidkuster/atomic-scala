
class Giraffe
class Bear
class Hippo

// interesting to define classes on a single line.
// I've forgotten a lot since partial participation in the Odersky course on Coursera...

val g1 = new Giraffe
val g2 = new Giraffe
val b = new Bear
val h = new Hippo

println(g1)
println(g2)
println(b)
println(h)


/*
interesting output (Main$$anon...):

Main$$anon$1$Giraffe@7229724f
Main$$anon$1$Giraffe@4c873330
Main$$anon$1$Bear@119d7047
Main$$anon$1$Hippo@776ec8df
*/


class Hyena {
    println("How does a class have a body like this? Not wrapped in a constructor, a static block, or nuthin")
}

val hyena = new Hyena
println(hyena)
