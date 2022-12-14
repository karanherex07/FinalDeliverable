package ca.sheridancollege.project;

/**
 * This class represent a Draw2 card in UNO game. 
 * It extends from {@code Card} class
 * @see Card
 */
public class Draw2Card extends Card
{
           /* Constructor */

    /**
     * Creat a new Draw2 card with given details
     * 
     * @param cardColor : the color of the card
     * @param cardCode : the code number of the card. an int in range [1, 108]
     */ 
    public Draw2Card(Color cardColor, int cardCode)
    {
        super(20, cardColor, cardCode);
    }


    


            /* Methods */

    /**
     * This method return the {@code String} of the each line of the visual card for print it 
     *  in terminal. if the given number be less than 0, the super class toSetirng will be called.
     *
     * 
     * @param lineNumber : the number of the card line
     * @return a {@code String} of the given card line
     * 
     * @see cardsOutput.txt, (in project repository)
     */
    @Override
    public String toString(int lineNumber)
    {
        if (lineNumber < 0)
            return super.toString((-1)*lineNumber);

        String cardColorCode = Color.getColorCodeString(super.getCardColor());

        switch (lineNumber)
        {
            // the top and bottom of the card
            case 1:
            case 7: 
                return cardColorCode + "•~~~~~~~•" +
                        Color.getColorCodeString(Color.RESET);

            case 2:
                return cardColorCode + "|+2     |" +
                        Color.getColorCodeString(Color.RESET);

            case 3:
            case 5:
                return cardColorCode + "|       |" +
                        Color.getColorCodeString(Color.RESET);

            case 4:
                return cardColorCode + "| Draw2 |" +
                        Color.getColorCodeString(Color.RESET);

            case 6:
                return cardColorCode + "|     +2|" + 
                        Color.getColorCodeString(Color.RESET);

            case 8:
                return Color.getColorCodeString(Color.WHITE) + "code: " + super.getCardCode() +
                        Color.getColorCodeString(Color.RESET);
        }

        return null;
    }
}