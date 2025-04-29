interface Playable{
    public void Play();
}

abstract class Instrument implements Playable{
     public void tune(){
        System.out.println("Instrument is being tuned");
     }

     @SuppressWarnings("unused")
     abstract void repair();
}


final class Guitar extends Instrument {
    public void play() {
        System.out.println("Guitar is playing music.");
    }
    @Override
    void repair() {
        System.out.println("Repairing the Guitar.");
    }

    @Override
    public void Play() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

public class MusicAppSimulation{
    public static void main(String[] args) {

        Guitar myGuitar = new Guitar();

        myGuitar.tune();
        myGuitar.play();
        myGuitar.repair();
        
    }
}