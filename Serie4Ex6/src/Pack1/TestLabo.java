package Pack1;

public class TestLabo {

	public static void main(String[] args) {
		Adresse adr=new Adresse();
		adr.setCodePostal("A100");
		adr.setRue("rue Mozart");
		adr.setVille("casa");
		System.out.println(adr);
		System.out.println(adr.toString());
		adr.afficherAdresse();
		Adresse adresse1=new Adresse();//Q2.3
		adresse1.setRue("Rue Farabi");//Q2.4
		adresse1.setVille("Fes");//Q2.4
		adresse1.setCodePostal("24000");//Q2.4
		adresse1.afficherAdresse();//Q2.5
		if (adresse1.getVille()=="Fes")//Q2.6
			{adresse1.setCodePostal("30000");}
		adresse1.afficherAdresse();//Q2.7
		System.out.println("************************");
		Chercheur chercheur1=new Chercheur();//Q2.8
		chercheur1.setNom("Ahmed");//Q2.9
		chercheur1.setPoste("Technicien");//Q9
		chercheur1.setIdentifiant(1);//Q2.9
	    chercheur1.afficherChercheur();//Q2.10
	    if(chercheur1.getIdentifiant()==1) {            // Q2.11
	    	                  chercheur1.setNom("Zakaria");;
	                          }
	    chercheur1.afficherChercheur();       //Q2.11
	    System.out.println("Afficher le nombre des chercheurs crees :");//Q2.12
	    Chercheur.afficherNbrCherCrees();//Q2.12 afficher le nombre des chercheurs crees//Q2.12
	     System.out.println("************************");
	    
	     Chercheur[] T1=new Chercheur[3];//Q2.13 creation de bureau1
	     T1[0]=new Chercheur(10,"Mohammed","technicien");
	     T1[1]=new Chercheur(11,"Bouchaib","ouvrier");
	     T1[2]=new Chercheur(12,"Omar","courtier");
	    
	     Chercheur[] T2=new Chercheur[3];//Q2.13 creation de bureau2
	     T2[0]=new Chercheur(13,"Mohammed","peinturier");
	     T2[1]=new Chercheur(14,"Mohammed","maçon");
	     T2[2]=new Chercheur(15,"Mohammed","menuisier");
	     
	     Bureau bureau1=new Bureau(100,"Vente",T1);//Q2.13 creation de bureau1
	     Bureau bureau2=new Bureau(200,"Publicite",T2);// Q2.13 cretion de bureau2
	     System.out.println("Affichage des bureau1 et bureau2");
	     bureau1.afficherBureau();//Q14 afficher bureau1
	     bureau2.afficherBureau();//Q14 afficher bureau2
	     
	     Adresse adr1=new Adresse("Rue tunis","El jadida","24000");//Q2.15 Adresse labo1
	     
	     Chercheur[] bureau1labo1=new Chercheur[3];//Q2.15 creation d un tableau1 de type Chercheur
	     bureau1labo1[0]=new Chercheur(25,"El arbi","responsable");
	     bureau1labo1[1]=new Chercheur(21,"radi","biologiste");
	     bureau1labo1[2]=new Chercheur(19,"othmane","courtier");
	    
	     Chercheur[] bureau2labo1=new Chercheur[3];//Q2.15 creation d un tableau2 de type Chercheur
	     bureau2labo1[0]=new Chercheur(17,"Mustafa","Gerant");
	     bureau2labo1[1]=new Chercheur(15,"Brahim","Comptable");
	     bureau2labo1[2]=new Chercheur(13,"safi","biologiste");
	     
	    
	     Bureau[] L=new Bureau[2];//Q2.15 creation d un tableau contenant 2 bureaux
	     L[0]=new Bureau(100,"Analyse",bureau1labo1);
	     L[1]=new Bureau(200,"Service",bureau2labo1);
	     Laboratoire laboratoire1=new Laboratoire("Al massira","Analyse",adr1,L);//Q2.15 creation du laboratoire1
	     System.out.println("Affichage du laboratoire1");
	     laboratoire1.afficherLabo();//Q2.16 affichage du laboratoire1 
	     System.out.println("Afficher le nom du premier chercheur du laboratoire1");
	     String S=laboratoire1.getBureaux()[0].getChercheurs()[0].getNom();//Q2.17 afficher le nom du premier chercheur du bureau1 du laboratoire1
	     System.out.println(S);//Q2.17
	     System.out.println("afficher adresse du laboratoire1");
	     Adresse Y=laboratoire1.getAdresse();//Q2.18 afficher l adresse du laboratoire1
	     Y.afficherAdresse();//Q2.18 afficher l adresse du laboratoire1
	     Chercheur.afficherNbrCherCrees();//Q2.19afficher le nombre des chercheurs crees
	     System.out.println("*******************");
	     System.out.println("on compare le premier chercheur du laboratoire1 avec le deuxieme chercheur du laboratoire1"); 
	     bureau1.getChercheurs()[0].comparer(bureau2.getChercheurs()[0]);//Q.4 Comparer le premier chercheur du bureau1 avec le premier chercheur du bureau2
	     System.out.println("*******************");//on va creer deux chercheurs CH1 et CH2 et on les compare
	     System.out.println("On va creer deux chercheurs et on les compare");
	     Chercheur CH1=new Chercheur(25,"soufiane","gerant");
	     Chercheur CH2=new Chercheur(25,"soufiane","technicien");
	     CH1.comparer(CH2);
	    
	     
	     System.out.println(adresse1);
	     System.out.println(chercheur1);
	     
	     
	     

	}

}
