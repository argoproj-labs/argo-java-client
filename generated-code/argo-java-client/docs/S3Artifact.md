

# S3Artifact

S3Artifact is the location of an S3 artifact
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKeySecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  | 
**bucket** | **String** | Bucket is the name of the bucket | 
**endpoint** | **String** | Endpoint is the hostname of the bucket endpoint | 
**insecure** | **Boolean** | Insecure will connect to the service with TLS |  [optional]
**key** | **String** | Key is the key in the bucket where the artifact resides | 
**region** | **String** | Region contains the optional bucket region |  [optional]
**roleARN** | **String** | RoleARN is the Amazon Resource Name (ARN) of the role to assume. |  [optional]
**secretKeySecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  | 



