package polymorphism;

/**
 * Created by @techieasif on April, 2020
 */

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {

        return "No Plot Here";

    }

    public String getName() {
        return name;
    }
}

class ThreeIdiots extends Movie {
    public ThreeIdiots() {
        super("3 Idiots");
    }

    public String plot() {
        return "Story about three friends and their different career Paths";
    }
}

class ZNMD extends Movie {
    public ZNMD() {
        super("Zindagi na milegi Dobara");
    }

    @Override
    public String plot() {
        return "Living your Life before die.";
    }
}

class Andhadhund extends Movie {
    public Andhadhund() {
        super("Andhadhund");
    }

    @Override
    public String plot() {
        return "Blind is not blind";
    }
}

class TwoStates extends Movie {
    public TwoStates() {
        super("2 state");
    }

    @Override
    public String plot() {
        return "2 lovers belong to two different states and castes";
    }
}

class SocialNetwork extends Movie {
    public SocialNetwork() {
        super("The Social Network");
    }

    //no plot found
}

public class Main {

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Current Random Number Selected " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new ThreeIdiots();
            case 2:
                return new ZNMD();
            case 3:
                return new Andhadhund();
            case 4:
                return new TwoStates();
            case 5:
                return new SocialNetwork();
        }
        return null;
    }

    public static void main(String[] args) {
        for (var i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("MOVIE # " + i +
                    ": " + movie.getName() +
                    "\n" + "Plot: " + movie.plot());
            System.out.println("\n -----------------------------------\n");
        }
    }
}
