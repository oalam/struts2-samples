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
        <td><s:text name="int1.prompt"/></td>
        <td><s:property value="int1"/></td>
      </tr>
      <tr>
        <td><s:text name="int2.prompt"/></td>
        <td><s:property value="int2"/></td>
      </tr>
      <tr>
        <td><s:text name="int3.prompt"/></td>
        <td><s:property value="int3"/></td>
      </tr>
      <tr>
        <td><s:text name="int4.prompt"/></td>
        <td><s:property value="int4"/></td>
      </tr>
      <tr>
        <td><s:text name="int5.prompt"/></td>
        <td><s:property value="int5"/></td>
      </tr>
      <tr>
        <td><s:text name="int6.prompt"/></td>
        <td><s:property value="int6"/></td>
      </tr>
    </table>
    <br/>
    <s:url id="url" action="FormInt" method="input"/>
    <s:a href="%{url}"><s:text name="Confirmation.lien"/></s:a>
  </body>
</html>
