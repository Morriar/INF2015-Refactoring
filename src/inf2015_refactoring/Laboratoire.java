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

// TODO extraire super classe `Salle` et y remonter `idSalle` et `capacite`
public class Laboratoire {
    String idSalle;
    Integer capacite;
    Integer nbOrdinateurs;

    public String getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(String idSalle) {
        this.idSalle = idSalle;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public Integer getNbOrdinateurs() {
        return nbOrdinateurs;
    }

    public void setNbOrdinateurs(Integer nbOrdinateurs) {
        this.nbOrdinateurs = nbOrdinateurs;
    }
}
