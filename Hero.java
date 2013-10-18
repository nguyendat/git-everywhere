package com.git.java;

public class Hero {
	private static Hero INSTANCE;
	public Hero() {

	}

	public static Hero getInstance() {
		if (INSTANCE == null) {
			synchronze(Hero.class) {
				if (INSTANCE == null) {
					INSTANCE = new Hero();
				}
			}
		}

		return INSTANCE;
	}
}
