<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="en_US" />
<section id="employees">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="card">
                    <div class="card-header">
                        <h4>Employee List</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Last name</th>
                                <th>Document type</th>
                                <th>Document number</th>
                                <th>Birthdate</th>
                                <th>Binding date</th>
                                <th>Position</th>
                                <th>Salary</th>
                                <th>Age</th>
                                <th>Binding time</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="employee" items="${employees}">
                                <tr>
                                	<td>${employee.id}</td>
                                    <td>${employee.name}</td>
                                    <td>${employee.last_name}</td>
                                    <td>${employee.doc_type}</td>
                                    <td>${employee.doc}</td>
                                    <fmt:parseDate value="${employee.birthdate}" pattern="yyyy-MM-dd HH:mm" var="birthDate"/>
                                    <td><fmt:formatDate value="${birthDate}" pattern="dd-MM-yyyy"/></td>
                                    <fmt:parseDate value="${employee.bind_date}" pattern="yyyy-MM-dd HH:mm" var="bindDate"/>
                                    <td><fmt:formatDate value="${bindDate}" pattern="dd-MM-yyyy"/></td>
                                    <td>${employee.position}</td>
                                    <td><fmt:formatNumber value="${employee.salary}" type="currency"/></td>
                                    <td>${employee.age}</td>
                                    <td>${employee.bindingTime}</td>                         
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletController?action=edit&id=${employee.id}" class ="btn btn-secondary">
                                            Edit
                                        </a>  
                                    </td>    
                            	</tr>               
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
		</div>
	</div>
</section>
<jsp:include page="add.jsp"/>
