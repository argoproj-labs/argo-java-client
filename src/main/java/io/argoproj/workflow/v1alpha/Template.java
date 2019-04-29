package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1Affinity;
import io.kubernetes.client.models.V1Container;
import io.kubernetes.client.models.V1Toleration;
import io.kubernetes.client.models.V1Volume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Template is a reusable and composable unit of execution in a workflow
 */
public class Template   {
  private Long activeDeadlineSeconds;

  private V1Affinity affinity = null;

  private ArtifactLocation archiveLocation = null;

  private V1Container container = null;

  private Boolean daemon;

  private DAGTemplate dag = null;

  private List<UserContainer> initContainers = null;

  private Inputs inputs = null;

  private Metadata metadata = null;

  private String name;

  private Map<String, String> nodeSelector = null;

  private Outputs outputs = null;

  private Long parallelism;

  private Integer priority;

  private String priorityClassName;

  private ResourceTemplate resource = null;

  private RetryStrategy retryStrategy = null;

  private String schedulerName;

  private ScriptTemplate script = null;

  private List<UserContainer> sidecars = null;

  private List<List<WorkflowStep>> steps = null;

  private Object suspend = null;

  private List<V1Toleration> tolerations = null;

  private List<V1Volume> volumes = null;

  public Template activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

  /**
   * Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates.
   * @return activeDeadlineSeconds
  */
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public Template affinity(V1Affinity affinity) {
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

  public Template archiveLocation(ArtifactLocation archiveLocation) {
    this.archiveLocation = archiveLocation;
    return this;
  }

  /**
   * Get archiveLocation
   * @return archiveLocation
  */
  public ArtifactLocation getArchiveLocation() {
    return archiveLocation;
  }

  public void setArchiveLocation(ArtifactLocation archiveLocation) {
    this.archiveLocation = archiveLocation;
  }

  public Template container(V1Container container) {
    this.container = container;
    return this;
  }

  /**
   * Get container
   * @return container
  */
  public V1Container getContainer() {
    return container;
  }

  public void setContainer(V1Container container) {
    this.container = container;
  }

  public Template daemon(Boolean daemon) {
    this.daemon = daemon;
    return this;
  }

  /**
   * Deamon will allow a workflow to proceed to the next step so long as the container reaches readiness
   * @return daemon
  */
  public Boolean getDaemon() {
    return daemon;
  }

  public void setDaemon(Boolean daemon) {
    this.daemon = daemon;
  }

  public Template dag(DAGTemplate dag) {
    this.dag = dag;
    return this;
  }

  /**
   * Get dag
   * @return dag
  */
  public DAGTemplate getDag() {
    return dag;
  }

  public void setDag(DAGTemplate dag) {
    this.dag = dag;
  }

  public Template initContainers(List<UserContainer> initContainers) {
    this.initContainers = initContainers;
    return this;
  }

  public Template addInitContainersItem(UserContainer initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

  /**
   * InitContainers is a list of containers which run before the main container.
   * @return initContainers
  */
  public List<UserContainer> getInitContainers() {
    return initContainers;
  }

  public void setInitContainers(List<UserContainer> initContainers) {
    this.initContainers = initContainers;
  }

  public Template inputs(Inputs inputs) {
    this.inputs = inputs;
    return this;
  }

  /**
   * Get inputs
   * @return inputs
  */
  public Inputs getInputs() {
    return inputs;
  }

  public void setInputs(Inputs inputs) {
    this.inputs = inputs;
  }

  public Template metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public Template name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the name of the template
   * @return name
  */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Template nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public Template putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

  /**
   * NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level.
   * @return nodeSelector
  */
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public Template outputs(Outputs outputs) {
    this.outputs = outputs;
    return this;
  }

  /**
   * Get outputs
   * @return outputs
  */
  public Outputs getOutputs() {
    return outputs;
  }

  public void setOutputs(Outputs outputs) {
    this.outputs = outputs;
  }

  public Template parallelism(Long parallelism) {
    this.parallelism = parallelism;
    return this;
  }

  /**
   * Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total.
   * @return parallelism
  */
  public Long getParallelism() {
    return parallelism;
  }

  public void setParallelism(Long parallelism) {
    this.parallelism = parallelism;
  }

  public Template priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Priority to apply to workflow pods.
   * @return priority
  */
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Template priorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return this;
  }

  /**
   * PriorityClassName to apply to workflow pods.
   * @return priorityClassName
  */
  public String getPriorityClassName() {
    return priorityClassName;
  }

  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }

  public Template resource(ResourceTemplate resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
  */
  public ResourceTemplate getResource() {
    return resource;
  }

  public void setResource(ResourceTemplate resource) {
    this.resource = resource;
  }

  public Template retryStrategy(RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
    return this;
  }

  /**
   * Get retryStrategy
   * @return retryStrategy
  */
  public RetryStrategy getRetryStrategy() {
    return retryStrategy;
  }

  public void setRetryStrategy(RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

  public Template schedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return this;
  }

  /**
   * If specified, the pod will be dispatched by specified scheduler. Or it will be dispatched by workflow scope scheduler if specified. If neither specified, the pod will be dispatched by default scheduler.
   * @return schedulerName
  */
  public String getSchedulerName() {
    return schedulerName;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public Template script(ScriptTemplate script) {
    this.script = script;
    return this;
  }

  /**
   * Get script
   * @return script
  */
  public ScriptTemplate getScript() {
    return script;
  }

  public void setScript(ScriptTemplate script) {
    this.script = script;
  }

  public Template sidecars(List<UserContainer> sidecars) {
    this.sidecars = sidecars;
    return this;
  }

  public Template addSidecarsItem(UserContainer sidecarsItem) {
    if (this.sidecars == null) {
      this.sidecars = new ArrayList<>();
    }
    this.sidecars.add(sidecarsItem);
    return this;
  }

  /**
   * Sidecars is a list of containers which run alongside the main container Sidecars are automatically killed when the main container completes
   * @return sidecars
  */
  public List<UserContainer> getSidecars() {
    return sidecars;
  }

  public void setSidecars(List<UserContainer> sidecars) {
    this.sidecars = sidecars;
  }

  public Template steps(List<List<WorkflowStep>> steps) {
    this.steps = steps;
    return this;
  }

  public Template addStepsItem(List<WorkflowStep> stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Steps define a series of sequential/parallel workflow steps
   * @return steps
  */
  public List<List<WorkflowStep>> getSteps() {
    return steps;
  }

  public void setSteps(List<List<WorkflowStep>> steps) {
    this.steps = steps;
  }

  public Template suspend(Object suspend) {
    this.suspend = suspend;
    return this;
  }

  /**
   * SuspendTemplate is a template subtype to suspend a workflow at a predetermined point in time
   * @return suspend
  */
  public Object getSuspend() {
    return suspend;
  }

  public void setSuspend(Object suspend) {
    this.suspend = suspend;
  }

  public Template tolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public Template addTolerationsItem(V1Toleration tolerationsItem) {
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

  public Template volumes(List<V1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public Template addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * Volumes is a list of volumes that can be mounted by containers in a template.
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
    Template ioArgoprojWorkflowV1alpha1Template = (Template) o;
    return Objects.equals(this.activeDeadlineSeconds, ioArgoprojWorkflowV1alpha1Template.activeDeadlineSeconds) &&
        Objects.equals(this.affinity, ioArgoprojWorkflowV1alpha1Template.affinity) &&
        Objects.equals(this.archiveLocation, ioArgoprojWorkflowV1alpha1Template.archiveLocation) &&
        Objects.equals(this.container, ioArgoprojWorkflowV1alpha1Template.container) &&
        Objects.equals(this.daemon, ioArgoprojWorkflowV1alpha1Template.daemon) &&
        Objects.equals(this.dag, ioArgoprojWorkflowV1alpha1Template.dag) &&
        Objects.equals(this.initContainers, ioArgoprojWorkflowV1alpha1Template.initContainers) &&
        Objects.equals(this.inputs, ioArgoprojWorkflowV1alpha1Template.inputs) &&
        Objects.equals(this.metadata, ioArgoprojWorkflowV1alpha1Template.metadata) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1Template.name) &&
        Objects.equals(this.nodeSelector, ioArgoprojWorkflowV1alpha1Template.nodeSelector) &&
        Objects.equals(this.outputs, ioArgoprojWorkflowV1alpha1Template.outputs) &&
        Objects.equals(this.parallelism, ioArgoprojWorkflowV1alpha1Template.parallelism) &&
        Objects.equals(this.priority, ioArgoprojWorkflowV1alpha1Template.priority) &&
        Objects.equals(this.priorityClassName, ioArgoprojWorkflowV1alpha1Template.priorityClassName) &&
        Objects.equals(this.resource, ioArgoprojWorkflowV1alpha1Template.resource) &&
        Objects.equals(this.retryStrategy, ioArgoprojWorkflowV1alpha1Template.retryStrategy) &&
        Objects.equals(this.schedulerName, ioArgoprojWorkflowV1alpha1Template.schedulerName) &&
        Objects.equals(this.script, ioArgoprojWorkflowV1alpha1Template.script) &&
        Objects.equals(this.sidecars, ioArgoprojWorkflowV1alpha1Template.sidecars) &&
        Objects.equals(this.steps, ioArgoprojWorkflowV1alpha1Template.steps) &&
        Objects.equals(this.suspend, ioArgoprojWorkflowV1alpha1Template.suspend) &&
        Objects.equals(this.tolerations, ioArgoprojWorkflowV1alpha1Template.tolerations) &&
        Objects.equals(this.volumes, ioArgoprojWorkflowV1alpha1Template.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, affinity, archiveLocation, container, daemon, dag, initContainers, inputs, metadata, name, nodeSelector, outputs, parallelism, priority, priorityClassName, resource, retryStrategy, schedulerName, script, sidecars, steps, suspend, tolerations, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Template {\n");
    
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    archiveLocation: ").append(toIndentedString(archiveLocation)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
    sb.append("    dag: ").append(toIndentedString(dag)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    sidecars: ").append(toIndentedString(sidecars)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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

