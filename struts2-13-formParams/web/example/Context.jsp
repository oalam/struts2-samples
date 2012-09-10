<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
	<title><s:text name="Context.titre"/></title>
	<s:head/>
    </head>

    <body background="<s:url value="/ressources/standard.jpg"/>">
	<h2><s:text name="Context.message"/></h2>
	<h3><s:text name="Context.parameters"/></h3>
	<s:iterator value="#parameters['nom']" var="nom">
	    nom : <s:property value="nom"/><br/>
	</s:iterator>
	<s:iterator value="#parameters['prenom']" var="prenom">
	    prenom : <s:property value="prenom"/><br/>
	</s:iterator>
	<s:iterator value="#parameters['age']" var="age">
	    âge : <s:property value="age"/><br/>
	</s:iterator>
	<h3><s:text name="Context.session"/></h3>
	compteur : <s:property value="#session['compteur']"/>
	<h3><s:text name="Context.request"/></h3>
	info1 : <s:property value="#request['info1']"/>
    </body>
</html>
