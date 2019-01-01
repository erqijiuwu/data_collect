package com.neat.data.house;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@SuppressWarnings("unused")
@Entity
@Table(name = "property_details_image")
public class PropertyDetailsImageEntity {
    @Id
    private String img_id;

    @Column(columnDefinition = "varchar(256)")
    private String thumb_src;

    @Column(columnDefinition = "varchar(256)")
    private String origin_src;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "property_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private PropertyDetailsBasicEntity property;

    public String getImg_id() {
        return img_id;
    }

    public void setImg_id(String img_id) {
        this.img_id = img_id;
    }

    public String getThumb_src() {
        return thumb_src;
    }

    public void setThumb_src(String thumb_src) {
        this.thumb_src = thumb_src;
    }

    public String getOrigin_src() {
        return origin_src;
    }

    public void setOrigin_src(String origin_src) {
        this.origin_src = origin_src;
    }

    public PropertyDetailsBasicEntity getProperty() {
        return property;
    }

    public void setProperty(PropertyDetailsBasicEntity property) {
        this.property = property;
    }
}
