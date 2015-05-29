package sg.interactivestory.Model;

import sg.interactivestory.R;

/**
 * Created by Shahzaib on 1/11/2015.
 */
public class Story {
    private Page[] mPages;

    public Story() {

        // array declaration
        mPages = new Page[14];

       // image, text and choices on each page
        mPages[0] = new Page(
                R.drawable.page0,
                    "%s, as an explorer, you were aware of the fact that your profession involved risks. While surveying a newly discovered forest, your plane’s engine malfunctions and you crash into the forest. With the radio transmitter broken, you must find a way to survive as night fast approaches.",
                new Choice("LEAVE PLANE AND EXPLORE", 2),
                new Choice("STAY NEAR PLANE", 1));

        mPages[1] = new Page(
                R.drawable.page1,
                "Being injured, you choose to stay near your crashed plane, even though all the food you brought along is destroyed. As night approaches, you wonder what your next step should be. What will you do, %s?",
                new Choice("DON'T MOVE AND HOPE FOR HELP", 5),
                new Choice("EXPLORE AREA SURROUNDING PLANE", 3));

        mPages[2] = new Page(
                R.drawable.page5,
                "You, being an adventurer, choose to explore the forest. While walking, you admire the beauty of the surrounding trees. However %s, you have sustained injuries from the crash, and hunger is preventing you from truly admiring the forest. You stumble upon a rocky hill, with a cave alongside its base.",
                new Choice("EXPLORE THE CAVE", 3),
                new Choice("CLIMB THE HILL", 6));

        mPages[3] = new Page(
                R.drawable.page2,
                "You realize that this might have been a mistake. You can sense another presence nearby. You hear the growls, and see a shadow looming over you. It’s a hungry bear, looking for it's next meal.",
                new Choice("PLAY DEAD", 12),
                new Choice("RUN FOR YOUR LIFE", 5));


        mPages[4] = new Page(
                R.drawable.page3,
                "%s, the decisions you made are well thought out, demonstrating your excellent survival instincts. The wilderness is a harsh place to survive, and a wrong decision can be costly. Through your resilience and sound decision making, you eventually find a way out of the forest, ready to explore once again.");

        mPages[5] = new Page(
                R.drawable.page4,
                "%s, the decisions you have made are rather poor. Perhaps it is because of the injuries and hunger that cloud your mind. However, the wilderness is a harsh place to survive, and a wrong decision can be costly. Poor decision making along with a harsh environment result in your unfortunate end.");

        mPages[6] = new Page(
                R.drawable.page6,
                "You climb atop the hill to get a better view of the surrounding area. You notice a river flowing downstream. Following the river may lead you to some other adventurer that may be exploring this forest or some native tribe. While thinking this, you see some movement in the trees beneath.",
                new Choice("FOLLOW THE RIVER", 9),
                new Choice("INVESTIGATE THE MOVEMENT", 7));

        mPages[7] = new Page(
                R.drawable.page7,
                "You decide to follow your gut and investigate the movement in the trees below. When you get close enough to the area of the movement, you realize it was made by a leopard, who has now noticed your presence. What will you do, %s?",
                new Choice("CLIMB A TREE", 4),
                new Choice("RUN FOR YOUR LIFE", 5));

        mPages[8] = new Page(
                R.drawable.page4,
                "%s, the decisions you have made are rather poor. Perhaps it is because of the injuries and hunger that cloud your mind. A leopard has the ability to climb trees, and can easily outrun a human. This encounter leads to your unfortunate end");

        mPages[9] = new Page(
                R.drawable.page8,
                "You decide to follow the river and sure enough, you come across a bunch of tribal folk, native to the forest. However, they have their own dialect and you cannot understand them. You also do not know if they see you as a threat, and thus may want to cause you harm. You notice a stick nearby. Perhaps you can use the stick in some way.",
                new Choice("USE STICK AS A WEAPON", 11),
                new Choice("USE STICK TO DRAW PICTOGRAPHS", 10));

        mPages[10] = new Page(
                R.drawable.page3,
                "%s, the decisions you made are well thought out, demonstrating your excellent survival instincts. The natives turn out to be friendly and show you a way out. Through your resilience and sound decision making, you survive, and are ready to explore once again.");

        mPages[11] = new Page(
                R.drawable.page4,
                "%s, the decisions you have made are rather poor. Perhaps it is because of the injuries and hunger that cloud your mind. Showing aggression against the tribal men is a mistake, as they all attack. This encounter leads to your unfortunate end");

        mPages[12] = new Page(
                R.drawable.page10,
                "After a while of sniffing you around and throwing you, the bear assumes you are dead. You are injured but still very much alive. The area is still largely unexplored. However, you recall seeing a hill, and think maybe you should climb that to get a better view. What will you do, %s?",
                new Choice("EXPLORE FURTHER", 13),
                new Choice("GO BACK AND CLIMB HILL", 6));

        mPages[13] = new Page(
                R.drawable.page9,
                "You come across a locked chest, in an obscure location. The lock seems fairly easy to break but you do not know if what is inside is harmful. What will you do, %s?",
                new Choice("OPEN CHEST", 10),
                new Choice("GO BACK AND CLIMB HILL", 6));

        mPages[10] = new Page(
                R.drawable.page3,
                "%s, the decisions you made are well thought out, demonstrating your excellent survival instincts. You find a map of forest showing the exit, as well as a compass. Perhaps it was left by another explorer.Through your sound decision making, you survive, and are ready to explore once again.");


    }

    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }


 }

