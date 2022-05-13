import java.util.ArrayList;
import java.util.Scanner;

public class TVShowMain {
    public static void main(String[] args) {

        ArrayList<TvShow> tvShows = new ArrayList<>();
        tvShows.add(new TvShow("Breaking Bad", 63, "Crime"));
        tvShows.add(new TvShow("The Wire", 60));
        tvShows.add(new TvShow( 60, "Drama"));
        tvShows.add(new TvShow("How I Met Your Mother"));
        tvShows.add(new TvShow(89));
        tvShows.add(new TvShow());

        Scanner scanner = new Scanner(System.in);
        System.out.println("TV Show Menu");
        System.out.println("Entering nothing to the TV show name will stop the loop");
        while (true) {
            System.out.print("Enter name of TV show: " + "\n");
            String tvShowName = scanner.nextLine();

            if (tvShowName.equalsIgnoreCase("")) {
                break;
            }
            System.out.println("How many episodes does the TV show has: ");
            int showEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the TV show genre: " + "\n");
            String tvShowGenre = scanner.nextLine();

            // Add Tv show to the list
            tvShows.add(new TvShow(tvShowName, showEpisodes, tvShowGenre));
        }
        for(TvShow tvShow:tvShows)
        {
            System.out.println(tvShow);
        }

    }
}
