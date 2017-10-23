package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyJoke {

    private List<String> jokes= Arrays.asList(
            "Reporter: \"Excuse me, may I interview you?\" \n" +
                    "Man: \"Yes!\" \n" +
                    "Reporter: \"Name?\" \n" +
                    "Man: \"Abdul Al-Rhazim.\" \n" +
                    "Reporter: \"Sex?\" \n" +
                    "Man: \"Three to five times a week.\" \n" +
                    "Reporter: \"No no! I mean male or female?\" \n" +
                    "Man: \"Yes, male, female... sometimes camel.\" \n" +
                    "Reporter: \"Holy cow!\" \n" +
                    "Man: \"Yes, cow, sheep... animals in general.\" \n" +
                    "Reporter: \"But isn't that hostile?\" \n" +
                    "Man: \"Yes, horse style, dog style, any style.\" \n" +
                    "Reporter: \"Oh dear!\" \n" +
                    "Man: \"No, no deer. Deer run too fast. Hard to catch.\""
            ,"I asked a Chinese girl for her number. She said, \"Sex! Sex! Sex! Free sex tonight!\" \nI said, \"Wow!\" Then her friend said, \"She means 666-3629.\""
            ,"Yo mamma is so ugly when she tried to join an ugly contest they said, \"Sorry, no professionals.\""
            ,"Yo momma is so fat when she got on the scale it said, \"I need your weight not your phone number.\""
            ,"Do not be racist; be like Mario. He's an Italian plumber, who was made by the Japanese, speaks English, looks like a Mexican, jumps like a black man, and grabs coins like a Jew!"
            ,"Yo momma is so fat that when she went to the beach a whale swam up and sang, \"We are family, even though you're fatter than me.\""
            ,"Yo momma is so fat when she sat on WalMart, she lowered the prices."
            ,"Yo momma's so fat, that when she fell, no one was laughing but the ground was cracking up."
            ,"Q: What starts with F and ends with U-C-K?\n" +
                    "A: Firetruck."
            ,"My friend thinks he is smart. He told me an onion is the only food that makes you cry, so I threw a coconut at his face."
            ,"On the roof of a very tall building are four men; one is asian, one is mexican, one is black,\n and the last one is white. The asian walks to the ledge and says, \"This is for all my people\" \nand jumps off the roof. Next, the mexican walks to the ledge and also says, \"This is for all \nmy people\" and then he jumps off the roof. Next is the black guy's turn. \nThe black guy walks to the ledge and says, \"This is for all my people\" \nand then throws the white guy off the roof."
    );

    public String getJoke(){
        return jokes.get(getrandom());
    }

    private int getrandom(){
        return new Random().nextInt(10);
    }
}
