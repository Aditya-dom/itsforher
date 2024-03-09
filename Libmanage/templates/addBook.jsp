<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Library Management</title>
</head>
<body>
    <h2>Add New Book</h2>
    <form action="/books/add" method="post">
        Title: <input type="text" name="title" required><br>
        Author: <input type="text" name="author" required><br>
        <input type="submit" value="Add Book">
    </form>
    <br>
    <a href="/books/list">Back to Book List</a>
</body>
</html>
