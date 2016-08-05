package com.tiy.ssa.weekone.assignmentfour;

public class Knight {
	
	final int startXPosition;
	final int startYPosition;
	int currentX;
	int currentY;
	int moves = 0;
	

	public Knight(int startXPosition, int startYPosition) {
		this.startXPosition = startXPosition;
		this.startYPosition = startYPosition;
	}
	
	
	void move(){
		
		//int random = (int) Math.random() * 8 + 1;
		int random = 1;
		
		switch(random) {
		case 1: currentX += 2;
		        currentY += 1;
		        break;
		case 2: currentX += 2;
		        currentY -= 1;
		        break;
		case 3: currentX += 1;
		        currentY += 2;
		        break;
		case 4: currentX += 1;
		        currentY -= 2;
		        break;
		case 5: currentX -= 2;
		        currentY += 1;
		        break;
		case 6: currentX -= 2;
		        currentY -= 1;
		        break;
		case 7: currentX -= 1;
		        currentY += 2;
		        break;
		case 8: currentX -= 1;
		        currentY -= 2;
		        break;
				}
		moves++;
		
	}
	
	public int howManyToStart() {
		return moves;
	}
	
	public String getPosition() {
		return currentX + ", " + currentY;
	}
	
	public String getStart() {
		return startXPosition + ", " + startYPosition;
	}
}
