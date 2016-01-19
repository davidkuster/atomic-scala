import util.{Random, Properties}

val r = Random
val p = Properties
// so apparently "new" is optional too

println(r)
println(p)

class X

val x = new X
println(x)
// no. new is required here. something else is going on above.


/*
output:

scala.util.Random$@7229724f
scala.util.Properties$@4c873330
Main$$anon$1$X@119d7047
*/


// change the name
import util.{Left => L }
// this doesn't work:
// import util.Left => L

val l = new L

// getting some deprecation warning in the REPL

/*
davidkuster@Davids-MacBook-Pro $ scala -deprecation imports.scala
/Users/davidkuster/workspace/github/davidkuster/atomic-scala/imports.scala:32: warning: Adaptation of argument list by inserting () has been deprecated: this is unlikely to be what you want.
        signature: Left(a: A): scala.util.Left[A,B]
  given arguments: <none>
 after adaptation: new Left((): Unit)
val l = new L
        ^
one warning found
*/