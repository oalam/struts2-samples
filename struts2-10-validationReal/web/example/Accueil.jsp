<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title><s:text name="Accueil.titre"/></title>
    <s:head/>
  </head>

  <body background="<s:url value="/ressources/standard.jpg"/>">
    <h2><s:text name="Accueil.message"/></h2>
    <ul>
      <li>
        <s:url id="url" action="FormDouble!input"/>
        <s:a href="%{url}"><s:text name="Accueil.FormDouble"/></s:a>
      </li>
    </ul>
  </body>
</html>
