package metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jpa.Cotisation;
import jpa.Employe;
import jpa.Indemnite;

public class MetierSimule implements IMetier {

  // liste des employes
  private Map<String, Employe> hashEmployes = new HashMap<String, Employe>();
  private List<Employe> listEmployes;

  // obtenir la feuille de salaire
  public FeuilleSalaire calculerFeuilleSalaire(String SS,
          double nbHeuresTravaillées, int nbJoursTravaillés) {
    // on récupère l'employé de n° SS
    Employe e = hashEmployes.get(SS);
    // on rend une feuille de salaire fictive
    return new FeuilleSalaire(e, new Cotisation(3.49, 6.15, 9.39, 7.88), new ElementsSalaire(100, 100, 100, 100, 100));
  }

  // liste des employés
  public List<Employe> findAllEmployes() {
    if (listEmployes == null) {
      // on crée une liste de deux employés
      listEmployes = new ArrayList<Employe>();
      listEmployes.add(new Employe("254104940426058", "Jouveinal", "Marie", "5 rue des oiseaux", "St Corentin", "49203", new Indemnite(2, 2.1, 2.1, 3.1, 15)));
      listEmployes.add(new Employe("260124402111742", "Laverti", "Justine", "La br�lerie", "St Marcel", "49014", new Indemnite(1, 1.93, 2, 3, 12)));
      // dictionnaire des employes
      for (Employe e : listEmployes) {
        hashEmployes.put(e.getSS(), e);
      }
    }
    // on rend la liste des employés
    return listEmployes;
  }
}
