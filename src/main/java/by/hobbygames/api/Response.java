package by.hobbygames.api;

import java.util.Objects;

public class Response {

    boolean success;
    int selected_region_id;

    Errors errors;

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

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return success == response.success && selected_region_id == response.selected_region_id && Objects.equals(errors, response.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, selected_region_id, errors);
    }

    @Override
    public String toString() {
        return "Response{" +
                "success=" + success +
                ", selected_region_id=" + selected_region_id +
                ", errors=" + errors +
                '}';
    }
}
