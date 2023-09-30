package com.blackcoffer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Data_Entity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "end_year")
    private Integer end_year;

    @Column(name = "citylng") // Updated column name to match your data
    private Double citylng;

    @Column(name = "citylat") // Updated column name to match your data
    private Double citylat;

    @Column(name = "intensity")
    private String intensity;

    @Column(name = "sector")
    private String sector;

    @Column(name = "topic")
    private String topic;

    @Column(name = "insight",length = 512)
    private String insight;

    @Column(name = "swot")
    private String swot;

    @Column(name = "url")
    private String url;

    @Column(name = "region")
    private String region;

    @Column(name = "start_year")
    private Integer start_year;

    @Column(name = "impact")
    private String impact;

    @Column(name = "added")
    private String added;

    @Column(name = "published")
    private String published;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "relevance")
    private String relevance;

    @Column(name = "pestle")
    private String pestle;

    @Column(name = "source")
    private String source;

    @Column(name = "title", length = 512)
    private String title;

    @Column(name = "likelihood")
    private Integer likelihood;


}
