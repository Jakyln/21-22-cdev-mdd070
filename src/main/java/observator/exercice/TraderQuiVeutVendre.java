package observator.exercice;

public class TraderQuiVeutVendre implements BourseSubscriber {
    @Override
    public void update(int prix){
        if (prix < 32_000){
            System.out.println("c'est trop cher il vaut mieux attendre car il vaut " + prix );
        }
    }
}
