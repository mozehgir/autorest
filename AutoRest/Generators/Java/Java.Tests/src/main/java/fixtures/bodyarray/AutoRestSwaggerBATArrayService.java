/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyarray;

import java.util.List;
import com.squareup.okhttp.Interceptor;

/**
 * The interface for AutoRestSwaggerBATArrayService class.
 */
public interface AutoRestSwaggerBATArrayService {
    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return the BaseUri value.
     */
    String getBaseUri();

    /**
     * Gets the list of interceptors the OkHttp client will execute.
     * @return the list of interceptors.
     */
    List<Interceptor> getClientInterceptors();

    /**
     * Gets the Array object to access its operations.
     * @return the array value.
     */
    Array getArray();

}