<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<table>
  <tr>
    <td><h1><s:text name="Pam.titre"/></h1></td>
    <td>
      <s:if test="menu.faireSimulation">
        |<a href="javascript:doSimulation()"><s:text name="Menu.FaireSimulation"/></a><br/>
      </s:if>
      <s:if test="menu.effacerSimulation">
        |<a href="<s:url action="Formulaire!input"/>"><s:text name="Menu.EffacerSimulation"/></a><br/>
      </s:if>
      <s:if test="menu.voirSimulations">
        |<a href="<s:url action="VoirSimulations"/>"><s:text name="Menu.VoirSimulations"/></a><br/>
      </s:if>
      <s:if test="menu.retourFormulaire">
        |<a href="<s:url action="RetourFormulaire"/>"><s:text name="Menu.RetourFormulaire"/></a><br/>
      </s:if>
      <s:if test="menu.enregistrerSimulation">
        |<a href="<s:url action="EnregistrerSimulation"/>"><s:text name="Menu.EnregistrerSimulation"/></a><br/>
      </s:if>
      <s:if test="menu.terminerSession">
        |<a href="<s:url action="TerminerSession"/>"><s:text name="Menu.TerminerSession"/></a><br/>
      </s:if>
    </td>
  </tr>
</table>

