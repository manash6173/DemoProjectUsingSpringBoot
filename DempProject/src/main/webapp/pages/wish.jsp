<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <form action="/wish" method="get" style="text-align: center;">
       Enter Name::<input type="text" name="name"/><br/>
       <input type="submit" value="getWishMsg"/>
    </form>
    <h1 style="color: blue;text-align: center;">${msg}</h1><br/>
    <a href="/">Home</a>