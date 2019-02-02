
# ResourceTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | Action is the action to perform to the resource. Must be one of: get, create, apply, delete, replace | 
**failureCondition** | **String** | FailureCondition is a label selector expression which describes the conditions of the k8s resource in which the step was considered failed |  [optional]
**manifest** | **String** | Manifest contains the kubernetes manifest | 
**successCondition** | **String** | SuccessCondition is a label selector expression which describes the conditions of the k8s resource in which it is acceptable to proceed to the following step |  [optional]



