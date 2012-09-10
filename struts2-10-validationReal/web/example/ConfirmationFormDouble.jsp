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
        <td><s:text name="double1.prompt"/></td>
        <td><s:text name="double1"/></td>
      </tr>
      <tr>
        <td><s:text name="double2.prompt"/></td>
        <td>
          <s:text name="double.format">
            <s:param value="double2"/>
          </s:text>
        </td>
      </tr>
      <tr>
        <td><s:text name="double3.prompt"/></td>
        <td>
          <s:text name="double.format">
            <s:param value="double3"/>
          </s:text>
        </td>
      </tr>
      <tr>
        <td><s:text name="double4.prompt"/></td>
        <td>
          <s:text name="double.format">
            <s:param value="double4"/>
          </s:text>
        </td>
      </tr>
      <tr>
        <td><s:text name="double5.prompt"/></td>
        <td>
          <s:text name="double.format">
            <s:param value="double5"/>
          </s:text>
        </td>
      </tr>
      <tr>
        <td><s:text name="double6.prompt"/></td>
        <td><s:text name="double6"/></td>
      </tr>
    </table>
    <br/>
    <s:url id="url" action="FormDouble!input"/>
    <s:a href="%{url}"><s:text name="Confirmation.lien"/></s:a>
  </body>
</html>
