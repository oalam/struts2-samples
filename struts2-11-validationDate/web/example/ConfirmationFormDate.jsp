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
        <td><s:text name="date1.prompt"/></td>
        <td><s:text name="date1"/></td>
      </tr>
      <tr>
        <td><s:text name="date2.prompt"/></td>
        <td>
          <s:text name="date.format">
            <s:param value="date2"/>
          </s:text>
        </td>
      </tr>
      <tr>
        <td><s:text name="date3.prompt"/></td>
        <td>
          <s:text name="date.format">
            <s:param value="date3"/>
          </s:text>
        </td>
      </tr>
      <tr>
        <td><s:text name="date4.prompt"/></td>
        <td>
          <s:text name="date.format">
            <s:param value="date4"/>
          </s:text>
        </td>
      </tr>
      <tr>
        <td><s:text name="date5.prompt"/></td>
        <td>
          <s:text name="date.format">
            <s:param value="date5"/>
          </s:text>
        </td>
      </tr>
      <tr>
        <td><s:text name="date6.prompt"/></td>
        <td><s:text name="date6"/></td>
      </tr>
    </table>
    <br/>
    <s:url id="url" action="FormDate!input"/>
    <s:a href="%{url}"><s:text name="Confirmation.lien"/></s:a>
  </body>
</html>
