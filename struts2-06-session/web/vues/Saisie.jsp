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
	<title><s:text name="saisie.titre1"/></title>
    </head>
    <body>
	<h1><s:text name="saisie.titre2"/></h1>
	<s:form action="Confirmer">
	    <s:textfield key="saisie.libelle" name="nom" value="%{#attr['nom']}"/>
	    <s:submit key="saisie.valider" action="Confirmer"/>
	    <s:submit key="saisie.effacer" action="Effacer"/>
	</s:form>
    </body>
</html>
