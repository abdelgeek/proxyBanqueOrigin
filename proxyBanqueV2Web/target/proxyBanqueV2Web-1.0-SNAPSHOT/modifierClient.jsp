
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
            <li class="breadcrumb-item active"> <a href="listeClients">Liste des Clients</a></li>
            <li class="breadcrumb-item active">Modifier Client</li>
        </ol>
       
        <div class="row">
            <div class="col-12">

                <!-- ******************************************************************-->
                <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ici le content @@@@@@@@@@@@@@@@@-->
                <!-- ******************************************************************-->

                <div class="container">
                    <div class="card card-login mx-auto mb-5 mt-5">
                        <h5 class="card-header">Modifier Client</h5>
                        <div class="card-body">
                            <form method="post" action="modifierClient">


                                <div class="form-group row">
                                    <label for="id" class="col-md-4">id</label>
                                    <input id="id" name="id" value="<c:out value="${client.idClient}"/>" class="col-md-8 form-control"/>
                                </div>
                                <div class="form-group row">
                                    <label for="nom" class="col-md-4">Nom</label>
                                    <input id="nom" name="nom" value="<c:out value="${client.nom}"/>" class="col-md-8 form-control"/>
                                </div>

                                <div class="form-group row">
                                    <label for="prenom" class="col-md-4">Prenom</label>
                                    <input id="prenom" name="prenom" value="<c:out value="${client.prenom}"/>" class="col-md-8 form-control"/>
                                </div>

                                <div class="form-group row">
                                    <label for ="email" class="col-md-4" >Email</label>
                                    <input id ="email" name ="email" value="<c:out value="${client.email}"/>" class="col-md-8 form-control"/> </div>

                                <div class="form-group">

                                    <div class="form-group row">
                                        <label for="adresse" class="col-md-4">adresse</label>
                                        <input id="adresse" name ="adresse" value="<c:out value="${client.adresse}"/>" class="col-md-8 form-control"/> </div>

                                    <input type="submit" value="Valider" class="btn btn-primary pull-right">

                                </div>

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
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
</div>
<%@include  file="footer.jsp" %>