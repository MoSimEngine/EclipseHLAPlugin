package edu.kit.ipd.sdq.modsim.hla.example.game.server;

public class Spieler {

	private String id;
	private int getippteZahl;

	public Spieler(String id, int getippteZahl) {
		this.setId(id);
		this.setGetippteZahl(getippteZahl);
	}

	public int getGetippteZahl() {
		return getippteZahl;
	}

	private void setGetippteZahl(int getippteZahl) {
		this.getippteZahl = getippteZahl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
