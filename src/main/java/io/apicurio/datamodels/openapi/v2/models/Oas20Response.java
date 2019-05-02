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

package io.apicurio.datamodels.openapi.v2.models;

import io.apicurio.datamodels.openapi.models.OasResponse;

/**
 * Models an OpenAPI 2.0 response.
 * @author eric.wittmann@gmail.com
 */
public class Oas20Response extends OasResponse {

    private String _statusCode;
    
    /**
     * Constructor.
     * @param statusCode
     */
    public Oas20Response(String statusCode) {
        this._statusCode = statusCode;
    }

    /**
     * Gets the status code.
     * @return {string}
     */
    public String getStatusCode() {
        return this._statusCode;
    }

}