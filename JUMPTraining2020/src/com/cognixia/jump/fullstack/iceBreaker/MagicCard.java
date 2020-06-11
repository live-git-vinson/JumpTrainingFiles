package com.cognixia.jump.fullstack.iceBreaker;

import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.fullstack.pokerGame.Card;


public class MagicCard extends Card{

	String name;
	int power;
	int toughness;
	List<Mana> manaCost = new ArrayList<>();
	List<String> supertype = new ArrayList<>();
	List<String> subtype = new ArrayList<>();
	List<String> keywordAbilities = new ArrayList<>();
	List<String> abilities = new ArrayList<>();
	
	public MagicCard(String name, int power, int toughness, List<Mana> manaCost,
			List<String> supertype, List<String> subtype) {
		
		this.name = name;
		this.power = power;
		this.toughness = toughness;
		this.manaCost = manaCost;
		this.supertype = supertype;
		this.subtype = subtype;
		
	}
	
	public static void PrintCard(MagicCard card) {
		System.out.println("|-------------------------------------|");
		System.out.print("|" + card.getName() + "  ");
		MagicCard.PrintMana(card.getManaCost());
		System.out.println("|");
		System.out.println("|-------------------------------------|");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|-------------------------------------|");
		System.out.println("|" + card.getSupertype() + " - " + card.getSubtype() + 
				"     |");
		System.out.println("|-------------------------------------|");
		
		if(!card.getKeywordAbilities().isEmpty()) {
			System.out.println("|" + card.getKeywordAbilities() + 
					"                                   |");
		}
		if(!card.getAbilities().isEmpty()) {
			System.out.println("|" + card.getAbilities().get(0) + "                   |");
			System.out.println("|                                     |");
			System.out.println("|" + card.getAbilities().get(1) + "          |");
			System.out.println("|                                     |");
		}
		else {
			System.out.println("|                                     |");
			System.out.println("|                                     |");
			System.out.println("|                                     |");
			System.out.println("|                                     |");
		}
		
		System.out.println("|-------------------------------------|");
		System.out.println("|                                  " 
		+ card.getPower() + "/" + card.getToughness() + "|");
		System.out.println("|-------------------------------------|");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getToughness() {
		return toughness;
	}

	public void setToughness(int toughness) {
		this.toughness = toughness;
	}

	public List<Mana> getManaCost() {
		return manaCost;
	}

	public void setManaCost(List<Mana> manaCost) {
		this.manaCost = manaCost;
	}

	public List<String> getSupertype() {
		return supertype;
	}

	public void setSupertype(List<String> supertype) {
		this.supertype = supertype;
	}

	public List<String> getSubtype() {
		return subtype;
	}

	public void setSubtype(List<String> subtype) {
		this.subtype = subtype;
	}

	public List<String> getKeywordAbilities() {
		return keywordAbilities;
	}

	public void setKeywordAbilities(List<String> keywordAbilities) {
		this.keywordAbilities = keywordAbilities;
	}

	public List<String> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<String> abilities) {
		this.abilities = abilities;
		
		
	}
	
	public static void PrintMana(List<Mana> mana) {
		
		for (Mana manaSymbol : mana){
			System.out.print(manaSymbol.color);
		}
		
	}
}
