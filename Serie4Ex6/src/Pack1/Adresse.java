package Pack1;

//Classe Adresse

public class Adresse {
  private String rue;
  private String ville;
  private String codePostal;

  // Constructeur sans arguments
  public Adresse() { }

  // Constructeur avec arguments
  public Adresse(String rue, String ville, String codePostal) {
      this.rue = rue;
      this.ville = ville;
      this.codePostal = codePostal;
  }

  // Getters et setters
  public String getRue() {  
	                       return rue; }
  public void setRue(String rue) {
	                       this.rue = rue; }

  public String getVille() { 
	                       return ville; }
  public void setVille(String ville) { 
	                       this.ville = ville; }

  public String getCodePostal() { 
	                       return codePostal; }
  public void setCodePostal(String codePostal) { 
	                       this.codePostal = codePostal; }

 public String toString() {
      return "Adresse: " + rue + ", " + ville + ", " + codePostal;
  }
 void afficherAdresse() {
	          String s=this.toString();
	                      System.out.println(s);
                           }
 
}
