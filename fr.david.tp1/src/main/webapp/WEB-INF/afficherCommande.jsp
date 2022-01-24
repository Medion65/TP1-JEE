<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Affichage d'une commande</title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>
        <p class="info">${ message }</p>
        <p>Client</p>
        <p>Nom : ${ commande.client.nom }</p>
        <p>Prénom : ${ commande.client.prenom }</p>
        <p>Adresse : ${ commande.client.adresse }</p>
        <p>Numéro de téléphone : ${ commande.client.telephone }</p>
        <p>Email : ${ commande.client.email }</p>
        <p>Commande</p>
        <p>Montant  : ${ commande.montant }</p> 
        <p>Mode de paiement  : ${ commande.modePaiement }</p> 
        <p>Statut du paiement  : ${ commande.statutPaiement }</p> 
        <p>Mode de livraison  : ${ commande.modeLivraison }</p> 
        <p>Statut de la livraison  : ${ commande.statutLivraison }</p> 
    </body>
</html>