
package edu.saintjoe.zbobos.cs.TestTwoZKB;


public class Team {
		private String name;
		
		private int score;
		
		public static void main(String [] args) {
			Team team1 = new Team();
			Team team2 = new Team();
			team1.score();
			
			team1.name ="Packers";
			team2.name ="Bears";
			
			team1.setName("Packers");
			team2.setName("Bears");
			
			
			Team[] score = new Team[2];
			score[0] = team1;
			score[1] = team2;
			
			score[0].setScore(42);
			score[1].setScore(21);
			

}
		
		private void setName(String newname) {
			name = newname;
		}
		
		private void setScore(int newscore){
			score = newscore;
		}
		
		public String getName() {
		    	return name;
		}
		    
		public int getscore() {
		    	return score;
		}
		
		public void score() {
			int nothing = 32;
			
			if (score < 22) {
				System.out.println("Packers WIN!!!");
				
			}else 
				System.out.println("Bears Lose :(");
			}
		}





