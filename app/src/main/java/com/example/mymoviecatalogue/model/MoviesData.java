package com.example.mymoviecatalogue.model;

import java.util.ArrayList;

public class MoviesData {

    public static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Movie movie = new Movie(titles[i], dates[i], genres[i], ratings[i], directors[i], synopsises[i], casts[i], drawables[i], imdb_urls[i], moviedb_urls[i]);
            list.add(movie);
        }
        return list;
    }

    private static String[] titles = {
            "Spider-Man: Into the Spider-Verse",
            "Mary Poppins Returns",
            "A Star Is Born",
            "Aquaman",
            "Avengers: Infinity War",
            "Bird Box",
            "Bohemian Rhapsody",
            "Bumblebee",
            "Once Upon a Deadpool",
            "How to Train Your Dragon: The Hidden World"
    };
    private static String[] dates = {
            "December 12, 2018",
            "December 22, 2018",
            "October 19, 2018",
            "December 21, 2018",
            "April 25, 2018",
            "December 14, 2018",
            "October 27, 2018",
            "December 19, 2018",
            "May 15, 2018",
            "January 9, 2019"
    };
    private static String[] genres = {
            "Fantasy/Sci-fi",
            "Fantasy/Adventure",
            "Drama/Romance",
            "Fantasy/Sci-fi",
            "Fantasy/Sci-fi",
            "Drama/Thriller",
            "Drama/Biography",
            "Sci-fi/Action",
            "Fantasy/Sci-fi",
            "Fantasy/Action"
    };
    private static String[] ratings = {
            "84%",
            "66%",
            "75%",
            "68%",
            "83%",
            "70%",
            "81%",
            "65%",
            "69%",
            "77%"
    };
    private static String[] directors = {
            "Rodney Rothman",
            "Rob Marshall",
            "Bradley Cooper",
            "James Wan",
            "Anthony Russo",
            "Susanne Bier",
            "Bryan Singer",
            "Travis Knight",
            "David Leitch",
            "Dean DeBlois"
    };
    private static String[] synopsises = {
            "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
            "In Depression-era London, a now-grown Jane and Michael Banks, along with Michael's three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives.",
            "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
            "A kidnapped Fred Savage is forced to endure Deadpool's PG-13 rendition of Deadpool 2 as a Princess Bride-esque story that's full of magic, wonder & zero F's.",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."
    };
    private static String[] casts = {
            "Shameik Moore, Jake Johnson, Hailee Steinfeld, Mahershala Ali, Brian Tyree Henry",
            "Emily Blunt, Lin-Manuel Miranda, Ben Whishas, Emily Mortimer, Pixie Davies",
            "Lady Gaga, Bradley Cooper, Sam Elliott, Andrew Dice Clay, Rafi Gavron",
            "Jason Momoa, Amber Heard, Willem Dafoe, Patrick Wilson, Nicole Kidman",
            "Robert Downey Jr., Chris Hemsworth, Chris Evans, Mark Ruffalo, Scarlett Johansson",
            "Sandra Bullock, Trevante Rhodes, John Malkovich, Sarah Paulson, Jacki Weaver",
            "Rami Malek, Gwilym Lee, Ben Hardy, Joseph Mazzello, Lucy Boynton",
            "Hailee Steinfeld, Jorge Lendeborg Jr., John Cena, Jason Ian Drucker, Pamela Adlon",
            "Ryan Reynolds, Fred Savage, Josh Brolin, Morena Baccarin, Julian Dennison",
            "Jay Baruchel, America Ferrera, F. Murray Abraham, Cate Blanchett, Gerard Butler"
    };
    private static String[] drawables = {
            "drawable/poster_spiderman",
            "drawable/poster_marrypopins",
            "drawable/poster_a_star",
            "drawable/poster_aquaman",
            "drawable/poster_avengerinfinity",
            "drawable/poster_birdbox",
            "drawable/poster_bohemian",
            "drawable/poster_bumblebee",
            "drawable/poster_deadpool",
            "drawable/poster_dragon",
    };
    private static String[] imdb_urls = {
            "https://www.imdb.com/title/tt4633694/",
            "https://www.imdb.com/title/tt5028340/",
            "https://www.imdb.com/title/tt1517451/",
            "https://www.imdb.com/title/tt1477834/",
            "https://www.imdb.com/title/tt4154756/",
            "https://www.imdb.com/title/tt2737304/",
            "https://www.imdb.com/title/tt1727824/",
            "https://www.imdb.com/title/tt4701182/",
            "https://www.imdb.com/title/tt5463162/",
            "https://www.imdb.com/title/tt2386490/"
    };
    private static String[] moviedb_urls = {
            "https://www.themoviedb.org/movie/324857/",
            "https://www.themoviedb.org/movie/400650/",
            "https://www.themoviedb.org/movie/332562/",
            "https://www.themoviedb.org/movie/297802/",
            "https://www.themoviedb.org/movie/299536/",
            "https://www.themoviedb.org/movie/405774/",
            "https://www.themoviedb.org/movie/424694/",
            "https://www.themoviedb.org/movie/424783/",
            "https://www.themoviedb.org/movie/567604/",
            "https://www.themoviedb.org/movie/166428/"
    };
}
