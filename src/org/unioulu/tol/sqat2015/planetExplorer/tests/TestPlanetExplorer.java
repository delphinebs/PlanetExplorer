package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testCreatePlanetSize() {
		PlanetExplorer planet = new PlanetExplorer(100, 100, "(obs1_x,obs1_y)");
		assertEquals(planet.getxSize(),100);
		assertEquals(planet.getySize(),100);
		assertEquals(planet.getObstacles(),"(obs1_x,obs1_y)");
	}
}
