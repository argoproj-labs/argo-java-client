package io.argoproj.workflow.v1alpha;

import java.util.Objects;

/**
 * ArchiveStrategy describes how to archive files/directory when saving artifacts
 */

public class ArchiveStrategy   {
  private Object none = null;

  private Object tar = null;

  public ArchiveStrategy none(Object none) {
    this.none = none;
    return this;
  }

  /**
   * NoneStrategy indicates to skip tar process and upload the files or directory tree as independent files. Note that if the artifact is a directory, the artifact driver must support the ability to save/load the directory appropriately.
   * @return none
  */
  public Object getNone() {
    return none;
  }

  public void setNone(Object none) {
    this.none = none;
  }

  public ArchiveStrategy tar(Object tar) {
    this.tar = tar;
    return this;
  }

  /**
   * TarStrategy will tar and gzip the file or directory when saving
   * @return tar
  */
  public Object getTar() {
    return tar;
  }

  public void setTar(Object tar) {
    this.tar = tar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveStrategy ioArgoprojWorkflowV1alpha1ArchiveStrategy = (ArchiveStrategy) o;
    return Objects.equals(this.none, ioArgoprojWorkflowV1alpha1ArchiveStrategy.none) &&
        Objects.equals(this.tar, ioArgoprojWorkflowV1alpha1ArchiveStrategy.tar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(none, tar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ArchiveStrategy {\n");
    
    sb.append("    none: ").append(toIndentedString(none)).append("\n");
    sb.append("    tar: ").append(toIndentedString(tar)).append("\n");
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

