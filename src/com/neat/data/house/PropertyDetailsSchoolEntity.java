package com.neat.data.house;

import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonNodeBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name = "property_details_school")
@TypeDef(
        name = "jsonb-node",
        typeClass = JsonNodeBinaryType.class
)
public class PropertyDetailsSchoolEntity {
    @Id
    private long id;

    @Type( type = "jsonb-node" )
    @Column(columnDefinition = "jsonb")
    private JsonNode contents;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public JsonNode getContents() {
        return contents;
    }

    public void setContents(JsonNode contents) {
        this.contents = contents;
    }
}
