


<%@include file="header.jsp" %>
<!-- ******************************************************************-->
<!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ debut de le content @@@@@@@@@@@@@@@@@-->
<!-- ******************************************************************-->

<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="index.html">Accueil</a>
            </li>
            <li class="breadcrumb-item active">Faire un virement</li>
        </ol>
        
        <div class ="Alert alert-success">${result.message}</div>
        <div class="row">
            <div class="col-12">

                <!-- ******************************************************************-->
                <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ici le content @@@@@@@@@@@@@@@@@-->
                <!-- ******************************************************************-->

                <div class="container">
                    <div class="card card-login mx-auto mb-5 mt-5">
                        <div class="card-header">Virement</div>
                        <div class="card-body">
                            <form method="post" action="faireVirement">
                                <div class="form-group">
                                    <label for="montant">Montant</label>
                                    <input class="form-control" required  id="montant" name="montant" type="text" placeholder="Montant du virement">
                                </div>

                                <div class="form-group">
                                    <label for="numDebiteur">Compte a débiter</label>
                                    <input class="form-control" required id="numDebiteur" name="numDebiteur" type="text" placeholder="Entrer le numero du compteè debiter">

                                </div>


                                <div class="form-group">
                                    <label for="numDebiteur">Compte a crediter</label>
                                    <input class="form-control" required id="numCrediteur" name="numDebiteur" type="text" placeholder="Entrer le numero du compteè crediter">

                                </div>

                                <button class="btn btn-primary btn-block" type="submit">Virer</button>
                            </form>

                        </div>
                    </div>
                </div>


                <!-- ******************************************************************-->
                <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ici le content @@@@@@@@@@@@@@@@@-->
                <!-- ******************************************************************-->

            </div>
        </div>
    </div>
</div>
<!-- /.container-fluid-->
<!-- /.content-wrapper-->
<%@include  file="footer.jsp" %>

<script>
    $(function () {

        $("#numDebiteur").autocomplete({
            source: function (requete, reponse) { // les deux arguments représentent les données nécessaires au plugin
                $.ajax({
                    url: 'listNumComptes', // on appelle le script JSON
                    dataType: 'json', // on spécifie bien que le type de données est en JSON
                    data: {
                        numCompte: $('#numDebiteur').val(), // on donne la chaîne de caractère tapée dans le champ de recherche
                        
                    },

                    success: function (donnee) {

                        reponse($.map(donnee, function (objet) {
                            return objet; // on retourne cette forme de suggestion
                        }));
                    }
                });
            }
        });
        
        $("#numCrediteur").autocomplete({
            source: function (requete, reponse) { // les deux arguments représentent les données nécessaires au plugin
                $.ajax({
                    url: 'listNumComptes', // on appelle le script JSON
                    dataType: 'json', // on spécifie bien que le type de données est en JSON
                    data: {
                        numCompte: $('#numCrediteur').val(), // on donne la chaîne de caractère tapée dans le champ de recherche
                        
                    },

                    success: function (donnee) {

                        reponse($.map(donnee, function (objet) {
                            return objet; // on retourne cette forme de suggestion
                        }));
                    }
                });
            }
        });
    });
</script>