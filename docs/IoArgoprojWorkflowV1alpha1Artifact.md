
# IoArgoprojWorkflowV1alpha1Artifact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archive** | [**IoArgoprojWorkflowV1alpha1ArchiveStrategy**](IoArgoprojWorkflowV1alpha1ArchiveStrategy.md) |  |  [optional]
**archiveLogs** | **Boolean** | ArchiveLogs indicates if the container logs should be archived |  [optional]
**artifactory** | [**IoArgoprojWorkflowV1alpha1ArtifactoryArtifact**](IoArgoprojWorkflowV1alpha1ArtifactoryArtifact.md) |  |  [optional]
**from** | **String** | From allows an artifact to reference an artifact from a previous step |  [optional]
**git** | [**IoArgoprojWorkflowV1alpha1GitArtifact**](IoArgoprojWorkflowV1alpha1GitArtifact.md) |  |  [optional]
**globalName** | **String** | GlobalName exports an output artifact to the global scope, making it available as &#39;{{workflow.outputs.artifacts.XXXX}} and in workflow.status.outputs.artifacts |  [optional]
**hdfs** | [**IoArgoprojWorkflowV1alpha1HDFSArtifact**](IoArgoprojWorkflowV1alpha1HDFSArtifact.md) |  |  [optional]
**http** | [**IoArgoprojWorkflowV1alpha1HTTPArtifact**](IoArgoprojWorkflowV1alpha1HTTPArtifact.md) |  |  [optional]
**mode** | **Integer** | mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts. |  [optional]
**name** | **String** | name of the artifact. must be unique within a template&#39;s inputs/outputs. | 
**path** | **String** | Path is the container path to the artifact |  [optional]
**raw** | [**IoArgoprojWorkflowV1alpha1RawArtifact**](IoArgoprojWorkflowV1alpha1RawArtifact.md) |  |  [optional]
**s3** | [**IoArgoprojWorkflowV1alpha1S3Artifact**](IoArgoprojWorkflowV1alpha1S3Artifact.md) |  |  [optional]



