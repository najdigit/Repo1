package Pack1;

public class Laboratoire {
	private String nomlab;
	private String specialite;
	private Adresse ad;
	private Bureau[] tablab ;
	public Laboratoire(String nomlab,String specialite,Adresse ad,Bureau[] tablab){
		         
		         this.nomlab=nomlab;
		         this.specialite=specialite;
		         this.ad=ad;
		         this.tablab=tablab;}
		         
		         public String getNom() {
		        	    return nomlab;
		        	  }
		        	  public void setNom(String nom) {
		        	    this.nomlab = nom;
		        	  }
		        	  public String getSpecialite() {
		        	    return specialite;
		        	  }
		        	  public void setSpecialite(String specialite) {
		        	    this.specialite = specialite;
		        	  }
		        	  public Adresse getAdresse() {
		        	    return ad;
		        	  }
		        	  public void setAdresse(Adresse ad) {
		        	    this.ad = ad;
		        	  }
		        	  public Bureau[] getBureaux() {
		        	    return tablab;
		        	  }
		        	  public void setBureaux(Bureau[] tablab) {
		        	    this.tablab = tablab;
		        	  }
		        	  public int getNmbBureau() {
		        		    return tablab.length ;}
		        	  public void afficherLabo() {
		        	        System.out.println("Labo "+nomlab+" Specialite "+specialite);
		        	        System.out.println("L adresse du laboratoire est :");
		        	        ad.afficherAdresse();
		        	        for (Bureau m :tablab ) {
		        	         m.afficherBureau(); 
		        	        }
		        	      }
		        	  
		         
		
	             

}
