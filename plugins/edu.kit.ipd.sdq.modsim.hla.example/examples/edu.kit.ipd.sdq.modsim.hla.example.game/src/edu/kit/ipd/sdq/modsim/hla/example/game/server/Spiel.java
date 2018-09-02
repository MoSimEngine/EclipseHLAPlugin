package edu.kit.ipd.sdq.modsim.hla.example.game.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Spiel {

	private Map<Integer, Integer> gewinnZahlen;
	private Map<Integer, List<Spieler>> tippsDerSpieler;

	public Spiel() {
		gewinnZahlen = new HashMap<Integer, Integer>();
		tippsDerSpieler = new HashMap<Integer, List<Spieler>>();
	}

	public void fuegeGewinnZahlHinzu(int runde, int zahl) {
		gewinnZahlen.put(runde, zahl);
	}

	public void fuegeGetippteZahlHinzu(int runde, String spieler, int zahl) {

		List<Spieler> list = tippsDerSpieler.get(runde);

		if (list == null) {
			list = new ArrayList<Spieler>();
			tippsDerSpieler.put(runde, list);
		}

		list.add(new Spieler(spieler, zahl));
	}

	public String gewinnerDerRunde(int runde) {
		Integer gewinnZahlRunde = gewinnZahlen.get(runde);
		List<Spieler> getippteZahlenRunde = tippsDerSpieler.get(runde);

		Collections.sort(getippteZahlenRunde, new Comparator<Spieler>() {

			@Override
			public int compare(Spieler sp1, Spieler sp2) {

				int abstand1 = gewinnZahlRunde - sp1.getGetippteZahl();
				int abstand2 = gewinnZahlRunde - sp2.getGetippteZahl();

				if (abstand1 < abstand2) {
					return 1;
				} else if (abstand2 > abstand1) {
					return -1;
				}

				return 0;
			}
		});

		return getippteZahlenRunde.get(0).getId();
	}

}
