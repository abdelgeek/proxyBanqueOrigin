<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@include file="header.jsp" %>
          
            <!-- ******************************************************************-->
            <!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ debut de le content @@@@@@@@@@@@@@@@@-->
            <!-- ******************************************************************-->

  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item active">Liste des comptes</li>
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
                  <th>Nom</th>
                  <th>Prenom</th>
                  <th>Email</th>
                  <th>Adresse</th>
                  <th colspan="2">Action</th>
                </tr>
              </thead>
             
              <tbody>
             
                  <c:forEach items="${clients}" var="c">
                      <tr>
                  <td>${c.nom}</td>
                  <td>${c.prenom}</td>
                 <td>${c.email}</td>
                 <td>${c.adresse}</td>
                 <td><a href='listeComptes?idClient=${c.idClient}' class ="btn btn-primary">Comptes</a></td>
                   <td><a href='modifierClient?idClient=${c.idClient}' class ="btn btn-primary">Editer Clients</a></td>
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
  </div>
      <%@include  file="footer.jsp" %>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
          