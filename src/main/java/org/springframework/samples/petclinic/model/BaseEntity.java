package org.springframework.samples.petclinic.model;

import lombok.Data;

import java.io.Serializable;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public boolean isNew() {
        return this.id == null;
    }
}
