
import bollywood.BollyWoodComedyMovie;
import bollywood.IBollyWoodMovie;
import hollywood.HollyWoodComedyMovie;
import hollywood.IHollyWoodMovie;

public class ComedyMovieFactory extends IMovieFactory {
    @Override
    public IHollyWoodMovie getHollywoodMovie() {
        return new HollyWoodComedyMovie();
    }

    @Override
    public IBollyWoodMovie getBollywoodMovie() {
        return new BollyWoodComedyMovie();
    }
}
