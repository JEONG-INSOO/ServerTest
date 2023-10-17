package com.kh.demo1.WEB.FORM;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UpdateForm {
  private Long productId;

  @NotBlank
  @Size(min = 1, max = 10)
  private String pname;

  @NotNull
  @Positive
  private Long quantity;

  @NotNull
  @Positive
  @Min(1000)
  private Long price;

}
