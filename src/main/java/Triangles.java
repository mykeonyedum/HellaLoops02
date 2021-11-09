public class Triangles {
    public String getTriangle(int numberOfRows) {


        StringBuilder result = new StringBuilder();
        for (int r = 1; r <= numberOfRows; r++) {
            for (int j = 1; j <= r; j++) {
                result.append("*");
            }
            result.append(System.lineSeparator());
        }
        return result.toString();
    }


    public String getRow(int numberOfStars) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            result.append("*");

        }
        return result.toString();
    }


    public String getSmallTriangle() {
        StringBuilder result = new StringBuilder();
        for (int r = 1; r <= 4; r++) {
            for (int j = 1; j <= r; j++) {
                result.append("*");
            }
            result.append(System.lineSeparator());
        }
        return result.toString();
    }

    public String getLargeTriangle() {
        StringBuilder result = new StringBuilder();
        for (int r = 1; r <= 9; r++) {
            for (int j = 1; j <= r; j++) {
                result.append("*");
            }
            result.append(System.lineSeparator());
        }
        return result.toString();


    }
}