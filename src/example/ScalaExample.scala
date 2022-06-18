package example

import arc._
import arc.util._
import mindustry.content.UnitTypes

// You may use object instead of class so you don't have to initialize scala class, choose whatever fits your needs
object ScalaExample {

    def content(): Unit = {
        Log.info("Loaded mod content", ()) // I use () because compilation throws {ambiguous reference to overloaded definition}
    }
    
    // Let's make Reign crazy
    def load(): Unit = {
        UnitTypes.reign.weapons.each((weapon) => weapon.reload = 1f)
        UnitTypes.reign.speed = 50f
        UnitTypes.reign.rotateSpeed = 10f
    }

}