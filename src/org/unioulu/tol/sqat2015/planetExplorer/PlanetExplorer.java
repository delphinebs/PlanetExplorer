package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 2479820
// Finish time:
public class PlanetExplorer {
	
	private int xPosition;
	private int yPosition;
	private String face;
	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	private String obstacles;
	int planetXSize; 
	int planetYSize; 
	
	//Getter and setter
	
	

	public int getPlanetXSize() {
		return planetXSize;
	}

	public void setPlanetXSize(int planetXSize) {
		this.planetXSize = planetXSize;
	}

	public int getPlanetYSize() {
		return planetYSize;
	}

	public void setPlanetYSize(int planetYSize) {
		this.planetYSize = planetYSize;
	}

	public int getxPosition() {
		return xPosition;
	}

	public String getObstacles() {
		return obstacles;
	}

	public void setObstacles(String obstacles) {
		this.obstacles = obstacles;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		
		
		this.setxPosition(x);
		this.setyPosition(y);
		this.setObstacles(obstacles);
	}
	
	public void landing(){
		//when the explorer lands, it start at th start of the grid and face north
		this.setxPosition(0);
		this.setyPosition(0);
		this.setFace("N");
	}
	
	public void movingForward(){
		
		if (this.getFace()=="N"){
		this.setyPosition(getyPosition()+1);
		}
		else {
			if (this.getFace()=="S"){
				this.setyPosition(getyPosition()-1);
			}
			else{if(this.getFace()=="E"){
				this.setyPosition(getxPosition()+1);
			}
			else {
				if (this.getFace()=="W"){
					this.setyPosition(getxPosition()-1);
				}
			}
			}
			
		}
	}
	public void movingBackward(){
		if (this.getFace()=="N"){
			this.setyPosition(getyPosition()-1);
			}
			else {
				if (this.getFace()=="S"){
					this.setyPosition(getyPosition()+1);
				}
				else{if(this.getFace()=="E"){
					this.setyPosition(getxPosition()-1);
				}
				else {
					if (this.getFace()=="W"){
						this.setyPosition(getxPosition()+1);
					}
				}
				}
	}
	public void turning(String turn){
		
		if (turn!="R" && turn!="L"){
			
			//error
		}
		else {
			
			
			if (turn=="R"){
				
				if(this.getFace()=="N"){
					this.setFace("E");
					//problem to fix with the switch case with string
				/*case "N": this.setFace("E");
				case "E":this.setFace("S");
				case "S":this.setFace("W");
				case "W":this.setFace("N");
				*/
				}
			}
			
			
			else{
				switch (this.getFace()){
				case "N": this.setFace("W");
				break;
				case "E":this.setFace("N");
				break;
				case "S":this.setFace("E");
				break;
				case "W":this.setFace("S");
				break;
				}				
			}
		}
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		return null;
	}


}
