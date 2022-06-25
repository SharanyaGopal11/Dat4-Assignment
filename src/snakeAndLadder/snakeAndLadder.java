package snakeAndLadder;

public class snakeAndLadder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int player1Position = 0;

        System.out.println("Game Started Initial Position Of Player 1 is : 0");
        int position = 0;
        int count = 0;
        System.out.println("Start Position of Player is : " + position);
        do{
            int dieOutput = (int) (Math.floor(Math.random() * 10) % 6) + 1; 
            System.out.println("Getting : " + dieOutput + " Rolling the Die");
            count ++;
            int checkSituation = (int) (Math.floor(Math.random() * 10) % 3) + 1;

            switch(checkSituation){
                case 1: //No Play
                    System.out.println("No Change in Players Position Current Position Of Player Is : " + position);
                    break;
                case 2:  //Ladder
                    if((position+dieOutput) <= 100){
                        position += dieOutput;
                        if(position == 100){
                            System.out.println("Congratulations After "+count+ " Attempts You Won The Game");
                            System.exit(0);
                        }else{
                            System.out.println("Player Moved : " + position + " Positions");
                        }
                    }else{
                        System.out.println("Die output and current position sum is larger than 100 chance skipped");
                    }
                    break;
                case 3: //Snake Bite
                    if((position - dieOutput) >= 0){
                        position -= dieOutput;
                        System.out.println("Player Move Back by : "+ position +" due to Snake Bite");
                    }else{
                        position = 0;
                        System.out.println("Snake Bite Player Moved Again to starting point");
                    }
                    break;
            }
        }while(position <= 100);
	}

}
