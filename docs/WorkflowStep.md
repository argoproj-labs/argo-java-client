
# WorkflowStep

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arguments** | [**Arguments**](Arguments.md) |  |  [optional]
**name** | **String** | Name of the step |  [optional]
**template** | **String** | Template is a reference to the template to execute as the step |  [optional]
**when** | **String** | When is an expression in which the step should conditionally execute |  [optional]
**withItems** | **List&lt;String&gt;** | WithItems expands a step into multiple parallel steps from the items in the list |  [optional]
**withParam** | **String** | WithParam expands a step into multiple parallel steps from the value in the parameter, which is expected to be a JSON list. |  [optional]
**withSequence** | [**Sequence**](Sequence.md) |  |  [optional]



