package Pack1;

public class Bureau {
	private int codeB;
	private String nomB;
	private Chercheur[]  tab;
	public Bureau(int codeB,String nomB,Chercheur[] tab) {
		         this.codeB=codeB;
		         this.nomB=nomB;
		         this.tab=tab;
		              
	                  }
	public int getCodeB() {
		                       return codeB;
	                       }
	public void setCodeB(int codeB) {
		                           this.codeB=codeB;
	                            }
	public String getnomB() {
                           return nomB;
                       }
    public void setNomB(String nomB) {
                                         this.nomB=nomB;
                                       }
    public Chercheur[] getChercheurs() {
        return tab;
      }
      
      public void setChercheurs(Chercheur[] tab) {
        this.tab = tab;
      }
      
      public void afficherBureau() {
        System.out.println("Bureau [ code = "+codeB+" , nom= '"+nomB+"' ]");
        for (Chercheur m :tab ) {
         System.out.println(m.toString()); 
        }
      }
      
            

}
