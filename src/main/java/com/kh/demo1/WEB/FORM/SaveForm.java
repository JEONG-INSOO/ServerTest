package com.kh.demo1.WEB.FORM;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SaveForm {
    @NotBlank
    @Size(min=1,max=10)
    private String pname;

    @NotNull
    @Positive
    private Long quantity;

    @NotNull(message = "필수 입력 필드입니다.")
    @Positive(message = "양수여야합니다.")
    @Min(value=1000, message = "최소 1000원이상이어야 합니다.")
    @Max(value = 100000000, message = "최대 1억원을 초과할 수 없습니다.")
    private Long price;
}
