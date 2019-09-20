/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.federationanimalclinic.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VeterinarianTest {

	@Test
	public void HasAnimals() {
		Veterinarian v = new Veterinarian();
		assertEquals(false, v.HasAnimals());
	}

	@Test
	public void hasCapacity() {
		Veterinarian v = new Veterinarian();
		assertEquals(false, v.hasCapacity());
	}

	@Test
	public void addAnAnimal() {
		Veterinarian v = new Veterinarian();
		Animal a = new UninsuredAnimal("Test", 10, 2, "");
		v.addAnAnimal(a);
		assertEquals(false, v.HasAnimals());
		assertEquals(false, v.hasCapacity());
	}

}