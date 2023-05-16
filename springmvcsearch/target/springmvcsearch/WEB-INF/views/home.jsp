<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Search Bar</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
            <link rel="stylesheet" href="<c:url value='/resources/css/style.css' />">
        </head>

        <body>
            <div class="container">
                <div class="card mx-auto mt-5 bg-warning" style="width: 50%;">
                    <div class="card-body py-5">
                        <h3 class="text-center text-white" style="text-transform: uppercase;">My Search</h3>
                        <form action="search" method="post" class="mt-5">
                            <div class="form-group">
                                <input type="text" name="querybox" class="form-control"
                                    placeholder="Enter your keyword">
                            </div>
                            <div class="container text-center">
                                <button class="btn btn-outline-light">Search</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
            <script src="https://kit.fontawesome.com/a076d05399.js"></script>
        </body>

        </html>