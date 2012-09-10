<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title><s:text name="Confirmation.titre"/></title>
    <s:head/>
  </head>

  <body background="<s:url value="/ressources/standard.jpg"/>">
    <h2><s:text name="Confirmation.message"/></h2>
    <table border="1">
      <tr>
        <th><s:text name="Confirmation.champ"/></th>
        <th><s:text name="Confirmation.valeur"/></th>
      </tr>
      <tr>
        <td><s:text name="email.prompt"/></td>
        <td><s:text name="email"/></td>
      </tr>
      <tr>
        <td><s:text name="url.prompt"/></td>
        <td><s:text name="url1"/></td>
      </tr>
      <tr>
        <td><s:text name="chaine.prompt"/></td>
        <td><s:text name="chaine"/></td>
      </tr>
     </table>
    <br/>
    <s:url id="url" action="FormDivers!input"/>
    <s:a href="%{url}"><s:text name="Confirmation.lien"/></s:a>
  </body>
</html>
