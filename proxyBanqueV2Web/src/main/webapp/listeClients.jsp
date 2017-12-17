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
        <li class="breadcrumb-item active">Liste des clients</li>
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
                  <th>Adresse mail</th>
                  <th>Contact</th>
                  <th>Date de naissance</th>
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <th>Nom</th>
                  <th>Prenom</th>
                  <th>Adresse mail</th>
                  <th>Contact</th>
                  <th>Date de naissance</th>
                </tr>
              </tfoot>
              <tbody>
             
               
                <tr>
                  <td>Charde Marshall</td>
                  <td>Regional Director</td>
                  <td>San Francisco</td>
                  <td>36</td>
                  <td>2008/10/16</td>
                
                </tr>
                <tr>
                  <td>Haley Kennedy</td>
                  <td>Senior Marketing Designer</td>
                  <td>London</td>
                  <td>43</td>
                  <td>2012/12/18</td>
                 
                </tr>
                <tr>
                  <td>Tatyana Fitzpatrick</td>
                  <td>Regional Director</td>
                  <td>London</td>
                  <td>19</td>
                  <td>2010/03/17</td>
                  
                </tr>
                <tr>
                  <td>Michael Silva</td>
                  <td>Marketing Designer</td>
                  <td>London</td>
                  <td>66</td>
                  <td>2012/11/27</td>
                 
                </tr>
                <tr>
                  <td>Paul Byrd</td>
                  <td>Chief Financial Officer (CFO)</td>
                  <td>New York</td>
                  <td>64</td>
                  <td>2010/06/09</td>
                  
                </tr>
                <tr>
                  <td>Gloria Little</td>
                  <td>Systems Administrator</td>
                  <td>New York</td>
                  <td>59</td>
                  <td>2009/04/10</td>
                 
                </tr>
                <tr>
                  <td>Bradley Greer</td>
                  <td>Software Engineer</td>
                  <td>London</td>
                  <td>41</td>
                  <td>2012/10/13</td>
                 
                </tr>
                <tr>
                  <td>Dai Rios</td>
                  <td>Personnel Lead</td>
                  <td>Edinburgh</td>
                  <td>35</td>
                  <td>2012/09/26</td>
                  
                </tr>
                <tr>
                  <td>Jenette Caldwell</td>
                  <td>Development Lead</td>
                  <td>New York</td>
                  <td>30</td>
                  <td>2011/09/03</td>
                  
                </tr>
                <tr>
                  <td>Yuri Berry</td>
                  <td>Chief Marketing Officer (CMO)</td>
                  <td>New York</td>
                  <td>40</td>
                  <td>2009/06/25</td>
                 
                </tr>
                
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