package org.eclipse.cours.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@XmlRootElement
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num;
	private String nom;
	private String prenom;
	private int age;
	public Personne() {
	}
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Personne(Integer num, String nom, String prenom, int age) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}