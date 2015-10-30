package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testPlanetExplorerSetSize() {
		PlanetExplorer planetExplorer = new PlanetExplorer(100, 100, "(obs1_x,obs1_y)");
		assertEquals(planetExplorer.getxPosition(),100);
		assertEquals(planetExplorer.getyPosition(),100);
		assertEquals(planetExplorer.getObstacles(),"(obs1_x,obs1_y)");
	}
	
	
	@Test
	public void testPlanetsize(){
		PlanetExplorer planetExplorer = new PlanetExplorer(100, 100, "(obs1_x,obs1_y)");
		
		planetExplorer.setPlanetXSize(3);
		planetExplorer.setPlanetYSize(4);
		assertEquals(planetExplorer.getPlanetXSize(),3);
		assertEquals(planetExplorer.getPlanetYSize(),4);
	
	}
	
	/*
	@Test
	public void testLanding(){
		PlanetExplorer planetExplorer =new PlanetExplorer(0, 0, "(obs1_x,obs1_y)");
		planetExplorer.landing();
		assertEquals(planetExplorer.getxSize(),planetExplorer.getySize(),0);
	}*/	
}
