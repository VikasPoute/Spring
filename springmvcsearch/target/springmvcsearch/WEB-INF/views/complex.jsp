<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Search Bar</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    </head>

    <body class="" style="background: #e2e2e2;">

        <div class="container mt-4">
            <div class="row">
                <div class="col-md-8 offset-md-2">
                    <div class="card">
                        <div class="card-body">
                            <h3 class="text-center">Complex Form</h3>
                            <div class="alert alert-danger" role="alert">
                                <form:errors path="student.*" />
                            </div>
                            <form action="handle" method="post">
                                <div class="form-group">
                                    <label for="name">Your Name</label>
                                    <input type="text" name="name" class="form-control" placeholder="Enter Name" />
                                    <small class="form-text text-muted">We'll never share your name with anyone
                                        else.</small>
                                </div>
                                <div class="form-group">
                                    <label for="id">Your Id</label>
                                    <input type="text" name="id" class="form-control" placeholder="Enter Id" />
                                </div>
                                <div class="form-group">
                                    <label for="date">Your DOB</label>
                                    <input type="text" name="date" class="form-control" placeholder="DD/MM/YYYY" />
                                </div>
                                <div class="form-group">
                                    <label for="courses">Select Courses</label>
                                    <select name="courses" id="" class="form-control" multiple>
                                        <option>Java</option>
                                        <option>C++</option>
                                        <option>Python</option>
                                        <option>Django</option>
                                        <option>Spring Framework</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <span class="mr-3">Select Gender</span>
                                    <div class="form-check form-check-inline">
                                        <input type="radio" name="gender" value="male" id="" class="form-check-input">
                                        <label for="male" class="form-check-label">Male</label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <input type="radio" name="gender" value="female" id="" class="form-check-input">
                                        <label for="female" class="form-check-label">Female</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="">Select Type</label>
                                    <select name="type" id="" class="form-control">
                                        <option value="oldstudent">Old Student</option>
                                        <option value="normalstudent">Normal Student</option>
                                    </select>
                                </div>
                                <div class="card">
                                    <div class="card-body">
                                        <p>Your Address</p>
                                        <div class="form-group">
                                            <input type="text" name="address.street" class="form-control"
                                                placeholder="Enter street">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="address.city" class="form-control"
                                                placeholder="Enter city">
                                        </div>
                                    </div>
                                </div>
                                <div class="container text-center">
                                    <button class="btn btn-primary">Submit</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    </body>

    </html>