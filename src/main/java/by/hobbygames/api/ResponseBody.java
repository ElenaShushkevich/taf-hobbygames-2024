package by.hobbygames.api;

import java.util.Objects;

public class ResponseBody {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseBody that = (ResponseBody) o;
        return success == that.success && selected_region_id == that.selected_region_id && Objects.equals(errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, selected_region_id, errors);
    }

    @Override
    public String toString() {
        return "ResponseBody{" +
                "success=" + success +
                ", selected_region_id=" + selected_region_id +
                ", errors=" + errors +
                '}';
    }
}
