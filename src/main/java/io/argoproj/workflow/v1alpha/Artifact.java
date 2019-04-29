package io.argoproj.workflow.v1alpha;

import java.util.Objects;

/**
 * Artifact indicates an artifact to place at a specified path
 */
public class Artifact   {
  private ArchiveStrategy archive = null;

  private Boolean archiveLogs;

  private ArtifactoryArtifact artifactory = null;

  private String from;

  private GitArtifact git = null;

  private String globalName;

  private HDFSArtifact hdfs = null;

  private HTTPArtifact http = null;

  private Integer mode;

  private String name;

  private Boolean optional;

  private String path;

  private RawArtifact raw = null;

  private S3Artifact s3 = null;

  public Artifact archive(ArchiveStrategy archive) {
    this.archive = archive;
    return this;
  }

  /**
   * Get archive
   * @return archive
  */
  public ArchiveStrategy getArchive() {
    return archive;
  }

  public void setArchive(ArchiveStrategy archive) {
    this.archive = archive;
  }

  public Artifact archiveLogs(Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
    return this;
  }

  /**
   * ArchiveLogs indicates if the container logs should be archived
   * @return archiveLogs
  */
  public Boolean getArchiveLogs() {
    return archiveLogs;
  }

  public void setArchiveLogs(Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
  }

  public Artifact artifactory(ArtifactoryArtifact artifactory) {
    this.artifactory = artifactory;
    return this;
  }

  /**
   * Get artifactory
   * @return artifactory
  */
  public ArtifactoryArtifact getArtifactory() {
    return artifactory;
  }

  public void setArtifactory(ArtifactoryArtifact artifactory) {
    this.artifactory = artifactory;
  }

  public Artifact from(String from) {
    this.from = from;
    return this;
  }

  /**
   * From allows an artifact to reference an artifact from a previous step
   * @return from
  */
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Artifact git(GitArtifact git) {
    this.git = git;
    return this;
  }

  /**
   * Get git
   * @return git
  */
  public GitArtifact getGit() {
    return git;
  }

  public void setGit(GitArtifact git) {
    this.git = git;
  }

  public Artifact globalName(String globalName) {
    this.globalName = globalName;
    return this;
  }

  /**
   * GlobalName exports an output artifact to the global scope, making it available as '{{workflow.outputs.artifacts.XXXX}} and in workflow.status.outputs.artifacts
   * @return globalName
  */
  public String getGlobalName() {
    return globalName;
  }

  public void setGlobalName(String globalName) {
    this.globalName = globalName;
  }

  public Artifact hdfs(HDFSArtifact hdfs) {
    this.hdfs = hdfs;
    return this;
  }

  /**
   * Get hdfs
   * @return hdfs
  */
  public HDFSArtifact getHdfs() {
    return hdfs;
  }

  public void setHdfs(HDFSArtifact hdfs) {
    this.hdfs = hdfs;
  }

  public Artifact http(HTTPArtifact http) {
    this.http = http;
    return this;
  }

  /**
   * Get http
   * @return http
  */
  public HTTPArtifact getHttp() {
    return http;
  }

  public void setHttp(HTTPArtifact http) {
    this.http = http;
  }

  public Artifact mode(Integer mode) {
    this.mode = mode;
    return this;
  }

  /**
   * mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts.
   * @return mode
  */
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public Artifact name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of the artifact. must be unique within a template's inputs/outputs.
   * @return name
  */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Artifact optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  /**
   * Make Artifacts optional, if Artifacts doesn't generate or exist
   * @return optional
  */
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public Artifact path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path is the container path to the artifact
   * @return path
  */
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Artifact raw(RawArtifact raw) {
    this.raw = raw;
    return this;
  }

  /**
   * Get raw
   * @return raw
  */
  public RawArtifact getRaw() {
    return raw;
  }

  public void setRaw(RawArtifact raw) {
    this.raw = raw;
  }

  public Artifact s3(S3Artifact s3) {
    this.s3 = s3;
    return this;
  }

  /**
   * Get s3
   * @return s3
  */
  public S3Artifact getS3() {
    return s3;
  }

  public void setS3(S3Artifact s3) {
    this.s3 = s3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artifact ioArgoprojWorkflowV1alpha1Artifact = (Artifact) o;
    return Objects.equals(this.archive, ioArgoprojWorkflowV1alpha1Artifact.archive) &&
        Objects.equals(this.archiveLogs, ioArgoprojWorkflowV1alpha1Artifact.archiveLogs) &&
        Objects.equals(this.artifactory, ioArgoprojWorkflowV1alpha1Artifact.artifactory) &&
        Objects.equals(this.from, ioArgoprojWorkflowV1alpha1Artifact.from) &&
        Objects.equals(this.git, ioArgoprojWorkflowV1alpha1Artifact.git) &&
        Objects.equals(this.globalName, ioArgoprojWorkflowV1alpha1Artifact.globalName) &&
        Objects.equals(this.hdfs, ioArgoprojWorkflowV1alpha1Artifact.hdfs) &&
        Objects.equals(this.http, ioArgoprojWorkflowV1alpha1Artifact.http) &&
        Objects.equals(this.mode, ioArgoprojWorkflowV1alpha1Artifact.mode) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1Artifact.name) &&
        Objects.equals(this.optional, ioArgoprojWorkflowV1alpha1Artifact.optional) &&
        Objects.equals(this.path, ioArgoprojWorkflowV1alpha1Artifact.path) &&
        Objects.equals(this.raw, ioArgoprojWorkflowV1alpha1Artifact.raw) &&
        Objects.equals(this.s3, ioArgoprojWorkflowV1alpha1Artifact.s3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archive, archiveLogs, artifactory, from, git, globalName, hdfs, http, mode, name, optional, path, raw, s3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Artifact {\n");
    
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
    sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
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

