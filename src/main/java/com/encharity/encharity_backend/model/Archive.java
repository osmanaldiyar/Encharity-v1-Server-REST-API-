package com.encharity.encharity_backend.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "archive")
@EntityListeners(AuditingEntityListener.class)
public class Archive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int archiveId;

    private int archivePhotoId;
    @NotBlank
    private String archiveTitle;
    @NotBlank
    private String archiveDescription;

    public String getArchiveDescription() {
        return archiveDescription;
    }

    public void setArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
    }

    public int getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(int archiveId) {
        this.archiveId = archiveId;
    }

    public int getArchivePhotoId() {
        return archivePhotoId;
    }

    public void setArchivePhotoId(int archivePhotoId) {
        this.archivePhotoId = archivePhotoId;
    }

    public String getArchiveTitle() {
        return archiveTitle;
    }

    public void setArchiveTitle(String archiveTitle) {
        this.archiveTitle = archiveTitle;
    }
}
