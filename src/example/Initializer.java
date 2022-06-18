package example;

import mindustry.mod.*;

// I use java to bootstrap the scala class
public class Initializer extends Mod {

    public Initializer() {} // Add some code inside constructor

    @Override
    public void loadContent() {
        ScalaExample.content();
    }

    @Override
    public void init() {
        ScalaExample.load();
    }

}
