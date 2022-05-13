public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    public TvShow(String showName, int numberOfEpisodes, String genre){
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    public TvShow(String showName, int numberOfEpisodes){
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
    }
    public TvShow(int numberOfEpisodes, String genre){
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }
    public TvShow(String showName){
        this.showName = showName;
    }

    public TvShow(int numberOfEpisodes){
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public TvShow(){
        this.showName = null;
        this.numberOfEpisodes = 0;
        this.genre = null;
    }
    public String getShowName() {
        return showName;
    }
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the TV show is "+ getShowName() + " with " + getNumberOfEpisodes()+ " numbers of episodes."
                + " The genre is " + getGenre() + ".";
    }
}
