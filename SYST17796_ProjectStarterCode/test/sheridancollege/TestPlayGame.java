package sheridancollege;

import ca.sheridancollege.project.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPlayGame extends Player {

    /**
     * Create a new Pleyer with given name and password
     *
     * @param firstName  : name of the player
     * @param playerPass : password of player
     */
    public TestPlayGame(String firstName, String playerPass) {
        super(firstName, playerPass);
    }

    @BeforeClass
    public static void setTheClassUpper() {
    }

    @AfterClass
    public static void setTheClassDown() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void setDown() {
    }

    @Test
    public void testDrawCard() {
        int cardCode = 2;

        Draw2Card draw2Card1 = new Draw2Card(Color.RED, cardCode);
        int score1 = draw2Card1.getCardScore();
        System.out.println("Your score is" + score1);

        Draw2Card draw2Card2 = new Draw2Card(Color.BLUE, cardCode);
        int score2 = draw2Card2.getCardScore();
        System.out.println("Your score is" + score2);

        Draw2Card draw2Card3 = new Draw2Card(Color.BLACK_B, cardCode);
        int score3 = draw2Card3.getCardScore();
        System.out.println("Your score is" + score3);
    }

    @Test
    public void boundarytestDrawCard() {
        int cardCode = 108;

        Draw2Card draw2Card1 = new Draw2Card(Color.RED, cardCode);
        int score1 = draw2Card1.getCardScore();
        System.out.println("Your score is" + score1);

        Draw2Card draw2Card2 = new Draw2Card(Color.BLUE, cardCode);
        int score2 = draw2Card2.getCardScore();
        System.out.println("Your score is" + score2);

        Draw2Card draw2Card3 = new Draw2Card(Color.BLACK_B, cardCode);
        int score3 = draw2Card3.getCardScore();
        System.out.println("Your score is" + score3);
    }

    public void wrongtestDrawCard() {
        int cardCode = 110;

        Draw2Card draw2Card1 = new Draw2Card(Color.RED, cardCode);
        int score1 = draw2Card1.getCardScore();
        System.out.println("Your score is" + score1);

        Draw2Card draw2Card2 = new Draw2Card(Color.BLUE, cardCode);
        int score2 = draw2Card2.getCardScore();
        System.out.println("Your score is" + score2);

        Draw2Card draw2Card3 = new Draw2Card(Color.BLACK_B, cardCode);
        int score3 = draw2Card3.getCardScore();
        System.out.println("Your score is" + score3);
    }

    @Test
    public void boundarytestReverseCardDraw() {
        int cardCode = 108;

        ReverseCard reversCard1 = new ReverseCard(Color.RED, cardCode);
        int score1 = reversCard1.getCardScore();
        System.out.println("Your score is" + score1);

        ReverseCard reversCard2 = new ReverseCard(Color.BLUE, cardCode);
        int score2 = reversCard2.getCardScore();
        System.out.println("Your score is" + score2);

        ReverseCard reversCard3 = new ReverseCard(Color.BLACK_B, cardCode);
        int score3 = reversCard3.getCardScore();
        System.out.println("Your score is" + score3);

    }

    public void wrongtestReverseCardDraw() {
        int cardCode = 110;

        ReverseCard reversCard1 = new ReverseCard(Color.RED, cardCode);
        int score1 = reversCard1.getCardScore();
        System.out.println("Your score is" + score1);

        ReverseCard reversCard2 = new ReverseCard(Color.BLUE, cardCode);
        int score2 = reversCard2.getCardScore();
        System.out.println("Your score is" + score2);

        ReverseCard reversCard3 = new ReverseCard(Color.BLACK_B, cardCode);
        int score3 = reversCard3.getCardScore();
        System.out.println("Your score is" + score3);

    }

    @Test
    public void wildCardTest() {
        int cardCode = 20;

        WildCard wildCard1 = new WildCard(cardCode);
        int score1 = wildCard1.getCardScore();
        System.out.println("Your score is" + score1);

        WildCard wildCard2 = new WildCard(cardCode);
        int score2 = wildCard2.getCardScore();
        System.out.println("Your score is" + score2);

    }

    @Test
    public void boundarywildCardTest() {
        int cardCode = 108;

        WildCard wildCard1 = new WildCard(cardCode);
        int score1 = wildCard1.getCardScore();
        System.out.println("Your score is" + score1);

        WildCard wildCard2 = new WildCard(cardCode);
        int score2 = wildCard2.getCardScore();
        System.out.println("Your score is" + score2);

    }

    @Test
    public void wrongwildCardTest() {
        int cardCode = 110;

        WildCard wildCard1 = new WildCard(cardCode);
        int score1 = wildCard1.getCardScore();
        System.out.println("Your score is" + score1);

        WildCard wildCard2 = new WildCard(cardCode);
        int score2 = wildCard2.getCardScore();
        System.out.println("Your score is" + score2);

    }

}