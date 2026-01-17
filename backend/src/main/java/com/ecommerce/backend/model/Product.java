package com.ecommerce.backend.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String description;
  private String brand;
  private String category;
  private Double price;
/*   @JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy") */
  private Date releaseDate;
  private Integer stockQuantity;
  private boolean productAvailable;
  private String imageType;
  private String imageName;
  @Lob
  private byte[] imageData;

}
