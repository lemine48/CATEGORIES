package metier;

import java.io.Serializable;

/*
 * Les classes qui corresondent � des tables au niveau des bases de donn�es(entit�s) 
 * "doivent" �tre s�rialisables (pour les applications distribu�es qui �changent les entit�s)
 */

public class Produit implements Serializable{
	private String reference;
	private String designation;
	private double prix;
	private int quantite;
	
	
	public Produit(String reference, String designation, double prix, int quantite) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
}
