<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" 
              crossorigin="anonymous"> 
        <title>Edit Employee</title>
        <link rel="shortcut icon" href="favicon.ico" type="image/x-icon"/>
    </head>
    <body>
        <jsp:include page="../common/header.jsp" />
        <form action="${pageContext.request.contextPath}/ServletController?action=update&id=${employee.id}"
              method="POST" class="was-validated">
            <jsp:include page="../common/btnNavEdit.jsp" /> 
            <section id="details"> 
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Edit Employee</h4>
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label for="name">Name</label>
                                        <input type="text" class="form-control" name="name" required value="${employee.name}">
                                    </div>
                                    <div class="form-group">
                                        <label for="last_name">Last name</label>
                                        <input type="text" class="form-control" name="last_name" required value="${employee.last_name}">
                                    </div>
                                    <div class="form-group">
                                        <label for="doc_type">Document type</label>
                                        <select class="form-control" name="doc_type">
				                        	<option value="C.C" ${employee.doc_type == 'C.C' ? 'selected' : ''}>C.C</option>
				                        	<option value="C.E" ${employee.doc_type == 'C.E' ? 'selected' : ''}>C.E</option>
				                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label for="doc">Document number</label>
                                        <input type="text" class="form-control" name="doc" required value="${employee.doc}">
                                    </div>
                                    <div class="form-group">
                                        <label for="birthdate">Birthdate</label>
                                        <input type="date" class="form-control" name="birthdate" required value="${birthdate}">
                                    </div>
                                    <div class="form-group">
                                        <label for="bind_date">Binding Date</label>
                                        <input type="date" class="form-control" name="bind_date" required value="${bind_date}">
                                    </div>
                                    <div class="form-group">
                                        <label for="position">Position</label>
                                        <input type="text" class="form-control" name="position" required value="${employee.position}">
                                    </div>
                                    <div class="form-group">
                                        <label for="salary">Salary</label>
                                        <input type="number" class="form-control" name="salary" required value="${employee.salary}" step="any">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </form>
    </body>
</html>