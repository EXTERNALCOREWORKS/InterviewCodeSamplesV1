package com.test.hacker.practice;

public class RobotsArray {

	public static boolean isValidPath(int[][] grid) {
		int numRobots=0;
		int rowRobots=0;
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if(row!=0) {
					if(grid[row][col]==1) {
						rowRobots++;
						if(col!=0 && col!=grid[row].length-1) {
							if(grid[row-1][col]!=1 &&( grid[row-1][col-1]==0 && grid[row-1][col+1]==0))
								return false;
						}
						else {
							if(col!=0) {
								if(grid[row-1][col]!=1 &&(grid[row-1][col-1]==0 && grid[row-1][col]==0))
									return false;
							}
							else {
								if(grid[row-1][col]!=1 &&(grid[row-1][col+1]==0 && grid[row-1][col]==0))
									return false;
							}
						}
					}
				}else {
					if(grid[row][col]==1)
						numRobots++;
				}
			}
		}
		if(numRobots!=rowRobots)
			return false;		
		return true;
	}

	public static void main(String[] args) {
		// 2 rows, 4 columns
		//int[][] grid = { { 1, 0, 0, 1 }, { 1, 0, 0, 1 } , { 0, 0, 1, 1 }};
		int[][] grid = { { 1, 0, 0, 1 }, { 0, 1, 1, 0 } };
		//int[][] grid = { { 1, 0, 0, 1 }, { 0, 1, 1, 0 } };
		System.out.println("Is Valid Path: " + isValidPath(grid));
		int[][] grid2 = { { 1, 0, 0, 0 ,1 }, { 1, 0, 1, 0, 0 } };
		//int[][] grid2 = { { 1, 0, 0, 0 ,1 }, { 1, 0, 0, 1, 0 } };
		System.out.println("Is Valid Path: " + isValidPath(grid2));
	}
}
