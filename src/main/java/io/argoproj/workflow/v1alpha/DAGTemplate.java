package io.argoproj.workflow.v1alpha;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * DAGTemplate is a template subtype for directed acyclic graph templates
 */

public class DAGTemplate   {
  private String target;

  private List<DAGTask> tasks = new ArrayList<>();

  public DAGTemplate target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Target are one or more names of targets to execute in a DAG
   * @return target
  */
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public DAGTemplate tasks(List<DAGTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  public DAGTemplate addTasksItem(DAGTask tasksItem) {
    this.tasks.add(tasksItem);
    return this;
  }

  /**
   * Tasks are a list of DAG tasks
   * @return tasks
  */
  public List<DAGTask> getTasks() {
    return tasks;
  }

  public void setTasks(List<DAGTask> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGTemplate ioArgoprojWorkflowV1alpha1DAGTemplate = (DAGTemplate) o;
    return Objects.equals(this.target, ioArgoprojWorkflowV1alpha1DAGTemplate.target) &&
        Objects.equals(this.tasks, ioArgoprojWorkflowV1alpha1DAGTemplate.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1DAGTemplate {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

