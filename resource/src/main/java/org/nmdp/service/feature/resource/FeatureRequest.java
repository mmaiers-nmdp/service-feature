/*

    feature-resource  Feature resources.
    Copyright (c) 2014-2015 National Marrow Donor Program (NMDP)

    This library is free software; you can redistribute it and/or modify it
    under the terms of the GNU Lesser General Public License as published
    by the Free Software Foundation; either version 3 of the License, or (at
    your option) any later version.

    This library is distributed in the hope that it will be useful, but WITHOUT
    ANY WARRANTY; with out even the implied warranty of MERCHANTABILITY or
    FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
    License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this library;  if not, write to the Free Software Foundation,
    Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA.

    > http://www.gnu.org/licenses/lgpl.html

*/
package org.nmdp.service.feature.resource;

import javax.annotation.concurrent.Immutable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Feature request.
 */
@Immutable
public final class FeatureRequest {
    private final String locus;
    private final String term;
    private final int rank;
    private final long accession;
    private final String sequence;

    @JsonCreator
    public FeatureRequest(final @JsonProperty("locus") String locus,
                          final @JsonProperty("term") String term,
                          final @JsonProperty("rank") int rank,
                          final @JsonProperty("accession") long accession,
                          final @JsonProperty("sequence") String sequence) {

        this.locus = locus;
        this.term = term;
        this.rank = rank;
        this.accession = accession;
        this.sequence = sequence;
    }


    public String getLocus() {
        return locus;
    }

    public String getTerm() {
        return term;
    }

    public int getRank() {
        return rank;
    }

    public long getAccession() {
        return accession;
    }

    public String getSequence() {
        return sequence;
    }
}
