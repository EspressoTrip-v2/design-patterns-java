import bollywood.IBollyWoodMovie;
import hollywood.IHollyWoodMovie;

public class Client {
    public static void main(String[] args) {
        // Create the movie factory from the producer
        IMovieFactory actionFactory = MovieProducer.movieFactory("action");

        System.out.println("**** Action Genre ****");
        IBollyWoodMovie bollyAction = actionFactory.getBollywoodMovie();
        bollyAction.getMovieName();
        IHollyWoodMovie hollyAction = actionFactory.getHollywoodMovie();
        hollyAction.getMovieName();

        System.out.println("**** Comedy Genre ****");
        IMovieFactory comedyFactory = MovieProducer.movieFactory("comedy");
        IBollyWoodMovie bollyCom = comedyFactory.getBollywoodMovie();
        bollyCom.getMovieName();
        IHollyWoodMovie hollyCom = comedyFactory.getHollywoodMovie();
        hollyCom.getMovieName();
    }
}
