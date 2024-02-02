<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Recycle Activity Bill</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="content">
            
            <h1>Recycle Activity Submission</h1>
            <p>If you don't have any data to submit, feel free to skip this form.
            Your participation is voluntary, and we appreciate your contribution. Thank you!</p>
            <br>

            <form action="add-bill" method="POST">
                
                <div class="mb-3">
                    <label for="type" class="form-label">Type</label>
                    <select class="form-select" id="type" name="type" required>
                        <option value="Recycling material">Recycling material collection</option>
						<option value="Used oil">Used oil collection</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label for="weight" class="form-label">Weight (kg)</label>
                    <input type="number" class="form-control" id="weight" name="weight" required>
                </div>

                <div class="mb-3">
                    <label for="amount" class="form-label">Amount (RM)</label>
                    <input type="number" step="0.01" class="form-control" id="amount" name="amount" required>
                </div>

                <div class="mb-3">
                    <label for="month" class="form-label">Month</label>
                    <select class="form-select" id="month" name="month" required>
                        <option value="January">January</option>
                        <option value="February">February</option>
                        <option value="March">March</option>
                        <option value="April">April</option>
                        <option value="May">May</option>
                        <option value="June">June</option>
                        <option value="July">July</option>
                        <option value="August">August</option>
                     	<option value="September">September</option>
                     	<option value="October">October</option>
                     	<option value="November">November</option>
                     	<option value="December">December</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label for="photoUrl" class="form-label">Proof Picture</label>
                    <input type="file" class="form-control" id="photoUrl" name="photoUrl" accept="image/*" required>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            
        </div>
	</div>
</body>
</html>