import java.util.ArrayList;

public class player {

	private String name;
	private int numTries;
	public ArrayList <Integer> numList;

	//Set player name
	public void setPlayerName(String playerName){
		name = playerName;
	}
	//Return player name
	public String getPlayerName(){
		return name;
	}
	//Increase the number of tries by 1
	public void setPlayerNumTries(){
		numTries++;
	}
	//Return the number of tries
	public int getPlayerNumTries(){
		return numTries;
	}

	public player(String playerName){
		name = playerName;
		numTries = 0;
		numList = new ArrayList <Integer>();
	}

	public String toString(){
		numList.remove(numList.size()-1);
		return name + "			" + numTries + "				" + numList; 
	}

	public String numtoString(){
		String answer = "";
		for (int i=0; i<numList.size(); i++){
			answer += numList.get(i) + " ";
		}
		return answer;
	}

}
