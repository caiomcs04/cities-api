package com.backend.citiesapi.model;

import com.backend.citiesapi.util.PointType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.geo.Point;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

@Entity
@Table(name = "cidade")
@NoArgsConstructor
@Getter
@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer uf;

    private Integer ibge;

    @Type(type = "point")
    @Column(name="lat_lon", updatable = false, insertable = false)
    private Point location;

    @Column(name="lat_lon")
    private String geolocation;

    private Double longitude;

    private Double latitude;

    private Integer cod_tom;

}

