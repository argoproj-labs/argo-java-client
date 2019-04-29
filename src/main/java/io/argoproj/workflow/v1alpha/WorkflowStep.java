package io.argoproj.workflow.v1alpha;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkflowStep is a reference to a template to execute in a series of step
 */
public class WorkflowStep   {
  private Arguments arguments = null;

  private ContinueOn continueOn = null;

  private String name;

  private String template;

  private String when;

  private List<String> withItems = null;

  private String withParam;

  private Sequence withSequence = null;

  public WorkflowStep arguments(Arguments arguments) {
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

  public WorkflowStep continueOn(ContinueOn continueOn) {
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

  public WorkflowStep name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the step
   * @return name
  */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkflowStep template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Template is a reference to the template to execute as the step
   * @return template
  */
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public WorkflowStep when(String when) {
    this.when = when;
    return this;
  }

  /**
   * When is an expression in which the step should conditionally execute
   * @return when
  */
  public String getWhen() {
    return when;
  }

  public void setWhen(String when) {
    this.when = when;
  }

  public WorkflowStep withItems(List<String> withItems) {
    this.withItems = withItems;
    return this;
  }

  public WorkflowStep addWithItemsItem(String withItemsItem) {
    if (this.withItems == null) {
      this.withItems = new ArrayList<>();
    }
    this.withItems.add(withItemsItem);
    return this;
  }

  /**
   * WithItems expands a step into multiple parallel steps from the items in the list
   * @return withItems
  */
  public List<String> getWithItems() {
    return withItems;
  }

  public void setWithItems(List<String> withItems) {
    this.withItems = withItems;
  }

  public WorkflowStep withParam(String withParam) {
    this.withParam = withParam;
    return this;
  }

  /**
   * WithParam expands a step into multiple parallel steps from the value in the parameter, which is expected to be a JSON list.
   * @return withParam
  */
  public String getWithParam() {
    return withParam;
  }

  public void setWithParam(String withParam) {
    this.withParam = withParam;
  }

  public WorkflowStep withSequence(Sequence withSequence) {
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
    WorkflowStep ioArgoprojWorkflowV1alpha1WorkflowStep = (WorkflowStep) o;
    return Objects.equals(this.arguments, ioArgoprojWorkflowV1alpha1WorkflowStep.arguments) &&
        Objects.equals(this.continueOn, ioArgoprojWorkflowV1alpha1WorkflowStep.continueOn) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1WorkflowStep.name) &&
        Objects.equals(this.template, ioArgoprojWorkflowV1alpha1WorkflowStep.template) &&
        Objects.equals(this.when, ioArgoprojWorkflowV1alpha1WorkflowStep.when) &&
        Objects.equals(this.withItems, ioArgoprojWorkflowV1alpha1WorkflowStep.withItems) &&
        Objects.equals(this.withParam, ioArgoprojWorkflowV1alpha1WorkflowStep.withParam) &&
        Objects.equals(this.withSequence, ioArgoprojWorkflowV1alpha1WorkflowStep.withSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, continueOn, name, template, when, withItems, withParam, withSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowStep {\n");
    
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    continueOn: ").append(toIndentedString(continueOn)).append("\n");
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

