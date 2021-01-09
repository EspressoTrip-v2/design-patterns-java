import bollywood.IBollyWoodMovie;
import hollywood.IHollyWoodMovie;

public abstract class IMovieFactory {
    public abstract IHollyWoodMovie getHollywoodMovie();
    public abstract IBollyWoodMovie getBollywoodMovie();
}
