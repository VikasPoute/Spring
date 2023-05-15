<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="ISO-8859-1">
            <title>Spring 5 MVC</title>
        </head>

        <body>

            <% String name=(String) request.getAttribute("name"); %>

                <h1>Hello ${name} this is home page</h1>
                <h1>Hello <%= name %> this is home page</h1>
                <h2> ${home.message} </h2>
                <h4>Server date time is : ${home.dateTime}</h4>
        </body>

        </html>