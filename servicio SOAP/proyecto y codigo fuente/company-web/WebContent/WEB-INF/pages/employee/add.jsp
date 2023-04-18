<div class="modal fade" id="addEmployeeModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">            
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Add employee</h5>
                <button class="btn-primary" data-dismiss="modal">
                    <span>&times;</span>
                </button>
        	</div>            
            <form action="${pageContext.request.contextPath}/ServletController?action=insert"
                  method="POST" class="was-validated">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="name">Name</label>
                        <input type="text" class="form-control" name="name" required>
                    </div>
                    <div class="form-group">
                        <label for="last_name">Last name</label>
                        <input type="text" class="form-control" name="last_name" required>
                    </div><!-- comment -->
                    <div class="form-group">
                        <label for="doc_type">Document type</label>
                        <select class="form-control" name="doc_type">
                        	<option value="C.C">C.C</option>
                        	<option value="C.E">C.E</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="doc">Document number</label>                        
                        <input type="number" class="form-control" name="doc" required>
                    </div>
                    <div class="form-group">
                        <label for="birthdate">Birthdate</label>
                        <input type="date" class="form-control" name="birthdate" required>
                    </div>
                    <div class="form-group">
                        <label for="bind_date">Binding date</label>
                        <input type="date" class="form-control" name="bind_date" required>
                    </div>
                    <div class="form-group">
                        <label for="position">Position</label>
                        <input type="text" class="form-control" name="position" required>
                    </div>
                    <div class="form-group">
                        <label for="salary">Salary</label>
                        <input type="number" class="form-control" name="salary" required>
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn-primary" type="submit">Save</button>                  
                </div>         
            </form>            
        </div>
    </div>  
</div>