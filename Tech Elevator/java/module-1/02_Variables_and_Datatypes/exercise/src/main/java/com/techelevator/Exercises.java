package com.techelevator;

import java.math.RoundingMode;
import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRacoons = 3;
		int numberOfRacoonsLeaving = 2;
		int numberOfRacoonsLeft = numberOfRacoons - numberOfRacoonsLeaving;


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int numOfFlowers = 5;
		int numOfBees = 3;
		int lessBeesThanFlowers = numOfFlowers - numOfBees;
		
        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int numOfLonelyPigeon = 1;
		int noneLonelyPigeon = 1;
		int pigeonsEatingBreadcrumbs = numOfLonelyPigeon + noneLonelyPigeon;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int owlsSittingOnFence = 3;
		int addOwls = 2;
		int owlsOnFence = owlsSittingOnFence + addOwls;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int beaversWorkingOnHome = 2;
		int beaversSwimming = 1;
		int beaversStillWorking = beaversWorkingOnHome - beaversSwimming;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int toucansSittingOnTree = 2;
		int joiningToucans = 1;
		int totalToucans = toucansSittingOnTree + joiningToucans;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrelsInTree = 4;
		int nutsInTree = 2;
		int moreSquirrelsThanNuts = squirrelsInTree - nutsInTree;

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		double quarter = 0.25;
		double dime = 0.10;
		double nickel = 0.05;

		double total = quarter + dime + nickel + nickel;
		System.out.println("Total is: " + total);

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int brierMuffins = 18;
		int macadamsMuffins = 20;
		int flanneryMuffins = 17;
		int totalMuffins = brierMuffins + macadamsMuffins + flanneryMuffins;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		double yoyoCost = 0.24;
		double whistleCost = 0.14;

		double totalCost = yoyoCost + whistleCost;

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int largeMarshmallow = 8;
		int miniMarshmallow = 10;

		int totalMarshmallow = largeMarshmallow + miniMarshmallow;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int hiltSnow = 29;
		int schoolSnow = 17;
		int moreSnow = hiltSnow - schoolSnow;
		System.out.println("#14: " + moreSnow);

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		double moneyHilt = 10;
		double toyTruck = 3;
		double pencilCost = 2;

		double moneyLeft = moneyHilt - (toyTruck + pencilCost);

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int numOfMarbles = 16;
		int marblesLost = 7;

		int marblesLeft = numOfMarbles - marblesLost;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int meganSeashell = 19;
		int numWantedSeashells = 25;

		int neededSeashells = numWantedSeashells - meganSeashell;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int bradBalloon = 17;
		int redBalloon = 8;

		int greenBalloon = bradBalloon - redBalloon;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnShelf = 38;
		int martaBooks = 10;

		int booksOnShelfNow = booksOnShelf + martaBooks;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int beeLegs = 6;
		int numOfBeesWithLegs = 8;
		int amountOfBeeLegs = beeLegs * numOfBeesWithLegs;


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double iceCreamCost = 0.99;
		double totalIceCreams = 2;
		double totalIceCreamCost = iceCreamCost * totalIceCreams;

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int rocksNeeded = 125;
		int rocksOwned = 64;
		int moreRocksToBuy = rocksNeeded - rocksOwned;

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int hiltMarbles = 38;
		int marblesHiltLost = 15;
		int hiltMarblesLeft = hiltMarbles - marblesHiltLost;

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int milesDrove = 78;
		int milesDriven = 32;
		int milesToGo = milesDrove - milesDriven;

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */

		int satMorningShovel = 90;
		int sunMorningShovel = 45;
		int totalMinutesShovel = satMorningShovel + sunMorningShovel;

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		double hotDogsBought = 6;
		double hotDogCost = 0.50;
		double costOfHotDogs = hotDogCost * hotDogsBought;
		System.out.println(hotDogsBought / hotDogCost);

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		double currentHiltMoney = 0.50;
		double costOfPencil = 0.07;
		int amountOfPencilsBuy = (int) (currentHiltMoney / costOfPencil);

	//	while

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int hiltButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = hiltButterflies - orangeButterflies;

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double moneyToClerk = 1;
		double candyCost = 0.54;
		double changeBack = moneyToClerk - candyCost;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int currentTrees = 13;
		int additionalTrees = 12;
		int newTreeTotal = currentTrees + additionalTrees;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int hoursInDay = 24;
		int daysLeftToGrannie = 2;
		int hoursLeftToGrannie = hoursInDay * daysLeftToGrannie;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int amountOfCousins = 4;
		int gumPerCousin = 5;
		int numOfGumNeeded = amountOfCousins * gumPerCousin;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		double dansMoney = 3;
		double candyBarCost = 1;
		double amountDanMoney = dansMoney - candyBarCost;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int boatsInLakes = 5;
		int peopleInBoat = 3;
		int peopleInBoatsInLake = peopleInBoat * boatsInLakes;

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int ellenLego = 380;
		int legoLost = 57;
		int legoLeft = ellenLego - legoLost;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int arthurBakedMuffins = 35;
		int numOfMuffinsWanted = 83;
		int numOfMuffinsLeftToCook = numOfMuffinsWanted - arthurBakedMuffins;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int willyCrayon = 1400;
		int lucyCrayon = 290;
		int willyMoreCrayon = willyCrayon - lucyCrayon;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersOnPage = 10;
		int pagesOfStickers = 22;
		int totalStickers = stickersOnPage * pagesOfStickers;

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		double numOfCupcakes = 100;
		double numOfChildren = 8;
		double numOfCupcakePerChild = numOfCupcakes / numOfChildren;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */

		int gingerbreadCookies = 47;
		int cookiesPerJar = 6;
		int numberOfJars = gingerbreadCookies % cookiesPerJar;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */

		int numOfCroissants = 59;
		int numOfNeighbors = 8;
		int numLeftOver = 59%8;

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int cookiesPerTray = 12;
		int totalOatmealCookies = 276;
		int traysNeeded = totalOatmealCookies / cookiesPerTray;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int pretzelsMade = 480;
		int pretzelPerPerson = 12;
		int servingsMade = pretzelsMade / pretzelPerPerson;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int lemonCookies = 53;
		int cookiesLeftAtHome = 2;
		int lemonCookiesPerBox = 3;

		int boxesGivenAway = (lemonCookies - cookiesLeftAtHome) / lemonCookiesPerBox;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int carrotSticks = 74;
		int peopleEatingCarrotSticks = 12;
		int carrotsLeftIfEqualShare = carrotSticks % peopleEatingCarrotSticks;

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int teddyBears = 98;
		int bearPerShelf = 7;
		int totalShelves = teddyBears / bearPerShelf;

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int totalPictures = 480;
		int picPerAlbum = 20;
		int albumsNeeded = totalPictures / picPerAlbum;

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int joeTradingCard = 94;
		int cardsPerBox = 8;
		int boxesFilled = joeTradingCard / cardsPerBox;
		int cardsInUnfilledBox = joeTradingCard % cardsPerBox;

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int booksToShelve = 210;
		int shelvesRepaired = 10;
		int booksPerShelf = booksToShelve / shelvesRepaired;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		double bakedCroissants = 17;
		double guestsWantingCroissants = 7;
		double croissantPerGuest = bakedCroissants / guestsWantingCroissants;

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls
	     in feet by the combined hourly rate of the painters.
	    */

//		Scanner in = new Scanner(System.in);
//		System.out.println("How many rooms do you have? ");
//		double numOfRooms = in.nextDouble();

		double squareFeetPerRoom = 12 * 14;
		double numOfRooms = 5;
		double totalSquareFeet = squareFeetPerRoom * numOfRooms;
		double billAverage = 2.15;
		double jillAverage = 1.90;
		double billHour = squareFeetPerRoom / billAverage;
		double jillHour = squareFeetPerRoom / jillAverage;
		double totalTimeForBoth = totalSquareFeet / (billHour + jillHour);
		System.out.println(jillHour + " Jill Hour");
		System.out.println(billHour + " Bill Hour");
		System.out.println(totalTimeForBoth + " Total");
		System.out.println(billAverage + " Bill Average");
		System.out.println(jillAverage + " Jill Average");

//		Scanner in = new Scanner(System.in);
//		System.out.println("How many rooms do you have? ");
//		numOfRooms = in.nextInt();
//		System.out.println("Very good, you have " + numOfRooms + ". " + "It will take " + totalTimeForBoth + " to complete.");

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */

		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInitial = "B";

		String fullName = lastName + ", " + firstName +" " + middleInitial + ".";

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */

		double totalDistance = 800;
		double amountTraveled = 537;
		int percentTraveled = (int) ((amountTraveled / totalDistance) * 100);
		System.out.println(percentTraveled + "%");
	}

}
