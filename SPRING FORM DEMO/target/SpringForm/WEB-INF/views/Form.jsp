<%--
  Created by IntelliJ IDEA.
  User: nivek
  Date: 30-11-2021
  Time: 07:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
            integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
            integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
            crossorigin="anonymous"></script>

    <link href="<c:url value="/WEB-INF/resources/css/style.css"/>">
    <link href="<c:url value="/WEB-INF/resources/js/test.js"/>">

</head>

<body>

<img src="<c:url value="/WEB-INF/resources/img/PIKACHU.png"/>"/>

<div class="container">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <div class="card mt-4">
                <div class="card-body">
                    <h3 class="text-center">Contact form</h3>

                    <div class="alert alert-warning" role="alert">
                        <form:errors path="employee.*"/>
                    </div>

                    <form action="RegisterUser" method="post">

                        <!-- Name -->
                        <div class="mb-3">
                            <label class="form-label">Name</label>
                            <input type="text" class="form-control" name="name" aria-describedby="emailHelp">
                            <div class="form-text">We'll never share your email with anyone else.</div>
                        </div>

                        <!-- Id -->
                        <div class="mb-3">
                            <label class="form-label">Id</label>
                            <input type="text" class="form-control" name="id">
                        </div>

                        <!-- Date -->
                        <div class="mb-3">
                            <label class="form-label">Date</label>
                            <input type="text" class="form-control" placeholder="dd/mm/yyyy" name="dob">
                        </div>

                        <!-- Courses -->
                        <div class="mb-3">
                            <label class="form-label">Courses</label>
                            <select class="form-select" aria-label="Default select example" name="courses">
                                <option selected value="Java">Java</option>
                                <option value="Python">Python</option>
                                <option value="C++">C++</option>
                                <option value="Spring">Spring</option>
                            </select>
                        </div>


                        <!-- Gender -->
                        <div class="mb-3">
                            <label class="form-label">Gender</label>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" id="inlineRadio1"
                                       value="Female" name="gender">
                                <label class="form-check-label" for="inlineRadio1">Female</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" id="inlineRadio2"
                                       value="Male" name="gender" >
                                <label class="form-check-label" for="inlineRadio2">Male</label>
                            </div>
                        </div>

                        <!-- Type -->
                        <div class="mb-3">
                            <label class="form-label">Select Type</label>
                            <select class="form-select" aria-label="Default select example" name="type">
                                <option selected value="Old Student">Old Student</option>
                                <option value="New Student">New Student</option>
                            </select>
                        </div>

                        <div class="mb-3">
                            <div class="card">
                                <div class="card-body">

                                    <p>Your Address</p>
                                    <div class="form-group mb-2">
                                        <input type="text" class="form-control" placeholder="Enter street" name="address.street"/>
                                    </div>

                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Enter city" name="address.city"/>
                                    </div>

                                </div>
                            </div>

                        </div>


                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
                </div>
            </div>

        </div>
    </div>
</div>

</body>

</html>