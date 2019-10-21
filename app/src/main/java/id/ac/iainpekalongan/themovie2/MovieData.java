package id.ac.iainpekalongan.themovie2;

import java.util.ArrayList;

import id.ac.iainpekalongan.themovie2.Model.Movies;

public class MovieData {

    public static String[][] data = new String[][]{
            {
                "IT CHAPTER TWO",
                    "Evil resurfaces in Derry as director Andy Muschietti reunites the Losers Club in a return to where it all began with \"IT Chapter Two,\" the conclusion to the highest-grossing horror film of all time. Twenty-seven years after the Losers Club defeated Pennywise, he has returned to terrorize the town of Derry once more. Now adults, the Losers have long since gone their separate ways. However, kids are disappearing again, so Mike, the only one of the group to remain in their hometown, calls the others home. Damaged by the experiences of their past, they must each conquer their deepest fears to destroy Pennywise once and for all...putting them directly in the path of the clown that has become deadlier than ever.",
                    "https://resizing.flixster.com/XukbYxQoSFKmQ7Y5MWKOkAJZTlo=/fit-in/200x296.2962962962963/v1.bTsxMzEzMTgyNTtwOzE4MTk2OzEyMDA7MTA4MDsxMzQ5",
            },
            {   "ANGEL HAS FALLEN",
                    "When there is an assassination attempt on U.S. President Allan Trumbull (Morgan Freeman), his trusted confidant, Secret Service Agent Mike Banning (Gerard Butler), is wrongfully accused and taken into custody. After escaping from capture, he becomes a man on the run and must evade his own agency and outsmart the FBI in order to find the real threat to the President. Desperate to uncover the truth, Banning turns to unlikely allies to help clear his name, keep his family from harm and save the country from imminent danger.",
                    "https://resizing.flixster.com/bwkGy3wVXML6meWZaP_sjANLrNY=/fit-in/200x296.2962962962963/v1.bTsxMzEzOTAzNjtqOzE4MTk3OzEyMDA7MTk0NDsyODgw",
            },
            {   "GOOD BOYS",
                    "After being invited to his first kissing party, 12-year-old Max (Room's Jacob Tremblay) is panicking because he doesn't know how to kiss. Eager for some pointers, Max and his best friends Thor (Brady Noon, HBO's Boardwalk Empire) and Lucas (Keith L. Williams, Fox's The Last Man On Earth) decide to use Max's dad's drone -- which Max is forbidden to touch -- to spy (they think) on a teenage couple making out next door. But when things go ridiculously wrong, the drone is destroyed. Desperate to replace it before Max's dad (Will Forte, The Last Man on Earth) gets home, the boys skip school and set off on an odyssey of epically bad decisions involving some accidentally stolen drugs, frat-house paintball, and running from both the cops and terrifying teenage girls (Life of the Party's Molly Gordon and Ocean's Eight's Midori Francis).",
                    "https://resizing.flixster.com/A1XHwB5YHFbAbiezgxIWH8h2BHI=/fit-in/200x296.2962962962963/v1.bTsxMzE2MTUxMjtqOzE4MTk3OzEyMDA7MTAwMDsxNDY0",
            },
            {   "THE LION KING",
                    "From Disney Live Action, director Jon Favreau's all-new \"The Lion King\" journeys to the African savanna where a future king is born. Simba idolizes his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the kingdom celebrates the new cub's arrival. Scar, Mufasa's brother-and former heir to the throne-has plans of his own. The battle for Pride Rock is ravaged with betrayal, tragedy and drama, ultimately resulting in Simba's exile. With help from a curious pair of newfound friends, Simba will have to figure out how to grow up and take back what is rightfully his.",
                    "https://resizing.flixster.com/feRInF7qkG5d0AKYwb0iISw_tEY=/fit-in/200x296.2962962962963/v1.bTsxMzAwNDEwMDtqOzE4MTk1OzEyMDA7MTY4ODsyNTAw",
            },
            {   "FAST & FURIOUS PRESENTS: HOBBS & SHAW",
                    "Ever since hulking lawman Hobbs (Dwayne Johnson), a loyal agent of America's Diplomatic Security Service, and lawless outcast Shaw (Jason Statham), a former British military elite operative, first faced off in 2015's Furious 7, the duo have swapped smack talk and body blows as they've tried to take each other down. But when cyber-genetically enhanced anarchist Brixton (Idris Elba) gains control of an insidious bio-threat that could alter humanity forever--and bests a brilliant and fearless rogue MI6 agent (The Crown's Vanessa Kirby), who just happens to be Shaw's sister--these two sworn enemies will have to partner up to bring down the only guy who might be badder than themselves.",
                    "https://resizing.flixster.com/f4-2RrJKKcJWSQJI5oseb8H76fk=/fit-in/200x296.2962962962963/v1.bTsxMzExNTg5NTtqOzE4MTk2OzEyMDA7MzE1ODs1MDAw",
            },
            {   "OVERCOMER",
                    "Life changes overnight for coach John Harrison when his high school basketball team and state championship dreams are crushed under the weight of unexpected news. When the largest manufacturing plant shuts down and hundreds of families leave their town, John questions how he and his family will face an uncertain future. After reluctantly agreeing to coach cross-country, John and his wife, Amy, meet an aspiring athlete who's pushing her limits on a journey toward discovery. Inspired by the words and prayers of a new-found friend, John becomes the least likely coach helping the least likely runner attempt the impossible in the biggest race of the year.",
                    "https://resizing.flixster.com/xkv6UqUPq6zEw_83924mlnhYVjs=/fit-in/200x296.2962962962963/v1.bTsxMjk5Mjg3MjtqOzE4MTk1OzEyMDA7ODY0OzEyODA",
            },
            {   "DORA AND THE LOST CITY OF GOLD",
                    "Having spent most of her life exploring the jungle with her parents, nothing could prepare Dora (Isabela Moner) for her most dangerous adventure ever -- High School. Always the explorer, Dora quickly finds herself leading Boots (her best friend, a monkey), Diego (Jeffrey Wahlberg), a mysterious jungle inhabitant (Eugenio Derbez), and a rag tag group of teens on a live-action adventure to save her parents (Eva Longoria, Michael Peña) and solve the impossible mystery behind a lost city of gold.",
                    "https://resizing.flixster.com/aHCsh3iVKP969x5l9_NgtrBUVck=/fit-in/200x296.2962962962963/v1.bTsxMzEzMjc3NDtqOzE4MTk2OzEyMDA7MTgyODsyODUz",
            },
            {   "READY OR NOT",
                    "Ready Or Not follows a young bride (Samara Weaving) as she joins her new husband's (Mark O'Brien) rich, eccentric family (Adam Brody, Henry Czerny, Andie MacDowell) in a time-honored tradition that turns into a lethal game with everyone fighting for their survival.",
                    "https://resizing.flixster.com/2-KP9av0WdiGyR8H0sgp30hqIxI=/fit-in/200x296.2962962962963/v1.bTsxMzE1NzQzNDtqOzE4MTk3OzEyMDA7NDM2OzY1MA",
            },
            {   "SCARY STORIES TO TELL IN THE DARK",
                    "It's l968 in America. Change is blowing in the wind... but seemingly far removed from the unrest in the cities is the small town of Mill Valley where for generations, the shadow of the Bellows family has loomed large. It is in their mansion on the edge of town that Sarah, a young girl with horrible secrets, turned her tortured life into a series of scary stories, written in a book that has transcended time--stories that have a way of becoming all too real for a group of teenagers who discover Sarah's terrifying tome.",
                    "https://resizing.flixster.com/LLuVPbDcKVrgACTBIB9hhGXSf14=/fit-in/200x296.2962962962963/v1.bTsxMzA5MjQwMjtqOzE4MTk2OzEyMDA7NDA1MDs2MDAw",
            },
            {   "ONCE UPON A TIME IN HOLLYWOOD",
                    "Quentin Tarantino's ninth feature film is a story that takes place in Los Angeles in 1969, at the height of hippy Hollywood. The two lead characters are Rick Dalton (Leonardo DiCaprio), former star of a western TV series, and his longtime stunt double Cliff Booth (Brad Pitt). Both are struggling to make it in a Hollywood they don't recognize anymore. But Rick has a very famous next-door neighbor...Sharon Tate.",
                    "https://resizing.flixster.com/Y-LEcdg8_L2daSZl5b2z0C9YUGI=/fit-in/200x296.2962962962963/v1.bTsxMzEwMTEzNDtqOzE4MTk2OzEyMDA7MTY5OzI1MA",
            },
            {   "THE PEANUT BUTTER FALCON",
                    "A modern Mark Twain style adventure story, THE PEANUT BUTTER FALCON tells the story of Zak (Zack Gottsagen), a young man with Down syndrome, who runs away from a residential nursing home to follow his dream of attending the professional wrestling school of his idol, The Salt Water Redneck (Thomas Haden Church). A strange turn of events pairs him on the road with Tyler (Shia LaBeouf), a small time outlaw on the run, who becomes Zak's unlikely coach and ally. Together they wind through deltas, elude capture, drink whisky, find God, catch fish, and convince Eleanor (Dakota Johnson), a kind nursing home employee charged with Zak's return, to join them on their journey.",
                    "https://resizing.flixster.com/3ZS8AE98ZyrEa0uYLwhs7xixf3M=/fit-in/200x296.2962962962963/v1.bTsxMzE1ODIwMjtqOzE4MTk3OzEyMDA7Njc0Ozk5OA",
            },
            {   "THE ANGRY BIRDS MOVIE 2",
                    "The flightless angry birds and the scheming green piggies take their beef to the next level in The Angry Birds Movie 2! When a new threat emerges that puts both Bird and Pig Island in danger, Red (Jason Sudeikis), Chuck (Josh Gad), Bomb (Danny McBride), and Mighty Eagle (Peter Dinklage) recruit Chuck's sister Silver (Rachel Bloom) and team up with pigs Leonard (Bill Hader), his assistant Courtney (Awkwafina), and techpig Garry (Sterling K. Brown) to forge an unsteady truce and form an unlikely superteam to save their homes.",
                    "https://resizing.flixster.com/D_v9NkC9s7Ngp5_mC1uW9eNAFFU=/fit-in/200x296.2962962962963/v1.bTsxMzEwNzQwMztqOzE4MTk2OzEyMDA7NjA3Mjs5MDAw",
            },

    };

    public static ArrayList<Movies> getListData(){
        ArrayList<Movies> list = new ArrayList<>();
        for (String[] aData : data) {
            Movies movie = new Movies();
            movie.setTitle(aData[0]);
            movie.setDescription(aData[1]);
            movie.setPhoto(aData[2]);
            list.add(movie);
        }
        return list;
    }
}
