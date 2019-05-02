/*
 * Copyright 2019 Red Hat
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

package io.apicurio.datamodels.openapi.v3.validation;

import io.apicurio.datamodels.openapi.v3.models.Oas30Document;
import io.apicurio.datamodels.openapi.v3.models.Oas30ParameterDefinition;
import io.apicurio.datamodels.openapi.v3.visitors.IOas30Visitor;
import io.apicurio.datamodels.openapi.validation.OasValidationVisitor;

/**
 * @author eric.wittmann@gmail.com
 */
public class Oas30ValidationVisitor extends OasValidationVisitor implements IOas30Visitor {

    /**
     * Constructor.
     * @param document
     */
    public Oas30ValidationVisitor(Oas30Document document) {
        super(document);
    }

    /**
     * @see io.apicurio.datamodels.openapi.v3.visitors.IOas30Visitor#visitParameterDefinition(io.apicurio.datamodels.openapi.v3.models.Oas30ParameterDefinition)
     */
    @Override
    public void visitParameterDefinition(Oas30ParameterDefinition node) {
        this.acceptAll(node);
    }

}