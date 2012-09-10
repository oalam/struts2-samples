<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<h2><s:text name="Pam.Erreurs.titre"/></h2>
<table>
  <tr class="titreInfos">
    <th><s:text name="Pam.Erreurs.classe"/></th>
    <th><s:text name="Pam.Erreurs.message"/></th>
  </tr>
  <s:iterator value="erreurs">
    <tr>
      <td class="libelle"><s:property value="classe"/></td>
      <td class="info"><s:property value="message"/></td>
    </tr>
  </s:iterator>
</table>
