// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.Map;

/** Resource collection API of Pipelines. */
public interface Pipelines {
    /**
     * Lists pipelines.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of pipeline resources.
     */
    PagedIterable<PipelineResource> listByFactory(String resourceGroupName, String factoryName);

    /**
     * Lists pipelines.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of pipeline resources.
     */
    PagedIterable<PipelineResource> listByFactory(String resourceGroupName, String factoryName, Context context);

    /**
     * Gets a pipeline.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param pipelineName The pipeline name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline.
     */
    PipelineResource get(String resourceGroupName, String factoryName, String pipelineName);

    /**
     * Gets a pipeline.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param pipelineName The pipeline name.
     * @param ifNoneMatch ETag of the pipeline entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline along with {@link Response}.
     */
    Response<PipelineResource> getWithResponse(
        String resourceGroupName, String factoryName, String pipelineName, String ifNoneMatch, Context context);

    /**
     * Deletes a pipeline.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param pipelineName The pipeline name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String factoryName, String pipelineName);

    /**
     * Deletes a pipeline.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param pipelineName The pipeline name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String pipelineName, Context context);

    /**
     * Creates a run of a pipeline.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param pipelineName The pipeline name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier.
     */
    CreateRunResponse createRun(String resourceGroupName, String factoryName, String pipelineName);

    /**
     * Creates a run of a pipeline.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param pipelineName The pipeline name.
     * @param referencePipelineRunId The pipeline run identifier. If run ID is specified the parameters of the specified
     *     run will be used to create a new run.
     * @param isRecovery Recovery mode flag. If recovery mode is set to true, the specified referenced pipeline run and
     *     the new run will be grouped under the same groupId.
     * @param startActivityName In recovery mode, the rerun will start from this activity. If not specified, all
     *     activities will run.
     * @param startFromFailure In recovery mode, if set to true, the rerun will start from failed activities. The
     *     property will be used only if startActivityName is not specified.
     * @param parameters Parameters of the pipeline run. These parameters will be used only if the runId is not
     *     specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier along with {@link Response}.
     */
    Response<CreateRunResponse> createRunWithResponse(
        String resourceGroupName,
        String factoryName,
        String pipelineName,
        String referencePipelineRunId,
        Boolean isRecovery,
        String startActivityName,
        Boolean startFromFailure,
        Map<String, Object> parameters,
        Context context);

    /**
     * Gets a pipeline.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline along with {@link Response}.
     */
    PipelineResource getById(String id);

    /**
     * Gets a pipeline.
     *
     * @param id the resource ID.
     * @param ifNoneMatch ETag of the pipeline entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline along with {@link Response}.
     */
    Response<PipelineResource> getByIdWithResponse(String id, String ifNoneMatch, Context context);

    /**
     * Deletes a pipeline.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a pipeline.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PipelineResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new PipelineResource definition.
     */
    PipelineResource.DefinitionStages.Blank define(String name);
}
