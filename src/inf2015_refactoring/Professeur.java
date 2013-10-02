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

import java.util.ArrayList;
import java.util.List;

public class Professeur extends Personne {

    List<Etudiant> etudiants = new ArrayList<Etudiant>();
    String photoUrl;

    public Professeur(String nom, String prenom) {
        // TODO introduire methode pour formater le nom
        String matriculePaie = nom.toUpperCase().trim().substring(1, 3)
                + prenom.toUpperCase().trim().substring(1, 3);
        // TODO introduire attribut `matriculePaie`
        System.out.println("Nouveau professeur: " + matriculePaie);
    }

    public void setPhotoUrl(String photoName) {
        // TODO introduire un parametre `folder`
        this.photoUrl = "/photos/professeurs/informatique/" + photoName;
    }

}
