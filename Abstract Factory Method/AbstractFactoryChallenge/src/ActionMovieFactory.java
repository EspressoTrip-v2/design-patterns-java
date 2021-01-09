import bollywood.BollyWoodActionMovie;
import bollywood.IBollyWoodMovie;
import hollywood.HollyWoodActionMovie;
import hollywood.IHollyWoodMovie;

public class ActionMovieFactory extends IMovieFactory {
    @Override
    public IHollyWoodMovie getHollywoodMovie() {
        return new HollyWoodActionMovie();
    }

    @Override
    public IBollyWoodMovie getBollywoodMovie() {
        return new BollyWoodActionMovie();
    }
}
