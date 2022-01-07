package az.iktlab.group_j4.java_lessons.lesson_13.enums;

public enum HttpCode {

    OK("Success", 200),
    NOT_FOUNDED("Value not founded", 404),
    FORBIDDEN("Unauthorized", 401);

    private final String message;
    private final int code;

    HttpCode(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
