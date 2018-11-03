package com.encharity.encharity_backend.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "blog")
@EntityListeners(AuditingEntityListener.class)
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blogId;

    private int blogPhotoId;
    @NotBlank
    private String blogTitle;

    @NotBlank
    private String blogDescription;

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public int getBlogPhotoId() {
        return blogPhotoId;
    }

    public void setBlogPhotoId(int blogPhotoId) {
        this.blogPhotoId = blogPhotoId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }
}
