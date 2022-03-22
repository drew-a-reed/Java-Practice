package com.techelevator;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class Application
{
    public static void main(String[] args)
    {
        Auction auction = new Auction("test");
        // static void main is the front door to a Java application
        // that is why it MUST be declared as static
        Application application = new Application();
        application.run();
    }

    Auction auction = new Auction("NOTHING TO BID ON YET - PLEASE CREATE AN AUCTION FIRST");

    public void run()
    {
        UserOutput.displayWelcome();

        while(true)
        {
            String userOption = UserInput.getHomeScreenSelection();

            if(userOption.equals("A"))
            {
                createAuction();
            }
            else if(userOption.equals("B"))
            {
                bidOnAuction();
            }
            else if(userOption.equals("D"))
            {
                displayWinner();
            }
            else if(userOption.equals("Q"))
            {
                break;
            }
        }

        UserOutput.displayThankYou();
    }

    private void createAuction()
    {
        this.auction = UserInput.getNewAuction();
    }

    private void bidOnAuction()
    {
        Bid bid = UserInput.getBid(this.auction);
        this.auction.placeBid(bid);
    }

    private void displayWinner()
    {
        UserOutput.displayWinner(this.auction);
    }


}
