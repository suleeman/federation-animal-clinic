/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.federationanimalclinic.beans;

import org.junit.jupiter.api.Test;

public class ClinicTest {

	@Test
	public void testRunWithoutCSV() {
		Clinic c = new Clinic();
		c.run();
	}
	
	@Test
	public void testRunWithCSV() {
		Clinic c = new Clinic("/MyInput.csv");
		c.run();
	}
}
