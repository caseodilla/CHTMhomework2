<%-- 
    Document   : calculate
    Created on : Oct 26, 2016, 8:44:06 PM
    Author     : Casey Hayes
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/includes/header.html" %>

<h1>Future Value Calculator</h1>
<jsp:useBean id="user" scope="request" class="chtm.objects.User"/>
  <p class="line"><span class="left">Investment Amount:</span>
  <span class="right"><jsp:getProperty name="user" property="amount"/></span></p>
  <p class="line"><span class="left">Yearly Interest Rate:</span>
  <span class="right"><jsp:getProperty name="user" property="rate"/></span></p>
  <p class="line"><span class="left">Number of Years:</span>
  <span class="right"><jsp:getProperty name="user" property="years"/></span></p>
  <p class="line"><span class="left">Future Value:</span>
  <span class="right"><jsp:getProperty name="user" property="futureValue"/></span></p>

<%@ include file="/includes/footer.jsp" %>
