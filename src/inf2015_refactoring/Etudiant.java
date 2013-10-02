/*
 * Copyright 2013 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package inf2015_refactoring;

import java.util.Date;

public class Etudiant extends Personne {
    // TODO renomer en `codePermanent`
    String code_permanent;

    // TODO remonter `nom`, `prenom` et `dateNaissance` dans `Personne`
    String nom;
    String prenom;
    Date dateNaissance;

    // TODO utiliser de meilleurs noms pour les paramètre
    public Etudiant(String n, String p, Date d) {
        this.nom = n;
        this.prenom = p;
        this.dateNaissance = d;
        this.code_permanent = createCodePermanent(n, p, d);
    }

    public String createCodePermanent(String nom, String prenom, Date date) {
        String end = concatDate(date);
        return nom.substring(0, 3) + prenom.charAt(0) + end;
    }

    // TODO inliner dans `createCodePermanent`
    private String concatDate(Date date) {
        return date.getYear() + "-" + date.getMonth();
    }

    public String getCodePermanent() {
        return code_permanent;
    }

    public void setCodePermanent(String codePermanent) {
        this.code_permanent = codePermanent;
    }

    // TODO déplacer dans la classe `Professeur`
    public void estSupervisePar(Professeur professeur) {
        professeur.etudiants.add(this);
    }
}
