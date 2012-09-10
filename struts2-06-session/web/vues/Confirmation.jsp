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
	<title><s:text name="confirm.titre1"/></title>
    </head>
    <body>
	<h1><s:text name="confirm.titre2"/></h1>
	<s:text name="confirm.texte"/>&nbsp;
	<s:property value="nom"/> !
	<br/><br/><br/>
	<a href="<s:url action="Saisir"/>"><s:text name="confirm.retour"/></a>
    </body>
</html>
