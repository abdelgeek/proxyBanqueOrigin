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
            <li class="breadcrumb-item active">Liste des Clients</li>
            <li class="breadcrumb-item active">Liste des Comptes</li>
        </ol>
        <div class="row">
            <div class="col-12">

                <!-- ******************************************************************-->
                <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ici le content @@@@@@@@@@@@@@@@@-->
                <!-- ******************************************************************-->


                <div class="card mb-3">
                    <div class="card-header">
                        <i class="fa fa-table"></i> Liste des clients</div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th>Numero</th>
                                        <th>Date ouverture</th>
                                        <th>Solde</th>
                                        <th>Type Compte</th>
                                        <th>Decouvert</th>
                                        <th>Taux</th>
                                       
                                    </tr>
                                </thead>

                                <tbody>


                                    <c:forEach items="${comptes}" var="c">
                                        <tr>
                                            <td>${c.numeroCompte}</td>
                                            <td>${c.dateOuverture}</td>
                                            <td>${c.solde}</td>
                                            <td>${c.typeCompte}</td>
                                            <td>${c.decouvert}</td>
                                            <td>${c.taux}</td>
                                           </tr>
                                    </c:forEach>



                                </tbody>
                            </table>
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
    <?php include"ProxyFooter.php" ?>