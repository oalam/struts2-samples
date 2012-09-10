<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!-- liste de simulations vide -->
<s:if test="#session['simulations']==null || #session['simulations'].size()==0">
  <h2><s:text name="Pam.SimulationsVides.titre"/></h2>
</s:if>
<!-- liste de simulations non vide -->
<s:if test="#session['simulations'].size()!=0">
  <h2><s:text name="Pam.Simulations.titre"/></h2>
  <table>
    <tr class="titreInfos">
      <th><s:text name="Pam.Simulations.num"/></th>
      <th><s:text name="Pam.Simulations.nom"/></th>
      <th><s:text name="Pam.Simulations.prenom"/></th>
      <th><s:text name="Pam.Simulations.heures"/></th>
      <th><s:text name="Pam.Simulations.jours"/></th>
      <th><s:text name="Pam.Simulations.salairebase"/></th>
      <th><s:text name="Pam.Simulations.indemnites"/></th>
      <th><s:text name="Pam.Simulations.cotisationsociales"/></th>
      <th><s:text name="Pam.Simulations.salairenet"/></th>
    </tr>
    <s:iterator value="#session['simulations']">
      <s:url action="SupprimerSimulation" var="url">
        <s:param name="id" value="num"/>
      </s:url>
      <tr>
        <td class="libelle"><s:property value="num"/></td>
        <td class="info"><s:property value="feuilleSalaire.employe.nom"/></td>
        <td class="info"><s:property value="feuilleSalaire.employe.prenom"/></td>
        <td class="info"><s:property value="heuresTravaillées"/></td>
        <td class="info"><s:property value="joursTravaillés"/></td>
        <td class="info">
          <s:text name="Format.monnaie">
            <s:param value="feuilleSalaire.elementsSalaire.salaireBase"/>
          </s:text>
        </td>
        <td class="info">
          <s:text name="Format.monnaie">
            <s:param value="indemnites"/>
          </s:text>
        </td>
        <td class="info">
          <s:text name="Format.monnaie">
            <s:param value="feuilleSalaire.elementsSalaire.cotisationsSociales"/>
          </s:text>
        </td>
        <td class="info">
          <s:text name="Format.monnaie">
            <s:param value="feuilleSalaire.elementsSalaire.salaireNet"/>
          </s:text>
        </td>
        <td class="info"><a href="<s:property value="#url"/>">Retirer</a></td>
      </tr>
    </s:iterator>
  </table>
</s:if>
