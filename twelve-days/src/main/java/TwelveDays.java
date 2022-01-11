class TwelveDays {

    private String[] days = {
            "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };

    private String[] phrases = {
            "a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese-a-Laying",
            "seven Swans-a-Swimming",
            "eight Maids-a-Milking",
            "nine Ladies Dancing",
            "ten Lords-a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming"
    };

    private String phraseOne = "On the ";
    private String phraseTwo = " day of Christmas my true love gave to me: ";

    String verse(int verseNumber) {

        StringBuilder sentence = new StringBuilder();

        sentence.append(phraseOne);
        sentence.append(days[verseNumber - 1]);
        sentence.append(phraseTwo);

        for (int i = verseNumber; i > 0; i--) {
            sentence.append(phrases[i - 1]);
            if (i != 1) {
                sentence.append(", ");
            }
            if (i == 2) {
                sentence.append("and ");
            }
        }

        sentence.append(".\n");
        return sentence.toString();

    }

    String verses(int startVerse, int endVerse) {
        StringBuilder poem = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            poem.append(verse(i));
            if (i != endVerse) {
                poem.append("\n");
            }
        }
        return poem.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}
