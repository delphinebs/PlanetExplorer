package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	
	//before
	PlanetExplorer planetExplorer =new PlanetExplorer(100, 100, "(obs1_x,obs1_y)");

	@Test
	public void testPlanetExplorerSetSize() {
		
		assertEquals(planetExplorer.getxPosition(),100);
		assertEquals(planetExplorer.getyPosition(),100);
		assertEquals(planetExplorer.getObstacles(),"(obs1_x,obs1_y)");
	}
	
	
	@Test
	public void testPlanetsize(){
		
		
		planetExplorer.setPlanetXSize(3);
		planetExplorer.setPlanetYSize(4);
		assertEquals(planetExplorer.getPlanetXSize(),3);
		assertEquals(planetExplorer.getPlanetYSize(),4);
	
	}
	
	
	@Test
	public void testLanding(){
		
		planetExplorer.landing();
		assertEquals(planetExplorer.getxPosition(),planetExplorer.getyPosition(),0);
		assertEquals(planetExplorer.getFace(), "N");
	}
	
	@Test
	public void testturningRight(){
		
		planetExplorer.turning("R");
		
		
	}
}
