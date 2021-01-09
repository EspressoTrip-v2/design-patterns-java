public class MovieProducer {
    public static IMovieFactory movieFactory(String genre) {
        switch (genre.toLowerCase()) {
            case "action":
                return new ActionMovieFactory();
            case "comedy":
                return new ComedyMovieFactory();
            default:
                return null;
        }
    }
}
