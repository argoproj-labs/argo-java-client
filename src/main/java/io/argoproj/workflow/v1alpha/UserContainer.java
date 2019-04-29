package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1ContainerPort;
import io.kubernetes.client.models.V1EnvFromSource;
import io.kubernetes.client.models.V1EnvVar;
import io.kubernetes.client.models.V1Lifecycle;
import io.kubernetes.client.models.V1Probe;
import io.kubernetes.client.models.V1ResourceRequirements;
import io.kubernetes.client.models.V1SecurityContext;
import io.kubernetes.client.models.V1VolumeDevice;
import io.kubernetes.client.models.V1VolumeMount;

import java.util.ArrayList;
import java.util.List;

/**
 * UserContainer is a container specified by a user.
 */
public class UserContainer   {
  private List<String> args = null;

  private List<String> command = null;

  private List<V1EnvVar> env = null;

  private List<V1EnvFromSource> envFrom = null;

  private String image;

  private String imagePullPolicy;

  private V1Lifecycle lifecycle = null;

  private V1Probe livenessProbe = null;

  private Boolean mirrorVolumeMounts;

  private String name;

  private List<V1ContainerPort> ports = null;

  private V1Probe readinessProbe = null;

  private V1ResourceRequirements resources = null;

  private V1SecurityContext securityContext = null;

  private Boolean stdin;

  private Boolean stdinOnce;

  private String terminationMessagePath;

  private String terminationMessagePolicy;

  private Boolean tty;

  private List<V1VolumeDevice> volumeDevices = null;

  private List<V1VolumeMount> volumeMounts = null;

  private String workingDir;

  public UserContainer args(List<String> args) {
    this.args = args;
    return this;
  }

  public UserContainer addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @return args
  */
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public UserContainer command(List<String> command) {
    this.command = command;
    return this;
  }

  public UserContainer addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

  /**
   * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @return command
  */
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }

  public UserContainer env(List<V1EnvVar> env) {
    this.env = env;
    return this;
  }

  public UserContainer addEnvItem(V1EnvVar envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * List of environment variables to set in the container. Cannot be updated.
   * @return env
  */
  public List<V1EnvVar> getEnv() {
    return env;
  }

  public void setEnv(List<V1EnvVar> env) {
    this.env = env;
  }

  public UserContainer envFrom(List<V1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
    return this;
  }

  public UserContainer addEnvFromItem(V1EnvFromSource envFromItem) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList<>();
    }
    this.envFrom.add(envFromItem);
    return this;
  }

  /**
   * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
   * @return envFrom
  */
  public List<V1EnvFromSource> getEnvFrom() {
    return envFrom;
  }

  public void setEnvFrom(List<V1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
  }

  public UserContainer image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
   * @return image
  */
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public UserContainer imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

  /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
   * @return imagePullPolicy
  */
  public String getImagePullPolicy() {
    return imagePullPolicy;
  }

  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }

  public UserContainer lifecycle(V1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  /**
   * Get lifecycle
   * @return lifecycle
  */
  public V1Lifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(V1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }

  public UserContainer livenessProbe(V1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
    return this;
  }

  /**
   * Get livenessProbe
   * @return livenessProbe
  */
  public V1Probe getLivenessProbe() {
    return livenessProbe;
  }

  public void setLivenessProbe(V1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }

  public UserContainer mirrorVolumeMounts(Boolean mirrorVolumeMounts) {
    this.mirrorVolumeMounts = mirrorVolumeMounts;
    return this;
  }

  /**
   * MirrorVolumeMounts will mount the same volumes specified in the main container to the container (including artifacts), at the same mountPaths. This enables dind daemon to partially see the same filesystem as the main container in order to use features such as docker volume binding
   * @return mirrorVolumeMounts
  */
  public Boolean getMirrorVolumeMounts() {
    return mirrorVolumeMounts;
  }

  public void setMirrorVolumeMounts(Boolean mirrorVolumeMounts) {
    this.mirrorVolumeMounts = mirrorVolumeMounts;
  }

  public UserContainer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
   * @return name
  */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserContainer ports(List<V1ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  public UserContainer addPortsItem(V1ContainerPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Cannot be updated.
   * @return ports
  */
  public List<V1ContainerPort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1ContainerPort> ports) {
    this.ports = ports;
  }

  public UserContainer readinessProbe(V1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
    return this;
  }

  /**
   * Get readinessProbe
   * @return readinessProbe
  */
  public V1Probe getReadinessProbe() {
    return readinessProbe;
  }

  public void setReadinessProbe(V1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }

  public UserContainer resources(V1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
  */
  public V1ResourceRequirements getResources() {
    return resources;
  }

  public void setResources(V1ResourceRequirements resources) {
    this.resources = resources;
  }

  public UserContainer securityContext(V1SecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

  /**
   * Get securityContext
   * @return securityContext
  */
  public V1SecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(V1SecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  public UserContainer stdin(Boolean stdin) {
    this.stdin = stdin;
    return this;
  }

  /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
   * @return stdin
  */
  public Boolean getStdin() {
    return stdin;
  }

  public void setStdin(Boolean stdin) {
    this.stdin = stdin;
  }

  public UserContainer stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

  /**
   * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
   * @return stdinOnce
  */
  public Boolean getStdinOnce() {
    return stdinOnce;
  }

  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }

  public UserContainer terminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
    return this;
  }

  /**
   * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
   * @return terminationMessagePath
  */
  public String getTerminationMessagePath() {
    return terminationMessagePath;
  }

  public void setTerminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
  }

  public UserContainer terminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
    return this;
  }

  /**
   * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
   * @return terminationMessagePolicy
  */
  public String getTerminationMessagePolicy() {
    return terminationMessagePolicy;
  }

  public void setTerminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
  }

  public UserContainer tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
   * @return tty
  */
  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  public UserContainer volumeDevices(List<V1VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
    return this;
  }

  public UserContainer addVolumeDevicesItem(V1VolumeDevice volumeDevicesItem) {
    if (this.volumeDevices == null) {
      this.volumeDevices = new ArrayList<>();
    }
    this.volumeDevices.add(volumeDevicesItem);
    return this;
  }

  /**
   * volumeDevices is the list of block devices to be used by the container. This is an alpha feature and may change in the future.
   * @return volumeDevices
  */
  public List<V1VolumeDevice> getVolumeDevices() {
    return volumeDevices;
  }

  public void setVolumeDevices(List<V1VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
  }

  public UserContainer volumeMounts(List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  public UserContainer addVolumeMountsItem(V1VolumeMount volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

  /**
   * Pod volumes to mount into the container's filesystem. Cannot be updated.
   * @return volumeMounts
  */
  public List<V1VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }

  public UserContainer workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  /**
   * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
   * @return workingDir
  */
  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserContainer ioArgoprojWorkflowV1alpha1UserContainer = (UserContainer) o;
    return Objects.equals(this.args, ioArgoprojWorkflowV1alpha1UserContainer.args) &&
        Objects.equals(this.command, ioArgoprojWorkflowV1alpha1UserContainer.command) &&
        Objects.equals(this.env, ioArgoprojWorkflowV1alpha1UserContainer.env) &&
        Objects.equals(this.envFrom, ioArgoprojWorkflowV1alpha1UserContainer.envFrom) &&
        Objects.equals(this.image, ioArgoprojWorkflowV1alpha1UserContainer.image) &&
        Objects.equals(this.imagePullPolicy, ioArgoprojWorkflowV1alpha1UserContainer.imagePullPolicy) &&
        Objects.equals(this.lifecycle, ioArgoprojWorkflowV1alpha1UserContainer.lifecycle) &&
        Objects.equals(this.livenessProbe, ioArgoprojWorkflowV1alpha1UserContainer.livenessProbe) &&
        Objects.equals(this.mirrorVolumeMounts, ioArgoprojWorkflowV1alpha1UserContainer.mirrorVolumeMounts) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1UserContainer.name) &&
        Objects.equals(this.ports, ioArgoprojWorkflowV1alpha1UserContainer.ports) &&
        Objects.equals(this.readinessProbe, ioArgoprojWorkflowV1alpha1UserContainer.readinessProbe) &&
        Objects.equals(this.resources, ioArgoprojWorkflowV1alpha1UserContainer.resources) &&
        Objects.equals(this.securityContext, ioArgoprojWorkflowV1alpha1UserContainer.securityContext) &&
        Objects.equals(this.stdin, ioArgoprojWorkflowV1alpha1UserContainer.stdin) &&
        Objects.equals(this.stdinOnce, ioArgoprojWorkflowV1alpha1UserContainer.stdinOnce) &&
        Objects.equals(this.terminationMessagePath, ioArgoprojWorkflowV1alpha1UserContainer.terminationMessagePath) &&
        Objects.equals(this.terminationMessagePolicy, ioArgoprojWorkflowV1alpha1UserContainer.terminationMessagePolicy) &&
        Objects.equals(this.tty, ioArgoprojWorkflowV1alpha1UserContainer.tty) &&
        Objects.equals(this.volumeDevices, ioArgoprojWorkflowV1alpha1UserContainer.volumeDevices) &&
        Objects.equals(this.volumeMounts, ioArgoprojWorkflowV1alpha1UserContainer.volumeMounts) &&
        Objects.equals(this.workingDir, ioArgoprojWorkflowV1alpha1UserContainer.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, command, env, envFrom, image, imagePullPolicy, lifecycle, livenessProbe, mirrorVolumeMounts, name, ports, readinessProbe, resources, securityContext, stdin, stdinOnce, terminationMessagePath, terminationMessagePolicy, tty, volumeDevices, volumeMounts, workingDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1UserContainer {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
    sb.append("    mirrorVolumeMounts: ").append(toIndentedString(mirrorVolumeMounts)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    terminationMessagePath: ").append(toIndentedString(terminationMessagePath)).append("\n");
    sb.append("    terminationMessagePolicy: ").append(toIndentedString(terminationMessagePolicy)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    volumeDevices: ").append(toIndentedString(volumeDevices)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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

