package votecounterproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version Spring 2019
 * @author clatulip
 */
public class ArrayListVoteCounterTest {

    private ArrayListVoteCounter voteCounter;

    @Before
    public void setUp() throws Exception {
        this.voteCounter = new ArrayListVoteCounter();
        /*
        Data Legend:
            [0] = "Darth Sidius"
            [1] = "Darth Maul"
            [2] = "Darth Vader"
            [3] = "Darth Plagueis"
         */
    }

    @Test
    public void recordVote() {
        // assert both the votes and spoiled votes lists are empty.
        
        // now, record some votes for one of the candidates. Use the legend 
        // above for clarification
        
        // using the getSithSenateMemberVotes method, make sure your candidate 
        // actually recieved their votes
        
        // assert that the size of the votes list has increased.
        
    }

}