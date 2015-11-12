/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in Bool.
 */
public interface Bool {
    /**
     * The interface defining all the services for Bool to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BoolService {
        @GET("/bool/true")
        Call<ResponseBody> getTrue();

        @PUT("/bool/true")
        Call<ResponseBody> putTrue(@Body boolean boolBody);

        @GET("/bool/false")
        Call<ResponseBody> getFalse();

        @PUT("/bool/false")
        Call<ResponseBody> putFalse(@Body boolean boolBody);

        @GET("/bool/null")
        Call<ResponseBody> getNull();

        @GET("/bool/invalid")
        Call<ResponseBody> getInvalid();

    }
    /**
     * Get true Boolean value
     *
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Boolean> getTrue() throws ServiceException;

    /**
     * Get true Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getTrueAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Set Boolean value true
     *
     * @param boolBody the boolean value
     * @return the {@link ServiceResponse} object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putTrue(boolean boolBody) throws ServiceException;

    /**
     * Set Boolean value true
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putTrueAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get false Boolean value
     *
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Boolean> getFalse() throws ServiceException;

    /**
     * Get false Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getFalseAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Set Boolean value false
     *
     * @param boolBody the boolean value
     * @return the {@link ServiceResponse} object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putFalse(boolean boolBody) throws ServiceException;

    /**
     * Set Boolean value false
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putFalseAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null Boolean value
     *
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Boolean> getNull() throws ServiceException;

    /**
     * Get null Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get invalid Boolean value
     *
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Boolean> getInvalid() throws ServiceException;

    /**
     * Get invalid Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidAsync(final ServiceCallback<Boolean> serviceCallback);

}