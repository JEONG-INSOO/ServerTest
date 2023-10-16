package com.kh.demo1.WEB.FORM;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SaveFormOld {
  @NotBlank(message = "필수입력 필드입니다.")
  @Size(min = 1, max = 10, message = "1~10자까지 가능합니다")
  @NotNull(message = "필수입력 필드입니다.")
  @Positive(message = "양수여야 합니다")
  private Long Quantity;

  @NotNull(message = "필수입력필드입니다.")
  @Positive(message = "양수여야 합니다")
  @Min(value = 100, message = "최소 1000원이상 이어야 합니다.")
  @Max(value = 100000000, message = "최대 1억원을 초과할 수 없습니다")
  private Long price;
}
