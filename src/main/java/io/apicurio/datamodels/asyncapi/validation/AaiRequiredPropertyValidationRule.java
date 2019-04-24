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

package io.apicurio.datamodels.asyncapi.validation;

import io.apicurio.datamodels.asyncapi.models.AaiInfo;
import io.apicurio.datamodels.asyncapi.visitors.IAaiVisitor;
import io.apicurio.datamodels.core.models.Document;
import io.apicurio.datamodels.core.models.Extension;
import io.apicurio.datamodels.core.validation.RequiredPropertyValidationRule;
import io.apicurio.datamodels.core.validation.ValidationRuleMetaData;

/**
 * Base class for all required property AsyncAPI validation rules.
 * @author eric.wittmann@gmail.com
 */
public class AaiRequiredPropertyValidationRule extends RequiredPropertyValidationRule implements IAaiVisitor {

    /**
     * Constructor.
     * @param ruleInfo
     */
    public AaiRequiredPropertyValidationRule(ValidationRuleMetaData ruleInfo) {
        super(ruleInfo);
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitDocument(io.apicurio.datamodels.core.models.Document)
     */
    @Override
    public void visitDocument(Document node) {
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitExtension(io.apicurio.datamodels.core.models.Extension)
     */
    @Override
    public void visitExtension(Extension node) {
    }

    /**
     * @see io.apicurio.datamodels.asyncapi.visitors.IAaiVisitor#visitInfo(io.apicurio.datamodels.asyncapi.models.AaiInfo)
     */
    @Override
    public void visitInfo(AaiInfo node) {
    }

}