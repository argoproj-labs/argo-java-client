package io.argoproj.workflow.v1alpha;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * DAGTask represents a node in the graph during DAG execution
 */
public class DAGTask   {
  private Arguments arguments = null;

  private ContinueOn continueOn = null;

  private List<String> dependencies = null;

  private String name;

  private String template;

  private String when;

  private List<String> withItems = null;

  private String withParam;

  private Sequence withSequence = null;

  public DAGTask arguments(Arguments arguments) {
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

  public DAGTask continueOn(ContinueOn continueOn) {
    this.continueOn = continueOn;
    return this;
  }

  /**
   * Get continueOn
   * @return continueOn
  */
  public ContinueOn getContinueOn() {
    return continueOn;
  }

  public void setContinueOn(ContinueOn continueOn) {
    this.continueOn = continueOn;
  }

  public DAGTask dependencies(List<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public DAGTask addDependenciesItem(String dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

  /**
   * Dependencies are name of other targets which this depends on
   * @return dependencies
  */
  public List<String> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<String> dependencies) {
    this.dependencies = dependencies;
  }

  public DAGTask name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the name of the target
   * @return name
  */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DAGTask template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Name of template to execute
   * @return template
  */
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public DAGTask when(String when) {
    this.when = when;
    return this;
  }

  /**
   * When is an expression in which the task should conditionally execute
   * @return when
  */
  public String getWhen() {
    return when;
  }

  public void setWhen(String when) {
    this.when = when;
  }

  public DAGTask withItems(List<String> withItems) {
    this.withItems = withItems;
    return this;
  }

  public DAGTask addWithItemsItem(String withItemsItem) {
    if (this.withItems == null) {
      this.withItems = new ArrayList<>();
    }
    this.withItems.add(withItemsItem);
    return this;
  }

  /**
   * WithItems expands a task into multiple parallel tasks from the items in the list
   * @return withItems
  */
  public List<String> getWithItems() {
    return withItems;
  }

  public void setWithItems(List<String> withItems) {
    this.withItems = withItems;
  }

  public DAGTask withParam(String withParam) {
    this.withParam = withParam;
    return this;
  }

  /**
   * WithParam expands a task into multiple parallel tasks from the value in the parameter, which is expected to be a JSON list.
   * @return withParam
  */
  public String getWithParam() {
    return withParam;
  }

  public void setWithParam(String withParam) {
    this.withParam = withParam;
  }

  public DAGTask withSequence(Sequence withSequence) {
    this.withSequence = withSequence;
    return this;
  }

  /**
   * Get withSequence
   * @return withSequence
  */
  public Sequence getWithSequence() {
    return withSequence;
  }

  public void setWithSequence(Sequence withSequence) {
    this.withSequence = withSequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGTask ioArgoprojWorkflowV1alpha1DAGTask = (DAGTask) o;
    return Objects.equals(this.arguments, ioArgoprojWorkflowV1alpha1DAGTask.arguments) &&
        Objects.equals(this.continueOn, ioArgoprojWorkflowV1alpha1DAGTask.continueOn) &&
        Objects.equals(this.dependencies, ioArgoprojWorkflowV1alpha1DAGTask.dependencies) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1DAGTask.name) &&
        Objects.equals(this.template, ioArgoprojWorkflowV1alpha1DAGTask.template) &&
        Objects.equals(this.when, ioArgoprojWorkflowV1alpha1DAGTask.when) &&
        Objects.equals(this.withItems, ioArgoprojWorkflowV1alpha1DAGTask.withItems) &&
        Objects.equals(this.withParam, ioArgoprojWorkflowV1alpha1DAGTask.withParam) &&
        Objects.equals(this.withSequence, ioArgoprojWorkflowV1alpha1DAGTask.withSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, continueOn, dependencies, name, template, when, withItems, withParam, withSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1DAGTask {\n");
    
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    continueOn: ").append(toIndentedString(continueOn)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    withItems: ").append(toIndentedString(withItems)).append("\n");
    sb.append("    withParam: ").append(toIndentedString(withParam)).append("\n");
    sb.append("    withSequence: ").append(toIndentedString(withSequence)).append("\n");
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

