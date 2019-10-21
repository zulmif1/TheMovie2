package id.ac.iainpekalongan.themovie2;

import java.util.ArrayList;

import id.ac.iainpekalongan.themovie2.Model.TVShow;

public class TVShowData {

    public static String[][] data = new String[][]{
            {"JANE THE VIRGIN: SEASON 5",
                    "Gina Rodriguez delivers a stellar performance in Jane the Virgin's final season, grounding the series in humanity amidst all its quirky telenovela humor.",
                    "https://resizing.flixster.com/qzZYBhEAQLcxkIDQ6hhn65nSw-E=/206x305/v1.dDs0NDA1MTE7ajsxODE4NTsxMjAwOzgwMDsxMjAw",
            },
            {"SOUTH SIDE: SEASON 1",
                    "Absurdly funny and fearless, South Side successfully captures the spirit of a community and confronts tough social constructs with smart writing, a spectacular cast, and just the right amount of silliness.",
                    "https://resizing.flixster.com/TVIL6lPHuMSArVWoPfmoRpKsvHY=/206x305/v1.dDs1MjY4Mzc7ajsxODE4NjsxMjAwOzkwMDsxMzUw",
            },
            {"A BLACK LADY SKETCH SHOW: SEASON 1",
                    "Singular, subversive, and simply hilarious, A Black Lady Sketch Show finds universal humor in specific spaces to craft quick-witted sketches that perfectly showcase Robin Thede and her talented cast.",
                    "https://resizing.flixster.com/7HXojwBHAuf1kfznTOpKAK6QJw8=/206x305/v1.dDs1MzY4NTM7ajsxODE4NjsxMjAwOzcyMDs5MDA",
            },
            {"DAVID MAKES MAN: SEASON 1",
                    "Powerful, beautiful, and like nothing else on TV, David Makes Man blends dreamy aesthetics with an empathetically crafted story to create a truly unique viewing experience.",
                    "https://resizing.flixster.com/FkYI1Ci2FCvoSUsAZajFggINKAc=/206x305/v1.dDs1NDUyOTE7ajsxODE4NjsxMjAwOzE1MzY7MjA0OA",
            },
            {"SHERMAN'S SHOWCASE: SEASON 1 ",
                    "Bold, brisk, and beautiful, Sherman's Showcase is a delightful and stylish sketch show that moves to its own groove and invites everyone to laugh along.",
                    "https://resizing.flixster.com/fw0suWtlHIFH9UYbAyLvxsjqkc0=/206x305/v1.dDs1MTgxNjI7ajsxODE4NTsxMjAwOzEwMDA7MTQ1Mw",
            },
            {"Orange Is the New Black: Season 7",
                    "Carried by its exceptional ensemble, Orange Is the New Black's final season gets straight to the point, tackling hard-hitting issues with the same dramatic depth and gallows humor that made the show so ground-breaking to begin with.",
                    "http://resizing.flixster.com/lEGZENks0fkoAcZyb8xScKc9K3k=/120x178/v1.dDs1MTkzNzk7ajsxODIyMDsyMDQ4OzE1MDA7MjIyMg",
            },
            {"When They See Us: Season 1",
                    "Ava DuVernay pulls no punches in When They See Us, laying out the harrowing events endured by the Central Park Five while adding a necessary layer of humanity to their story that challenges viewers to reconsider what it means to find justice in America.",
                    "http://resizing.flixster.com/DZhK1e7KABkrLPZ2_H7r0eDgB7k=/120x178/v1.dDs0OTkyODM7ajsxODE5MzsyMDQ4OzQwMDs1OTM",
            },
            {"Derry Girls: Series 2",
                    "The sophomore season of Derry Girls doesn't lose any of its irreverent charms thanks its predictably unpredictable romps and canny characterizations.",
                    "http://resizing.flixster.com/aTlKN84E8kF8U5QCFWkiO1rny4I=/120x180/v1.dDszOTQ1NTc7ajsxODIyNjsyMDQ4OzEzNDg7MjAyMg",
            },
            {"Succession: Season 2",
                    "Succession returns in darkly funny form, with sharp writing, exceptional performances, and a surprising new level of sympathy for some of television's least likable characters.",
                    "http://resizing.flixster.com/fl5yX2jXrU8YuCK2NUgvwJ2-IEs=/120x180/v1.dDs1MzEwNjY7ajsxODIwNzsyMDQ4OzE5MjA7Mjg4MA",
            },
            {"This Way Up: Season 1",
                    "Devastating, hilarious, and surprisingly light, This Way Up captures the complexities of mental health with an empathetic -- if at times wandering -- eye.",
                    "http://resizing.flixster.com/uh4dyh0QDVNIurMoid2ZrtyXNps=/120x180/v1.dDs1NDc4MTE7ajsxODIxMjsyMDQ4OzU0MDs4MTA",
            },
            {"GLOW: Season 3",
                    "GLOW dives even deeper into the lives of its divas to deliver a knock-out third season that solidifies its place as one of TV's most compelling -- and hilarious -- character studies.",
                    "http://resizing.flixster.com/9WGBI_B-xpF62H5cBfaZu9bMyzw=/120x178/v1.dDs1MTUwNDM7ajsxODIwMzsyMDQ4OzEwMTM7MTUwMA",
            },
            {"The Terror: Infamy",
                    "Real-world and supernatural horrors collide in Infamy, an exceptionally well-crafted ghost story that creeps under the skin and stays there.",
                    "http://resizing.flixster.com/UNlHkbBQUmukb5KNHed4aUC5BGc=/120x180/v1.dDs1NDQ3NzM7ajsxODE4OTsyMDQ4OzE2MDA7MjQwMA",
            },
            {"The Dark Crystal: Age of Resistance: Season 1",
                    "An epic fantasy adventure that will please old and new fans alike, Age of Resistance expertly builds on the lore of The Dark Crystal, crafting compelling new mythos without losing sight of the humanity at the story's heart.",
                    "http://resizing.flixster.com/nPOy0JWOtjoCvXQ-X7ew9S2lrp8=/120x150/v1.dDs0OTg3MzE7ajsxODIyNjsyMDQ4OzEwODA7MTM1MA",
            },
            {"The Spy: Limited Series",
                    "Though a bit too familiar, The Spy is never less than watchable thanks to a moving performance from Sacha Baron Cohen.",
                    "http://resizing.flixster.com/j7sOURNuMwOXKh47TvC2UwuMhqA=/120x178/v1.dDs1NTUyODY7ajsxODIxNzsyMDQ4OzQwNTs2MDA",
            },
            {"On Becoming a God in Central Florida: Season 1",
                    "Though viewers' mileage may vary, The Boys' violent delights and willingness to engage in heavy, relevant themes are sure to please those looking for a new group of antiheroes to root for.",
                    "http://resizing.flixster.com/vzL6jQR2zf0UiuFENU1jYza-0EM=/120x180/v1.dDs1Mjg3OTU7ajsxODE4NjsyMDQ4OzQwNDs2MDg",
            },
    };

    public static ArrayList<TVShow> getListData() {
        ArrayList<TVShow> list = new ArrayList<>();
        for (String[] aData : data) {
            TVShow tvShow = new TVShow();
            tvShow.setTitle(aData[0]);
            tvShow.setDescription(aData[1]);
            ;
            tvShow.setPhoto(aData[2]);
            list.add(tvShow);
        }
        return list;
    }
}
