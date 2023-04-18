<section id="actions" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <a href="index.jsp" class="btn btn-light btn-block">Back</a>          
            </div>            
            <div class="col-md-3">
                <button type="submit" class="btn btn-success btn-block">Save</button>          
            </div>            
            <div class="col-md-3">
	          	<a href="${pageContext.request.contextPath}/ServletController?action=delete&id=${employee.id}" class="btn btn-danger btn-block">
	            	Delete
	            </a>          
            </div>
        </div>
    </div>
</section>