
public class Vinyl {

	private String titre;
	private String prix;
	private String description;
	private String genre;
	private String annees;
	
	
	
	
	
	
	public Vinyl(String titre, String prix, String description, String genre, String annees) {
		super();
		this.titre = titre;
		this.prix = prix;
		this.description = description;
		this.genre = genre;
		this.annees = annees;
	}
	
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAnnees() {
		return annees;
	}
	public void setAnnees(String annees) {
		this.annees = annees;
	}


	@Override
	public String toString() {
		return "Vinyl [titre=" + titre + ", prix=" + prix + ", description=" + description + ", genre=" + genre
				+ ", annees=" + annees + "]";
	}
	
	
	
	
	
	
	
}
