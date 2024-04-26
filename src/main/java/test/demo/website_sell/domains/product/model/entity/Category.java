package test.demo.website_sell.domains.product.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryId;

    @NotEmpty(message = "Name cannot be empty")
    @Size(max = 255, message = "Name must be less than or equal to 255 characters")
    private String categoryName;

    private String description;

}
