package bip.online.biplio2024.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ListResponse <T>extends BaseResponse {
    private T data;

    public ListResponse(boolean success, String message, T data) {
        super(success, message);
        this.data = data;
    }
}
