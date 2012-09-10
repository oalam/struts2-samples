<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">


<script language="javascript" type="text/javascript">
  function doSimulation(){
    // on poste le formulaire
    document.forms['Saisie'].elements['action'].name='action:Formulaire!calculSalaire'
    document.forms['Saisie'].submit();
  }
</script>

<!-- saisie des informations -->
<s:form name="Saisie" id="Saisie">
  <s:select name="comboEmployesValue" list="employes" listKey="SS" listValue="prenom+' ' +nom" key="Pam.Saisie.employé"/>
  <s:textfield name="heuresTravaillees" key="Pam.Saisie.Heures.libellé" value="%{#parameters['heuresTravaillees']!=null ? #parameters['heuresTravaillees'] : heuresTravaillees==null ? '' : getText('double.format',{heuresTravaillees})}"/>
  <s:textfield name="joursTravailles" key="Pam.Saisie.Jours.libellé" value="%{#parameters['joursTravailles']!=null ? #parameters['joursTravailles'] : joursTravailles==null ? '' : joursTravailles}"/>
  <input type="hidden" name="action"/>
</s:form>