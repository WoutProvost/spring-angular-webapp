package com.example.horeca.domain;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Horeca {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@JsonProperty("json_featuretype")
	private String jsonFeatureType;

	@JsonProperty("Naam")
	private String naam;

	@JsonProperty("Formule")
	private String formule;

	@JsonProperty("Straat")
	private String straat;

	@JsonProperty("HuisNr")
	private int huisNr;

	@JsonProperty("HuisNrToev")
	private String huisNrToevoeging;

	@JsonProperty("Postcode")
	private String postcode;

	@JsonProperty("Deelgemeente")
	private String deelgemeente;

	@JsonProperty("Gemeente")
	private String gemeente;

	@JsonProperty("Branche")
	private String branche;

	@JsonProperty("Check_dat")
	private String checkDat;

	@JsonProperty("Winkelgebied")
	private String winkelgebied;

	@JsonProperty("Subcentrum")
	private String subcentrum;

	@JsonProperty("StrnmEnHuisnr")
	private String strnmEnHuisnr;

	@JsonProperty("Aangemaakt op")
	private String aangemaaktOp;

	@JsonProperty("json_ogc_wkt_crs")
	private String jsonOgcWktCrs;

	@Embedded
	@JsonProperty("json_geometry")
	private Geometry jsonGeometry;

	@ElementCollection
	private List<Byte> scores;

	// Default constructor required by framework
	public Horeca() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJson_featuretype() {
		return jsonFeatureType;
	}

	public void setJson_featuretype(String json_featuretype) {
		this.jsonFeatureType = json_featuretype;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getFormule() {
		return formule;
	}

	public void setFormule(String formule) {
		this.formule = formule;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public int getHuisNr() {
		return huisNr;
	}

	public void setHuisNr(int huisNr) {
		this.huisNr = huisNr;
	}

	public String getHuisNrToevoeging() {
		return huisNrToevoeging;
	}

	public void setHuisNrToevoeging(String huisNrToevoeging) {
		this.huisNrToevoeging = huisNrToevoeging;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getDeelgemeente() {
		return deelgemeente;
	}

	public void setDeelgemeente(String deelgemeente) {
		this.deelgemeente = deelgemeente;
	}

	public String getGemeente() {
		return gemeente;
	}

	public void setGemeente(String gemeente) {
		this.gemeente = gemeente;
	}

	public String getBranche() {
		return branche;
	}

	public void setBranche(String branche) {
		this.branche = branche;
	}

	public String getCheck_dat() {
		return checkDat;
	}

	public void setCheck_dat(String check_dat) {
		this.checkDat = check_dat;
	}

	public String getWinkelgebied() {
		return winkelgebied;
	}

	public void setWinkelgebied(String winkelgebied) {
		this.winkelgebied = winkelgebied;
	}

	public String getSubcentrum() {
		return subcentrum;
	}

	public void setSubcentrum(String subcentrum) {
		this.subcentrum = subcentrum;
	}

	public String getStrnmEnHuisnr() {
		return strnmEnHuisnr;
	}

	public void setStrnmEnHuisnr(String strnmEnHuisnr) {
		this.strnmEnHuisnr = strnmEnHuisnr;
	}

	public String getAangemaaktOp() {
		return aangemaaktOp;
	}

	public void setAangemaaktOp(String aangemaaktOp) {
		this.aangemaaktOp = aangemaaktOp;
	}

	public String getJsonOgcWktCrs() {
		return jsonOgcWktCrs;
	}

	public void setJsonOgcWktCrs(String jsonOgcWktCrs) {
		this.jsonOgcWktCrs = jsonOgcWktCrs;
	}

	public Geometry getJsonGeometry() {
		return jsonGeometry;
	}

	public void setJsonGeometry(Geometry jsonGeometry) {
		this.jsonGeometry = jsonGeometry;
	}

	public List<Byte> getScores() {
		return scores;
	}

	public void setScores(List<Byte> scores) {
		this.scores = scores;
	}

	public void addScore(byte score) {
		if(score < 1) {
			score = 1;
		} else if(score > 5) {
			score = 5;
		}
		
		scores.add(score);
	}
}