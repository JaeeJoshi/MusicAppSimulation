Create an Interface called Playable


It should have one method: void play();


Create an Abstract Class called Instrument that:


Implements Playable


Has a concrete method tune() that prints "Instrument is being tuned."


Has an abstract method void repair();


Create a Final Class called Guitar that:


Extends Instrument


Implements the play() method (print "Guitar is playing music.")


Implements the repair() method (print "Repairing the Guitar.")


In the main method:


Create an object of Guitar.


Call tune(), play(), and repair() methods.
