package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1Affinity;
import io.kubernetes.client.models.V1LocalObjectReference;
import io.kubernetes.client.models.V1PersistentVolumeClaim;
import io.kubernetes.client.models.V1PodDNSConfig;
import io.kubernetes.client.models.V1Toleration;
import io.kubernetes.client.models.V1Volume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WorkflowSpec is the specification of a Workflow.
 */
public class WorkflowSpec   {
  private Long activeDeadlineSeconds;

  private V1Affinity affinity = null;

  private Arguments arguments = null;

  private V1PodDNSConfig dnsConfig = null;

  private String dnsPolicy;

  private String entrypoint;

  private Boolean hostNetwork;

  private List<V1LocalObjectReference> imagePullSecrets = null;

  private Map<String, String> nodeSelector = null;

  private String onExit;

  private Long parallelism;

  private Integer podPriority;

  private String podPriorityClassName;

  private Integer priority;

  private String schedulerName;

  private String serviceAccountName;

  private Boolean suspend;

  private List<Template> templates = new ArrayList<>();

  private List<V1Toleration> tolerations = null;

  private Integer ttlSecondsAfterFinished;

  private List<V1PersistentVolumeClaim> volumeClaimTemplates = null;

  private List<V1Volume> volumes = null;

  public WorkflowSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

  /**
   * Optional duration in seconds relative to the workflow start time which the workflow is allowed to run before the controller terminates the workflow. A value of zero is used to terminate a Running workflow
   * @return activeDeadlineSeconds
  */
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public WorkflowSpec affinity(V1Affinity affinity) {
    this.affinity = affinity;
    return this;
  }

  /**
   * Get affinity
   * @return affinity
  */
  public V1Affinity getAffinity() {
    return affinity;
  }

  public void setAffinity(V1Affinity affinity) {
    this.affinity = affinity;
  }

  public WorkflowSpec arguments(Arguments arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * Get arguments
   * @return arguments
  */
  public Arguments getArguments() {
    return arguments;
  }

  public void setArguments(Arguments arguments) {
    this.arguments = arguments;
  }

  public WorkflowSpec dnsConfig(V1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
    return this;
  }

  /**
   * Get dnsConfig
   * @return dnsConfig
  */
  public V1PodDNSConfig getDnsConfig() {
    return dnsConfig;
  }

  public void setDnsConfig(V1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
  }

  public WorkflowSpec dnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
    return this;
  }

  /**
   * Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
   * @return dnsPolicy
  */
  public String getDnsPolicy() {
    return dnsPolicy;
  }

  public void setDnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
  }

  public WorkflowSpec entrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  /**
   * Entrypoint is a template reference to the starting point of the workflow
   * @return entrypoint
  */
  public String getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
  }

  public WorkflowSpec hostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

  /**
   * Host networking requested for this workflow pod. Default to false.
   * @return hostNetwork
  */
  public Boolean getHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  public WorkflowSpec imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public WorkflowSpec addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

  /**
   * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  */
  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public WorkflowSpec nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public WorkflowSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

  /**
   * NodeSelector is a selector which will result in all pods of the workflow to be scheduled on the selected node(s). This is able to be overridden by a nodeSelector specified in the template.
   * @return nodeSelector
  */
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public WorkflowSpec onExit(String onExit) {
    this.onExit = onExit;
    return this;
  }

  /**
   * OnExit is a template reference which is invoked at the end of the workflow, irrespective of the success, failure, or error of the primary workflow.
   * @return onExit
  */
  public String getOnExit() {
    return onExit;
  }

  public void setOnExit(String onExit) {
    this.onExit = onExit;
  }

  public WorkflowSpec parallelism(Long parallelism) {
    this.parallelism = parallelism;
    return this;
  }

  /**
   * Parallelism limits the max total parallel pods that can execute at the same time in a workflow
   * @return parallelism
  */
  public Long getParallelism() {
    return parallelism;
  }

  public void setParallelism(Long parallelism) {
    this.parallelism = parallelism;
  }

  public WorkflowSpec podPriority(Integer podPriority) {
    this.podPriority = podPriority;
    return this;
  }

  /**
   * Priority to apply to workflow pods.
   * @return podPriority
  */
  public Integer getPodPriority() {
    return podPriority;
  }

  public void setPodPriority(Integer podPriority) {
    this.podPriority = podPriority;
  }

  public WorkflowSpec podPriorityClassName(String podPriorityClassName) {
    this.podPriorityClassName = podPriorityClassName;
    return this;
  }

  /**
   * PriorityClassName to apply to workflow pods.
   * @return podPriorityClassName
  */
  public String getPodPriorityClassName() {
    return podPriorityClassName;
  }

  public void setPodPriorityClassName(String podPriorityClassName) {
    this.podPriorityClassName = podPriorityClassName;
  }

  public WorkflowSpec priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Priority is used if controller is configured to process limited number of workflows in parallel. Workflows with higher priority are processed first.
   * @return priority
  */
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public WorkflowSpec schedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return this;
  }

  /**
   * Set scheduler name for all pods. Will be overridden if container/script template's scheduler name is set. Default scheduler will be used if neither specified.
   * @return schedulerName
  */
  public String getSchedulerName() {
    return schedulerName;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public WorkflowSpec serviceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

  /**
   * ServiceAccountName is the name of the ServiceAccount to run all pods of the workflow as.
   * @return serviceAccountName
  */
  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }

  public WorkflowSpec suspend(Boolean suspend) {
    this.suspend = suspend;
    return this;
  }

  /**
   * Suspend will suspend the workflow and prevent execution of any future steps in the workflow
   * @return suspend
  */
  public Boolean getSuspend() {
    return suspend;
  }

  public void setSuspend(Boolean suspend) {
    this.suspend = suspend;
  }

  public WorkflowSpec templates(List<Template> templates) {
    this.templates = templates;
    return this;
  }

  public WorkflowSpec addTemplatesItem(Template templatesItem) {
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * Templates is a list of workflow templates used in a workflow
   * @return templates
  */
  public List<Template> getTemplates() {
    return templates;
  }

  public void setTemplates(List<Template> templates) {
    this.templates = templates;
  }

  public WorkflowSpec tolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public WorkflowSpec addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

  /**
   * Tolerations to apply to workflow pods.
   * @return tolerations
  */
  public List<V1Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }

  public WorkflowSpec ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    return this;
  }

  /**
   * TTLSecondsAfterFinished limits the lifetime of a Workflow that has finished execution (Succeeded, Failed, Error). If this field is set, once the Workflow finishes, it will be deleted after ttlSecondsAfterFinished expires. If this field is unset, ttlSecondsAfterFinished will not expire. If this field is set to zero, ttlSecondsAfterFinished expires immediately after the Workflow finishes.
   * @return ttlSecondsAfterFinished
  */
  public Integer getTtlSecondsAfterFinished() {
    return ttlSecondsAfterFinished;
  }

  public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
  }

  public WorkflowSpec volumeClaimTemplates(List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public WorkflowSpec addVolumeClaimTemplatesItem(V1PersistentVolumeClaim volumeClaimTemplatesItem) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates = new ArrayList<>();
    }
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }

  /**
   * VolumeClaimTemplates is a list of claims that containers are allowed to reference. The Workflow controller will create the claims at the beginning of the workflow and delete the claims upon completion of the workflow
   * @return volumeClaimTemplates
  */
  public List<V1PersistentVolumeClaim> getVolumeClaimTemplates() {
    return volumeClaimTemplates;
  }

  public void setVolumeClaimTemplates(List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
  }

  public WorkflowSpec volumes(List<V1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public WorkflowSpec addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * Volumes is a list of volumes that can be mounted by containers in a workflow.
   * @return volumes
  */
  public List<V1Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSpec ioArgoprojWorkflowV1alpha1WorkflowSpec = (WorkflowSpec) o;
    return Objects.equals(this.activeDeadlineSeconds, ioArgoprojWorkflowV1alpha1WorkflowSpec.activeDeadlineSeconds) &&
        Objects.equals(this.affinity, ioArgoprojWorkflowV1alpha1WorkflowSpec.affinity) &&
        Objects.equals(this.arguments, ioArgoprojWorkflowV1alpha1WorkflowSpec.arguments) &&
        Objects.equals(this.dnsConfig, ioArgoprojWorkflowV1alpha1WorkflowSpec.dnsConfig) &&
        Objects.equals(this.dnsPolicy, ioArgoprojWorkflowV1alpha1WorkflowSpec.dnsPolicy) &&
        Objects.equals(this.entrypoint, ioArgoprojWorkflowV1alpha1WorkflowSpec.entrypoint) &&
        Objects.equals(this.hostNetwork, ioArgoprojWorkflowV1alpha1WorkflowSpec.hostNetwork) &&
        Objects.equals(this.imagePullSecrets, ioArgoprojWorkflowV1alpha1WorkflowSpec.imagePullSecrets) &&
        Objects.equals(this.nodeSelector, ioArgoprojWorkflowV1alpha1WorkflowSpec.nodeSelector) &&
        Objects.equals(this.onExit, ioArgoprojWorkflowV1alpha1WorkflowSpec.onExit) &&
        Objects.equals(this.parallelism, ioArgoprojWorkflowV1alpha1WorkflowSpec.parallelism) &&
        Objects.equals(this.podPriority, ioArgoprojWorkflowV1alpha1WorkflowSpec.podPriority) &&
        Objects.equals(this.podPriorityClassName, ioArgoprojWorkflowV1alpha1WorkflowSpec.podPriorityClassName) &&
        Objects.equals(this.priority, ioArgoprojWorkflowV1alpha1WorkflowSpec.priority) &&
        Objects.equals(this.schedulerName, ioArgoprojWorkflowV1alpha1WorkflowSpec.schedulerName) &&
        Objects.equals(this.serviceAccountName, ioArgoprojWorkflowV1alpha1WorkflowSpec.serviceAccountName) &&
        Objects.equals(this.suspend, ioArgoprojWorkflowV1alpha1WorkflowSpec.suspend) &&
        Objects.equals(this.templates, ioArgoprojWorkflowV1alpha1WorkflowSpec.templates) &&
        Objects.equals(this.tolerations, ioArgoprojWorkflowV1alpha1WorkflowSpec.tolerations) &&
        Objects.equals(this.ttlSecondsAfterFinished, ioArgoprojWorkflowV1alpha1WorkflowSpec.ttlSecondsAfterFinished) &&
        Objects.equals(this.volumeClaimTemplates, ioArgoprojWorkflowV1alpha1WorkflowSpec.volumeClaimTemplates) &&
        Objects.equals(this.volumes, ioArgoprojWorkflowV1alpha1WorkflowSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, affinity, arguments, dnsConfig, dnsPolicy, entrypoint, hostNetwork, imagePullSecrets, nodeSelector, onExit, parallelism, podPriority, podPriorityClassName, priority, schedulerName, serviceAccountName, suspend, templates, tolerations, ttlSecondsAfterFinished, volumeClaimTemplates, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowSpec {\n");
    
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
    sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    onExit: ").append(toIndentedString(onExit)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    podPriority: ").append(toIndentedString(podPriority)).append("\n");
    sb.append("    podPriorityClassName: ").append(toIndentedString(podPriorityClassName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    ttlSecondsAfterFinished: ").append(toIndentedString(ttlSecondsAfterFinished)).append("\n");
    sb.append("    volumeClaimTemplates: ").append(toIndentedString(volumeClaimTemplates)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

