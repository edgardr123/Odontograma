package com.example.odontograma.DTO;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Singular;

@Getter
@Builder
public class ResponseDTO<T> {
  @Singular("data")
  @NonNull
  private final List<T> data;

  public static <T> ResponseDTO<T> build(final List<T> data) {
    return ResponseDTO.<T>builder().data(data).build();
  }
}
