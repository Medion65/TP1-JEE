package fr.david.tp1.servlets;

import java.io.IOException;

import fr.david.tp1.beans.Client;
import fr.david.tp1.beans.Commande;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreationCommande extends HttpServlet {

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        String nom = request.getParameter( "nomClient" );
        String prenom = request.getParameter( "prenomClient" );
        String adresse = request.getParameter( "adresseClient" );
        String telephone = request.getParameter( "telephoneClient" );
        String email = request.getParameter( "emailClient" );
        String modePaiement = request.getParameter( "modePaiementCommande" );
        String statutPaiement = request.getParameter( "statutPaiementCommande" );
        String modeLivraison = request.getParameter( "modeLivraisonCommande" );
        String statutLivraison = request.getParameter( "statutLivraisonCommande" );


        Client client = new Client();
        client.setNom( nom );
        client.setPrenom( prenom );
        client.setAdresse( adresse );
        client.setTelephone( telephone );
        client.setEmail( email );

        Commande commande = new Commande();
        commande.setClient( client );
        commande.setModePaiement( modePaiement );
        commande.setStatutPaiement( statutPaiement );
        commande.setModeLivraison( modeLivraison );
        commande.setStatutLivraison( statutLivraison );

        request.setAttribute( "commande", commande );
        this.getServletContext().getRequestDispatcher( "/WEB-INF/afficherCommande.jsp" ).forward( request, response );
    }
	
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( "/WEB-INF/creerCommande.jsp" ).forward( request, response );
    }
}