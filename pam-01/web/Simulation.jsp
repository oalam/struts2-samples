<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<hr/>
<!-- informations Employé -->
<span class="titreInfos">
  <s:text  name="Simulation.Infos.employe"/>
</span>
<br/><br/>
<table>
  <!-- ligne 1 -->
  <tr>
    <th class="libelle">
      <s:text name="Simulation.Employe.nom"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Employe.prenom"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Employe.adresse"/>
    </th>
  </tr>
  <!-- ligne 2 -->
  <tr>
    <td class="info">   
      <s:property value="feuilleSalaire.employe.nom"/>      
    </td>
    <td class="info">
      <s:property value="feuilleSalaire.employe.prenom"/>
    </td>
    <td class="info">
      <s:property value="feuilleSalaire.employe.adresse"/>
    </td>
</table>
<table>
  <!-- ligne 1 -->
  <tr>
    <th class="libelle"><s:text name="Simulation.Employe.ville"/></th>
    <th class="libelle">
      <s:text name="Simulation.Employe.codePostal"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Employe.indice"/>
    </th>
  </tr>
  <!-- ligne 2 -->
  <tr>
    <td class="info">
      <s:property value="feuilleSalaire.employe.ville"/>
    </td>
    <td class="info">
      <s:property value="feuilleSalaire.employe.codePostal"/>
    </td>
    <td class="info">
      <s:property value="feuilleSalaire.employe.indemnite.indice"/>
    </td>
</table>
<!-- informations Cotisations -->
<br/>
<span class="titreInfos">
  <s:text name="Simulation.Infos.cotisations"/>
</span>

<br/><br/>
<table>
  <!-- ligne 1 -->
  <tr>
    <th class="libelle">
      <s:text name="Simulation.Cotisations.csgrds"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Cotisations.csgrds"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Cotisations.retraite"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Cotisations.secu"/>
    </th>
  </tr>
  <!-- ligne 2 -->
  <tr>
    <td class="info">
      <s:text name="Format.pourcent">
        <s:param value="feuilleSalaire.cotisation.csgrds"/>
      </s:text>
    </td>
    <td  class="info">
      <s:text name="Format.pourcent">
        <s:param value="feuilleSalaire.cotisation.csgd"/>
      </s:text>
    </td>
    <td class="info">
      <s:text name="Format.pourcent">
        <s:param value="feuilleSalaire.cotisation.retraite"/>
      </s:text>
    </td>
    <td class="info">
      <s:text name="Format.pourcent">
        <s:param value="feuilleSalaire.cotisation.secu"/>
      </s:text>
    </td>
</table>
<!-- informations Indemnités -->
<br/>
<span class="titreInfos">
  <s:text name="Form.Infos.indemnites"/>
</span>
<br/><br/>
<table>
  <!-- ligne 1 -->
  <tr>
    <th class="libelle">
      <s:text name="Simulation.Indemnites.salaireHoraire"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Indemnites.entretienJour"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Indemnites.repasJour"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Indemnites.congésPayés"/>
    </th>
  </tr>
  <!-- ligne 2 -->
  <tr>
    <td class="info">
      <s:text name="Format.monnaie">
        <s:param value="feuilleSalaire.employe.indemnite.baseHeure"/>
      </s:text>
    </td>
    </td>
    <td class="info">
      <s:text name="Format.monnaie">
        <s:param value="feuilleSalaire.employe.indemnite.entretienJour"/>
      </s:text>
    </td>
    <td class="info">
      <s:text name="Format.monnaie">
        <s:param value="feuilleSalaire.employe.indemnite.repasJour"/>
      </s:text>
    </td>
    <td class="info">
      <s:text name="Format.monnaie">
        <s:param value="feuilleSalaire.employe.indemnite.indemnitesCP"/>
      </s:text>
    </td>
  </tr>
</table>
<!-- informations Salaire -->
<br/>
<span class="titreInfos">
  <s:text name="Simulation.Infos.Salaire"/>
</span>
<br/><br/>
<table>
  <!-- ligne 1 -->
  <tr>
    <th class="libelle">
      <s:text name="Simulation.Salaire.salaireBase"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Salaire.cotisationsSociales"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Salaire.entretien"/>
    </th>
    <th class="libelle">
      <s:text name="Simulation.Salaire.repas"/>
    </th>
  </tr>

  <!-- ligne 2 -->
  <tr>
    <td class="info">
      <s:text name="Format.monnaie">
        <s:param value="feuilleSalaire.elementsSalaire.salaireBase"/>
      </s:text>
    </td>
    <td class="info">
      <s:text name="Format.monnaie">
        <s:param value="feuilleSalaire.elementsSalaire.cotisationsSociales"/>
      </s:text>
    </td>
    <td class="info">
      <s:text name="Format.monnaie">
        <s:param value="feuilleSalaire.elementsSalaire.indemnitesEntretien"/>
      </s:text>
    </td>
    <td class="info">
      <s:text name="Format.monnaie">
        <s:param value="feuilleSalaire.elementsSalaire.indemnitesRepas"/>
      </s:text>
    </td>
  </tr>
</table>
<!-- Salaire net-->
<br/>
<table>
  <tr>
    <td class="libelle">
      <s:text name="Simulation.salaireNet"/>
    <td></td>
    <td class="info">
      <s:text name="Format.monnaie">
        <s:param value="feuilleSalaire.elementsSalaire.salaireNet"/>
      </s:text>
    </td>
  </tr>
</table>
