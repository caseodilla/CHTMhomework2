<%-- 
    Document   : calculate
    Created on : Oct 26, 2016, 8:44:06 PM
    Author     : Casey Hayes
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/includes/header.html" %>

<p><div class="left">Investment Amount:</div><div class="right">${amount}</div></p>
<p><div class="left">Yearly Interest Rate:</div><div class="right">${rate}</div></p>
<p><div class="left">Number of Years:</div><div class="right">${years}</div></p>
<p><div class="left">Future Value:</div><div class="right">${futureValue}</div></p>

<%@ include file="/includes/footer.jsp" %>
