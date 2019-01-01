package com.neat.data.house;

//import org.springframework.data.annotation.CreatedInstant;
//import org.springframework.data.annotation.LastModifiedInstant;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.time.Instant;

@SuppressWarnings("unused")
@Entity
@Table(name = "property_list")
@Proxy(lazy=false)
public class PropertyListEntity {
    @Id
    private String id;

    //    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "created_at", nullable = false, updatable = false)
//    @CreatedInstant
    @Column(columnDefinition = "timestamp")
    private Instant createdAt;

    //    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "upInstantd_at", nullable = false)
//    @LastModifiedInstant
    @Column(columnDefinition = "timestamp")
    private Instant updatedAt;

    @Column(columnDefinition = "text")
    private String base_url;

    @Column(columnDefinition = "text")
    private String url;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBase_url() {
        return base_url;
    }

    public void setBase_url(String base_url) {
        this.base_url = base_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String toString() {
        return String.format("id: %s,base_url=%s, url=%s", this.id, this.base_url, this.url);
    }
}