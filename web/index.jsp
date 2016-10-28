<%-- 
    Document   : index
    Created on : Oct 24, 2016, 7:35:42 PM
    Author     : Casey Hayes
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/includes/header.html" %>

<h1>Future Value Calculator</h1>
  <form action="calculate" method="post">
    <input type="hidden" name="action" value="calculate" />
    <p><label class="left">Investment Amount</label><input class="right" name="amount" type="number" title="Your Investment Amount" min="0" step="any" autofocus required /></p>
    <p><label class="left">Yearly Interest Rate</label><input class="right" name="rate" type="number" title="Yearly Interest Rate" min="0" required /></p>
    <p><label class="left">Number of Years</label><input class="right" name="years" type="number" title="Number of Years" min="0" placeholder="integer number of years" required /></p>
    <p><input type="submit" value="Calculate" id="submit" /></p>
  </form>

<%@ include file="/includes/footer.jsp" %>