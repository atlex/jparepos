package org.am.jparepos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "PRODUCT_DB", name = "MODEL_IMAGE")
public class Image {
    @Id
    @Column(name = "MODEL_IMAGE_ID")
    private Integer modelImageId;

    @Column(name = "MODEL_ID")
    private Integer modelId;

    @Column(name = "CLOUD_NAME")
    private String cloudName;

    @Column(name = "NORMALIZED_IMAGE_NAME")
    private String fileName;

    @Column(name = "RELATIVE_DIRECTORY_PATH")
    private String relativePath;

    @Column(name = "IMAGE_FORMAT")
    private String fileFormat;

    @Column(name = "IMAGE_TYPE_ID")
    private Integer imageTypeId;

    public Integer getModelImageId() {
        return modelImageId;
    }

    public void setModelImageId(Integer modelImageId) {
        this.modelImageId = modelImageId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getCloudName() {
        return cloudName;
    }

    public void setCloudName(String cloudName) {
        this.cloudName = cloudName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public Integer getImageTypeId() {
        return imageTypeId;
    }

    public void setImageTypeId(Integer imageTypeId) {
        this.imageTypeId = imageTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Image image = (Image) o;

        if (modelId != null ? !modelId.equals(image.modelId) : image.modelId != null) return false;
        if (cloudName != null ? !cloudName.equals(image.cloudName) : image.cloudName != null) return false;
        if (fileName != null ? !fileName.equals(image.fileName) : image.fileName != null) return false;
        if (relativePath != null ? !relativePath.equals(image.relativePath) : image.relativePath != null) return false;
        if (fileFormat != null ? !fileFormat.equals(image.fileFormat) : image.fileFormat != null) return false;
        return imageTypeId != null ? imageTypeId.equals(image.imageTypeId) : image.imageTypeId == null;
    }

    @Override
    public int hashCode() {
        int result = modelId != null ? modelId.hashCode() : 0;
        result = 31 * result + (cloudName != null ? cloudName.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (relativePath != null ? relativePath.hashCode() : 0);
        result = 31 * result + (fileFormat != null ? fileFormat.hashCode() : 0);
        result = 31 * result + (imageTypeId != null ? imageTypeId.hashCode() : 0);
        return result;
    }
}
