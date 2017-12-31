<%-- 
    Document   : message
    Created on : 21 déc. 2017, 15:31:28
    Author     : Abdel veno vedi vici
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="header.jsp" %>



<c:choose>
    
    <c:when test="${result.isValid == true}" >
    <c:set value="alert-success" var="state" scope="session">
    </c:set>
    </c:when>
    
    <c:when test="${result.isValid == false}">
        <c:set value="alert-danger" var="state" scope="session">
       </c:set>
    </c:when>
    
    <c:otherwise>
        <c:set value="" var="state" scope="session">
       </c:set>
    </c:otherwise>
</c:choose>

<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
      
        <div class="row">
            <div class="col-12">

                <div class="alert ${state} "> 
                    <c:out value="${result.message}"/>
                    
                   </div>

            </div></div></div>
</div>
<%@include file="footer.jsp" %>