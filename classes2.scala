class Monster(roar: String, monsterType: String) {
    println( s"A monster of type ${monsterType} is being created..." )

    def beScary() = println( s"${roar.toUpperCase()}! I am a ${monsterType} monster!" )
}

val cookie:Monster = new Monster("yum", "cookie")
cookie.beScary

val dragon = new Monster("<breathing fire>", "dragon")
dragon.beScary

val boozeHound:Monster = new Monster("burp", "booze hound")
boozeHound.beScary


println("trying the map approach...")

List(cookie, dragon, boozeHound).map( it => it.beScary )

// comparing length in Groovy:
//[cookie, dragon, boozeHound]*.beScary()
// definitely shorter. hmm. but I'm getting ahead of the book regardless.