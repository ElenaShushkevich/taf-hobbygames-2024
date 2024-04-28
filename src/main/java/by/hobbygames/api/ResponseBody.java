package by.hobbygames.api;

import java.util.Objects;

public class ResponseBody {

    boolean success;
    int selected_region_id;

    ResponseErrorsBody responseErrorsBody;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getSelected_region_id() {
        return selected_region_id;
    }

    public void setSelected_region_id(int selected_region_id) {
        this.selected_region_id = selected_region_id;
    }

    public ResponseErrorsBody getErrors() {
        return responseErrorsBody;
    }

    public void setErrors(ResponseErrorsBody responseErrorsBody) {
        this.responseErrorsBody = responseErrorsBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseBody responseBody = (ResponseBody) o;
        return success == responseBody.success && selected_region_id == responseBody.selected_region_id && Objects.equals(responseErrorsBody, responseBody.responseErrorsBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, selected_region_id, responseErrorsBody);
    }

    @Override
    public String toString() {
        return "Response{" +
                "success=" + success +
                ", selected_region_id=" + selected_region_id +
                ", errors=" + responseErrorsBody +
                '}';
    }
}
