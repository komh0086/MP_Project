package com.example.mp_project.domain.community;

import java.util.List;

public class CommunitySummaryEntity {

    private Long id;

    private Long creatorId;

    private String title;

    private List<String> tags;

    private Long views;

    private Long likes;

    private Long hates;

    private Long createdAt;

    private Long updatedAt;

    private Long deletedAt;

    public CommunitySummaryEntity(Long id, Long creatorId, String title, List<String> tags, Long views, Long likes, Long hates, Long createdAt, Long updatedAt, Long deletedAt) {
        this.id = id;
        this.creatorId = creatorId;
        this.title = title;
        this.tags = tags;
        this.views = views;
        this.likes = likes;
        this.hates = hates;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public Long getId() {
        return id;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getTags() {
        return tags;
    }

    public Long getViews() {
        return views;
    }

    public Long getLikes() {
        return likes;
    }

    public Long getHates() {
        return hates;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public Long getDeletedAt() {
        return deletedAt;
    }
}
