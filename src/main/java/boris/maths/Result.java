package boris.maths;

public class Result {
    public Result(int mathResult, String message) {
        this.mathResult = mathResult;
        this.message = message;
    }

    private int mathResult;
    private String message;

    public int getMathResult() {
        return mathResult;
    }

    public void setMathResult(int mathResult) {
        this.mathResult = mathResult;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
