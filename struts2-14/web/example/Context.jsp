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
	nom : <s:property value="#parameters['nom']"/><br/>
	age : <s:property value="#parameters['age']"/>
	<h3><s:text name="Context.session"/></h3>
	compteur : <s:property value="#session['compteur']"/>
	<h3><s:text name="Context.request"/></h3>
	nbMaxUsers : <s:property value="#request['nbMaxUsers']"/>
    </body>
</html>
