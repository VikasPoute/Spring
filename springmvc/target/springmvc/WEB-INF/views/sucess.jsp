<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ page isELIgnored="false" %>
        <!doctype html>
        <html lang="en">

        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Bootstrap demo</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
                crossorigin="anonymous">
        </head>

        <body>

            <div class="container mt-5">
                <div class="container">
                    <h1> User Name: ${user.username} </h1>
                </div>

                <div class="container">
                    <h1> User Email: ${user.email} </h1>
                </div>

                <div class="container">
                    <h1> User Password: ${user.password} </h1>

                </div>

                <div class="container">
                    <h1> User City: ${user.city} </h1>
                </div>

                <div class="container">
                    <h1> User Zip code: ${user.zip} </h1>
                </div>
            </div>

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
                crossorigin="anonymous"></script>
        </body>

        </html>