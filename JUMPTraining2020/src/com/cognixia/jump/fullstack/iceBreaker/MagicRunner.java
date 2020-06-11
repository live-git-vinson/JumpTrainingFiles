package com.cognixia.jump.fullstack.iceBreaker;

import java.util.ArrayList;
import java.util.List;

public class MagicRunner {

	public static void main(String[] args) {
		
		List<Mana> arcsManaCost = new ArrayList<>();
		arcsManaCost.add(new Mana("(3)"));
		arcsManaCost.add(new Mana("(U)"));
		arcsManaCost.add(new Mana("(U)"));
		arcsManaCost.add(new Mana("(U)"));
		
		List<String> arcsSupertype = new ArrayList<>();
		arcsSupertype.add("Legendary");
		arcsSupertype.add("Creature");
		
		List<String> arcsSubtype = new ArrayList<>();
		arcsSubtype.add("Wizard");
		List<String> arcsAbilities = new ArrayList<>();
		arcsAbilities.add("Tap: Draw 3 Cards.");
		arcsAbilities.add("(2)(U)(U): Return Arcanis, The       |"
				+ "\n|Omnipotent to your hand.   ");
		MagicCard arcanis = new MagicCard("Arcanis, The Omnipotent", 3, 4, 
				arcsManaCost, arcsSupertype, arcsSubtype);
		
		arcanis.setAbilities(arcsAbilities);
		
		MagicCard.PrintCard(arcanis);
		

	}

}
