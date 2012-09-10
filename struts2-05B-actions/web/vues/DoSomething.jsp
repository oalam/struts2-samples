<%-- 
    Document   : Action1
    Created on : 6 déc. 2011, 09:59:38
    Author     : Serge Tahé
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><s:text name="formulaire.titre1"/></title>
    </head>
    <body>
	<h1><s:text name="formulaire.titre2"/></h1>
	<s:form action="DoSomething">
	    <s:submit key="formulaire.execute"/>
	    <s:submit key="formulaire.action1" method="action1"/>
	    <s:submit key="formulaire.action2" action="DoSomethingElse" method="action2"/>
	</s:form>
	<s:url id="url" action="DoSomething" method="action3"/>
	<s:a href="%{url}"><s:text name="formulaire.action3"/></s:a>
    </body>
</html>
