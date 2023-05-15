<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="ISO-8859-1">
            <title>Spring 5 MVC</title>
        </head>

        <body>

            <!-- <% 
                String name=(String) request.getAttribute("name");
                Integer roll=(Integer) request.getAttribute("roll");
             %> -->

            <!-- <h1>Hello <%= name %> </h1> -->
            <h1>Hello ${name} </h1>
            <!-- <h1>Hello <%= name %> your roll number is: <%= roll %> </h1> -->
            <h1>Hello ${name} your roll number is: ${roll} </h1>

            <c:forEach var="item" items="${marks}">
                <h3> ${item} </h3>
            </c:forEach>

        </body>

        </html>