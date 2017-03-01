import java.util.Arrays;

/**
 * Split of string on array of each elements, limited " ", ":", "/".
 */
public class SplitterOfStingOnArray {
    private String[] arrayDate;

    /**
     * Split of string on array of each elements, limited " ", ":", "/".
     * @param userDate String of data from console.
     */
    public void splitSringOnArray(String userDate) {
        String pattern = " |:|/";
        arrayDate = userDate.split(pattern);
    }

    /**
     *
     * @return the array of time and date divided into elements.
     */
    public String[] getArrayDate() {
        return arrayDate;
    }
}
