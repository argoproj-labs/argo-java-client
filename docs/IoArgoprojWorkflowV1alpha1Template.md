
# IoArgoprojWorkflowV1alpha1Template

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeDeadlineSeconds** | **Long** | Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates. |  [optional]
**affinity** | [**IoK8sApiCoreV1Affinity**](IoK8sApiCoreV1Affinity.md) |  |  [optional]
**archiveLocation** | [**IoArgoprojWorkflowV1alpha1ArtifactLocation**](IoArgoprojWorkflowV1alpha1ArtifactLocation.md) |  |  [optional]
**container** | [**IoK8sApiCoreV1Container**](IoK8sApiCoreV1Container.md) |  |  [optional]
**daemon** | **Boolean** | Deamon will allow a workflow to proceed to the next step so long as the container reaches readiness |  [optional]
**dag** | [**IoArgoprojWorkflowV1alpha1DAGTemplate**](IoArgoprojWorkflowV1alpha1DAGTemplate.md) |  |  [optional]
**inputs** | [**IoArgoprojWorkflowV1alpha1Inputs**](IoArgoprojWorkflowV1alpha1Inputs.md) |  |  [optional]
**metadata** | [**IoArgoprojWorkflowV1alpha1Metadata**](IoArgoprojWorkflowV1alpha1Metadata.md) |  |  [optional]
**name** | **String** | Name is the name of the template | 
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level. |  [optional]
**outputs** | [**IoArgoprojWorkflowV1alpha1Outputs**](IoArgoprojWorkflowV1alpha1Outputs.md) |  |  [optional]
**parallelism** | **Long** | Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total. |  [optional]
**resource** | [**IoArgoprojWorkflowV1alpha1ResourceTemplate**](IoArgoprojWorkflowV1alpha1ResourceTemplate.md) |  |  [optional]
**retryStrategy** | [**IoArgoprojWorkflowV1alpha1RetryStrategy**](IoArgoprojWorkflowV1alpha1RetryStrategy.md) |  |  [optional]
**script** | [**IoArgoprojWorkflowV1alpha1ScriptTemplate**](IoArgoprojWorkflowV1alpha1ScriptTemplate.md) |  |  [optional]
**sidecars** | [**List&lt;IoArgoprojWorkflowV1alpha1Sidecar&gt;**](IoArgoprojWorkflowV1alpha1Sidecar.md) | Sidecars is a list of containers which run alongside the main container Sidecars are automatically killed when the main container completes |  [optional]
**steps** | [**List&lt;List&lt;IoArgoprojWorkflowV1alpha1WorkflowStep&gt;&gt;**](List.md) | Steps define a series of sequential/parallel workflow steps |  [optional]
**suspend** | [**Object**](.md) | SuspendTemplate is a template subtype to suspend a workflow at a predetermined point in time |  [optional]
**tolerations** | [**List&lt;IoK8sApiCoreV1Toleration&gt;**](IoK8sApiCoreV1Toleration.md) | Tolerations to apply to workflow pods. |  [optional]



