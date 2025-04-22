package Pack1;

public class Chercheur {
	private String nom;
	private String poste;
	private int identifiant;
	private static  int count=0;
	Chercheur(int identifiant,String nom,String poste){
		this.identifiant=identifiant;
		this.nom=nom;
		this.poste=poste;
		count++;	
     	}
	Chercheur(){
		           count++;
		        }
	public String getNom() {  
		                    return nom;}
	public void setNom(String nom) {
		                     this.nom=nom;
	                      }
    public String getPoste() { 
    	                     return poste ; }
    public void setPoste(String poste) {
    	                     this.poste=poste;
                      }
    public int getIdentifiant() {
    	                         return identifiant;}
    public void setIdentifiant(int identifiant) {
    	                             this.identifiant=identifiant;
                                  }
    public String toString() {
    	return("le nom du chercheur est "+nom+" son poste est :"+poste+" son identifiant est :"+identifiant);
                }
    public static int getCounter() {
    	                          return count;}
   public void afficherChercheur() {
	   String s=this.toString();
	   System.out.println(s);
   }
   public static void afficherNbrCherCrees() {
	                        System.out.println("le nombre des chercheurs crees est :"+count);
                              }
// La methode comparer pour comparer l objet courant de type Chercheur avec un autre objet du meme type 
  public void comparer (Chercheur ch) {
    String str =(this.nom == ch.nom)?"==":"<>";
    System.out.println(this.nom+ str+ch.nom);
    str = (this.poste == ch.poste)?"==":"<>";
    System.out.println(this.poste + str+ch.poste);
    str = (this.identifiant == ch.identifiant)?"==":"<>";
    System.out.println(this.identifiant + str+ch.identifiant);
  }
}
