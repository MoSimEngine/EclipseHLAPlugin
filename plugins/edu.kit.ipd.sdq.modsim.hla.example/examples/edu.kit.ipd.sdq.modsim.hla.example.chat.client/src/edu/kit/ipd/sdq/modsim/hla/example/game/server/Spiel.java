package edu.kit.ipd.sdq.modsim.hla.example.game.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Spiel {

	private List<Integer> gewinnZahlen;
	private List<List<Integer>> getippteZahlen;

	public Spiel() {
		gewinnZahlen = new ArrayList<Integer>();
		getippteZahlen = new ArrayList<List<Integer>>();
	}

	public void fuegeGewinnZahlHinzu(int runde, int zahl) {
		gewinnZahlen.add(runde, zahl);
	}

	public void fuegeGetippteZahlHinzu(int runde, int spieler, int zahl) {
		List<Integer> list = getippteZahlen.get(runde);

		if (list == null) {
			list = new ArrayList<Integer>();
			getippteZahlen.add(runde, list);
		}
		list.add(spieler, zahl);
	}

	public int gewinnerDerRunde(int runde) {
		Integer gewinnZahlRunde = gewinnZahlen.get(runde);
		List<Integer> getippteZahlenRunde = getippteZahlen.get(runde);

		Integer[] gewinner = new Integer[getippteZahlenRunde.size()];

		for (int i = 0; i < getippteZahlenRunde.size(); i++) {
			Integer integer = getippteZahlenRunde.get(i);

		}

		return gewinner[0];

	}

}
